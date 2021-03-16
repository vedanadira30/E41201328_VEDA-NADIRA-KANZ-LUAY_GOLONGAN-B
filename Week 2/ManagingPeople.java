// SECOND TASK FOR WORKSHOP SISTEM BERBASIS DESKTOP 2021 // 
/**
 *
 * @author VEDA NADIRA KANZ LUAY E41201328
 */
package ManagingPople;
// Class Name Which is include 2 Atribute : Name and Ages //
class Person {
    
    String Name;
    int Ages;
    
    // Using Set and Get Method //
    public Person(String Name, int Ages) {
        this.Name = Name;
        this.Ages = Ages;
    }
    
    public String getName(){
        return this.Name;
    }
    public int getAges(){
        return this.Ages;
    }    

}
    // Main Method //
      public class ManagingPeople {
        
        public static void main(String[] args) {
    // Object from Class //
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);      
    // Show the Program //           
       if(p1.getAges()!=p2.getAges())
       {
           System.out.println(p1.getName()+" Is not the same age as "+p2.getName());
       }
       else
       {
           System.out.println(p1.getName()+" Is the same age as "+p2.getName());   
       }
    }    
}
