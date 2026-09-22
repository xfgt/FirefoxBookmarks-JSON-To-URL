/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a_remake;

import SOLID.a_SRP.example_a_remake.after.EmployeeService;
import SOLID.a_SRP.example_a_remake.after.EmployeeServiceImpl;
import SOLID.a_SRP.example_a_remake.after.PayrollFacade;



/**
 *
 * @author xfgt
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        EmployeeService employee = new EmployeeServiceImpl("Oggy", 37);
        
        PayrollFacade pf = new PayrollFacade();
        
        pf.calculateAndSendSalary(employee);
        
        
        
    }
    
}
