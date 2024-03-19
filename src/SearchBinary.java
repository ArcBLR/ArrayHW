public class SearchBinary {
    static int searchBinary(int[] massiv, int randomint, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (massiv[mid] < randomint) {
                low = mid + 1;
            } else if (massiv[mid] > randomint) {
                high = mid-1;
            } else if (massiv[mid] == randomint) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

