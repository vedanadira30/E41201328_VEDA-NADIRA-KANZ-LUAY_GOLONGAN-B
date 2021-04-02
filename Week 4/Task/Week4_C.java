package week4_c;
import java.util.Scanner;
/**
 *
 * E41201328 VEDA NADIRA KANZ LUAY TIF B
 */
public class Week4_C {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value, max, min, i, array[];
        float average = 0, total = 0;
        
        System.out.print ("Masukan Banyaknya Data Nilai = ");
        value = scan.nextInt();        
        
        array = new int[value];
        
        for ( i = 0; i < value; i++ ){
            System.out.print ("Masukkan data nilai ke-" + (i + 1) +" = ");
            array [i] = scan.nextInt();
        }
        max = array[0];
        min = array[0];  
        
        for ( i = 0; i < value; i++ ){
            total = total + array[i];
            if (array[i] > max){
                max = array[i];
            } else;
            
            average = total/value;
        }
        System.out.println(" ");
        System.out.println("Nilai Minimum = " +min);
        System.out.println("Nilai Maksimum = " +max);
        System.out.println("Nilai rata-ratanya adalah " +average);
        
        
    }
    
}
