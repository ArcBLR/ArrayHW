import jdk.incubator.vector.VectorOperators;

import java.util.Random;

import static java.util.Arrays.binarySearch;

public class SozdMassiv {
    public static void main(String[] args) {
        int[] massiv = new int[1000000];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = 1000000 + i;
        }
        Random random = new Random();
        int randomint = random.nextInt(1000000, 2000000);
        System.out.println(randomint);
        System.out.printf("Случайный элемент - %d%n", binarySearch(massiv,randomint,0,massiv.length-1));
    }
}
