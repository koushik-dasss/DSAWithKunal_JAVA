// Calculate Commission Percentage
import java.util.*;
public class A3Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter commission amount : ");
        double c = sc.nextDouble();
        System.out.println("Enter total sales or revenue : ");
        double r = sc.nextDouble();
        System.out.println("The commission % is : "+ (c/r)*100);
        sc.close();
    }
}
