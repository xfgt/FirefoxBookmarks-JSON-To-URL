/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.D.FromO.EarningsCalculatorB;

/**
 *
 * @author xfgt
 */
public class EducationalEarningsCalculator implements IEarningsCalculator {
    

    @Override
    public double calculateEarnings(Object video) {
        return video.getLikes() * 0.013 + video.getViews() * 0.0013;
    }
}
