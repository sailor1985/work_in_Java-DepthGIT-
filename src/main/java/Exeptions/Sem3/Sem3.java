package Exeptions.Sem3;

import java.io.IOException;

public class Sem3 {
    public static void main(String[] args) {
        //������ 1:
//        try {
//            doSomething();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        //������ 3:
//        try {
//            throw new byZero();
//        } catch (byZero e) {
//            System.out.println(e);
//        }
//        try {
//            throw new emptyArray();
//        } catch (emptyArray e) {
//            System.out.println(e);
//        } try {
//            throw new absentFile();
//        } catch (absentFile e) {
//            System.out.println(e);
//        }

        //������ 4:
        String[][] arr = {
                {"1", "2", "3", "a"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            System.out.println(SumStringMatrics(arr));
        } catch (ArraySize | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    //������ 1:
    //�������� ����� doSomething(), ������� ����� ���� ���������� ������ �� ����� checked exceptions
    //(���� ������ ������ ����������� �� �����������). �������� ���� ����� �� main � ����������� � ��� ����������,
    //������� ������ ����� doSomething().
    public static void doSomething() throws RuntimeException {
        throw new RuntimeException("This is exception");
    }

    //������ 2:
    //�������� ����� �������, � �������� ���� ����� add(), ������������� �������� ���������� int ���������� �� 1.
    //�������� ���, ����� � �������� ������ ���� ����� ���� �������� � ����� try-with-resources.
    //���������, ��� ������ ����������� ��� �������� ����� �������? �������� ����� ��� ��������, ������ �� ������.
    //��� ������� ������� add() � ��������� �������, ������ ����������� IOException
public static class Count implements AutoCloseable {
        public static void main(String[] args) {

        }
        private Integer value = 0;
        public void add() throws IOException {
            if (isClose()) {
                throw new IOException("������ ������ ");
            }
            value += 1;
        }
        public Integer getValue() throws IOException {
            if (isClose()) {
                throw new IOException("������ ������ ");
            }
            return value;
        }
        @Override
        public void close() throws Exception {
            value = null;
        }
        public boolean isClose() {
            return value == null;
        }
    }

    //������ 3:
    //�������� ����� ����������, ������� ����� ������������� ��� ������� �� 0.
    //���������� ������ ���������� �������� ��� ������������ ��������� �� ������.
    //�������� ����� ����������, ������� ����� ��������� ��� ��������� � ������� �������� � ������� ���������� ����.
    //���������� ������ ���������� �������� ��� ������������ ��������� �� ������
    //�������� ����� ����������, ������� ����� ��������� ��� ������� ������� �������������� ����.
    // ���������� ������ ���������� �������� ��� ������������ ��������� �� ������.

    //������ 4:
    //�������� �����, �� ���� �������� ������� ��������� ��������� ������ �������� 4�4.
    //��� ������ ������� ������� ������� ���������� ������� ���������� MyArraySizeException.
    //����� ����� ������ �������� �� ���� ��������� �������, ������������� � int � ��������������.
    //���� � �����-�� �������� ������� �������������� �� ������� (��������, � ������ ����� ������ ��� ����� ������ �����),
    //������ ���� ������� ���������� MyArrayDataException � ������������, � ����� ������ ������ ����� �������� ������.
    //� ������ main() ������� ���������� �����, ���������� ��������� ���������� MyArraySizeException � MyArrayDataException
    //� ������� ��������� ������� (����� ���������, ��� ������� ��� ������ �� ���� ���������� ������).
    public static int SumStringMatrics(String[][] arr) throws MyArrayDataException, ArraySize {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySize();
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }
}




