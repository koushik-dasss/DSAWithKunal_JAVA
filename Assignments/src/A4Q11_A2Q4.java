// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class A4Q11_A2Q4 {
    public static int MATHS(String S, int a , int b ){
        if(S.equals("+")){
            return a+b;
        }else if(S.equals("-")){
            return a-b;
        }else if(S.equals("*")){
            return a*b;
        }else if(S.equals("/") && b!=0){
            return a/b;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator : ");
        String S = sc.nextLine();
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result is : " + MATHS(S,a,b));
        sc.close();
    }
}
