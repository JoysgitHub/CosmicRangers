import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
