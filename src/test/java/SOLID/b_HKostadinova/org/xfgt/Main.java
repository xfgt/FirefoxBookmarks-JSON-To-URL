/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt;

import SOLID.b_HKostadinova.org.xfgt.data.Client;
import SOLID.b_HKostadinova.org.xfgt.data.Employee;
import SOLID.b_HKostadinova.org.xfgt.data.PositionType;
import SOLID.b_HKostadinova.org.xfgt.data.Project;

/**
 *
 * @author xfgt
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov", 2, PositionType.SOFTWARE_ENGINEER);
        Employee employee2 = new Employee("Petrov", 5, PositionType.SOFTWARE_ENGINEER);
        
        Client client = new Client("Georgiev", 200); // sobstvenika na proekta, plashta 200 lv na chas za rabota po tozi proekt
        Project project = new Project("Sellings", client);
        
        
        
        
        
        
        
        
        
    }
}
