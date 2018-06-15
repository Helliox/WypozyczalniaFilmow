/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import models.Customer;
/**
 *
 * @author Rozkurwozaur
 */
public interface CustomerDao<T,K> extends GenericDao<Customer,Long> {
    Customer findByLogin(String login, String haslo);
}
