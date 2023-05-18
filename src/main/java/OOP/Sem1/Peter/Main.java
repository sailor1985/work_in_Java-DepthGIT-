package OOP.Sem1.Peter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static List<Human> myList = new LinkedList<>();

    public static void main(String[] args) {
        Human Adam = new Human("Адам", "male", true);
        Human Eva = new Human("Ева", "female", true, Adam);
        Human Kain = new Human("Каин", "male", true, null);
        Human Aver = new Human("Авель", "male", true, null);
        Human Sif = new Human("Сиф", "male", true, null);
        Human Kalmana = new Human("Калмана", "female", true, Kain);
        Human Delvora = new Human("Делвора", "female", true, Aver);
        Human Azura = new Human("Азура", "female", true, Sif);
        Human Enoh = new Human("Енох", "male", true, null);


        myList.add(Adam);
        myList.add(Eva);
        myList.add(Kain);
        myList.add(Aver);
        myList.add(Sif);
        myList.add(Kalmana); //Жена Каина
        myList.add(Delvora);//Жена Авеля
        myList.add(Azura);//Жена Сифа
        myList.add(Enoh);//Сын Каина

//        checkChildren(Adam);
//        checkParents(Isaac);

        Person p1 = new Person("Вася", true);
        Person p2 = new Person("Маша", false);
        Person p3 = new Person("Коля", true);
        Person p4 = new Person("Василиса Петровна", false);
        Person p5 = new Person("Николай Иванович", true);
        Person p6 = new Person("Ольга Бузова", false);
        Person p7 = new Person("Тимур Батрутдинов", true);
        Person p8 = new Person("Филипп Киркоров", true);

        p1.setFather(p5);
        p1.setMother(p4);
        p1.setChild(p3);
        p2.setMother(p6);
        p2.setFather(p7);
        p2.setChild(p3);
        p5.setFather(p8);


        System.out.println(Person.family);
//        System.out.println(Eva.getSpouse().getName());
//        System.out.println(myList);
//        Person.family.forEach(System.out::println);




    }

    public static void checkChildren(Human human) {
        int index = myList.indexOf(human);
        if (index < myList.size() - 1) {
            List<Human> children = new ArrayList<>(myList.subList(index +1 , myList.size()));
            System.out.println("У человека " + human);
            System.out.println("Следующие потомки: ");
            for (Human myhuman: children) {
                System.out.println(myhuman);
            }
        }
    }

    public static void checkParents(Human human) {
        int index = myList.indexOf(human);
        if (index > 0) {
            List<Human> parents = new ArrayList<>(myList.subList(0 , index));
            System.out.println("У человека " + human);
            System.out.println("Следующие предки: ");
            for (Human myhuman: parents) {
                System.out.println(myhuman);
            }
        }
    }
}
