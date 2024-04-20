// Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class A3Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0 , p = 1 ;
        while(n!=0){
            sum+=(n%10);
            p*=(n%10);
            n/=10;
        }
        System.out.println("The difference between the product of digits and sum of digits  is : "+ (p-sum));
        sc.close();
    }
}
