/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jpaDAO;

import Interface.ProductDao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import models.Product;
import org.apache.log4j.Logger;
/**
 *
 * @author DanPat
 */
public class ProductJpaDao<T, K> extends GenericJpaDao<Product, Long> implements ProductDao<T, K> {

    private final Class<T> type;
    public static Logger logger = Logger.getLogger(ProductJpaDao.class);
    public ProductJpaDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }
    
    @Override
    public Product findByName(String title)
    {
        logger.debug("Enter in findByName method");
       try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("product.title");
            query.setParameter("title", title);
            Object result = query.getSingleResult();
            logger.debug("Exit of findByName method");
            return (Product) result;
        } catch (Exception e) {
            logger.error("Error with findByName method");
            return null;
        }        
    }
    @Override
    public long amount()
    {
        logger.debug("Enter in amount method");
        try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("product.count");
            Object result = query.getSingleResult();
            logger.debug("Exit of amount method");
            return (long) result;
        }
        catch (Exception e){
            logger.error("Error in amount method");
            return 0;
        }
    }
    @Override
    public List<Product> findAllProducts()
    {
        logger.debug("Enter in findAllProducts method");
        try{
            EntityManager em = getEntityManager();
            Query query = em.createQuery("SELECT e FROM Product e");
            logger.debug("Exit of findAllProducts method");
            return (List<Product>) query.getResultList();
        }
        catch(Exception e){
            logger.error("Error with findAllProducts method");
            return null;
        }
    }
}
