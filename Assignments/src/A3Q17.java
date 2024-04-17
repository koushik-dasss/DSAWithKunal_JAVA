// Volume Of Sphere
import java.util.*;
public class A3Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere : ");
        double r = sc.nextDouble();
        System.out.println("Volume of the sphere is : "+ (4/3.0)*Math.PI*r*r*r);
        sc.close();
    }
}
