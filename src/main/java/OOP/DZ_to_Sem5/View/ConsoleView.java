package OOP.DZ_to_Sem5.View;

import OOP.DZ_to_Sem2.ANSIConstants;
import OOP.DZ_to_Sem5.Model.MathResult;
import OOP.DZ_to_Sem5.Service.impls.View;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class ConsoleView implements View {
    public Integer enteringNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }
    @Override
    public void showMathResult(@NotNull MathResult result) {
        System.out.printf("Результат выбранной вами математической операции: %s", result.getResult());
    }
    public int showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("\n" + ANSIConstants.ANSI_WHITE_BACKGROUND +
                ANSIConstants.ANSI_BLACK + ANSIConstants.ANSI_RESET);
        System.out.println("-".repeat(37)
                + "\nВыберите пункт меню: " + "\n" + "-".repeat(37) +
                "\nКакую математическую операцию вы хотите осуществить: " + "\n" + "-".repeat(37));
        System.out.println("1.Сложение ");
        System.out.println("2.Вычитание ");
        System.out.println("3.Умножение ");
        System.out.println("4.Деление ");
        System.out.println("5.Выход ");
        System.out.println("-".repeat(37));
        System.out.print("Сделай свой выбор здесь: ");
        return in.nextInt();
    }
}
