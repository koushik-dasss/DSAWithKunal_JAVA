// Calculate Distance Between Two Points
import java.util.*;
public class A3Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point-1 : ");
        double p = sc.nextDouble();
        System.out.println("Enter the point-2 : ");
        double q = sc.nextDouble();
        System.out.println("The distance between "+ p + " and " + q + " is : "+ Math.sqrt(Math.abs(p*p-q*q)));
        sc.close();
    }
}
