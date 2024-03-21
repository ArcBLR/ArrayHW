package HomeWork_4_3;

import java.util.LinkedList;
import java.util.Scanner;

public class ListLinked {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < i + 2 & i > 0; i++) {
            System.out.println("Введите элемент для добавления в лист (если ввести \"stop\" ввод будет остановлен: ");
            String next = scanner.nextLine();
            linkedList.addLast(next);
            switch (next) {
                case "stop":
                    i = -1;
                    linkedList.removeLast();
                    System.out.println(linkedList);
                    break;
            }
        }
        System.out.println("Введите индекс и через пробел элемент который хотите добавить (пример \"5 элемент\"): ");
        String next3 = scanner.nextLine();
        String[] s = next3.split(" ");
        int i1 = Integer.valueOf(s[0]);
        String i2 = String.valueOf(s[1]);
        linkedList.add(i1, i2);
        System.out.println(linkedList);

        System.out.println("Введите один элемент который хотите добавить: ");
        String next1 = scanner.next();
        linkedList.addLast(next1);
        System.out.println(linkedList);
        System.out.println("Введите один элемент который хотите удалить: ");
        String next2 = scanner.next();
        linkedList.remove(next2);
        System.out.println(linkedList);

        System.out.println("Удаляем весь массив");

           for (int i=0;i<linkedList.size();){
            linkedList.remove();

        }
        System.out.println(linkedList);
    }
}
