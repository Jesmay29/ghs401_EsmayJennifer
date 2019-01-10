import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Larry(), 88, 23);
        addObject(new Larry ("Lar Bar", 8, 12), 102, 97);
        addObject(new Bob(), 599, 45);
        addObject(new Bob(8, 34), 300, 34);
        
    }
    
    
}
