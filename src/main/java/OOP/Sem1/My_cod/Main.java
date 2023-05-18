package OOP.Sem1.My_cod;

public class Main {
    public static void main(String[] args) {
//        родители/дети
//        не на Джаве есть
//        супервкласс - человек --> Мужчина/женщина
//        Проработать и описать логику генеалогического древа на языке Java

        Human human = new Human(80, 25, "Michael", "г. Воркута, Ленина, 3", "Мужской");
        human.printInfo();
        human.sleep();

    }
}
