// Area Of Circle Java Program
import java.util.*;
public class A3Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        double r = sc.nextDouble();
        System.out.println("Area of the circle is: "+ (Math.PI*r*r));
        sc.close();

    }
}
