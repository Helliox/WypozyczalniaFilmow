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

import org.springframework.stereotype.Service;
/**
 *
 * @author Rozkurwozaur
 */
public class GenericJpaDao<T, K> implements GenericDao<T, K> {

    private final Class<T> type;

    public GenericJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    @Override
    public void save(Object t) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Object t) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        t = em.merge(t);
        em.remove(t);
        em.getTransaction().commit();
        em.close();    
    }

    @Override
    public void update(Object t) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        em.close();    
    }

    @Override
    public T findById(K id) {
        EntityManager em = getEntityManager();
        T dto = em.find(type, id);
        em.close();
        return dto;
    }
    @Override
    public T findByName(K name)
    {
        EntityManager em = getEntityManager();
        T dto = em.find(type, name);
        em.close();
        return dto;
    }
    protected EntityManager getEntityManager() {
        return JpaFactory.getEntityManager();
    }
}
