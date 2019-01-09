import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
      
        addObject(new Igloo(2, "gluue"), 997,15);
        addObject(new Igloo(), 334, 7);
        addObject(new Igloo(6, "Gloo"), 765, 5);
    }
}
