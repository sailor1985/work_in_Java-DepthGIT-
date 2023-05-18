package Sem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main_Timofei {
    public static void main(String[] args) {
        System.out.println(ex3("MCMXXIX"));

        Map<String, ArrayList<String>> phoneNote = new HashMap<>();
//        1) нет фамилии, создаете ArrayList в первый раз
//        2) уже была фамилия, получаете готовый ArrayList через phoneNote.get(фамилия);
    }

    private static void ex0() {
        String userName = "Иванов";
        Map<String, String> passports = new HashMap<>();
        passports.put("12345", "Иванов");
        passports.put("321456 ", "Васильев");
        passports.put("43535", "Иванов");
        passports.put("345277", "Васильев");
        passports.put("567445", "Иванов");
        passports.put("876845", "Петрова");

/*        for (String key : passports.keySet()) {
            if (passports.get(key).equals(userName)) {
                System.out.printf("%s - %s%n", key, passports.get(key));
            }
        }*/

        for (Map.Entry<String, String> entry : passports.entrySet()) {
            if (entry.getValue().equals(userName)) {
                System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

    private static Integer ex3(String romanNum) {

        Map<Character, Integer> romanToDecimalMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int lastIndex = romanNum.length() - 1;
        char lastRomanChar = romanNum.charAt(lastIndex);
        int decimalNum = romanToDecimalMap.get(lastRomanChar);
        int prevNum = decimalNum;

        for (int i = 0; i < lastIndex; i++) {
            int currentIndex = lastIndex - 1 - i;
            char currentRomanChar = romanNum.charAt(currentIndex);
            int currentNum = romanToDecimalMap.get(currentRomanChar);

            /*int prevIndex = currentIndex + 1;
            char prevRomanChar = romanNum.charAt(prevIndex);
            int prevNum = romanToDecimalMap.get(prevRomanChar);*/

            if (currentNum < prevNum) {
                currentNum *= -1;
            }

            prevNum = currentNum;
            decimalNum += currentNum;
        }

        return decimalNum;

    }
}
