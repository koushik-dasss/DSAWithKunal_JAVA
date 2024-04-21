// // Calculate CGPA Java Program
// CGPA = (Total Percentage ÷ Total Semesters) ÷ 9.5.
// Calculating here for one semester
import java.util.*;
public class A3Q36_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of semesters : ");
        double n = sc.nextDouble();
        System.out.println("Enter the percentage in each semester : ");
        double sum = 0 ;
        for (int i = 0; i < n  ; i++) {
            double p = sc.nextDouble();
            sum+=p;
        }
        double CGPA = (sum/n)/9.5;
        System.out.println("The CGPA is : "+ CGPA );
        sc.close();
    }
}
