// HCF Of Two Numbers Program
import java.util.*;
public class A3Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        System.out.println("The HCF is : "+ a );
        sc.close();
    }
}
