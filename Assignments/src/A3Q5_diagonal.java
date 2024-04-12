import java.util.*;
public class A3Q5_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal 1 : ");
        double d1 = sc.nextDouble();
        System.out.println("Enter diagonal 2 : ");
        double d2 = sc.nextDouble();
        System.out.println("Area of ||gm is : "+ (0.5*d1*d2));
        sc.close();
    }
}
