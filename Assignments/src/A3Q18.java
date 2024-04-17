// Volume Of Pyramid
import java.util.*;
public class A3Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base length : ");
        double l = sc.nextDouble();
        System.out.println("Enter the base width : ");
        double w = sc.nextDouble();
        System.out.println("Enter the pyramid  height : ");
        double h = sc.nextDouble();
        System.out.println("Volume of the pyramid is : "+ (l*w*h)/3);
        sc.close();
    }
}
