/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xfgt
 */
public class Project {
    
    private String name;
    private List<EmployeeProjectWork> employees;    // <Employee> -> <EmployeeProjectWork>
    private Client client;
    
    public Project(String name, Client client) {
        this.name = name;
        this.client = client;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeProjectWork> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeProjectWork> employees) {
        this.employees = employees;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Project{" + "name=" + name + ", client=" + client + ", employees=" + employees + '}';
    }
    
    
    
      
    
    
    
}
