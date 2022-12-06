import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class creates a win world screen that lets the play know that they have won.
 * 
 * @author (Joyson Cardoso, Keegan DeSouza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     */
    public WinWorld()
    {    
        // Creates a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500,600, 1); 
        //This line of code adds the restart button to the Win world menu.
        addObject(new RestartButton(),250,270);
        // This adds the Exit button to the "WinWorld"
        addObject(new Exit(),250,380);
    }
}
