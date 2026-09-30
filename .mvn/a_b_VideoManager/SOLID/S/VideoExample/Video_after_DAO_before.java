/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_b_VideoManager.SOLID.S.VideoExample;

/**
 *
 * @author xfgt
 */
public class Video_after_DAO {
    public void persist() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/youtube";
        Connection conn = DriverManager.getConnection(url, "root", "");  
            // Database connection can be segregated to another class. -> connection DAO
            
        
        Statement stmt = conn.createStatement();
        String sql = " INSERT INTO Video(Title, Time, Likes, Views) VALUES ...";
                + title + ", " + likes + ", "....
        stmt.excuteUpdate(sql);
    }
}
