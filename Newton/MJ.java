import javax.swing.JOptionPane;

public class MJ
{
   public static void main(){
       
       String username = JOptionPane.showInputDialog("What high school do you attend?");
       
       
       
       if(username.equals("Granada")){
           
           String password = JOptionPane.showInputDialog("What is the mascot?");
           
           if (password.equals("Matadors")){
               
               String [] myArray = new String [4];
               
               myArray [0] = "George Ezra";
               myArray [1] = "Michael Jackson";
               myArray [2] = null;
               myArray [3] = "Saint Motel";
               
               int i = 0;
               for (i=0; i < myArray.length; i++){ 
                   if(myArray[i] != null) {
                  
                 
                       if(myArray[i].equals ("Michael Jackson")){
                       
                       System.out.println("We did find him. Element " + i + " is Michael Jackson");
    
                    }else {
                        
                        System.out.println("We did not find him. Element " + i + " is " + myArray[i]);
                        
                    }
                
                }else {
               System.out.println("We did not find him. Element 2 is empty(null)");
            }    
         }
    
           String fave = JOptionPane.showInputDialog("What's your favorite artist?");                               
            if(fave.equals("Saint Motel")){                                       
                System.out.println("We have the same taste in music!");                                   
            } else {                                       
                System.out.println("We don't have the same favorite artist.");    
            } 
        } else {
            System.out.println("Wrong mascot");
        }
    } else {
        System.out.println("Wrong high school");
    }
 }
}