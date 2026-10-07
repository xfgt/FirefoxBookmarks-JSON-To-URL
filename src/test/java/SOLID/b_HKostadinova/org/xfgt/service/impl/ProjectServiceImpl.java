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
public class ProjectServiceImpl implements ProjectService{

    
    private EmployeeService employeeService;

    public ProjectServiceImpl() {
        this.employeeService = new EmployeeServiceImpl();
    }


    public ProjectServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    
        
    @Override
    public double employeesSalary(Project project) {
        
        double total = 0;
        
        for(EmployeeProjectWork employee : project.getEmployees()) {
            total += employeeService.employeeSalary(employee.getEmployee(), project);
        }
        return total;
    }

    
    public boolean addEmployeeToProject(Project project, EmployeeProjectWork employee){
        return project.getEmployees().add(employee);
    }
    
    
    

   
    
}
