/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jpaDAO;

import Interface.ProductDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import models.Customer;
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
    public Product findByName(String title)
    {
       try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("product.title");
            query.setParameter("title", title);
            Object result = query.getSingleResult();
            return (Product) result;
        } catch (Exception e) {
            return null;
        }        
    }
}
