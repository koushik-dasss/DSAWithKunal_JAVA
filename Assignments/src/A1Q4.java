// Take 2 numbers as inputs and find their HCF and LCM.

import java.util.*;
public class A1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int B = b ;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        int GCD = a;
        int LCM = (a*B)/GCD;


        System.out.println("The GCD is : "+ GCD);
        System.out.println("The LCM is : "+ LCM);


        sc.close();
    }
}
