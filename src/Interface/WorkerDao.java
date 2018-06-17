/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import models.Worker;

public interface WorkerDao<T,K> extends GenericDao<Worker,Long>  {
    Worker findByLogin(String login, String haslo);
}
