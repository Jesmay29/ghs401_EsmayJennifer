import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        
        addObject(new Ell(5), 112, 345);
        addObject(new Ell(2), 100, 100);
        addObject(new Ell(1), 346,357);
        addObject(new Ell(7),9,728);
        addObject(new Ell(2), 997,15);
        
        showText("Hello", getWidth()/2, 100);
    }
}
