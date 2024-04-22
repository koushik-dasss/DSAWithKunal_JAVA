// Write a function to find if a number is  palindrome or not . Take number as a parameter.
import java.util.*;
public class A4Q10 {
    public static boolean palindrome(int n ){
        int rev = 0 ;
        int num = n ;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return num==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+" is palindrome : "+ palindrome(n));
        sc.close();
    }
}
