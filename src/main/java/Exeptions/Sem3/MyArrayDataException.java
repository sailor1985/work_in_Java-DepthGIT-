package Exeptions.Sem3;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i ,int j) {
        super("� ������ � ��������� " + i + " " + j + " ��� �������� ������");
    }
}