package Sem3;

import java.util.*;

public class Main {
/*     1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/
    private static Random random = new Random();
    private static List<String> planets = Arrays.asList("Uranus", "Mercury", "Jupiter", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Pluto", "Jupiter", "Uranus", "Venus", "Mars", "Mercury", "Pluto");

    public static void main(String[] args) {
//        ex0();
 //       ex1();
        ex2_1();
//        ex2_2();
        //ex2_3();
    }

    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
    }

    private static void ex1() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

//        list.sort(Comparator.naturalOrder());
//        Collections.sort(list);
//        list.sort(Integer::compare);

        System.out.println(list);
    }

    private static void ex2_1() {
        List<String> distinctPlanets = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);
            if (!distinctPlanets.contains(planet)) {
                int count = 1;
                distinctPlanets.add(planet);
                for (int j = i + 1; j < planets.size(); j++) {
                    if (planet.equals(planets.get(j))) {
                        count++;
                    }
                }
                System.out.printf("%s\t-\t%s раз%n", planet, count);
            }
        }
    }


    private static void ex2_2() {
        planets.stream().distinct()
                .forEach(planet -> System.out.printf("%s\t-\t%s раз%n", planet,
                        planets.stream().filter(planet::equals).count()));
    }

    private static void ex2_3() {
        Map<String, Integer> frequencyByPlanet = new HashMap<>();
        for (String planet : planets) {
            Integer frequency = frequencyByPlanet.getOrDefault(planet, 0);
/*            if (frequency == null) {
                frequency = 0;
            }*/

            frequencyByPlanet.put(planet, ++frequency);
        }

        frequencyByPlanet.forEach((planet, frequency) -> System.out.printf("%s\t-\t%s раз%n", planet, frequency));
    }
}
