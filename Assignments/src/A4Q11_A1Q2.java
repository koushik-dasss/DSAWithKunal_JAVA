// Take two numbers and print the sum of both.
import java.util.*;
public class A4Q11_A1Q2 {
    public static int sum(int a , int b ){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println("Sum is : "+ sum(a,b));
        sc.close();
    }
}
