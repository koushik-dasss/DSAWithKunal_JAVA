// Perimeter Of Circle
import java.util.*;
public class A3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double r = sc.nextDouble();
        System.out.println("Perimeter is : "+(2*Math.PI*r));

        sc.close();
    }
}
