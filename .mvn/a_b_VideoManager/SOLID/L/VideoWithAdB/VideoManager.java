/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.L.VideoWithAdB;

/**
 *
 * @author xfgt
 */
public class VideoManager {
    
    private String title;
    private int time;
    private int likes;
    private int views;
    
    
    public double getNumberOfHours(){
        return (time / 3600)  * views;
    }
    
    
    public void playRandomAd(){
        
        // play an ad
        
    }
    
    
}
