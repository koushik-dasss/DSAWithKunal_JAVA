// Take 2 numbers as input and print the largest number.
import java.util.*;
public class A4Q11_A2Q5 {
    public static int Largest(int a , int b ){
        if(a>b){
            return a ;
        }
        return b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Largest(a,b)+ " is largest .");
        sc.close();
    }
}
