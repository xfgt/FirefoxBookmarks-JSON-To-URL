/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.L.VideoWithAdA;

/**
 *
 * @author xfgt
 */


@Data @EqualsHashCode(callsuper = true)
public class PremiumVideoA extends VideoWithAdA {
    private int premiumId;
    
    
    @Override
    public void playRandomAd(){
        throw new Exception (
                "No ads play during Premium videos"
            );
    }
    
    // Bad approach 
    
    
    /*
        public static void main(String[] args){
    
            
            List<Video> videos = new ArrayList<>();
            videos.add(new VideoWithAdA());
            videos.add(new PremiumVideoA());
    
            for(VideoWithAdA i : videos){
                video.playRandomAd();           // here will throw an exception
                                                // and break the cycle of the 
                                                // program .
                                                // bad approach.
    
            }
        }
    */
    
}
