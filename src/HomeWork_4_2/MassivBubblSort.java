package HomeWork_4_2;

import java.util.Arrays;

public class MassivBubblSort {
    public static void main(String[] args) {
        int[] massivBS = new int[100_000];

        for (int j = 0; j < massivBS.length; j++) {
            massivBS[j] = (int) (Math.random() * 1000000);
        }

        boolean isSorted = false;
        int buffers;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massivBS.length - 1; i++) {
                if (massivBS[i] > massivBS[i + 1]) {
                    isSorted = false;

                    buffers = massivBS[i];
                    massivBS[i] = massivBS[i + 1];
                    massivBS[i + 1] = buffers;

                }
            }
        }
        System.out.println(Arrays.toString(massivBS));
    }
}
