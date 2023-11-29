import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
    }
    
    
    public void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,50,200);
    
    }
    
    int timer = 0;
    public void act(){
        
        
        if (timer==60){
            Enemy enemy1 = new Enemy();
            addObject(
                enemy1, 
                590, 
                Greenfoot.getRandomNumber(200) + 100
                );
            timer = 0;
        }
        
        timer++;
    }
}



