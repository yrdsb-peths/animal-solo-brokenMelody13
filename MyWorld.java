import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephont = new Elephant();
        addObject(elephont, 300, 200);
        
        Banana banana = new Banana();
        addObject(banana, 300, 0);
    }
}
