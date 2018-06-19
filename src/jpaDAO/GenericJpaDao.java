/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaDAO;
import Interface.GenericDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import factory.JpaFactory;
import models.Customer;
import org.slf4j.Logger;

import org.springframework.stereotype.Service;
/**
 *
 * @author Rozkurwozaur
 */
public class GenericJpaDao<T, K> implements GenericDao<T, K> {

    private final Class<T> type;
    Logger logger;
    public GenericJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    @Override
    public void save(Object t) {
        logger.debug("Enter in save method");
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.flush();
        em.getTransaction().commit();
        em.close();
        logger.debug("Exit of save method");
    }

    @Override
    public void delete(Object t) {
        logger.debug("Enter in delete method");
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        t = em.merge(t);
        em.remove(t);
        em.getTransaction().commit();
        em.close();    
        logger.debug("Exit of delete method");
    }

    @Override
    public void update(Object t) {
        logger.debug("Enter in update method");
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        em.close();    
        logger.debug("Exit of update method");
    }

    @Override
    public T findById(K id) {
        logger.debug("Enter in findById method");
        EntityManager em = getEntityManager();
        T dto = em.find(type, id);
        em.close();
        logger.debug("Exit of findById method");
        return dto;
    }
    
    protected EntityManager getEntityManager() {
        return JpaFactory.getEntityManager();
    }
}
