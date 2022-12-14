import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This class is responsible for seting the world size and adding the start button 
 * and Tutorial button to the main menu.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (6/12/2022)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1);
        //This line of code adds the start button to the main menu.
        addObject(new StartButton(),150,450);
        // This adds the Tutorial button to the "Main menu".
        addObject(new TutorialButton(),380,450);
        //prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    /*private void prepare()
    {

        Music music = new Music();
        addObject(music,58,34);
    }
    */
}
