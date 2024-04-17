// Perimeter Of Rectangle
import java.util.*;
public class A3Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle : ");
        int b = sc.nextInt();
        System.out.println("The perimeter of the rectangle is : "+2*(l+b));
        sc.close();
    }
}
