/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.service.impl;

import SOLID.b_HKostadinova.org.xfgt.data.Employee;
import SOLID.b_HKostadinova.org.xfgt.data.EmployeeProjectWork;
import SOLID.b_HKostadinova.org.xfgt.data.Project;

/**
 *
 * @author xfgt
 */
public class EmployeeServiceImpl implements EmployeeService {
    
    private ClientService clientService; // the interface

    public EmployeeServiceImpl() {
        this.clientService = new ClientServiceImpl(); // to get paymentPerHour
    }
    
    
    
    public EmployeeServiceImpl(ClientService clientService) { // dependency injection
        this.clientService = clientService;
    }
    
    @Override
    public double employeeSalary(Employee employee, Project project) { // hours worked (for an employee) and paymentPerHour from client about project.
        
        /* liskov substitution principle
            if(project.getEmployees().contains(?)){
                throw new RuntimeException();
            }
        */        
        
        
        /*
            We search for a specific employee in the list of employees about
            the specified project.
        
            If we meet that employee hence it exists,
            then, we get the value of hours worked and multiply it by
            the specific client which holds the project and pays
            specific amount for an hour of work.
        */
        
        for (EmployeeProjectWork employeeProjectWork : project.getEmployees()){
            if(employeeProjectWork.getEmployee().equals(employee)){
                return employeeProjectWork.getHoursWorked() * 
                        clientService.projectPaymentPerHour(project.getClient(), project); // This is just client's payment per hour.
                                                                                           // It is searched through the list of projects 
                                                                                           // that a client can hold on to
            }
        }
        
        return 0;
    }
}
