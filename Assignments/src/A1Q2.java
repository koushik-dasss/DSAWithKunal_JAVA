// Take two numbers and print the sum of both.

import java.util.*;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("The sum is : "+ (num1+num2));
        sc.close();
    }
}
