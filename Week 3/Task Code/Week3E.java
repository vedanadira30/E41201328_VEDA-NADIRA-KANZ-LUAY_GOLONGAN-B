package week2d;

import java.util.Scanner;

  /**
     E41201328 VEDA NADIRA KANZ LUAY TIF B
     */
public class Week3E {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu;
        String pembeli = scan.nextLine();
        
        System.out.println("CAFE CERIA");
        System.out.println("ANEKA MINUMAN");
        System.out.println("========================");
        System.out.println("SPECIAL MENU: ");
        System.out.println("1. SOFT DRINKS");
        System.out.println("2. MIX JUICE");
        System.out.println("3. NESCAFE");
        System.out.println("4. SODA MILK");
        System.out.println("5. TEA");
        System.out.println("========================");
        System.out.println("MASUKKAN NAMA PEMBELI :"+pembeli);
        
        System.out.println("SILAHKAN MASUKKAN PILIHAN ANDA :");
        menu = scan.nextLine();
        
        switch(menu) {
            case "1":
                System.out.println("MINUMAN YANG ANDA PESAN ADALAH SOFT DRINKS");
                break;
            case "2":
                System.out.println("MINUMAN YANG ANDA PESAN ADALAH MIX JUICE");
                break;
            case "3":
                System.out.println("MINUMAN YANG ANDA PESAN ADALAH NESCAFE");
                break;
            case "4":
                System.out.println("MINUMAN YANG ANDA PESAN ADALAH SODA MILK");
                break;
            case "5":
                System.out.println("MINUMAN YANG ANDA PESAN ADALAH TEA");
                break;
        }
        
        System.out.println("PESANAN AKAN SEGERA KAMI ANTAR");
        System.out.println("TERIMAKASIH "+pembeli+" TELAH BERKUNJUNG DI CAFE CERIA");
          
        }
    }
    
