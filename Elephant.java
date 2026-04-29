import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant's name is Elephont.
 * 
 * @author Dominic 
 * @version April 27th, 2026
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantSound.mp3");
    GreenfootImage idle = new GreenfootImage();
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        // Remove banana if elephont touches it
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBanana();
            world.increaseScore();
            elephantSound.play();
        }
        // eat the banana and spawn new banana if a banana is eaten
        
    }
}
