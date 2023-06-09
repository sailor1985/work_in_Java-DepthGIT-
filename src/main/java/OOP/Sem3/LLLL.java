package OOP.Sem3;

public class LLLL {

    public class SuperList {
        private final int INIT_SIZE = 16;
        private final int CUT_RATE = 4;
        private String[] array = new String[INIT_SIZE];
        private int pointer = 0;


        public void add(String item) {
            if(pointer == array.length-1)
                resize(array.length*2);
            array[pointer++] = item;
        }


        public  String get (int index) {
            return array[index];
        }


        public void remove(int index) {
            for (int i = index; i<pointer; i++)
                array[i] = array[i+1];
            array[pointer] = null;
            pointer--;
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length/2);

        }

        public int size() {
            return pointer;
        }


        private void resize(int newLength) {
            String[] newArray = new String[newLength];
            System.arraycopy(array, 0, newArray, 0, pointer);
            array = newArray;
        }
    }

}
