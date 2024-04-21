// Perfect Number In Java
import java.util.*;
public class A3Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sqrt = (int)(Math.sqrt(n));
        int sum = 0 ;
        for(int i = 1 ; i<=sqrt ; i++){
            if(n%i==0){
                sum+=i;
                if(n!=n/i){
                    sum+=n/i;
                }
            }
        }if(sum==n){
            System.out.println(n+" is a perfect number.");
        }else{
            System.out.println(n+" is not a perfect number.");
        }
        sc.close();
    }
}
