import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Exit()
    {   
        //This sets the bullet size
        getImage().scale(250,230);
    }
    public void act()
    {
    if(Greenfoot.mousePressed(this))
    //This stops the game.  
        {
            Greenfoot.stop();
        }
    }
}
