/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmentity;

import java.awt.Color;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rozkurwozaur
 */
public class Entity {
    
    public static JLabel add()
    {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("XDXDXD");
        panel.add(label);
        javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackline);
        return label;
    }
    
}
