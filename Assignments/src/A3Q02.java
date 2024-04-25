// Area Of Triangle
import java.util.*;
public class A3Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        double b = sc.nextDouble();
        System.out.println("Enter height : ");
        double h = sc.nextDouble();
        System.out.println("Area of triangle is : "+ (0.5*b*h));

        sc.close();
    }
}
