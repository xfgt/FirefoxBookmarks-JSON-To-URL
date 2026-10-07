/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SOLID.b_HKostadinova.org.xfgt.service.impl;

import SOLID.b_HKostadinova.org.xfgt.data.Client;
import SOLID.b_HKostadinova.org.xfgt.data.Project;

/**
 *
 * @author xfgt
 */
public interface ClientService {
    double projectPaymentPerHour(Client client, Project project);
}
