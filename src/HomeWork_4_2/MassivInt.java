package HomeWork_4_2;

import java.util.Arrays;

public class MassivInt{
    public static void main(String[] args) {
        int[] massivint = new int[100_000];
        for (int j = 0; j < massivint.length; j++) {
            massivint[j] = (int) (Math.random() * 1000000);
        }
        boolean isSorted = false;
        int buffers;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massivint.length - 1; i++) {
                if (massivint[i] > massivint[i + 1]) {
                    isSorted = false;

                    buffers = massivint[i];
                    massivint[i] = massivint[i + 1];
                    massivint[i + 1] = buffers;

                }
            }
        }
        System.out.println(Arrays.toString(massivint));
    }
}
