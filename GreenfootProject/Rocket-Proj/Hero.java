import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int delay = 20; // Delay penembakan
    private int delayCounter = 0; // Counter untuk menghitung delay
    //private boolean isShooting = true; // Menentukan apakah roket bisa menembak
    private int lives = 3; // Jumlah nyawa awal
    //private LivesCounter livesCounter; // Referensi ke kelas LivesCounter

    public void act()
    {

        if (isAtEdge()){
            setLocation(0,getY());
        }
        
        
        heroMovement();
        //if (Greenfoot.isKeyDown("space") && isShooting) {
        //    fireLaser();
        //    isShooting = true; // Menembak hanya satu laser pada satu siklus act()
        //}  
        // Menambahkan jeda antara setiap tembakan laser
        if (delayCounter <= 0) {
            fireLaser();
            delayCounter = delay; // Set delay counter kembali ke nilai delay
        } else {
            delayCounter--; // Mengurangi delay counter setiap siklus act
        }
        
        if (isTouching(Enemy.class)) {
            // Menanggapi tabrakan dengan musuh
            reduceLives();
        }
        
       
    }
    
    public void heroMovement(){
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX()+4, getY());
        }else if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-4, getY());
        }else if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-4);
        }else if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+4);
        }
        
    }
    
    private void fireLaser() {
        Laser laser = new Laser();
        getWorld().addObject(laser, getX() + 70, getY());
        getWorld().addObject(laser, getX() + 70, getY()); // Menambahkan laser di depan Rocket
        laser.setRotation(getRotation());
        laser.move(5); // Jarak antara setiap laser
    }    
    
    private void reduceLives() {
        lives--;
        if (lives <= 0) {
            // Jika nyawa habis, hentikan permainan atau tampilkan pesan kalah
            Greenfoot.stop(); // Anda juga dapat menambahkan logika lain di sini
        } else {
            // Reset posisi atau lakukan sesuatu yang sesuai ketika nyawa berkurang
            setLocation(0, getWorld().getHeight() / 2);
        }
    }
    
}
