package HomeWork_4_2;

import java.util.Random;

public class MassivInt {
    public static void main(String[] args) {
        int[] massivint = new int[1000000];
        for (int i = 0; i < massivint.length; i++) {
            Random random = new Random();
            int randint = random.nextInt(2, 2000000);
            massivint[i] = randint;
        }
    }
}
