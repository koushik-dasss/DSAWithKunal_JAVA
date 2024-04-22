// Define a method that returns the product of two numbers entered by user.
import java.util.*;
public class A4Q05 {
    public static int product(int a , int b ){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println("The product of "+ a + " and "+ b +" is : "+ product(a,b));
        sc.close();
    }
}
