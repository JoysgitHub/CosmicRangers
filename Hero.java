import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (Joyson Cardoso) 
 * @version (a version number or a date)
 */
    public class Hero extends Actor
    {
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hero()
    {
        getImage().scale(80,80);
        
    }
    SimpleTimer bulletTimer = new SimpleTimer();
    
    public void act()
    {
        //This code allows the player to move left and right 
        if (Greenfoot.isKeyDown("a"))
        {
            move(-5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(5);
        }
    
        //this allows the player to shoot
        if (Greenfoot.isKeyDown("space") && bulletTimer.millisElapsed() > 200)
        {
            getWorld().addObject(new Bullet(), getX(), getY()); 
            Greenfoot.playSound("herolaser.mp3");
            bulletTimer.mark();
        }
    }
}
