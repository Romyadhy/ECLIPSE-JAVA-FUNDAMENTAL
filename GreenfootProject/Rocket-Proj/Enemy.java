import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy(){
        turn(180);
    }
    
    public void act()
    {
        move(Greenfoot.getRandomNumber(15));
        checkEdge();
    }
    
    private void checkEdge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
