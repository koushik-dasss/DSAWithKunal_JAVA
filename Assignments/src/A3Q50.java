// Sum Of A Digits Of Number
import java.util.*;
public class A3Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int n = num ;
        int sum = 0 ;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println("Sum of digits of "+ num + " is "+ sum);
        sc.close();
    }
}
