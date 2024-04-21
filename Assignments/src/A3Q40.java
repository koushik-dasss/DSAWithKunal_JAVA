// Armstrong Number In Java
import java.util.*;
public class A3Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = n ;
        int digit ;
        int sum = 0 ;
        while(n!=0){
            digit = n%10;
            sum+=(digit*digit*digit);
            n/=10;
        }
        if(num==sum){
            System.out.println(num+" is an armstrong number .");
        }else{
            System.out.println(num+" is not an armstrong number .");
        }
        sc.close();
    }
}
