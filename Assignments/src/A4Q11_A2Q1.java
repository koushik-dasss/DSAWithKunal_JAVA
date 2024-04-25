// Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class A4Q11_A2Q1 {
    public static String even_odd(int n){
        if(n%2==0){
            return "even";
        }
        return "odd";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+" is  "+ even_odd(n));
        sc.close();
    }
}
