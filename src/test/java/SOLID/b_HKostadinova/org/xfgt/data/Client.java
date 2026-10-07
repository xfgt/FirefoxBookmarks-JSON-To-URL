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
public class Client {
    
    private String name;
    private List<Project> projects;
    private double paymentPerHour;

    public Client(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public double getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(double paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", projects=" + projects + ", paymentPerHour=" + paymentPerHour + '}';
    }
    
    
    
    
    
}
