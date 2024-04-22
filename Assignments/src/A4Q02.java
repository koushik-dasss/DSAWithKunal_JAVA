// Define a program to find out whether a given number is even or odd .
import java.util.*;
public class A4Q02 {
    public static String EvenOdd(int n ){
        String result ;
        if(n%2==0){
            result = "even";
        }else{
            result = "odd";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n+" is "+ EvenOdd(n));
        sc.close();
    }
}
