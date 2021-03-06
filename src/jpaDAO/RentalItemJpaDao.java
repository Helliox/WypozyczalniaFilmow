/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jpaDAO;

import Interface.RentalItemDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import models.RentalItem;
import org.apache.log4j.Logger;

/**
 *
 * @author DanPat
 */
public class RentalItemJpaDao  extends GenericJpaDao<RentalItem, Long> implements RentalItemDao {
    public static Logger logger = Logger.getLogger(RentalItemJpaDao.class);
    @Override
    public RentalItem findByItemId(Long id)
    {
        logger.debug("Enter in findByItemId method");
        EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("rental.id");
            query.setParameter("id", id);
            Object result = query.getSingleResult();
            logger.debug("Exit of findByItemId method");
            return (RentalItem) result;
    }
    @Override
    public List<RentalItem> findAllProductsR(Long id)
    {
        logger.debug("Enter in findAllProductsR method");
        try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("account.items");
            query.setParameter("id",id);
            logger.debug("Exit of findAllProductsR method");
            return (List<RentalItem>) query.getResultList();
        }
        catch(Exception e){
            logger.error("Error with findAllProducts method");
            return null;
        }
    }
}
