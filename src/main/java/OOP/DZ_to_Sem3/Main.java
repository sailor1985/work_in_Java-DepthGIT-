package OOP.DZ_to_Sem3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2: Борьба человека с ТВ и сном");
        task2();
    }
    private static void task2() {
        TV tv = new TV();
        Human2 human = new Human2("Геннадий");
        human.turnOnOffTV(tv);
        human.gotoSleep();
    }
}
