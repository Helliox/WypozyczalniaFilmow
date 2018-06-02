/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniefilmow;

import org.springframework.stereotype.Component;
import java.awt.Color;
import filmentity.Entity;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rozkurwozaur
 */
@Component
public class Okno extends javax.swing.JFrame {

    /**
     * Creates new form Okno
     */
    public Okno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JLayeredPane();
        LoginField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ZalogujButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RejestracjaButton = new javax.swing.JButton();
        ZalogujSieLabel = new javax.swing.JLabel();
        menuPanel = new javax.swing.JLayeredPane();
        tabPanel = new javax.swing.JTabbedPane();
        przegladajTab = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        panelTEST = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textTEST = new javax.swing.JTextPane();
        dodajTab = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        kontoTab = new javax.swing.JPanel();
        nazwaKontaLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nazwaKontaDB = new javax.swing.JLabel();
        idDB = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        zmienHasloButton = new javax.swing.JButton();
        twojeRezerwacjeLabel = new javax.swing.JLabel();
        wylogujButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        twojeRezerwacjeText = new javax.swing.JTextPane();
        historiaTranskacjiButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginField.setForeground(new java.awt.Color(204, 204, 204));
        LoginField.setText("Nazwa użytkownika");
        LoginField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginFieldMouseClicked(evt);
            }
        });

        LoginLabel.setText("Login:");

        PasswordLabel.setText("Hasło:");

        ZalogujButton.setText("Zaloguj");
        ZalogujButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZalogujButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Nie masz konta? Zarejestruj");

        RejestracjaButton.setText("Rejestracja");
        RejestracjaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RejestracjaButtonMouseClicked(evt);
            }
        });

        ZalogujSieLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ZalogujSieLabel.setText("Logowanie");

        loginPanel.setLayer(LoginField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(PasswordField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(LoginLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(PasswordLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(ZalogujButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(RejestracjaButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        loginPanel.setLayer(ZalogujSieLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ZalogujButton)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoginField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(PasswordField)))
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(318, 318, 318))))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(ZalogujSieLabel))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(RejestracjaButton)))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(ZalogujSieLabel)
                .addGap(52, 52, 52)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginLabel))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(ZalogujButton)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(RejestracjaButton)
                .addGap(87, 87, 87))
        );

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        panelTEST.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTEST.setLayout(new GridLayout());
        panelTEST.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelTESTLayout = new javax.swing.GroupLayout(panelTEST);
        panelTEST.setLayout(panelTESTLayout);
        panelTESTLayout.setHorizontalGroup(
            panelTESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        panelTESTLayout.setVerticalGroup(
            panelTESTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(textTEST);

        javax.swing.GroupLayout przegladajTabLayout = new javax.swing.GroupLayout(przegladajTab);
        przegladajTab.setLayout(przegladajTabLayout);
        przegladajTabLayout.setHorizontalGroup(
            przegladajTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(przegladajTabLayout.createSequentialGroup()
                .addGroup(przegladajTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(przegladajTabLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jButton2))
                    .addGroup(przegladajTabLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(panelTEST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(przegladajTabLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        przegladajTabLayout.setVerticalGroup(
            przegladajTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(przegladajTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(42, 42, 42)
                .addComponent(panelTEST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        tabPanel.addTab("                                                      Przeglądaj                                                       ", przegladajTab);

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout dodajTabLayout = new javax.swing.GroupLayout(dodajTab);
        dodajTab.setLayout(dodajTabLayout);
        dodajTabLayout.setHorizontalGroup(
            dodajTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajTabLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        dodajTabLayout.setVerticalGroup(
            dodajTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dodajTabLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        tabPanel.addTab("                                            Dodaj                                                    ", dodajTab);

        nazwaKontaLabel.setText("Nazwa konta:");

        idLabel.setText("Id:");

        nazwaKontaDB.setText("***");

        idDB.setText("***");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        zmienHasloButton.setText("Zmień hasło");

        twojeRezerwacjeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        twojeRezerwacjeLabel.setText("Twoje Rezerwacje");

        wylogujButton.setText("Wyloguj");
        wylogujButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wylogujButtonMouseClicked(evt);
            }
        });

        twojeRezerwacjeText.setEditable(false);
        jScrollPane2.setViewportView(twojeRezerwacjeText);

        historiaTranskacjiButton.setText("Zobacz historię transakcji");

        jButton1.setText("Anuluj rezerwację");

        javax.swing.GroupLayout kontoTabLayout = new javax.swing.GroupLayout(kontoTab);
        kontoTab.setLayout(kontoTabLayout);
        kontoTabLayout.setHorizontalGroup(
            kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kontoTabLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabel)
                    .addComponent(nazwaKontaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nazwaKontaDB)
                    .addComponent(idDB)
                    .addComponent(zmienHasloButton))
                .addGap(71, 71, 71)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kontoTabLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(twojeRezerwacjeLabel)
                        .addContainerGap())
                    .addGroup(kontoTabLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kontoTabLayout.createSequentialGroup()
                                .addComponent(historiaTranskacjiButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kontoTabLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(wylogujButton)
                                .addGap(47, 47, 47))))))
            .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kontoTabLayout.createSequentialGroup()
                    .addGap(692, 692, 692)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(151, Short.MAX_VALUE)))
        );
        kontoTabLayout.setVerticalGroup(
            kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kontoTabLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kontoTabLayout.createSequentialGroup()
                        .addComponent(twojeRezerwacjeLabel)
                        .addGap(18, 18, 18)
                        .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wylogujButton)
                            .addComponent(jScrollPane2)))
                    .addGroup(kontoTabLayout.createSequentialGroup()
                        .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nazwaKontaLabel)
                            .addComponent(nazwaKontaDB))
                        .addGap(18, 18, 18)
                        .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idDB))
                        .addGap(44, 44, 44)
                        .addComponent(zmienHasloButton))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historiaTranskacjiButton)
                    .addComponent(jButton1))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(kontoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kontoTabLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        tabPanel.addTab("      Konto       ", kontoTab);

        menuPanel.setVisible(false);

        menuPanel.setLayer(tabPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menuPanel))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginFieldMouseClicked
        LoginField.setText("");        
        LoginField.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoginFieldMouseClicked

    private void ZalogujButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZalogujButtonMouseClicked
        loginPanel.setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_ZalogujButtonMouseClicked

    private void wylogujButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wylogujButtonMouseClicked
        menuPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_wylogujButtonMouseClicked

    private void RejestracjaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RejestracjaButtonMouseClicked
        Rejestracja rej = new Rejestracja();
        rej.setTitle("Rejestracja");
        rej.setLocationRelativeTo(null);
        rej.setVisible(true);
    }//GEN-LAST:event_RejestracjaButtonMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JPanel panel = new JPanel();
        JLabel _la = new JLabel("XD");
        
        panel.setLayout(new BorderLayout());
        panel.setSize(50,50);
        panel.add(_la);
        JTextField asd = new JTextField();
        //panel.add(la);
        panelTEST.add(panel);
        panelTEST.setOpaque(true);
        panelTEST.setBackground(Color.BLUE);
        //SwingUtilities.updateComponentTreeUI(panelTEST);
        //panelTEST.validate();
        panelTEST.revalidate();
        panelTEST.repaint();
        textTEST.setText("asda");
        //test.add(la);
        //test.add(filmentity.Entity.add());
    }//GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LoginField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RejestracjaButton;
    private javax.swing.JButton ZalogujButton;
    private javax.swing.JLabel ZalogujSieLabel;
    private javax.swing.JPanel dodajTab;
    private javax.swing.JButton historiaTranskacjiButton;
    private javax.swing.JLabel idDB;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel kontoTab;
    private javax.swing.JLayeredPane loginPanel;
    private javax.swing.JLayeredPane menuPanel;
    private javax.swing.JLabel nazwaKontaDB;
    private javax.swing.JLabel nazwaKontaLabel;
    private javax.swing.JPanel panelTEST;
    private javax.swing.JPanel przegladajTab;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextPane textTEST;
    private javax.swing.JLabel twojeRezerwacjeLabel;
    private javax.swing.JTextPane twojeRezerwacjeText;
    private javax.swing.JButton wylogujButton;
    private javax.swing.JButton zmienHasloButton;
    // End of variables declaration//GEN-END:variables
}
