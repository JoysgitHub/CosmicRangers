import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the the hero, getting the user keyboard 
 * inputs and shooting the enemy.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
    public class Hero extends Actor
    {
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hero()
    {
        //This line of code sets the hero sprite size.
        getImage().scale(80,80);
        
    }
    //This line of code creates a timer to space the bullets out.
    SimpleTimer bulletTimer = new SimpleTimer();
    //This creates a variable that is used to space out the hero bullet.
    int bulletSpacer = 500;
    
    public void act()
    {
        /*This code uses if statments to check if the player presses the 
         * "a" or "d" key and moves the hero left and right by adding +5 and -5 to its x axis. */
        if (Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
    
        /*This block of code checks if the player presses the space bar and 
         * if the time elapsed is over 500 milliseconds to avoid over shooting. 
         * If these two conditions are met it adds a hero bullet to the screen and plays a sound.  
           */
        if (Greenfoot.isKeyDown("space") && bulletTimer.millisElapsed() > bulletSpacer)
        {
            getWorld().addObject(new Bullet(), getX(), getY()); 
            Greenfoot.playSound("herolaser.mp3");
            bulletTimer.mark();
        }
    }
}
