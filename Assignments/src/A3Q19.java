// Curved Surface Area Of Cylinder
import java.util.*;
public class A3Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder : ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cylinder : ");
        double h = sc.nextDouble();
        System.out.println("The CSA of the cylinder is : "+ (2*Math.PI*r*h));
        sc.close();
    }
}
