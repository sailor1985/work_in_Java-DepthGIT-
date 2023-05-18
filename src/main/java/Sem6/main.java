package Sem6;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5, 1, "Арноль", "Черный", "Тверская 1");
        // cat1.descrition();
        // cat1.printInfo();
        Cat cat2 = new Cat(6, 2, "Степан", "Серый", "Тверская-Ямская, 5");
        // cat2.descrition();
        // cat2.printInfo();
        // cat2.sleep();
        // cat2.speak();
        // cat2.eat();
        Cat cat3 = new Cat(6, 2, "Богдан", "Серый", "Тверская-Ямская, 5");
        ArrayList<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        cat2.setIsSpeak(true);

            for (Cat cat : list) {
                cat.descrition();
                cat.printInfo();
                System.out.println("===========");
            }
    }  
}
