// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class A2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operator : ");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            System.out.println(num1+num2);
        } else if (ch=='-') {
            System.out.println(num1-num2);
        } else if (ch=='*') {
            System.out.println(num1*num2);
        } else if (ch=='/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            }
        }
        sc.close();
    }
}
