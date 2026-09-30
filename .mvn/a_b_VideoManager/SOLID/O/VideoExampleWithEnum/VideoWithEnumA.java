/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.O.VideoExampleWithEnum;

/**
 *
 * @author xfgt
 */
public class VideoWithEnumA {
    private String title;
    private int time;
    private int likes;
    private int views;
    
    public double getNumberOfHoursPlayed(){ // is not meant to change in future
        return (time / 3600 ) * views;
    }
    
    enum Category {
        GAMING, EDUCATIONAL, ENTERTAINMENT // what if we want to extend?
    }
    
}
