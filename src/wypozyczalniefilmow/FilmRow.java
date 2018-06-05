/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rozkurwozaur
 */
public class FilmRow {
    
    public static JPanel add(JPanel panel)
    {
        JLabel label = new JLabel("XD2");
        javax.swing.border.Border blackline = BorderFactory.createLoweredBevelBorder();
        //panel.setPreferredSize(new Dimension(150, 100));
        panel.setMaximumSize(new Dimension(850,70));
        panel.setPreferredSize(new Dimension(850,70));
        panel.setMinimumSize(new Dimension(850,70));
        //asd
        panel.setBorder(blackline);
        panel.add(label);
        return panel;
    }
    
}
