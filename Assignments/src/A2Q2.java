// Take name as input and print a greeting message for that particular name.
import java.util.*;
public class A2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Good Morning , "+ name + " ! ");
        sc.close();
    }
}
