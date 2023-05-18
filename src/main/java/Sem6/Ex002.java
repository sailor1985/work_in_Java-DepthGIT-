package Sem6;
// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24. 

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент 
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex002 {
    public static void main(String[] args) {
        // getNums();
        calculateUnicNums(getNums());
    }

    private static void calculateUnicNums(ArrayList<Integer> nums) {
        Set<Integer> unic = new HashSet<>(nums);
        System.out.println(unic);
        double percUnic = 1.0 * unic.size() * 100 / nums.size();
        System.out.printf("%.2f%n", percUnic);
    }

    private static ArrayList<Integer> getNums() {
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(random.nextInt(25));
        }
        System.out.println(nums);
        System.out.println(nums.size());
        return nums;
    }
}

