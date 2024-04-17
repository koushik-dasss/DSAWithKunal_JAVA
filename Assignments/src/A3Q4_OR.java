import java.util.*;
public class A3Q4_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equal side of the isosceles triangle : " );
        double a = sc.nextDouble();
        System.out.println("Enter the other side of the isosceles triangle : ");
        double b = sc.nextDouble();
        System.out.println("The height of the triangle is : ");
        double h = Math.sqrt((a*a)-(b*b)/4);
        System.out.println(h);
        System.out.println("The area of the isosceles triangle is : "+ (0.5*a*h));
        sc.close();
    }
}
