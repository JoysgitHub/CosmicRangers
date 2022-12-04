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

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 800;
    
    /**
     * Constructor for objects of class MyWorld.
     * Create a new world with SCREEN_WIDTH X 
     * SCREEN_HEIGHT cells with a cell size of 1X1 pixels.
     * 
     */
    public MyWorld()
    {    
        super(SCREEN_WIDTH, SCREEN_HEIGHT, 1); 

        addHero();
        addEnemies();
        
        setupScore();
        setupLives();
    }

    private void addHero()
    {
        addObject(new Hero(), 200, 560);
    }
    
    private void addEnemies()
    {
        addObject(new Enemy(), 100, 20);
        addObject(new Enemy(), 200, 60);
        addObject(new Enemy(), 300, 20); 
        
        for(int i=0; i < 3; i++)
        {
           addObject(new Enemy(), 200,300); 
        }
        
        addObject(new Enemy(), 100, 20);
        addObject(new Enemy(), 200, 60);
        addObject(new Enemy(), 300, 20);
    
        addObject(new Enemy(), 100, 130);
        addObject(new Enemy(), 200, 130);
        addObject(new Enemy(), 300, 130);  
    }
    
    private void setupScore()
    {
        heroScore.setValue(0);
        addObject(heroScore, 360, 590);
    }
    
    private void setupLives()
    {
        heroLife.setValue(5);
        addObject(heroLife, 40, 590);
    }
}
