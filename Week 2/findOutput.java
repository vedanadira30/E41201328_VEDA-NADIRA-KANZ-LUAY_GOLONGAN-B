// THIRD TASK FOR WORKSHOP SISTEM BERBASIS DESKTOP 2021 //
package findOutput;

/**
 *
 * @author VEDA NADIRA E41201328
 */

public class findOutput {
    public static void main(String[] args){
       // Variables //
        String s1 ="ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";
        
       // compateTo method //
       
        int var1 = s1.compareTo(s2);
        System.out.println("s1.compareTo(s2) : " +var1);
        
        int var2 = s2.compareTo(s3);
        System.out.println("s2.compareTo(s3) : " +var2);
        
       // Equals method //
       
        System.out.println("s2.equals(s3) : " +s2.equals(s3));
        
        System.out.println("s3.equals(s1) : " +s3.equals(s1));
        
        System.out.println(s3==s1);
    }        
    
    
}
