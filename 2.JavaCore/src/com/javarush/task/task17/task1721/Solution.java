package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Solution solution= new Solution();
        solution.joinData();
        try {
            BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
            File filename1 = new File(reader.readLine());
            File filename2 = new File(reader.readLine());
            BufferedReader fileReader = new BufferedReader(new FileReader(filename1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(filename2));
            String line = null;
            String line2 = null;
            while ((line = fileReader.readLine()) != null) {
                allLines.add(line);
            }
            while ((line2 = fileReader2.readLine()) != null) {
                forRemoveLines.add(line2);
            }
            reader.close();

        }

        catch(IOException e){
            e.printStackTrace();
        }



    }
    /*
    3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
     */
    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            for (int i = 0; i < forRemoveLines.size(); i++) {
                if (allLines.contains(forRemoveLines.get(i))){
                    allLines.remove(i);
                }
            }
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
