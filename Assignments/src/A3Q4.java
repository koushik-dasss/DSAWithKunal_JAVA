// Area Of Isosceles Triangle
import java.util.*;
public class A3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height  of the triangle : ");
        double h = sc.nextDouble();
        System.out.println("Enter the side of the triangle which is equal to the other side : ");
        double a = sc.nextDouble();
        System.out.println("Area of Isosceles triangle is : "+ (1/2.0)*h*a);
        sc.close();
    }
}
