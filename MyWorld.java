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
<<<<<<< Updated upstream

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 800;
    
=======
    public static final int SCREEN_WIDTH = 500;
    public static final int SCREEN_HEIGHT = 600;
>>>>>>> Stashed changes
    /**
     * Constructor for objects of class MyWorld.
     * Create a new world with SCREEN_WIDTH X 
     * SCREEN_HEIGHT cells with a cell size of 1X1 pixels.
     * 
     */
    public MyWorld()
    {    
<<<<<<< Updated upstream
        super(SCREEN_WIDTH, SCREEN_HEIGHT, 1); 

        addHero();
        addEnemies();
        
        setupScore();
        setupLives();
    }

    /**
     * Place Hero at the bottom and the centre
     * of the screen.
     */
    private void addHero()
    {
        Hero hero = new Hero();
        int imageSize = hero.getImage().getWidth();
        
        int x = SCREEN_WIDTH/2;
        int y = (SCREEN_HEIGHT - imageSize/2);
        
        addObject(hero, x, y);
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
=======
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
>>>>>>> Stashed changes
    
    private void addScore()
    {
        heroScore.setValue(0);
        addObject(heroScore, 450, 590);
    }
<<<<<<< Updated upstream
    
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
=======

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

>>>>>>> Stashed changes
}
