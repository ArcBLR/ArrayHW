package HomeWork_4_2;

public class BubbleSort {
    static void bubbleSort(int[] massiveBS) {

        boolean isSorted = false;
        int buffers;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massiveBS.length - 1; i++) {
                if (massiveBS[i] > massiveBS[i + 1]) {
                    isSorted = false;

                    buffers = massiveBS[i];
                    massiveBS[i] = massiveBS[i + 1];
                    massiveBS[i + 1] = buffers;
                }
            }
        }
    }
}
