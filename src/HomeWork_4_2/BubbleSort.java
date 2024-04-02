package HomeWork_4_2;

public class BubbleSort {
    static void bubbleSort(int[] massivBS) {

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
    }
}
