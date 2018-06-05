/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Rozkurwozaur
 * @param <T>
 * @param <K>
 */
public interface GenericDao <T, K>{
    void save(T t);
    void delete (T t);
    void update (T t);
    T findById(K id);
}
