import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the EnemyBullet object, 
 * moving the bullet down the screen, removing a hero life, 
 * setting the world to the loose screen and removing the enemy bullet from the screen.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class EnemyBullet extends Actor
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyBullet()
    {
        //This line sets the EnemyBullet sprite size.
        getImage().scale(20,40);
    }
    //This variable sets the enemy speed.
    int bulletSpeed = 6;
    public void act()
    {
        /* This line of code moves the enemy bullet down the screen by adding 
         * the bulletSpeed variable to its y axis.*/
        setLocation(getX(),getY() + bulletSpeed);
        /*This line of code creates a hero object that will be used to check
         * for collisions between the hero and the enemy bullet.*/
        Hero hero = (Hero)getOneIntersectingObject(Hero.class);
        /*This block of code uses an if statment to check if the the hero object
         * interacts with the enemy bullet. If a collision occurs it removes a life from 
         * the hero life counter ,plays the enemyexplode sound and removes the enemy bullet from the world. */
        if (hero != null)
        {
            MyWorld.heroLife.add(-1);
            Greenfoot.playSound("enemyexplode.mp3");
            /*This block of code uses an if statment to check if the hero life equals to 0,
             * if life equals to 0 it removes the hero object, plays the sound and sets the world to loose menu*/
            if (MyWorld.heroLife.getValue() == 0)
            {
                getWorld().removeObject(hero);
                Greenfoot.playSound("enemyexplode.mp3");
                Greenfoot.setWorld(new LooseWorld());
            }
            getWorld().removeObject(this);
        }
        else if (getY() > 595)
        {
            getWorld().removeObject(this);
        }
    }
}
