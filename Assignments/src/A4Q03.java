// A person is eligible to vote if his/her age is greater than or equal to 18 .
// Define a method to find out if he/she is eligible to vote.
import java.util.*;
public class A4Q03 {
    public static String vote(int age){
        String result ;
        if(age>=18){
            result = "eligible";
        }else{
            result = "not eligible ";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        int age = sc.nextInt();
        System.out.println("The person is "+ vote(age)+"to cast his/her vote.");
        sc.close();
    }
}
