// Volume Of Prism
import java.util.*;
public class A3Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the prism : ");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the prism : ");
        double h = sc.nextDouble();
        System.out.println("The volume of the prism is : "+(b*h));
        sc.close();
    }
}
