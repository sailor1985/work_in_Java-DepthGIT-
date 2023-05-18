package DZ_to_Sem2;

import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkingForPalindrome("А роза упала на лапу Азора")); //Задача 1
        writeToFile(createStringCount(100, "TEST ")); //Задача 2
    }
//    Задача 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
private static boolean checkingForPalindrome(String str) {
    String clean = str.replaceAll(" ", "").toLowerCase();
    int length = clean.length() - 1;
    int firstIndex = 0;
    int lastIndex = length;
    while (lastIndex > firstIndex) {
        if (clean.charAt(firstIndex++) != clean.charAt(lastIndex--)) {
            return false;
        }
    }
    return true;
    }


//    Задача 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.
private static String createStringCount(int count, String str) {
    StringBuilder new_str = new StringBuilder();
    for (int i = 0; i < count; i++) {
        new_str.append(str);
    }
    return new_str.toString();
}

private static void writeToFile(String str) {
    try (FileWriter fw = new FileWriter("C:\\Users\\Клен-М\\Work in Git\\work_in_Java\\src\\main\\java\\DZ_to_Sem2\\file.txt", false)) {
        fw.write(str);
        fw.flush();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }

}




}

