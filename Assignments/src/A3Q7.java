// Area Of Equilateral Triangle
import java.util.*;
public class A3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral triangle : ");
        double  a = sc.nextInt();
        System.out.println("The area of the equilateral triangle is : "+ (Math.sqrt(3)/4.0*(a*a)));
        sc.close();
    }
}
