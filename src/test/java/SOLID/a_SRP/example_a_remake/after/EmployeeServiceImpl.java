/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a_remake.after;

/**
 *
 * @author xfgt
 */
public class EmployeeServiceImpl implements EmployeeService {

    private String name;
    private int id;
    
    
    public EmployeeServiceImpl(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
    
}
