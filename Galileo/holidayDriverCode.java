
public class holidayDriverCode
{
   public static void main(){
       HolidayCharacter h1 = new HolidayCharacter();
       HolidayCharacter h2 = new HolidayCharacter("Grinch",false,0);
       HolidayCharacter h3 = new HolidayCharacter("Santa", true, 100000);
       
       System.out.println(h1.toString());
       System.out.println();
       System.out.println(h2.toString());
       System.out.println();
       System.out.println(h3.toString());
       System.out.println();
    }
}
