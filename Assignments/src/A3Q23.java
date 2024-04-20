// Input a number and print all the factors of that number (use loops).
import java.util.*;
public class A3Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("The factors are : ");
        for (int i = 1; i <= (num/2) ; i++) {
            if(num%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
