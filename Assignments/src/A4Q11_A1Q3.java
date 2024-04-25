// Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class A4Q11_A1Q3 {
    public static void table(int n ){
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        table(n);
        sc.close();

    }
}
