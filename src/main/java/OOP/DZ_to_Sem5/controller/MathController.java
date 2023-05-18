package OOP.DZ_to_Sem5.controller;

import OOP.DZ_to_Sem5.Service.Servise;
import OOP.DZ_to_Sem5.View.ConsoleView;

import java.util.InputMismatchException;

public class MathController {
    private final Servise service = new Servise();
    private final ConsoleView consoleView = new ConsoleView();
    public void execute() throws InputMismatchException {
        while (true) {
            try {
                switch (consoleView.showMenu()) {
                    case 1 -> consoleView.showMathResult(service.sum(consoleView.enteringNumbers(), consoleView.enteringNumbers()));
                    case 2 -> consoleView.showMathResult(service.difference(consoleView.enteringNumbers(), consoleView.enteringNumbers()));
                    case 3 -> consoleView.showMathResult(service.multiplication(consoleView.enteringNumbers(), consoleView.enteringNumbers()));
                    case 4 -> consoleView.showMathResult(service.division(consoleView.enteringNumbers(), consoleView.enteringNumbers()));
                    case 5 -> System.exit(0);
                    default -> {
                        System.out.println("Вы ввели число не из диапозона от 1 до 4");
                        continue;
                    }
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода данных. Введите число от 1 до 4");
            }
        }
    }
}

