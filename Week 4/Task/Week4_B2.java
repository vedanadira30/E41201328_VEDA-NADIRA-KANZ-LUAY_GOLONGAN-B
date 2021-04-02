package week4_b2;

/**
 *
 * E41201328
 */
public class Week4_B2 {

    public static void main(String[] args) {
        int i = 2;
   
            System.out.println("           Do_While Program");
            System.out.println("Kelipatan 2(1-100): ");
            System.out.println("=====================================");
            //command to run the program
        do {
            if ( i >= 2 ) 
               System.out.print(i + " ");   
            i += 2;
        } while ( i <= 100);
    }
}
    
