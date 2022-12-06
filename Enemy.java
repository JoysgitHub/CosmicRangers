import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy()
<<<<<<< Updated upstream
    {
        getImage().scale(70,70);
=======
    {   
        //This line sets the enemy sprite size.
        getImage().scale(90,90); 
>>>>>>> Stashed changes
    }
    
    int enemySpeed = 1;
    int extraTime = 1000;
    int randomBullet = Greenfoot.getRandomNumber(8000);
    SimpleTimer bulletTimer = new SimpleTimer();
    
    
    public void act()
    {
        setLocation(getX(),getY() + enemySpeed);
        
        if (bulletTimer.millisElapsed() > extraTime + randomBullet)
        {
            
            getWorld().addObject(new EnemyBullet(), getX(), getY()); 
            Greenfoot.playSound("enemylaser.mp3");
            bulletTimer.mark();
            randomBullet = Greenfoot.getRandomNumber(8500);
            
        }
        else if (getY() > 600)
        {
            getWorld().removeObject(this);
        }
    }
}
