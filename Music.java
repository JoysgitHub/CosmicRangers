import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible for adding the play/pause music function in the game.
 * 
 * @author (Joyson Cardoso, Keegan De souza, Mohammad Matloob) 
 * @version (22/12/2022)
 */
public class Music extends Actor
{
    //This creates a myMusic object using the built in sound class
    GreenfootSound myMusic =  new GreenfootSound("Game_Sound.mp3");
    boolean firstTurn = true;
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /*This statement automatically starts the music when the game starts*/
        if(firstTurn)
        {
            myMusic.playLoop();
            firstTurn = false;
        }
        /*This statment stops the music to avoid looping issues on restarts. 
           It does this by checking if the hero score is 45 or life is 1 and 
           uses the built in .stop() function to stop the music*/
        if(MyWorld.heroScore.getValue() == 45 || MyWorld.heroLife.getValue() == 1 )
        {
            myMusic.stop();
        }
        /*This if statment checks if the the pause button is pressed and either 
         * plays or pauses the music depending on if its playing */
        if(Greenfoot.mouseClicked(this))
        {
            if(myMusic.isPlaying())
            {
                myMusic.pause();
                setImage("play.png");
            }else
            {
                myMusic.playLoop();
                setImage("Pause.png");
            }

        }
    }
}
