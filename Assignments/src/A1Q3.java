// Take a number as input and print the multiplication table for it.

import java.util.*;
public class A1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num+"*"+i+"="+(num*i));
        }
        sc.close();
    }
}
