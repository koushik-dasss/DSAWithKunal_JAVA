// Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;
public class A4Q11_A1Q4 {
    public static int  HCF(int a , int b ){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a ;
    }
    public static int LCM(int a , int b ){
        int num1 = a , num2 = b ;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return (num1*num2)/a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values  : ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("The HCF is : "+ HCF(a,b));
        System.out.println("The LCM is : "+ LCM(a,b));
        sc.close();
    }
}
