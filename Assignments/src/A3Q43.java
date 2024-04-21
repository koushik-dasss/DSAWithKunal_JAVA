// Find if a number is palindrome or not
import java.util.*;
public class A3Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt(), reverse = 0 ;
        int num = n ;
        if(n<0){
            System.out.println(n+" is not a palindrome number .");
        }else if(n<=9){
            System.out.println(n+" is a palindrome number.");
        }else {
            while (n != 0) {
                reverse = reverse * 10 + (n % 10);
                n /= 10;
            }
            if (reverse == num) {
                System.out.println(num + " is a palindrome number.");
            } else {
                System.out.println(num + " is not a palindrome number. ");
            }
        }
        sc.close();
    }
}
