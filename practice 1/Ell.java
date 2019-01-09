import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ell extends Actor
{
    private int speed;
    
    public Ell(){
        this.speed=0;
        
    }
    
    public Ell(int speed){
        this.speed = speed;
        
    }
    
    public void act() 
    {
        move(this.speed);
        if(this.isAtEdge()){
            turn(37);
        }
        
        getWorld().showText("X-ccoor" + this.getX(), getWorld().getHeight()/2, getWorld().getWidth()/2);
        
    }    
}
