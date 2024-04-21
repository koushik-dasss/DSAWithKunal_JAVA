// Calculate Average Marks
import java.util.*;
public class A3Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of subjects : ");
        int n = sc.nextInt();
        int sum = 0 ;
        System.out.println("Enter the marks : ");
        for(int i = 0 ; i<n ; i++){
            int m = sc.nextInt();
            sum+=m;
        }
        double avg = (double)(sum)/n;
        System.out.println("The average mark is : "+ avg);
        sc.close();
    }
}
