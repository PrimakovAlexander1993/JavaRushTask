package com.javarush.task.task30.task3008;

import com.javarush.task.task30.task3008.client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    private static class Handler extends Thread {
        private Socket socket;

        Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            Message messageNameRequest = new Message(MessageType.NAME_REQUEST, "Введите ваше имя.");
            connection.send(messageNameRequest);
            Message messageUserName = null;
            while (true) {
                messageUserName = connection.receive();
                if (messageUserName.getType() != MessageType.USER_NAME) {
                    connection.send(messageNameRequest);
                } else {
                    if (messageUserName.getData() == null || messageUserName.getData().equals("") || connectionMap.containsKey(messageUserName.getData())) {
                        connection.send(messageNameRequest);
                    } else {
                        connectionMap.put(messageUserName.getData(), connection);
                        connection.send(new Message(MessageType.NAME_ACCEPTED, "Имя принято."));
                        return messageUserName.getData();
                    }
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message != null && message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    ConsoleHelper.writeMessage("Error!");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage(String.valueOf(socket.getRemoteSocketAddress()));

            String userName;
            Connection connection;
            if (socket.getRemoteSocketAddress() != null) {
                ConsoleHelper.writeMessage("A new connection has been established");
            }
            try {
                connection = new Connection(socket);

                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
                for (String name : connectionMap.keySet()) {
                    if (name.equals(userName)) {
                        connectionMap.remove(name);
                        sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            ConsoleHelper.writeMessage("cоединение с удаленным адресом закрыто");


        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (String name : connectionMap.keySet()) {
            try {
                connectionMap.get(name).send(message);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Не получилось отправить сообщение пользователю " + name);
            }
        }
    }

    public static void main(String[] args) {
        int serverPort = ConsoleHelper.readInt();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(serverPort);
            ConsoleHelper.writeMessage("Сервер запущен.");
            while (true) {
                new Handler(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            try {
                serverSocket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}
