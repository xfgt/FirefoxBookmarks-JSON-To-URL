/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.service.impl;

import SOLID.b_HKostadinova.org.xfgt.data.Client;
import SOLID.b_HKostadinova.org.xfgt.data.Project;

/**
 *
 * @author xfgt
 */
public class ClientServiceImpl implements ClientService{

    @Override
    public double projectPaymentPerHour(Client client, Project project) {
        for(Project project1 : client.getProjects() ) {
            if(project1.equals(project)){
                return client.getPaymentPerHour();
            }
        }
        return 0;
    }
    
}
