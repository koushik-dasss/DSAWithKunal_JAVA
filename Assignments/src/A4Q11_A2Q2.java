// Take name as input and print a greeting message for that particular name.
import java.util.*;
public class A4Q11_A2Q2 {
    public static String greeting(String name ){
        return  name;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Good Morning , "+ greeting(name));
        sc.close();
    }
}
