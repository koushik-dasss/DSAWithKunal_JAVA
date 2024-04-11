// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.*;
public class A1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = 0  , sum = 0  ;
        try{
            while(n!='x'){
                n = sc.nextInt();
                sum+=n;
            }


        }catch(InputMismatchException obj){
            System.out.println(obj);
            System.out.println("Input is not an integer.");
        }finally {
            sc.close();
        }
        System.out.println("Sum is : " + sum);

    }
}
