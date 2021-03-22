
package week2a;

import java.util.Scanner;

public class Week3D {

    /**
     E41201328 VEDA NADIRA KANZ LUAY TIF B
     */
    
    public static void main(String[] args) {
        String hadiah;
        Scanner scan = new Scanner(System.in);
        
        String pembeli = scan.nextLine();
        
        int barang1 = scan.nextInt();
        int barang2 = scan.nextInt();
        int barang3 = scan.nextInt();
        int barang4 = scan.nextInt();
        int barang5 = scan.nextInt();
        
        int total=barang1+barang2+barang3+barang4+barang5;
        
        
        System.out.println("-----------------------------------------------");
        System.out.println("           KHARISMA AGUNG PLAZA (KAP)          ");
        System.out.println("            PROMO BELANJA BERHADIAH            ");
        System.out.println("       KHUSUS PEMMBELIAN 5 BARANG PERTAMA      ");
        System.out.println("        DENGAN BIAYA MINIMUM RP 10000,00       ");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan Nama Pembeli : "+pembeli);
        System.out.println("Masukkan Harga Barang ke-1 :"+barang1);
        System.out.println("Masukkan Harga Barang ke-2 :"+barang2);
        System.out.println("Masukkan Harga Barang ke-3 :"+barang3);
        System.out.println("Masukkan Harga Barang ke-4 :"+barang4);
        System.out.println("Masukkan Harga Barang ke-5 :"+barang5);
        
        System.out.println("Total Harga Pembelian Atas Nama "+pembeli+" adalah :"+total);
        
        if (total >= 10000) {
            hadiah = "SELAMAT ANDA MENDAPATKAN 1 MUG CANTIK";
        }else { 
            hadiah = "TAMBAH TOTAL BELANJAMU DAN DAPATKAN HADIAH LANGSUNG";
        } 
        
        System.out.println(hadiah);
        System.out.println("-----------------------------------------------");
        System.out.println("                TERIMA KASIH                   ");
        System.out.println("        ANDA SUDAH BELANJA DI KHARISMA AGUNG PLAZA");
    }
}
