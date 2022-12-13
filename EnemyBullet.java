import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the bullet object, setting its speed, 
 * shooting the enemy bullet and removing the hero.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
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
        getImage().scale(20,40);
    }
    
    int bulletSpeed = 5;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY() + bulletSpeed);
        
        Hero a = (Hero)getOneIntersectingObject(Hero.class);
        if (a != null)
        {
            MyWorld.heroLife.add(-1);
            if (MyWorld.heroLife.getValue() == 0)
            {
               
                getWorld().removeObject(a);
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
