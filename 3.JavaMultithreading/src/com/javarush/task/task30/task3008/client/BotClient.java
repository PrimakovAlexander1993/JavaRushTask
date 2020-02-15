package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
3) Переопредели методы:
а) getSocketThread(). Он должен создавать и возвращать объект класса BotSocketThread.
б) shouldSendTextFromConsole(). Он должен всегда возвращать false.
Мы не хотим, чтобы бот отправлял текст введенный в консоль.
в) getUserName(), метод должен генерировать новое имя бота, например: date_bot_X, где X - любое число от 0 до 99.
Для генерации X используй метод Math.random().
4) Добавь метод main(). Он должен создавать новый объект BotClient и вызывать у него метод run().
 */public class BotClient extends Client {

    @Override
    protected SocketThread  getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }


    protected String getUserName(){
        int x = (int) (Math.random() * 100);
        return "date_bot_"+x;
    }

    public class BotSocketThread extends SocketThread{

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {


            ConsoleHelper.writeMessage(message);

            if (message.indexOf(": ") == -1) {
                return;
            }

            String userName = message.substring(0,message.indexOf(": "));
            String strMessage = message.substring(message.indexOf(": ")+2);



            Calendar calendar;
            String pattern;

            if (strMessage.equalsIgnoreCase("дата")){
                pattern = "d.MM.YYYY";
            }
            else if (strMessage.equalsIgnoreCase("день")){
                pattern = "d";
            }else if (strMessage.equalsIgnoreCase("месяц")){
                pattern = "MMMM";
            }else if (strMessage.equalsIgnoreCase("год")){
                pattern = "YYYY";
            }else if (strMessage.equalsIgnoreCase("время")){
                pattern = "H:mm:ss";
            }else if (strMessage.equalsIgnoreCase("час")){
                pattern = "H";
            }else if (strMessage.equalsIgnoreCase("минуты")){
                pattern = "m";
            }else if (strMessage.equalsIgnoreCase("секунды")){
                pattern = "s";
            }else pattern = "";

            SimpleDateFormat formatDate = new SimpleDateFormat(pattern);

            String formatString = "Информация для %s: %s";

            String sAnswer = String.format(formatString,userName,formatDate.format(new GregorianCalendar().getTime()));

            if (!pattern.isEmpty()){
                sendTextMessage(sAnswer);
            }

        }
    }

    public static void main(String[] args){
        BotClient botClient = new BotClient();
        botClient.run();
    }

}
