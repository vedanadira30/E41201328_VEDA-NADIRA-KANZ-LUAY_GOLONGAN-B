package conditionalstatement2;

import java.util.Scanner;

  /**
     E41201328 VEDA NADIRA KANZ LUAY TIF B
     */
public class ConditionalStatement2 {

    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan Nama Warna : ");
        lampu = scan.nextLine();
        
        switch(lampu){
            case "merah":
                System.out.println("Lapu merah, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, Hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, Jalan!");
                break;
            default:
                System.out.println("Warna lampu tidak diketahui!");              
        }
                 
    }
    
}
