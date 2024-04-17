// Fibonacci Series In Java Programs
import java.util.*;
public class A3Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();
        int a = 0 , b = 1 , sum = 0 ;
        for(int i = 1 ; i<=N ; i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("Series at " + N +"th  term is : "+  sum);

        sc.close();
    }
}
