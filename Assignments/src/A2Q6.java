import java.util.*;
public class A2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in rupees : ");
        double RS = sc.nextDouble();
        double USD = (1/83.33)*RS;
        System.out.println("Currency in USD is " + USD);
        sc.close();
    }
}
