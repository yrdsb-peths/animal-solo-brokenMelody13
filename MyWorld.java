import greenfoot.*;

public class MyWorld extends World 
{
    public int score = 0;
    Label scoreLabel;    
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        
        // Create the object
        Elephant elephont = new Elephant();
        addObject(elephont, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBanana();
    }
    
    //End the game and appear "GameOver"
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    
    //Increase score
    
    public void increaseScore()
    {
        score++;

        scoreLabel.setValue(score);
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
