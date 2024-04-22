// Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.*;
public class A4Q04 {
    public static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println("The sum of "+ a + " and "+ b + " is : "+ sum(a,b));
        sc.close();
    }
}
