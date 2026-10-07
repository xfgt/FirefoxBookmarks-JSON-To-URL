/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.data;

/**
 *
 * @author xfgt
 */
public class Employee {
    
    private String name;
    private int experience;
    private PositionType positionType;
    
    

    public Employee(String name, int experience, PositionType positionType) {
        this.name = name;
        this.experience = experience;
        this.positionType = positionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", experience=" + experience + ", positionType=" + positionType + '}';
    }
    
    
    
    
    
}
