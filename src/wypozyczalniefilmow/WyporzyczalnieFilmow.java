/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import JFrames.Okno;
import jpaDAO.*;
import models.*;
import Interface.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author Rozkurwozaur
 */

public class WyporzyczalnieFilmow {
    //protected static EntityManager em;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EntityManager em = null;
        //Customer customer = em.find(Customer.class, 0);
        //System.out.println(customer.getLastName());
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerJpaDao cdao = new CustomerJpaDao();
        Customer customer = new Customer();
        customer.setFirstName("asd1");
        customer.setLastName("sdf1");
        customer.setEmail("aaa@one2t.pl");
        cdao.save(customer);
        Okno frame1 = context.getBean(Okno.class);
        frame1.setTitle("Wyporzyczalnia Filmów XD");
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
    
}
