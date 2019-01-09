
public class hamburgerDriver
{
   public static void main(){
       //make one instance(object) of the Hamburger class
       Hamburger hamburger1 = new Hamburger();
       Hamburger hamburger2 = new Hamburger();
       Hamburger hamburger3 = new Hamburger(true,3,"Cheddar");
       Hamburger hamburger4 = new Hamburger(true,1,"String");
       
       //print the ToString of that object
       System.out.println(hamburger1.toString());
       System.out.println();
       System.out.println(hamburger2.toString());
       System.out.println();
       System.out.println(hamburger3.toString());
       System.out.println();
       System.out.println(hamburger4.toString());
    }
}
