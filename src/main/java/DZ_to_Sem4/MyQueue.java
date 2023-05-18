package DZ_to_Sem4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private static LinkedList<String> queue =  new LinkedList<>();

    public static void main(String[] args) {
        Collections.addAll(queue,"apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println("Элементы стэка: " + queue);
        //add("hello"); //добавить в конец
        //System.out.println("Первое в очереди = " + top()); //посмотреть первое в очереди
        //System.out.println("Первый извлеченный элемент из очереди = " + remove()); //извлечь и вернуть первое в очереди
    }

    private static void add(String hello) {
        queue.add(0, hello);//добавили в начало очереди по индексу 0
        System.out.println(queue);
    }

    private static String top() {
        return queue.get(queue.size() -1);
    }

    private static String remove() {
        String elem = queue.get(queue.size() -1);
        queue.set(queue.size() -1, null);
        return elem;
    }
}
