/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaDAO;
import models.Customer;
import Interface.CustomerDao;
import JFrames.Rejestracja;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.log4j.*;


/**
 *
 * @author Rozkurwozaur
 */
public class CustomerJpaDao<T,K> extends GenericJpaDao<Customer, Long> implements CustomerDao<T,K> {
    private final Class<T> type;
    public static Logger logger = Logger.getLogger(CustomerJpaDao.class);
    public CustomerJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    
    @Override
    public Customer findByLogin(String login, String haslo)
    {
        logger.debug("Enter in findByLogin method");
        try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("customer.login");
            query.setParameter("login", login);
            query.setParameter("haslo", haslo);
            Object result = query.getSingleResult();
            return (Customer) result;
        } catch (Exception e) {
             logger.error("Error with findByLogin");
            return null;  
        }        
    }
}

