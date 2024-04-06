/*
 Flowcharts :-
 
 Start/Stop -> Oval
 Input/Output -> Curved Rectangle
 Processing ->  Rectangle
 Condition -> Diamond
 Flow of Program -> Arrow sign 


 Visualising the algorithms or the steps of the program in the form of pictorial description.




 */

// Program in place of flowchart (for revision )


// Name display

/*import java.util.*;
public class Lecture2_FOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+ name );
        sc.close();
    }
}
 */

// Salary question
/*
import java.util.*;
public class Lecture2_FOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        int s = sc.nextInt();
        if(s>10000){
            s+=2000;
        }else{
            s+=1000;
        }
        System.out.println("Salary is : "+ s );
        sc.close();
    }
}
*/




// Prime or not (Logic :- Square root check)

/*  import java.util.*;
public class Lecture2_FOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean b = true;
        int sqrt = (int)(Math.sqrt(num)); // sq. root taken out in advance so as to ignore TLE
        int i=2;
        while(i<=sqrt){  // i*i<=num is same as  i<=sqrt, but second one will not give TLE
            if(num%i==0){
                b=false;
                break;
            }
            i++;
        }
        if(b){
            System.out.println(num+ " is a prime number.");
        }else{
            System.out.println(num+ " is not a prime number.");
        }
        sc.close();
    }
}
*/

/*
Pseudocode :- Rough code of the logic used in the program
written irrespective of the programming language.


*/

