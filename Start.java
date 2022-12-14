import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    GreenfootSound myMusic = new GreenfootSound("Game_Sound.mp3");
    boolean firstTurn = true;
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (firstTurn)
        {
            myMusic.playLoop();
            firstTurn = false;
        }
        if (Greenfoot.mouseClicked(this))
        {
            if(myMusic.isPlaying())
            {
                myMusic.stop();
                setImage("play.png");
            } else
            {
                myMusic.playLoop();
                setImage("Pause.png");
             
            }

        }
    } 
 }
