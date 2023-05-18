package OOP.Sem1.Elvira_0;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Вася", "м", true);
        Human h2 = new Human("Анна", "ж", true);
        Human h3 = new Human("Андрей", "м", true, h1, h2, null);
        h1.setNext(h3);
        h2.setNext(h3);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

}