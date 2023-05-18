package DZ_to_Sem4;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ex1(); //Задача 1

    }


//    Задача 1: Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static void ex1(){
        LinkedList<String> wordsLst = new LinkedList<>();
        Collections.addAll(wordsLst,"apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println("Исходный список: " + wordsLst);
        Collections.reverse(wordsLst);
        System.out.println("Перевернутый список: " + wordsLst);
    }
}
