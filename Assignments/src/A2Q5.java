// Take 2 numbers as input and print the largest number.
import java.util.*;
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1+" is largest");
        }else{
            System.out.println(num2+" is largest");
        }
        sc.close();
    }
}
