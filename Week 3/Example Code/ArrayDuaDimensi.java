package arrayduadimensi;
  /**
     E41201328 VEDA NADIRA KANZ LUAY TIF B
     */
public class ArrayDuaDimensi {

    public static void main(String[] args) {
        int [][] angka = {{5, 4, 2, 1, 5}, {9, 6, 5, 7, 8}, {5, 2, 1, 5, 10}};
        for(int baris=0; baris < 3; baris++){
            for(int kolom=0; kolom < 5; kolom++){
                System.out.print(angka[baris][kolom]+"  ");
            }
            System.out.println((""));
        }
      
    }
    
}
