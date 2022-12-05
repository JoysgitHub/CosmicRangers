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
    public static final int SCREEN_WIDTH = 500;
    public static final int SCREEN_HEIGHT = 600;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(SCREEN_WIDTH,SCREEN_HEIGHT, 1); 
        addScore();
        addLife();
        addHero();
    }
    
      private void addLife()
    {
        heroLife.setValue(10);
        addObject(heroLife, 60, 590);
    }
    
    private void addScore()
    {
        heroScore.setValue(0);
        addObject(heroScore, 450, 590);
    }

    private void addHero()
    {
        addObject(new Hero(), 250, 530);
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(60)<1)
        {
            addEnemy();
        }   
    }
    public void addEnemy()
    {
         addObject(new Enemy(), Greenfoot.getRandomNumber(480),0);
    }

}
