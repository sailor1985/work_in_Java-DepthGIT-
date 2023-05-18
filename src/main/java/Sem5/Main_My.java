package Sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main_My {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

//    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

    private static void ex1() {
        Map<String, String> data = new HashMap<>();
        data.putIfAbsent("123456", "Иванов");
        data.putIfAbsent("321456", "Васильев");
        data.putIfAbsent("234561", "Петрова");
        data.putIfAbsent("234432", "Иванов");
        data.putIfAbsent("654321", "Петрова");
        data.putIfAbsent("345678", "Иванов");
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
    }
//


//    Написать метод, который переведет число из римского формата записи в арабский.
//    Например, MCMXXIX = 1929
    private static void ex2() {
        Map<Character, Integer> data = new HashMap<>();
        data.putIfAbsent('M', 1000);
        data.putIfAbsent('X', 10);
        data.putIfAbsent('C', 100);
        data.putIfAbsent('I', 1);
        data.putIfAbsent('V', 5);
        data.putIfAbsent('L', 50);
        data.putIfAbsent('D', 500);

        String str = "MCMXXIX"; //1929
        ArrayList<Integer> new_lst = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char corr= str.charAt(i);
            for (Map.Entry<Character, Integer> entry : data.entrySet()) {
                if (entry.getKey().equals(corr)) {
                    new_lst.add(entry.getValue());
                }
            }
        }
        System.out.println(new_lst);
        int sum = 0;
        int temp = new_lst.get(new_lst.size() -1);
        for (int i = 0; i < new_lst.size() - 1; i++) {
            if (new_lst.get(i) > new_lst.get(i + 1)) {
                sum += new_lst.get(i) - new_lst.get(i + 1);
                i++;
            } else if (new_lst.get(i) <= new_lst.get(i + 1)) {
                sum += new_lst.get(i);
            }
            System.out.println(sum);
        }
        sum += temp;
       System.out.println(sum);
        }
    }