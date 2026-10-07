/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SOLID.a_SRP.example_a.after;

import SOLID.a_SRP.example_a_remake.after.EmployeeService;

/**
 *
 * @author LOCAL_ADMIN
 */
public interface EmailService {
    public void sendSalaryEmail(EmployeeService employee, double totalSalary);
    
}
