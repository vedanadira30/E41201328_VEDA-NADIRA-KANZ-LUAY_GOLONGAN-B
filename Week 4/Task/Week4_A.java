package week4_a;
// first, import java.util.Scanner for using Scanner Method
import java.util.Scanner;

/**
 *
 * E41201328 VEDA NADIRA KANZ LUAY TIF B
 */
public class Week4_A {

    public static void main(String[] args) {
            //import Scanner
            Scanner scan = new Scanner(System.in);
            //Variables
            int first,last;
         
            
            System.out.println("Display Even Number Sequence Program");
            
            System.out.println("-------------------------------------");
            //program code to enter first value according to user
            System.out.print("Input First Value :");
            first = scan.nextInt();
            //program code to enter last value according to user
            System.out.print("Input Last Value :");
            last = scan.nextInt();
            //command to run the program
            System.out.println("Result :");
            
            for( int i=first; i<=last; i++ ){
                if (i%2==0)
                    System.out.print(i+ " ");
                 
            }
            System.out.println(" ");
            System.out.println("Hope This Could Help You!");
            
    }
    
}
// It works!
