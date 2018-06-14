/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import models.Product;
/**
 *
 * @author DanPat
 */
public interface ProductDao<T, K> extends GenericDao<Product,Long>  {
    T findByName(K name);
}
