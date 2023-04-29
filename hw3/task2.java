package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка чисел: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int numList = iScanner.nextInt();
            ArrayList<Integer> arrayNum = new ArrayList<Integer>();
            Random rnd = new Random();
            for (int i = 0; i < numList; i++) {
                int x = rnd.nextInt(numList);
                arrayNum.add(x);
            }
            System.out.println("Случайны список целых чисел: \n " + arrayNum);

            for (int i = arrayNum.size() - 1; i >= 0; i--) {
                int even = arrayNum.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + arrayNum.get(i));
                    arrayNum.remove(i);
                }
            }
            Collections.sort(arrayNum);
            System.out.println("Список с удаленными четными числами: \n " + arrayNum);
        }
    }
}
