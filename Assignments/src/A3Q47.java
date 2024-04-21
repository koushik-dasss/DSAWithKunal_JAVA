// Java Program Vowel Or Consonant
import java.util.*;
public class A3Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  letter : ");
        char ch = sc.next().charAt(0);
        if (ch == 'A' || ch == 'a' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'u' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        }else {
            System.out.println(ch + " is a consonant .");
        }
        sc.close();
    }
}
