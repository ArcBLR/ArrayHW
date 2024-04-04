package HomeWork_4_3;

public class MyArrayList {
    static String[] newMassive = new String[]{"NewElem_100", "NewElem_101", "NewElem_102", "NewElem_103", "NewElem_104"};

    public static void main(String[] args) {
        String ds = "Длинна списка ";
        MassList<String> list = new MassList<>();
        System.out.println("Наполняем список элементами");
        for (int i = 0; i < 6; i++) {
            list.add("Ellement_" + i);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println(ds + list.size());

        System.out.println("Добавлям массив \"newMassive\" к нашему списку");
        for (int i = 0; i < newMassive.length; i++) {
            list.add(newMassive[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println(ds + list.size());

        System.out.println("Добавляем один элемент");
        list.add("Ellement_6_6");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println(ds + list.size());

        System.out.println("Добавляем в список элемент с индексом 6");
        list.add(6, "Ellement_5_5");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println(ds + list.size());

        System.out.println("Удаляем из списка элемент с индексом 5");
        list.remove(5);
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println(ds + list.size());

        System.out.println("Очищаем список");
        list.clear();
        System.out.println(ds + list.size());
    }
}

