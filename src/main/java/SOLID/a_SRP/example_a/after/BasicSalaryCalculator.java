/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a.after;

import SOLID.a_SRP.example_a_remake.after.EmployeeService;
import SOLID.a_SRP.example_a_remake.after.SalaryCalculatorService;

/**
 *
 * @author LOCAL_ADMIN
 */
public class BasicSalaryCalculator implements SalaryCalculatorService {

    @Override
    public double calculateBasicSalary(EmployeeService employee) {
        return 5000.00; // sample value
    }

    @Override
    public double calculateBonusSalary(EmployeeService employee) {
        return 1237.45;
    }
    
    
}
