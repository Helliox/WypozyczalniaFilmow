/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import java.util.List;
import models.Product;
/**
 *
 * @author DanPat
 */
public interface ProductDao<T, K> extends GenericDao<Product,Long>  {
    Product findByName(String title);
    long amount();
    List<Product> findAllProducts();
}
