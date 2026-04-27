import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        
        // Create the object
        Elephant elephont = new Elephant();
        addObject(elephont, 300, 200);
        
        // Create a label
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBanana();
    }
    
    // Create a new banana at random location at top of screen
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
}
