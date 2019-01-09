
public class randomStuff
{
    
    public static void main(){
        
        for(int i=0; i<10; i++){
        //cast a random number to an integer 
        
        double age = (int)(Math.random()*8) + 367;
        
        System.out.println("the number is " + age);
       }
       
       /*for(int i=0; i<13; i++){
           
           System.out.println("George Takei");
           System.out.println("Takes pilot lessons");
        }*/
    }
}