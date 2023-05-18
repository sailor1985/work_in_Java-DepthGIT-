package DZ_to_Sem1;

import java.util.Arrays;
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        //System.out.println(ex1(summa_of_digits())); //Задача 1

        //System.out.print("Введите целое положительно (отрицательное) число: ");
        //Scanner scanner = new Scanner(System.in);
        //int number1 = scanner.nextInt();
        //ex2(number1); //Задача 2

        //System.out.print("Введите целое положительно (отрицательное) число: ");
        //Scanner scanner = new Scanner(System.in);
        //int number2 = scanner.nextInt();
        //System.out.println(ex3(number2));//Задача 3

//        System.out.print("Введите число: ");
//        Scanner scanner = new Scanner(System.in);
//        int number3 = scanner.nextInt();
//        System.out.println("Введите строку: ");
//        Scanner scanner1 = new Scanner(System.in);
//        String str = scanner1.nextLine();

//        System.out.print("Введите число и строку через пробел: ");
//        Scanner scanner = new Scanner(System.in);
//        int number3 = scanner.nextInt();
//        String str = scanner.nextLine();
//        ex4(number3, str); //Задача 4

//        ex6(); //Задача 6
//        ex7(); //Задача 7
//        ex8(); //Задача 8
//        ex9(); //Задача 9

//        System.out.print("Введите длину массива и значение ячейки через пробел: ");
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int initialValue = scanner.nextInt();
//        System.out.print(Arrays.toString(ex10(len, initialValue))); //Задача 10

    }

    //   Задача 1: Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    //   от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    private static int summa_of_digits() {
        System.out.print("Введите 2 числа через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int sum = number_1 + number_2;
        System.out.printf("Сумма чисел = %d%n", sum);
        return sum;
    }
    public static boolean ex1(int sum) {
        return sum >= 10 && sum <= 20;
    }

    //    Задача 2: Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    private static void ex2(int number) {
        if (number >= 0) {System.out.println("Передано положительное число");}
        else {System.out.println("Передано отрицательное число");}
    }

    //    Задача 3: Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    //    если число отрицательное, и вернуть false если положительное.
    public static boolean ex3(int number2) {
        return number2 < 0;
    }

//    Задача 4: Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
//    в консоль указанную строку, указанное количество раз
    private static void ex4(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.printf("%s%n", str);
        }
    }

//    Задача 6: Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0
    private static void ex6() {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) {arr[i] = 0;}
            else {arr[i] = 1;}
        }
        System.out.println(Arrays.toString(arr));
        }

//    Задача 7: Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void ex7() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

//    Задача 8: Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void ex8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    Задача 9: Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void ex9() {
        System.out.print("Задайте размерность двумерного целочисленного массива: ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                    if (i == j || i == x - 1) arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }

//    Задача 10:Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
//    типа int длиной len, каждая ячейка которого равна initialValue;
    private static int [] ex10(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}
