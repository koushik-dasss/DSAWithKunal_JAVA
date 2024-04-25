// Input a year and find whether it is a leap year or not.
import java.util.*;
public class A4Q11_A1Q1 {
    public static boolean LeapYear(int n ){
       return ((n%4==0 && n%100!=0)|| (n%400==0));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int n =sc.nextInt();
        System.out.println(n+" is a leap year :  "+ LeapYear(n));
        sc.close();
    }
}
