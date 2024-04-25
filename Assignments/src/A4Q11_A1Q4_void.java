//
import java.util.*;
public class A4Q11_A1Q4_void {
    public static void HCF_LCM(int a , int b ){
        int num1 = a , num2 = b ;
        while(b!=0){
            int temp = b ;
            b = a%b;
            a = temp;
        }
        System.out.println("The HCF is : "+ a );
        System.out.println("The LCM is : "+ (num1*num2)/a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt(), b = sc.nextInt();
        HCF_LCM(a,b);
        sc.close();
    }
}
