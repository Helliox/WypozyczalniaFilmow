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

/**
 *
 * @author DanPat
 */
public class RentalItemJpaDao  extends GenericJpaDao<RentalItem, Long> implements RentalItemDao {
    @Override
    public RentalItem findByItemId(Long id)
    {
        EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("rental.id");
            query.setParameter("id", id);
            Object result = query.getSingleResult();
            return (RentalItem) result;
    }
    @Override
    public List<RentalItem> findAllProductsR(Long id)
    {
        try{
            EntityManager em = getEntityManager();
            Query query = em.createNamedQuery("account.items");
            query.setParameter("id",id);
            return (List<RentalItem>) query.getResultList();
        }
        catch(Exception e){
            return null;
        }
    }
}
