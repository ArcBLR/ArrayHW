package HomeWork_4_2;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа разделенные пробелом: ");
        String next = scanner.nextLine();
        scanner.close();
        String[] s = next.split(" ");
        int i1 = Integer.valueOf(s[0]);
        int i2 = Integer.valueOf(s[1]);
        System.out.println(i1);
        System.out.println(i2);
        for (int r = i1; r <=i2; r++){
            System.out.print(" " + massivBS[r]);
        }
    }
}
