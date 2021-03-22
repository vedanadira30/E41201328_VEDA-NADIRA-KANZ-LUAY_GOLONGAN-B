package Week3;
import java.util.Scanner;
 
/**
     E41201328 VEDA NADIRA KANZ LUAY TIF B
     */

public class Week3B {
   public static void main(String[] args){
       
       System.out.println("Tugas 2 :" );
       System.out.println();
       System.out.println("Masukkan berapa banyak random angka :");
       Scanner scan = new Scanner(System.in);
       
       int jumlah = scan.nextInt();
       int[] deret = new int[jumlah];
       for (int i = 0; i <deret.length; i++){
           deret[i] = (int) (Math.random() * 100);
           System.out.print(deret[i] + " ");        
       }
       System.out.println();
   }
   
}
