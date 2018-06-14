/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaDAO;
import models.Customer;
import Interface.CustomerDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;


/**
 *
 * @author Rozkurwozaur
 */
public class CustomerJpaDao<T,K> extends GenericJpaDao<Customer, Long> implements CustomerDao<T,K> {
    private final Class<T> type;
    
    public CustomerJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    
    @Override
    public T findByLogin(K login)
    {
        EntityManager em = getEntityManager();
        T dto = em.find(type, login);
        em.close();
        return dto;
    }
}

