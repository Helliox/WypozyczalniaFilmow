/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import java.util.List;
import models.RentalItem;
/**
 *
 * @author DanPat
 */
public interface RentalItemDao  extends GenericDao<RentalItem,Long>  {
    RentalItem findByItemId(Long id);
    List<RentalItem> findAllProductsR(Long id);
}

