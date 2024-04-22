// Write a function that returns the sum of first n natural numbers .
import java.util.*;
public class A4Q14 {
    public static int sum(int n ){
        int sum = 0 ;
        for(int i = 1 ; i<= n ; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("The sum of first "+ n + " natural numbers is : "+ sum(n));
        sc.close();
    }
}
