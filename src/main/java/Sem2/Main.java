package Sem2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        //System.out.println(ex1(3, 'c', 'z')); //Задача 1
        //System.out.println(ex2("aaaabbbcdd")); //Задача 2

        printIntoFileNames("C:\\Users\\Клен-М\\Desktop\\Сем2"); //Задача 3


    }

//    Задача 1: Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1.
    private static String ex1(int count, char str1, char str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                sb.append(str1);
            }
            else {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

//    Задача 2: Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd. -> 4a3b1c2d
    private static String ex2(String str) {
        StringBuilder new_str = new StringBuilder();
        char prev= str.charAt(0);
        char curr = str.charAt(0);
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            curr = str.charAt(i + 1);
            prev = str.charAt(i);
            if (curr == prev) {
                count++;
            }
            else {
                new_str.append(count);
                new_str.append(prev);
                count = 1;
            }
        }
        new_str.append(count);
        new_str.append(prev);
        return new_str.toString();
    }


//    Задача 3: Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//    Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//    Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

    private static void printIntoFileNames(String path) {
        StringBuilder sb = new StringBuilder();
        String[] names = convertPathToNamesArr(path);
        Logger logger = Logger.getLogger(path); //Разобраться с 67 строкой
        for (String name : names) {
            sb.append(name).append(System.lineSeparator());
        }
        try(PrintWriter pw  = new PrintWriter("src/main/resources/files/dir_files.txt")) {
            pw.print(sb.toString());
        } catch (FileNotFoundException e) {
            logger.fine("File not fount: " + e.getMessage());
        }
    }
    private static String[] convertPathToNamesArr(String path) {
        File file = new File(path);
        return file.list();
    }



}
