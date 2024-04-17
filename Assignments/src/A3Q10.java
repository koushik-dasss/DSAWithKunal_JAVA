// Perimeter Of Parallelogram
import java.util.*;
public class A3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the ||gm : ");
        int s = sc.nextInt();
        System.out.println("Enter the base of the ||gm : ");
        int b = sc.nextInt();
        System.out.println("The perimeter of the ||gm ids : "+ 2*(b+s));
        sc.close();
    }
}
