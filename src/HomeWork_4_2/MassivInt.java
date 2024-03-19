package HomeWork_4_2;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class MassivInt {
    public static void main(String[] args) {
        Instant start=Instant.now();
        int[] massivint = new int[100_000];
        for (int i = 0; i < massivint.length; i++) {
//            Random random = new Random();
//            int randint = random.nextInt(1, 1000000);
//            massivint[i] = randint;
            massivint[i] = (int) (Math.random()*1000000);
            System.out.println(massivint[i]);
            sort.Bubble(massivint);


            Instant finish =Instant.now();
            Long elapsedTime= Duration.between(start,finish).toSeconds();
            System.err.println("\n"+elapsedTime);
        }

    }
}
