package Sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MainMy {
    public static void main (String[] args) {
//        ex0();
        ex1();


    }
    private static void ex0() {
        ArrayList<Integer> lstArray = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            lstArray.add(0,100);
        }
        System.out.println(System.currentTimeMillis() - start);

        LinkedList<Integer> lstLink = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            lstLink.add(0,100);
        }
        System.out.println(System.currentTimeMillis() - start);

    }


//    Реализовать консольное приложение, которое:
//    Принимает от пользователя строку вида
//    text~num
//    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    private static void ex1() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> wordsLst = new LinkedList<>();
        while (true) {
            System.out.println("Введите строку");
            String text = scanner.nextLine();
            if (text.equals("stop")) {
                System.exit(0);
            }
            String[] arr1 = text.split("\\~"); // [hello, 0]
            int number = Integer.parseInt(arr1[1]); // 0
            String value = arr1[0];
            if (wordsLst.size() == number) {
                wordsLst.add(arr1[0]);
            } else if (number >= 0 && wordsLst.size() > number) {
                wordsLst.set(number, value);
            } else if (wordsLst.size() < number) {
                System.out.println("Не корректный ввод");
            } else if (text.equals("print")) {
                wordsLst.pop();
            }


            System.out.printf("%s\n", wordsLst);
        }
    }

}
