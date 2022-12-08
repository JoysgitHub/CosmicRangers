import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a tutorial button and allows the player to view the game 
 * instruction before gameplay.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class TutorialButton extends Actor
{
    /**
     * Act - do whatever the TutorialButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TutorialButton()
    {   
        //This sets the bullet size
        getImage().scale(200,100);
    }
    public void act()
    {
        /*This if statment checks if the player left clicks on the Tutorial button 
         * and takes the user to the tutorial page.*/
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new Tutorial());
        }
    }
}
