// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.*;
public class A3Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.MIN_VALUE , sum = 0;
        System.out.println("Enter the number till the input is 0 : ");
        while(num!=0){
            num = sc.nextInt();
            sum+=num;
        }
        System.out.println("The required sum is : "+ sum);
        sc.close();
    }
}
