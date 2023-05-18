package OOP.DZ_to_Sem1.ex3;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 3: Змея жалит человека");
        task3();
    }
    private static void task3() {
        Human3 human3 = new Human3("Савелий");
        Animal snake = new Snake();
        for (int i = 0; i < 22; i++) {
            snake.attack(human3);
        }
    }
}
