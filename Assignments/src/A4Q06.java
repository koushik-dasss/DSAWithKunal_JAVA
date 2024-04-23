// Write a program to print the circumference and area of a circle of radius
// entered by  user by defining your own method.
import java.util.*;
public class A4Q06 {
    public static double  circumference(double  r ){
        return 2*Math.PI*r;
    }
    public static double area(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        double r = sc.nextDouble();
        System.out.println("The circumference of the circle is : "+ circumference(r));
        System.out.println("The area of the circle is : "+ area(r));
        sc.close();
    }
}
