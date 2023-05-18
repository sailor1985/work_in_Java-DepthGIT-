package Sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.

public class Ex001 {
    public static void main(String[] args) {
        createHashSet();
        createLinkedHashSet();
        createTreeSet();
        System.out.println();
    }

    private static void createTreeSet() {
        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 7, 5, 6, 3));
        System.out.println(set);
    }

    private static void createLinkedHashSet() {
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 7, 5, 6, 3));
        System.out.println(set);
    }

    private static void createHashSet() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 7, 5, 6, 3));
        System.out.println(set);
    }
}
