// Calculate Average Of N Numbers
import java.util.*;
public class A3Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers to be entered  : ");
        int N = sc.nextInt();
        double sum = 0 , avg ;
        System.out.println("Enter the number : ");
        for (int i = 1; i <= N ; i++) {
            int n = sc.nextInt();
            sum+=n;
        }
        avg = sum/N;
        System.out.println("The average of  "+ N +" numbers entered is : "+ avg);
        sc.close();
    }
}
