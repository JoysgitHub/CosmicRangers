import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a back button which allows the player to go back to the previous
 * page.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class BackButton extends Actor
{
    /**
     * Act - do whatever the Exist wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public BackButton()
    {   
        //This sets the bullet size
        getImage().scale(100,100);
    }
    public void act()
    {
    if(Greenfoot.mousePressed(this))
    //This sends the user back to the main menu.  
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
