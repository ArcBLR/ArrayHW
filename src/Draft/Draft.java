package Draft;

import java.util.Arrays;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа разделенные пробелом: ");
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        int i1 = Integer.valueOf(s[0]);
        int i2 = Integer.valueOf(s[1]);
        System.out.println(i1);
        System.out.println(i2);
        for (int r = i1; r < i2; r++){

        }

    }
}
