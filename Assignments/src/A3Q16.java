// Volume Of Cylinder
import java.util.*;
public class A3Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double h = sc.nextDouble();
        System.out.println("Volume of the cylinder is : "+(Math.PI*r*h*h));
        sc.close();
    }
}
