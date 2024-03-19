import java.util.Arrays;
import java.util.Random;

public class SozdMassiv {
    public static void main(String[] args) {
        int[] massiv = new int[1000000];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = 1000000 + i;
        }
        Random random = new Random();
        int randomint = random.nextInt(1000000, 2000000);
        System.out.println("Случайное число: " + randomint);
//        System.out.println("Индекс случайного числа: " + Arrays.binarySearch(massiv,randomint));
        System.out.printf("Индекс случайного числа: " +
                SearchBinary.searchBinary(massiv, randomint, 0, massiv.length - 1));
    }
}
