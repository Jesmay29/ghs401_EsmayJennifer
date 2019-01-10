import greenfoot.*;  

public class Larry extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    private String output;
    
      
    public Larry(){
        this.name = null;
        this.speed = 0;
        this.turnAmount = 0;
    }
      
    public Larry(String name, int speed, int turnAmount){
        this.name = name;
        this.speed = speed;
        this.turnAmount = turnAmount;
    }
    
    public String toString(){
        output = "Name: " + this.name + "\nSpeed: " + this.speed + 
        "\nTurn Amount: " + this.turnAmount + "\nX-coordinate: " + 
        getX() + "\nY-coordinate: " + getY();
        return output;
    }
    
    public void act() 
    {
       move(speed);
       
       if(this.isAtEdge()){
          turn(turnAmount);
        }
        
       
       getWorld().showText(this.toString() + "", 500, 100);
        
       /*if(isTouching(Bob.class)) {
          System.out.println("Collision!");
          collide++;
       } else if (isTouching(Larry.class)){
           System.out.println("Collision!");
           collide++;
        }*/
    }    
}
