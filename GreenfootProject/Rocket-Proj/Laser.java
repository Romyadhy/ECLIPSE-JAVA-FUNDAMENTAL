import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private boolean toRemove=false;
    private int vx = 5;
    public void addedToWorld(World MyWorld){
        GreenfootImage image = new GreenfootImage(20, 10);
        //image.setColor(Color.RED);
        image.setColor(new Color(255, 255, 0));
        image.drawLine(0,5,image.getWidth() -1, 5);
        setImage(image);
    }
    
   public void act() {
        move(vx); // Bergerak ke depan

        if (isAtEdge()) {
            getWorld().removeObject(this); // Menghapus laser jika menyentuh ujung layar
        } else if (isTouching(Enemy.class)) {
            removeEnemyAndLaser(); // Menghapus musuh dan laser jika menyentuh musuh
        }
    }
    
    private void removeEnemyAndLaser() {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if (enemy != null) {
            getWorld().addObject(new Explosion(), enemy.getX(), enemy.getY()); // Memunculkan animasi ledakan di posisi musuh
            getWorld().removeObject(enemy); // Menghapus musuh yang terkena laser
            getWorld().removeObject(this); // Menghapus laser
        }
    }
    
    
}
