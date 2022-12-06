import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the enemy object, setting its speed, 
 * shooting the enemy bullet and removing the enemy   .
 * 
 * @author (Joyson Cardoso, Keegan DeSouza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy()
    {   
        //This line sets the enemy sprite size.
        getImage().scale(70,70); 
    }
    /*These variables set the enemy speed, create a timer to space out the shooting 
     * and generate a random number between 1-8000 milliseconds. */
    int enemySpeed = 3;
    int extraTime = 995;
    int randomBullet = Greenfoot.getRandomNumber(8000);
    //This line of code creates a bullet timer object that keeps track of enenmy bullet time.
    SimpleTimer bulletTimer = new SimpleTimer();
    
    public void act()
    {   
        /*This line of code moves the enenmy object down the screen by adding the enemySpeed 
        variable to its y coordinate.*/
        setLocation(getX(),getY() + enemySpeed);
        /*This block of code uses an if statment to check if time elapsed is over 
         * extraTime + randomBullet time to make the enemy shoot randomly and avoid over shooting. 
         * If the time elapsed is over the sum of extraTime + randomBullet it adds the enemy bullet 
           to the screen, plays the enemylaser sound, and generates another random time for the enemy bullet.*/
        if (bulletTimer.millisElapsed() > extraTime + randomBullet)
        {
            getWorld().addObject(new EnemyBullet(), getX(), getY()); 
            Greenfoot.playSound("enemylaser.mp3");
            bulletTimer.mark();
            randomBullet = Greenfoot.getRandomNumber(8500);
        }
        //This if statment removes the enemy from the world when its y coordinate is over 595.
        if (getY() > 595)
        {
            getWorld().removeObject(this);
        }
    }
}
