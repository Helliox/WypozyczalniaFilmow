/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javafx.scene.layout.Border;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jpaDAO.ProductJpaDao;
import models.Product;

/**
 *
 * @author Rozkurwozaur
 */
public class FilmRow {
    
    public static JPanel add(JPanel panel, String tytul, double cena, String status, Long id)
    {
        JLabel label1 = new JLabel(tytul);
        String cenaStr = String.valueOf(cena);
        JLabel label2 = new JLabel(cenaStr);
        JLabel label3 = new JLabel(status);
        String idStr = String.valueOf(id);
        JLabel label4 = new JLabel(idStr);
        javax.swing.border.Border blackline = BorderFactory.createLoweredBevelBorder();
        
        //panel.setPreferredSize(new Dimension(150, 100));
        label1.setMaximumSize(new Dimension(200,14));
        label1.setPreferredSize(new Dimension(200,14));
        label1.setMinimumSize(new Dimension(200,14));
        label2.setMaximumSize(new Dimension(200,14));
        label2.setPreferredSize(new Dimension(200,14));
        label2.setMinimumSize(new Dimension(200,14));
        label3.setMaximumSize(new Dimension(200,14));
        label3.setPreferredSize(new Dimension(200,14));
        label3.setMinimumSize(new Dimension(200,14));
        panel.setMaximumSize(new Dimension(850,70));
        panel.setPreferredSize(new Dimension(850,70));
        panel.setMinimumSize(new Dimension(850,70));
        //asd
        panel.setBorder(blackline);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        return panel;
    }
}
