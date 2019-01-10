import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bob extends Actor
{
    private int speed;
    private int turnAmount;
    private String output;
    public static int colon;
    
    public Bob(){
        this.speed = 0;
        this.turnAmount = 0;
    }
    
    public Bob(int speed, int turnAmount){
        this.speed = speed;
        this.turnAmount = turnAmount;
    }
    
    public String toString(){
         output = "Speed: " + this.speed + ", Turn Amount: " + this.turnAmount
        + "\nX-coordinate: " + getX() + ", Y-coordinate: " + getY();
        return output;
    }
    
    public void act() 
    {
      move(speed);
        
  
      if(isAtEdge()) {
            turn(turnAmount);
        }
      getWorld().showText(this.toString() + "", 200, 100);
      
       
       if(getOneIntersectingObject(Larry.class) != null) {
          colon++;
          System.out.println("Collision!" + colon);
       } else if (getOneIntersectingObject(Bob.class) != null){
           colon++;
           System.out.println("Collision!" + colon);
        } 
      
      /*if(isTouching(Larry.class)) {
          System.out.println("Collision!");
          collide++;
       } else if (isTouching(Bob.class)){
           System.out.println("Collision!");
           collide++;
        }*/
       
   }
}