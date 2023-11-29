import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int rotationSpeed = 5; // Kecepatan rotasi (ubah sesuai keinginan)
    private int duration = 60; // Durasi sebelum objek dihapus (dalam frame, misalnya 60 frame = 1 detik)
    private int frameCount = 0; // Hitungan frame untuk durasi objek
    

    
    public void act()
    {
        spin(); // Memutar objek
        checkDuration(); // Memeriksa durasi untuk menghapus objek
    }
    
     private void spin() {
        setRotation(getRotation() + rotationSpeed); // Memutar objek
    }
    
    private void checkDuration() {
        frameCount++;
        if (frameCount >= duration) {
            getWorld().removeObject(this); // Menghapus objek setelah durasi tertentu
        }
    }
}
