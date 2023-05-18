package Exeptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ2 {
    public static void main(String[] args) {
        //������ 1:
        System.out.println(floatValue());
        //������ 2:
        //task2();
        //������ 3:
        /*try {
            Integer a = 90;
            Integer b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("������ ������� �� ������� ������ �������!");
        } catch (NullPointerException ex) {
            System.out.println("��������� �� ����� ��������� �� null!");
        } catch (Exception ex) {
            System.out.println("���-�� ����� �� ���...");
        }*/
        //������ 4:
        //task4();
    }

    /* ������ 1:
       ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������.
       ���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� � ������������ ���� ������.*/
    public static float floatValue() {
        while (true)
            try {
                System.out.print("������� ������� �����:");
                Scanner scanner = new Scanner(System.in);
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("������� ������� ����� ���������");
            }
    }

    /* ������ 2: ���� ����������, ��������� ������ ��� */
    public static void task2() {
        try {
            int[] intArray = new int[]{1,2,3,4,5,6,7,8};
            int d = 0;
            double caughtRes1 = intArray[7] / d;
            System.out.println("caughtRes1 = " + caughtRes1);
        } catch (ArithmeticException e) {
            System.out.println("������� ����������: ArithmeticException\n" + "������ ��������: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������� ����������: ArrayIndexOutOfBoundsException\n " + "������ ��������: " + e);
        }
    }
    /* ������ 3: ���� ����������, ��������� ������ ��� */
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    /* ������ 4:
       ������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������.
       ������������ ������ ���������� ���������, ��� ������ ������ ������� ������.*/
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ������: ");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty()) {
                throw new NullPointerException("������ ������ ������� ������");
            }
            System.out.println("�� �����: " + input);
        } catch (NullPointerException e) {
            System.out.println("������: " + e.getMessage());
        }
    }
}

