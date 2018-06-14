/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jpaDAO;

import Interface.ProductDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import models.Product;
/**
 *
 * @author DanPat
 */
public class ProductJpaDao<T, K> extends GenericJpaDao<Product, Long> implements ProductDao<T, K> {

    private final Class<T> type;
    
    public ProductJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    
    @Override
    public T findByName(K name)
    {
        EntityManager em = getEntityManager();
        T dto = em.find(type, name);
        em.close();
        return dto;
    }
}
