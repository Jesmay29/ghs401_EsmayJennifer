

public class newStudent
{
   private String lastName;
   private String firstName;
   private int grade;
   private String who;
   
   public newStudent(){
       this.lastName = null;
       this.firstName = null;
       this.grade = 0;
       this.who = null;
       System.out.println("3");
    }
    
   public newStudent(String lastName, String firstName, int grade, String who){
       this.lastName = lastName;
       this.firstName = firstName;
       this.grade = grade;
       this.who = who;
       System.out.println("4");
    }
    
   public String toString(){
        String output = "Last name is: " + lastName + "\nFirst name is: " + firstName
        + "\nThey are in: " + grade + "th grade\nTheir full name is: " + who;
        
        return output;
    }
}
