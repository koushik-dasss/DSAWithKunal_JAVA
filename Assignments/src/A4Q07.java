// Define a method to find out if a number is prime or not .
import java.util.*;
public class A4Q07 {
    public static boolean isPrime(int n){
        int i = 2 ;
        boolean b = true;
        int sqrt = (int)(Math.sqrt(n));
        while(i<=sqrt){
            if(n%i==0){
                b=false;
                break;
            }
            i++;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+" is prime : "+ isPrime(n));
        sc.close();
    }
}
