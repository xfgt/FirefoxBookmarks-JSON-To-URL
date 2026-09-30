/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.L.VideoWithAdB;

/**
 *
 * @author xfgt
 */
public class PremiumVideo {
    
    
    private int premiumId;
    private VideoManager manager;
    
    
    public double getNumberOfHoursPlayed(){
        return manager.getNumberOfHours();
    }
    
    // playRandomAd() is not chosen to be executed for a premium video
    // that's the cherry-pick behaviour here. 
}
