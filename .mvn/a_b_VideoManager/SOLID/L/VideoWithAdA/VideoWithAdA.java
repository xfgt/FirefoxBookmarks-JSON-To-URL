/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.L.VideoWithAdA;

/**
 *
 * @author xfgt
 */

@Data
public class VideoWithAdA {
    
    private String title;
    private int time;
    private int likes;
    private int views;
    
    public double getNumberOfHoursPlayed(){ // is not meant to change in future
        return (time / 3600 ) * views;
    }
    
    public void playRandomAd() throws Exception{
        // play an ad
    }
    
}
    

