// Calculate CGPA Java Program
import java.util.*;
public class A3Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // CGPA = (Total Percentage ÷ Total Semesters) ÷ 9.5.
        // Calculating here for one semester
        System.out.println("Enter the number of subjects : ");
        double n = sc.nextInt();
        double sum1 = 0 , sum2 = 0  ;
        System.out.println("Enter the full marks and secured marks of each subject respectively: ");
        for(int i = 0 ; i<n ; i++){
            double fm = sc.nextDouble();
            sum1+=fm;
            double sm = sc.nextDouble();
            sum2+=sm;
        }
        double p = (sum2/sum1)*100;
        System.out.println(p);
        double CGPA = p/9.5;
        System.out.println("CGPA is : "+ CGPA);
        sc.close();
    }
}
