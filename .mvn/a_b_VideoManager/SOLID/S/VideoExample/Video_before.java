/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.S.VideoExample;

/**
 *
 * @author xfgt
 */
public class Video_before {
    
    
    
    
}

@Data
public class Video{
    private String title;
    private int time;
    private int likes;
    private int views;
    
    public double getNumberOfHoursPlayed(){ // is not meant to change in future
        return (time / 3600 ) * views;
    }
    
    public void persist() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/youtube";
        Connection conn = DriverManager.getConnection(url, "root", "");
        Statement stmt = conn.createStatement();
        String sql = " INSERT INTO Video(Title, Time, Likes, Views) VALUES ...";
        stmt.excuteUpdate(sql);
    }
    
    
    
}
