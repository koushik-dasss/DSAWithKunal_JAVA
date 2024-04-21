// Power In Java
import java.util.*;
public class A3Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int b = sc.nextInt();
        System.out.println("Enter the power : ");
        int p = sc.nextInt();
        int result = 1 ;
        for(int i = 1 ; i<= p ; i++){
            result*=b;
        }
        System.out.println(b +" to the power " + p + " is : " + result);
        sc.close();
    }
}
