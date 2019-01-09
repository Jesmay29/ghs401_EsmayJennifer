
public class HolidayCharacter
{
    private String name;
    private boolean guilty;
    private int prisonNumber;
    
    public HolidayCharacter (){
        this.name = null;
        this.guilty = false;
        this.prisonNumber = 0;
    }
    
    public HolidayCharacter (String name, boolean guilty, int prisonNumber){
        this.name = name;
        this.guilty = false;
        this.prisonNumber = prisonNumber;
    }
    
    public String toString() {
        String output = "Name: " + name + "\nPlea of guilty " + guilty + "\nPrisoner number " + prisonNumber;
        
        return output;
    }
}
