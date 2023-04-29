package hw4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(linkList, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(linkList);

        System.out.println(dequeue(linkList)); // удалили первый элемент
        System.out.println(linkList);

        System.out.println(first(linkList)); // вывели первый элемент
        System.out.println(linkList); 
    }

    public static void enqueue(LinkedList<Integer> linkList, int num) {// помещает элемент в конец очереди
        linkList.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> linkList) { // возвращает первый элемент из очереди и удаляет его
        int num = linkList.get(0);
        linkList.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> linkList) { // возвращает первый элемент из очереди, не удаляя
        int num = linkList.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
