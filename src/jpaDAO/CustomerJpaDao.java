/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaDAO;
import models.Customer;
import Interface.CustomerDao;


/**
 *
 * @author Rozkurwozaur
 */
public class CustomerJpaDao extends GenericJpaDao<Customer, Long> implements CustomerDao {   
}

