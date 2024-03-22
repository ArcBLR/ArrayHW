package Draft;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> states = new LinkedList<String>();
//
//        // Добавление элементов в список
//        states.add("Германия");
//        states.add("Франция");
//        // добавляем элемент в конец
//        states.addLast("Великобритания");
//        // добавляем элемент в первую позицию
//        states.addFirst("Испания");
//        // добавляем элемент с индексом 1
//        states.add(1, "Италия");
//
//        System.out.printf("В списке %d элементов \n",
//                states.size());
//        System.out.println(states.get(1));
//        states.set(1, "Дания");
//        for (String state : states) {
//            System.out.println(state);
//        }
//        // проверка на наличие элемента в списке
//        if (states.contains("Германия")) {
//            System.out.println(
//                    "Список содержит государство Германия");
//        }
//
//        states.remove("Германия");
//        states.removeFirst(); // удаление первого элемента
//        states.removeLast();  // удаление последнего элемента

        LinkedList<Person> people;
        people = new LinkedList<Person>();
        people.add(new Person("Алекс"));
        people.addFirst(new Person("Митя"));
        people.addLast(new Person("Прохор"));
//        people.remove(1); // удаление второго элемента

        for (Person p : people) {
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
//         вывод в консоль первого элемента
        System.out.println(first.getName());
    }
}


