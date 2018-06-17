/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import JFrames.Okno;
import java.util.Collection;
import java.util.List;
import jpaDAO.CustomerJpaDao;
import jpaDAO.ProductJpaDao;
import models.Customer;
import models.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class WyporzyczalnieFilmow {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Okno frame1 = context.getBean(Okno.class);
        frame1.setTitle("Wyporzyczalnia Filmów XD");
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        /*ProductJpaDao pdao = new ProductJpaDao();
        System.out.println(pdao.amount());
         List<Product> emps = pdao.findAllProducts();
            //for (Product e : emps)
            //System.out.println("Found Professor: " + e);
        System.out.println(emps.get(0).getStates());
        System.out.println(emps.get(0).getPrice());
        System.out.println(emps.get(0).getTitle());*/
        
        
          
    }
    
}
