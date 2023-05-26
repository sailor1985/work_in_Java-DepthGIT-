package Exeptions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        //Задача 1:
        int [] arr1 = initializingArray();//Инициализируем первый массив
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = initializingArray();//Инициализируем второй массив
        System.out.println(Arrays.toString(arr2));

        System.out.printf("Результирующий массив: " + Arrays.toString(diffArrays(arr1, arr2)));

        //Задача 2:
        //int[] arr3 = initializingArray();//Инициализируем первый массив
        //System.out.println(Arrays.toString(arr3));

        //int [] arr4 = initializingArray();//Инициализируем второй массив
        //System.out.println(Arrays.toString(arr4));

        //System.out.printf("Результирующий массив: " + Arrays.toString(privateArrays(arr3, arr4)));
    }
       /* Задача 1:
          Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
          каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
          Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
    public static int[] initializingArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива:");
        int len = scanner.nextInt();
        int[] array = new int[len];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
    public static Integer[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длины массивов должны быть равны");
        }
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /* Задача 2:
       Реализуйте метод, принимащий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
       каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
       Если длины массивов не равны, необходимо как-то оповестить пользователя.
       Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/
    public static double[] privateArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть равны");
        }
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = (double) arr1[i]/arr2[i];
        }
        return result;
    }
}


