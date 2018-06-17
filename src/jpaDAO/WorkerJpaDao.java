/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jpaDAO;

import Interface.WorkerDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import models.Worker;

public class WorkerJpaDao<T,K> extends GenericJpaDao<Worker, Long> implements WorkerDao<T,K> {   
        private final Class<T> type;
      public WorkerJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    
    @Override
    public Worker findByLogin(String login, String haslo)
    {
        try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("worker.login");
            query.setParameter("login", login);
            query.setParameter("haslo", haslo);
            Object result = query.getSingleResult();
            return (Worker) result;
        } catch (Exception e) {
            return null;
        }        
    }
}
