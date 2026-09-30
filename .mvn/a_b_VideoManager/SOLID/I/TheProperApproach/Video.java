/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.I.TheProperApproach;

/**
 *
 * @author xfgt
 */
public class Video implements IVideoActions, IAdsActions { // videos and ads things
    
    ...

    @Override
    public double getNumberOfHoursPlayed() {
        ....
    }

    @Override
    public void playRandomAd() {
        ...
    }
}
