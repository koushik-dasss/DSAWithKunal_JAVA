// To calculate Fibonacci Series up to n numbers.
import java.util.*;
public class A2Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int a = 0 , b = 1 , sum = 0 ;
        for(int i = 1 ; i<=n ; i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
        sc.close();
    }
}
