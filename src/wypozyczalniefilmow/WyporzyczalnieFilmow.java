/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import JFrames.Okno;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class WyporzyczalnieFilmow {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Okno frame1 = context.getBean(Okno.class);
        frame1.setTitle("Wyporzyczalnia Filmów XD");
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
    
}
