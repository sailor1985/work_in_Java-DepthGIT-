package Exeptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DZ3 {
        public static void main(String[] args) {
            // ����������� � ������������ ��� ����������� ������
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ������ � ��������� �������: ������� ��� �������� ���� �������� ����� �������� ���");
            String input = scanner.nextLine();
            scanner.close();

            // ��������� ���������� ������ �� ��������� ��������
            String[] values = input.split("\\s+");

            // ��������� ���������� ���������� �������� ����������
            validateValues(values);

            // ���������� ������ ������� ���������
            String surname = validateString(values[0], "�������");
            String name = validateString(values[1], "���");
            String patronymic = validateString(values[2], "��������");
            String birthday = validateDate(values[3]);
            String phoneNumber = validatePhoneNumber(values[4]);
            String gender = validateGender(values[5]);

            // ������� ���� � ���������� ������
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true));
                writer.write(surname + " " + name + " " + patronymic+ " " + birthday + " " + phoneNumber+ " " + gender);
                writer.newLine();
                writer.close();
                System.out.println("������ ������� �������� � ����.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ������� �������� ���������� ���������� �������� ����������
        private static void validateValues (String[] values) throws ArrayIndexOutOfBoundsException {
                try {
                    if (values.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("������: ������� ������� ���������� ������, ��� ��������� (������ ���� 6 ��������)");
                    } else if (values.length > 6) {
                        throw new ArrayIndexOutOfBoundsException("������: ������� ������� ���������� ������, ��� ��������� (������ ���� 6 ��������)");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e.getMessage());
                }
        }

        // ���������, ��� ���������� ������ ������� ������ �� ����
        private static String validateString(String value, String field) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("������: ������������ �������� ���� " + field + ".");
                System.exit(1);
            }
            return value;
        }

        // ���������, ��� ���������� ������ �������� ���������� ����� � ������� dd.mm.yyyy
        private static String validateDate(String value) {
            Pattern pattern = Pattern.compile("^\\d{2}\\.\\d{2}\\.\\d{4}$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("������: ������������ �������� ���� ���� ��������.");
                System.exit(1);
            }
            // ���������, ��� ���� ������������� �������� ����
            // ...
            return value;
        }

        // ���������, ��� ���������� ������ �������� ���������� ������� �������� (����� ����������� ����� ��� ��������������)
        private static String validatePhoneNumber(String value) {
            Pattern pattern = Pattern.compile("^\\d+$");
            Matcher matcher = pattern.matcher(value);
            if (!matcher.matches()) {
                System.err.println("������: ������������ �������� ���� ����� ��������.");
                System.exit(1);
            }
            return value;
        }

        // ���������, ��� ���������� ������ �������� 'f' ��� 'm'
        private static String validateGender(String value) {
            if (!value.equals("f") && !value.equals("m")) {
                System.err.println("������: ������������ �������� ���� ���.");
                System.exit(1);
            }
            return value;
        }
    }

