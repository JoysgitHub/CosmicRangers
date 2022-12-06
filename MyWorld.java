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
<<<<<<< Updated upstream
        
        addObject(new Hero(), 200, 560);
        addObject(heroLife, 40, 590);
        addObject(heroScore, 360, 590);
        
        addObject(new Enemy(), 100, 20);
        addObject(new Enemy(), 200, 60);
        addObject(new Enemy(), 300, 20); 
        
        for(int i=0;i<3;i++)
=======
        addObject(heroScore, 450, 590);
    }
    /*This block of code creates a hero object using the Hero class, gets the screen width and divides 
     * it by two to get the x coordinate and then gets the hero width divides it by two and takes it away
       from the screen height to create the y coordinate and finally uses the two variables to add the hero to the screen*/
    private void addHero()
    {
        Hero hero = new Hero();
        int imageSize = hero.getImage().getWidth();
        int x = SCREEN_WIDTH/2;
        int y = (SCREEN_HEIGHT - imageSize/1);
        addObject(hero, x, y);
    }
    /*This function gets a random number between 1 and 60 to avoid adding too many enemys to the screen and
     * adds the enemy to the screen using the addEnemy function*/
    public void act()
    {
        if (Greenfoot.getRandomNumber(60)<1)
>>>>>>> Stashed changes
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
