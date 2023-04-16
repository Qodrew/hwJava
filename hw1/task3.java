// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.printf("Enter the first number: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        
        System.out.printf("Enter the second number: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.printf("Enter the arithmetic operation: ");
        char operation = scanner.next().charAt(0);

        int result = 0;
        String resultDef = "";
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                resultDef = "Incorrect data entered ";
            }
    System.out.println("The result of the operation: " + result + resultDef);
    n1.close();
    n2.close();
    }
}
