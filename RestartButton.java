import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a restart button and allows the player to restart the game.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class RestartButton extends Actor
{
    /**
     * Act - do whatever the RestartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public RestartButton()
    {   
        //This sets the bullet size
        getImage().scale(250,250);
    }
    public void act()
    {
        /*This if statment checks if the player left clicks on the restart sprite and sets the the world to MyWorld.*/
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}