import javax.swing.JOptionPane;

public class ageAsk
{
   public static void main(){
       int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
       
      
       while(age<0 || age>120){
           age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        }
       System.out.println("Thank you");
    }
}
