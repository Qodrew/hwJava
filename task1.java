// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.printf("Enter the number: ");
        Scanner numbers = new Scanner(System.in);
        int n = numbers.nextInt();
        int sum = 0;
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            prod *= i;            
        }
        System.out.printf("The sum of the numbers from 1 to %d: %d%n", n, sum);
        System.out.printf("The product of the numbers from 1 to %d: %d%n", n, prod);
        numbers.close();
     }
    
}