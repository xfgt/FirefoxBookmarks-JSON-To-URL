/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a.after;

import SOLID.a_SRP.example_a_remake.after.EmailService;
import SOLID.a_SRP.example_a_remake.after.EmployeeService;

/**
 *
 * @author LOCAL_ADMIN
 */
public class BasicEmailService implements EmailService{

    @Override
    public void sendSalaryEmail(EmployeeService employee, double totalSalary) {
        System.out.println("Email sent to " + employee.getName() + " (ID: " + employee.getId() + ")");
        System.out.println("Total Salary: $ " + totalSalary);
    }
    
}
