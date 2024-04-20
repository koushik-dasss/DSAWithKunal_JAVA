// Calculate Discount Of Product
import java.util.*;
public class A3Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity to be bought of a product : ");
        double q = sc.nextDouble();
        System.out.println("Enter the price of the product : ");
        double p = sc.nextDouble();
        System.out.println("Enter the %  of  discount to be applied : ");
        double d = sc.nextDouble();
        System.out.println("The amount to be paid after getting discount is : "+ ((q*p)-(d/100*(q*p))));
        sc.close();
    }
}
