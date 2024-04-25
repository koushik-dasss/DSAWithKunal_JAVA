// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class A4Q11_A2Q3 {
    public static double SI(double P , double R , int T ){
        return (P*R*T)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P,R & T :  ");
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        int  T = sc.nextInt();
        System.out.println("SI is : "+ SI(P,R,T));
        sc.close();
    }
}
