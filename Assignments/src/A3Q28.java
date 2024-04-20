// Calculate Electricity Bill
import java.util.*;
public class A3Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units of electricity : ");
        int e = sc.nextInt();
        System.out.println("Enter the price per units used  : ");
        double p = sc.nextDouble();
        System.out.println("The total amount to be paid is : "+ (e*p));
        sc.close();
    }
}
