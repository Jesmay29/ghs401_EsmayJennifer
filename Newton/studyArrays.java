import javax.swing.JOptionPane;

public class studyArrays
{
    public static void main(){
        
        int grade = Integer.parseInt(JOptionPane.showInputDialog("What is your English grade percentage?"));
        
        while(grade <0 || grade>110){
            grade = Integer.parseInt(JOptionPane.showInputDialog("What is your English grade percentage?"));
        }
        if (grade >89){
            System.out.println("Your grade is an A");
        } else if (grade >79){
            System.out.println("You have a B");
        } else if (grade>69){
            System.out.println("You have a C");
        } else {
            System.out.println("You are failing");
        }
    }
}
