import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for creating the bullet object, setting its speed, 
 * shooting the enemy bullet and removing the enemy   .
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class Bullet extends Actor
{
    public Bullet()
    {
        getImage().scale(25,45);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()-8);
        
        Enemy a = (Enemy)getOneIntersectingObject(Enemy.class);
        if (a != null)
        {
            getWorld().removeObject(a);
            Greenfoot.playSound("enemyexplode.mp3");
            getWorld().removeObject(this);
            MyWorld.heroScore.add(5);
            if (MyWorld.heroScore.getValue() == 50)
            {
                Greenfoot.setWorld(new WinWorld());
            }
        }  
        else if (getY()==0)
        {
            getWorld().removeObject(this);
        }
        
    }
}
