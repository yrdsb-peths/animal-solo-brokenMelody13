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
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant()// The code gets run when object is created
    {
        for(int i = 0; i < 8; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/Idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    
    //Animate the elephant
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
        
        animateElephant(); // Animate the elephant
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
