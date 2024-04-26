// Input currency in rupees and output in USD.
import java.util.*;
public class A4Q11_A2Q6 {
    public static double  USD(double INR){
        return INR/83.34;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR value : ");
        double INR = sc.nextDouble();
        System.out.println("The USD value is : "+ USD(INR));
        sc.close();
    }
}
