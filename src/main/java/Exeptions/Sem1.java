package Exeptions;

public class Sem1 {
    public static void main(String[] args) {
        //Задача 1:
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int [] arr1 = null;
        //System.out.println(sizeArray(arr, 15));

        //Задача 2:
        //printCodExeptions(Array(arr, 4, 1));
        //printCodExeptions(Array(arr, 4, 11)); // -1
        //printCodExeptions(Array(arr, 55, 1)); // -2
        //printCodExeptions(Array(null, 4, 1)); // -3

        //Задача 3:
        int [][] matrix = new int [][] {{2,0,0},{1,1,1},{1,0,0}};
        //System.out.println(SumBin(new int [][] {{1,0,0},{1,1,1},{1,0,0}}));
        //System.out.println(SumBin(new int [][] {{2,0,0},{1,1,1},{1,0,0}}));
        //System.out.println(SumBin(new int [][] {{2,0,0},{1,1,1},{1,0,0},{1,1,1},{1,0,0}}));

        //Задача 4:
        //CheckArray(new Integer[] {1,2,3,4,5,6,7});
        CheckArray (new Integer[] {1,null,3,4,null,6,7});
    }

    /* Задача 1:
       Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
       Если длина массива меньше некоторого заданного минимума,
       метод возвращает -1, в качестве кода ошибки, иначе - длину массива.*/
    public static int sizeArray(int [] arr, int min) {
        int a = arr.length;
        if (a < min) {
            return -1;
        }
        return a;
    }

    /* Задача 2:
       Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
       Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
       если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
       если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
       если вместо массива пришел null, метод вернет -3
       придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

       Напишите метод, в котором реализуйте взаимодействие с пользователем.
       То есть, этот метод запросит искомое число у пользователя, вызовет первый,
       обработает возвращенное значение и покажет читаемый результат пользователю.
       Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/
    public static int Array(int [] arr, int value, int min){
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }
    public static void printCodExeptions(int cod){
        if (cod == -3) {
            System.out.println("Вместо массива пришел null");
        } else if (cod == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (cod == -1) {
            System.out.println("Длина массива меньше некоторого заданного минимума");
        } else System.out.println("Индекс =" + cod);
    }

    /* Задача 3:
       Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
       Необходимо посчитать и вернуть сумму элементов этого массива.
       При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
       и в каждой ячейке может лежать только значение 0 или 1.
       Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/
    public static int SumBin(int[][] arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Массив не бинарный. Элемент равен " + arr[i][j]);
                }
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    /* Задача 4:
       Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
       Метод должен пройтись по каждому элементу и проверить что он не равен null.
       А теперь реализуйте следующую логику:
       Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
       Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”*/
    public static void CheckArray (Integer[] array){
        StringBuilder errIndex= new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null){
                errIndex.append(" ").append(i);
            }
        }
        if (!errIndex.toString().equals("")) throw new RuntimeException ("Индексы ошибок:" + errIndex);
        else System.out.println("Ошибок нет");
    }
}
