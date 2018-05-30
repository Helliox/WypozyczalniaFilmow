/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Rozkurwozaur
 */
public class WyporzyczalnieFilmow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Okno frame1 = context.getBean(Okno.class);
        frame1.setVisible(true);
    }
    
}
