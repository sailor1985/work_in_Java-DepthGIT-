package Exeptions.Sem3;

import java.io.IOException;

public class Sem3 {
    public static void main(String[] args) {
        //Задача 1:
//        try {
//            doSomething();
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }

        //Задача 3:
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

        //Задача 4:
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

    //Задача 1:
    //Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
    //(тело самого метода прописывать не обязательно). Вызовите этот метод из main и обработайте в нем исключение,
    //которое вызвал метод doSomething().
    public static void doSomething() throws RuntimeException {
        throw new RuntimeException("This is exception");
    }

    //Задача 2:
    //Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
    //Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources.
    //Подумайте, что должно происходить при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
    //При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
public static class Count implements AutoCloseable {
        public static void main(String[] args) {

        }
        private Integer value = 0;
        public void add() throws IOException {
            if (isClose()) {
                throw new IOException("Ресурс закрыт ");
            }
            value += 1;
        }
        public Integer getValue() throws IOException {
            if (isClose()) {
                throw new IOException("Ресурс закрыт ");
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

    //Задача 3:
    //Создайте класс исключения, который будет выбрасываться при делении на 0.
    //Исключение должно отображать понятное для пользователя сообщение об ошибке.
    //Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
    //Исключение должно отображать понятное для пользователя сообщение об ошибке
    //Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
    // Исключение должно отображать понятное для пользователя сообщение об ошибке.

    //Задача 4:
    //Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    //При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    //Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    //должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
    //и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
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




