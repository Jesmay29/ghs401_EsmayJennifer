
public class driver
{
   public static void main(){
       
       songs song1 = new songs();
       songs song2 = new songs("I want you back", "Jackson 5", true, "80's Hip Hop");
       
       
       System.out.println(song1.toString() + "\n");
       System.out.println(song2.toString() + "\n");
       
       newStudent student1 = new newStudent();
       newStudent student2 = new newStudent("Allen", "Freddie", 11, "Freddie Mercury Allen Jr.");
       
       System.out.println(student1.toString() + "\n");
       System.out.println(student2.toString() + "\n");
    }
}
