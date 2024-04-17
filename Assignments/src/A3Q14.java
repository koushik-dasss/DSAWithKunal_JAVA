/* Volume Of Cone Java Program */
import java.util.*;
public class A3Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone : ");
        double r = sc.nextDouble();
        System.out.println("Enter the height of the cone : ");
        double h = sc.nextDouble();
        System.out.println("The volume of the cone is : "+ (1/3.0)*Math.PI*r*r*h);
        sc.close();
    }
}
