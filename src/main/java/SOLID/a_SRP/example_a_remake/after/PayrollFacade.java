/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.a_SRP.example_a_remake.after;

/**
 *
 * @author xfgt
 */
public class PayrollFacade {
    
    private SalaryCalculatorService salaryCalculator;
    private EmailService emailService;
    
    public PayrollFacade(){
        this.salaryCalculator = new SalaryCalculatorServiceImpl();
        this.emailService = new EmailServiceImpl();
    }
    
    public void calculateAndSendSalary(EmployeeService employee){
        double basicSalary = salaryCalculator.calculateBasicSalary(employee);
        double bonusSalary = salaryCalculator.calculateBonusSalary(employee);
        
        double totalSalary = basicSalary + bonusSalary;
        emailService.sendSalaryEmail(employee, totalSalary);
    }
    
}
