import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watermelon extends Actor
{
    public Watermelon()
    {
        GreenfootImage img = getImage();
        img.scale(70,70);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 2);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
