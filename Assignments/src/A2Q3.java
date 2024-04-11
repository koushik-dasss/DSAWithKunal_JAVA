// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class A2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal : ");
        double p = sc.nextDouble();
        System.out.println("Enter the time : ");
        int t = sc.nextInt();
        System.out.println("Enter ROI : ");
        double r = sc.nextDouble();
        double SI = (p*r*t)/100;
        System.out.println("SI is : "+ SI);
        sc.close();
    }
}
