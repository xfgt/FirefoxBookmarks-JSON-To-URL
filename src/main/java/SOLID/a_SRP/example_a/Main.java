/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a;

import SOLID.a_SRP.example_a_remake.after.EmployeeServiceImpl;
import SOLID.a_SRP.example_a_remake.after.PayrollFacade;
import SOLID.a_SRP.example_a_remake.after.EmployeeService;


/**
 *
 * @author LOCAL_ADMIN
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        EmployeeService employee = new EmployeeServiceImpl("Jack", 45);
        
        PayrollFacade pf = new PayrollFacade();
        
        pf.calculateAndSendSalary(employee);
        
        
        
    }
    
}
