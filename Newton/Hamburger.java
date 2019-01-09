
public class Hamburger
{
    //this is a class called Hamburger
    //from this class, we can make as many hamburgrer instances (objects) as we want
    //instance variables
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero-argument constructor
    //this runs every time a zero-arg hamburger is made
    //the constructor name is always named public className 
    
    public Hamburger(){
        this.hasLettuce=false; //sets all instance variables to generic values
        this.numPatties=0;
        this.cheeseType=null;
    }
    
    //multi-arg constructor
    public Hamburger(boolean hasLettuce, int numPatties, String cheeseType){
        this.hasLettuce = hasLettuce;
        this.numPatties = numPatties;
        this.cheeseType = cheeseType;
    }
    
    //toString method
    public String toString(){
        String output = "Has lettuce: " + this.hasLettuce + "\nPatties: " + this.numPatties + 
        "\nCheese type: " + this.cheeseType;
        return output;
    }
}
