import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LooseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LooseWorld extends World
{

    /**
     * Constructor for objects of class LooseWorld.
     * 
     */
    public LooseWorld()
    {    
<<<<<<< Updated upstream
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(new RestartButton(),200,300);
=======
        // Create a new world with 500x600 cells with a cell size of 1x1 pixels.
        super(500, 600, 1);
        //This line of code adds the restart button to the loose world menu.
        addObject(new RestartButton(),250,250);
        // This adds the Exit button to the "looseworld".
        addObject(new Exit(),250,380);
        
>>>>>>> Stashed changes
    }
}
