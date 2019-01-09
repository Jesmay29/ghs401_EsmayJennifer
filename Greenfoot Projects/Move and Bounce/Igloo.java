import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Igloo extends Actor
{
    private int speed;
    private String name;
    
    public Igloo(){
        this.speed=0;
        this.name = "Igloo";
    }
    
    public Igloo(int speed, String name){
        this.speed = speed;
        this.name = name;
    }
    
    //toString method
    public String toString(){
        String output = "Name: " + this.name + "\nX-coordinate: " + 
        this.getX() + "\nY-coordinate: " + this.getY();
        return output;
    }
    
    public void act() 
    {
        move(speed);
        
        if (isAtEdge()){
            turn((int)(Math.random() * 91));
        }
        
        getWorld().showText(this.toString() + "", 
        getWorld().getWidth()/2, getWorld().getHeight()/2);
        
    }    
}
