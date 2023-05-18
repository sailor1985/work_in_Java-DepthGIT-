package DZ_to_Sem4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    private static final LinkedList<String> stack = new LinkedList<>();

    public static void main(String[] args) {
        Collections.addAll(stack,"apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println("Элементы стэка: " + stack);
        //push("hello"); //добавить в конец слово hello
        //System.out.println("Последний элемент в стэке = " + peek()); //посмотреть последнее в стеке
        //System.out.println("Последний извлеченный элемент в стэке = " + pop()); //посмотреть и извлечь последнее в стеке
    }

    private static void push(String word) {
        stack.add(word);
        System.out.println(stack);
    }

    private static String peek() {
        return stack.get(stack.size() -1);
    }

    private static String pop() {
        String elem = stack.get(stack.size() -1);
        stack.set(stack.size() -1, null);
        return elem;
    }
}
