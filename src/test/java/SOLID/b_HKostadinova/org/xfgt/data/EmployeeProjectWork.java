/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.data;

/**
 *
 * @author xfgt
 */

/*
    That class holds an employee and adds hours measure
    to connect to the project and extract how many hours 
    an employee has worked on a specific project.

    It is a many to many relationship to see how much an employee has worked
    on which project N:M relationship between project and employee.
*/

public class EmployeeProjectWork {
    private Employee employee;
    private int hoursWorked;

    public EmployeeProjectWork(Employee employee, int hoursWorked) {
        this.employee = employee;
        this.hoursWorked = hoursWorked;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "EmployeeProjectWork{" + "employee=" + employee + ", hoursWorked=" + hoursWorked + '}';
    }
    
    
}
