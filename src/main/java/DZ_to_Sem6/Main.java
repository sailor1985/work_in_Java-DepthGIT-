package DZ_to_Sem6;

import Sem6.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<HardDisc> hardDiscList = new ArrayList<>();
        hardDiscList.add(new HardDisc(500));
        hardDiscList.add(new HardDisc(1000));

        Notebook notebook1 = new Notebook("Asus VivoBook", "Vivobook 15 F51", "Intel Core i3", "Windows 11 Home", 15.6, 1, hardDiscList);

        Notebook notebook2 = new Notebook("Macbook Pro", "MacBook Pro 14 2021 (Z15J000DW)", "Apple M1 Pro", "macOS", 14.2, 1, hardDiscList);

        Notebook notebook3 = new Notebook("HUAWEI MateBook", "MateBook D 14", "Intel Core i3", "Windows 11 Home", 14, 1, hardDiscList);

        notebook1.printInfo();

        ArrayList<Notebook> list = new ArrayList<>(); // cоздаем множество ноутбуков
        list.add(notebook1);
        list.add(notebook2);
        list.add(notebook3);
        System.out.println(list); //Печатаем получившийся список ноутбуков

        // Фильтруем список по условию: диагональ ноутов > number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ноутбук с какой минимальной диагональю экрана вы хотели бы купить? ");
        int number = scanner.nextInt();
        for (Notebook note : list) {
            if (note.getScreenDiagonal() > number) {
                System.out.println(note);
            }
        }

        // Суммируем емкости всех жестких дисков всех ноутбуков
        for (Notebook note : list) {
            note.getSizeHardDisc();
        }
        // Получаем процессоры всех ноутбуков
        for (Notebook note : list) {
            System.out.println(note.getProcessor());
        }
    }
}
