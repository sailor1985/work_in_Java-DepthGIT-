package DZ_to_Sem5;

import java.util.*;

public class PhoneNote {
    static Map<String, ArrayList<String>> phoneNote = new HashMap<>();

    public static void main(String[] args) {
        createPhoneNote();
        System.out.println(addPhoneNote());
    }

    //Инициализация телефонного справочника с уже имеющимися ключами - Фамилии
    private static void createPhoneNote() {
        phoneNote.putIfAbsent("Иванов", null);
        phoneNote.putIfAbsent("Петров", null);
        phoneNote.putIfAbsent("Сидоров", null);
    }

    // Метод добавления нескольких номеров телефона в ArrayList<String>
    private static ArrayList<String> addTelephones() {
        ArrayList<String> telephones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько номеров телефона вы будете вводить: ");
        int quantity = scanner.nextInt();
        for (int i = 1; i < quantity + 1; i++) {
            System.out.printf("Введите %d номер телефона: ", i);
            String number = scanner.next();
            telephones.add(number);
        }
        return telephones;
    }

    // Добавление по ключу - Фамилии опредленного количества номеров телефонов
    private static Map<String, ArrayList<String>> addPhoneNote() {
        for (Map.Entry<String, ArrayList<String>> pair : phoneNote.entrySet()) {
            System.out.printf("Ввод номеров телефонов для %s\n", pair.getKey());
            pair.setValue(addTelephones());
        }
        return phoneNote;
    }
}
