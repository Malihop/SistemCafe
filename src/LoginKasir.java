

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class LoginKasir extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginKasir() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in the screen
        this.setResizable(false); // prevent frame from being resized
    }
    
    private int x;
    private int y;
    
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;
    private static PreparedStatement ps;
    
    String getNama() {
        return namaField.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        namaField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setForeground(new java.awt.Color(255, 178, 207));
        closeButton.setText("X");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Thames", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Masuk Akun");

        loginButton.setBackground(new java.awt.Color(0, 0, 0));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 178, 207));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        namaField.setBackground(new java.awt.Color(51, 51, 51));
        namaField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        namaField.setForeground(new java.awt.Color(153, 153, 153));
        namaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        namaField.setText("Masukkan Nama");
        namaField.setToolTipText("");
        namaField.setBorder(null);
        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });

        idField.setBackground(new java.awt.Color(51, 51, 51));
        idField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        idField.setForeground(new java.awt.Color(153, 153, 153));
        idField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idField.setText("Masukkan No. ID");
        idField.setBorder(null);
        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFieldFocusLost(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginkasir/iconBlack.png"))); // NOI18N

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginkasir/icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(closeButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(loginButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        try {
            openDb();
            ps = c.prepareStatement("SELECT `namaPegawai`, `idPegawai` FROM "
                + "`karyawan` WHERE `namaPegawai` = ? AND `idPegawai` = ?");
            ps.setString(1, namaField.getText());
            ps.setString(2, String.valueOf(idField.getText()));
            rs = ps.executeQuery();
            
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successesfully");
                setVisible(false);
                Pembayaran slide = new Pembayaran(namaField.getText());
                slide.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Nama or ID");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
        } finally {
            closeDb();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void namaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusGained
        // TODO add your handling code here:
        if(namaField.getText().equals("Masukkan Nama")) {
            namaField.setText("");
        }
        
        namaField.setForeground(Color.white);
    }//GEN-LAST:event_namaFieldFocusGained

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        // TODO add your handling code here:
        if(namaField.getText().equals("")) {
            namaField.setText("Masukkan Nama");
        }
        
        namaField.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_namaFieldFocusLost

    private void idFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusGained
        // TODO add your handling code here:
        if(idField.getText().equals("Masukkan No. ID")) {
            idField.setText("");
        }
        
        idField.setForeground(Color.white);
    }//GEN-LAST:event_idFieldFocusGained

    private void idFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusLost
        // TODO add your handling code here:
        if(idField.getText().equals("")) {
            idField.setText("Masukkan No. ID");
        }
        
        idField.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_idFieldFocusLost

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Tampilan slide = new Tampilan();
        slide.setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        int x1 = evt.getXOnScreen();
        int y1 = evt.getYOnScreen();

        this.setLocation(x1-x, y1-y);
    }//GEN-LAST:event_panelMouseDragged

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    /**
     * @param args the command line arguments
     */
    
    private static void openDb() throws ClassNotFoundException, SQLException {
       String URL = "jdbc:mysql://localhost:3306/dbkasir";
       String USERNAME = "root";
       String PASSWORD = "";
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       c = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       s = c.createStatement();
    }
    
    private static void closeDb() {
        try {
            rs.close();
            s.close();
            c.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel panel;
    // End of variables declaration//GEN-END:variables
}