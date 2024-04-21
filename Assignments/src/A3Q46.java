// LCM Of Two Numbers
import java.util.*;
public class A3Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num1= a , num2 = b ;
        while(b!=0){
            int temp = b ;
            b=a%b;
            a=temp;
        }
        int LCM = (num1*num2)/a;
        System.out.println("The LCM is : "+ LCM );
        sc.close();
    }
}
