package Exeptions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        //������ 1:
        int [] arr1 = initializingArray();//�������������� ������ ������
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = initializingArray();//�������������� ������ ������
        System.out.println(Arrays.toString(arr2));

        System.out.printf("�������������� ������: " + Arrays.toString(diffArrays(arr1, arr2)));

        //������ 2:
        //int[] arr3 = initializingArray();//�������������� ������ ������
        //System.out.println(Arrays.toString(arr3));

        //int [] arr4 = initializingArray();//�������������� ������ ������
        //System.out.println(Arrays.toString(arr4));

        //System.out.printf("�������������� ������: " + Arrays.toString(privateArrays(arr3, arr4)));
    }
       /* ������ 1:
          ���������� �����, ����������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������,
          ������ ������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������.
          ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������.*/
    public static int[] initializingArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ����� �������:");
        int len = scanner.nextInt();
        int[] array = new int[len];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }
    public static Integer[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("����� �������� ������ ���� �����");
        }
        Integer[] result = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    /* ������ 2:
       ���������� �����, ���������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������,
       ������ ������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������.
       ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������.
       �����: ��� ���������� ������ ������������ ����������, ������� ������������ ����� ������� - RuntimeException, �.�. ����.*/
    public static double[] privateArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("����� �������� ������ ���� �����");
        }
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = (double) arr1[i]/arr2[i];
        }
        return result;
    }
}


