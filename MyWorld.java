import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static Counter heroLife = new Counter();
    public static Counter heroScore = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        

        super(400, 600, 1); 
        heroLife.setValue(5);
        heroScore.setValue(0);
        
        addObject(new Hero(), 200, 560);
        addObject(heroLife, 40, 590);
        addObject(heroScore, 360, 590);
        
        addObject(new Enemy(), 100, 20);
        addObject(new Enemy(), 200, 60);
        addObject(new Enemy(), 300, 20); 
        
        for(int i=0;i<3;i++)
        {
           addObject(new Enemy(), 200,300); 
        }
    
        //
        
        
        addObject(new Enemy(), 100, 20);
        addObject(new Enemy(), 200, 60);
        addObject(new Enemy(), 300, 20);
        
    
        addObject(new Enemy(), 100, 130);
        addObject(new Enemy(), 200, 130);
        addObject(new Enemy(), 300, 130);  
    }
}
