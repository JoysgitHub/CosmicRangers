import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a Exit button which allows the player to exit the page.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (6/12/2022)
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
        getImage().scale(250,100);
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
