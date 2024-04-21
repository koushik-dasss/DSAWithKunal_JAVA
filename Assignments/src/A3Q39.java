// Sum Of N Numbers
import java.util.*;
public class A3Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int N = sc.nextInt();
        int sum = 0 ;
        System.out.println("Enter a number : ");
        for (int i = 0; i < N  ; i++) {
            int n = sc.nextInt();
            sum+=n;
        }
        System.out.println("The sum of "+ N + " numbers is : "+ sum );
        sc.close();
    }
}
