// To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class A4Q11_A2Q7 {
    public static int  Fibonacci(int n){
        int a = 0 , b = 1 , sum = 0 ;
        for(int i = 1 ; i<n ; i++){
             sum=a+b;
             a=b;
             b=sum;
         }
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
        sc.close();
    }
}
