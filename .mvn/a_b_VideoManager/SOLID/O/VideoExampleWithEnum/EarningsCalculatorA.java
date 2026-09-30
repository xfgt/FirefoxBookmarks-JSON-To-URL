/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.O.VideoExampleWithEnum;

/**
 *
 * @author xfgt
 */
public class EarningsCalculatorA {
    
    public double calculateEarnings(Video video){
        return swtich(video.getCategory()){
            case EDUCATIONAL -> calculateEducationalEarnings(video);
            case GAMING -> calculateGamingEarnings(video);
            case ENTERTAINMENT -> calculateEntertainmentEarnings(video);
        };
    }
    
    
    private double calculateEducationalEarnings(Video video){
        return video.getLikes() * 0.013 + video.getViews() * 0.0013;
    }
    
     private double calculateGamingEarnings(Video video){
        return video.getLikes() * 0.012 + video.getViews() * 0.0012;
    }
     
      private double calculateEntertainmentarnings(Video video){
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }
      

    
}
