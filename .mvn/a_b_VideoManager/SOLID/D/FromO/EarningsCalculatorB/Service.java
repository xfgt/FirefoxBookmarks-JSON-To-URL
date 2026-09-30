/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.D.FromO.EarningsCalculatorB;

import SOLID.a_b_VideoManager.SOLID.O.VideoExampleWithEnum.EarningsCalculatorB.IEarningsCalculator;

/**
 *
 * @author xfgt
 */
public class Service {
    IEarningsCalculator calculator;
    
    public Service(IEarningsCalculator calculator){
        this.calculator = calculator;
    }
    
    public double calculateEarnings(Video video){
        return calculator.calculateEarnings(video); // abstraction related to the interface;
    }
    
}
