package OOP.DZ_to_Sem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Main m = new Main();
        Protected data1 = m.getProtectedData();
        System.out.println(ANSIConstants.ANSI_GREEN + "ORIGINAL DATA: \n"
                + ANSIConstants.ANSI_RESET + data1);

        System.out.println(data1.getPassword());
        System.out.println(Arrays.toString(data1.getUsername()));
        System.out.println(data1.getCard());
    }

    public Protected getProtectedData() {
        return new Protected(new String[]{"Ivan Ivanov"}, "4272 2909 8061 3962", 12345);
    }

}
