package DZ_to_Sem3;

import java.util.*;

public class Main {
    public static void main (String[] args) {
//        removingEvenNumbers(); //Задача 1
//        findMinMaxArithmeticMean(); //Задача 2
    }

//    1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
private static void removingEvenNumbers() {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
        list.add(random.nextInt(10));
    }
    System.out.println("Оригинал: " + list);
    list.removeIf(i-> (i % 2 ==0));
    System.out.println("Новый список: " + list);
}

//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
private static void findMinMaxArithmeticMean() {
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    System.out.print("Введите количество элементов в целочисленном списке: ");
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
        list.add(random.nextInt(10));
    }
    System.out.println("Целочисленный список: " + list);
    System.out.printf("Минимальное число в целочисленном списке: %d\n ", Collections.min(list));
    System.out.printf("Максимальное число в целочисленном списке: %d\n ",Collections.max(list));

    double sum = list.stream().mapToInt(Integer::intValue).sum();
    double arithmeticMean = sum/q;
    System.out.printf("Среднее арифметическое элементов в целочисленном списке: %s\n ",arithmeticMean);
}
}


