/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PrithviDevKumar
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel1 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sign = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        click_me = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        sign1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email/Boss.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 84, 34, -1));

        em.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emKeyPressed(evt);
            }
        });
        getContentPane().add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 84, 203, 24));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email/Lock.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 135, 34, -1));

        sign.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sign.setText("SIGN IN");
        sign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });
        getContentPane().add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 183, 93, 28));
        sign.getAccessibleContext().setAccessibleName("Sign In");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Forgotten Password,");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 217, -1, -1));

        click_me.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        click_me.setForeground(new java.awt.Color(204, 0, 0));
        click_me.setBorder(null);
        click_me.setContentAreaFilled(false);
        click_me.setLabel("Click Here");
        click_me.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                click_meMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                click_meMouseExited(evt);
            }
        });
        click_me.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                click_meActionPerformed(evt);
            }
        });
        click_me.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                click_meKeyPressed(evt);
            }
        });
        getContentPane().add(click_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 213, -1, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email/1111.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 26, 169, 40));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 135, 203, 24));

        sign1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sign1.setText("SIGN UP");
        sign1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign1ActionPerformed(evt);
            }
        });
        getContentPane().add(sign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 183, 93, 28));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel5.setText("version 1.0.0");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 365, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email/background.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void click_meKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_click_meKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_click_meKeyPressed

    private void click_meMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_meMouseEntered
click_me.setForeground(Color.blue);        // TODO add your handling code here:
    }//GEN-LAST:event_click_meMouseEntered

    private void click_meMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click_meMouseExited
click_me.setForeground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_click_meMouseExited

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed
            String regex="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$";
            if(em.getText().matches(regex)){
            try {
            Connection con;
            myconnection registercon = new myconnection();
            con = registercon.getRegisterConnection();
            String email=em.getText();
            String password= pass.getText();
            String sql = "select * from details where email='"+email+"'&& Password='"+password+"'";
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            if(rs.next()){
                 String a = pass.getText();
                 String e1 = em.getText();
                 try{
                     String w = "Welcome";
                     String ff = rs.getString("first_name");
                     String ll = rs.getString("last_name");
                     String q = w.concat(" ").concat(ff).concat(" ").concat(ll);
                 email e = new email(a,q);
                 e.from.setText(e1);
                 this.setVisible(false);
                 e.setVisible(true);
                 con.close();
                 }
                 catch(Exception ex){};
                
                 JOptionPane.showMessageDialog(this, "LOGIN SUCCESSFUL");    
            }
            else{
                Connection con1;
                myconnection registercon1 = new myconnection();
                con1 = registercon1.getRegisterConnection();
                String sql1 = "Select * from details where email='"+em.getText()+"'";
                PreparedStatement p1 = con.prepareStatement(sql1);
                ResultSet rs1 = p1.executeQuery();
                if(!rs1.next()){
                JOptionPane.showMessageDialog(this,"INCORRECT EMAIL");
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"INCORRECT PASSWORD");
                }
                con1.close();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else{
                JOptionPane.showMessageDialog(null,"INVALID EMAIL");
                em.setText("");
                pass.setText("");
            }
        
    }//GEN-LAST:event_signActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void emKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emKeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_emKeyPressed

    private void sign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign1ActionPerformed
        user_details ud =new user_details();
        this.setVisible(false);
        ud.setVisible(true);
        
    }//GEN-LAST:event_sign1ActionPerformed

    private void click_meActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_click_meActionPerformed
        
        forgotten_pass fp = new forgotten_pass();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_click_meActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton click_me;
    public static javax.swing.JTextField em;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JPasswordField pass;
    private javax.swing.JButton sign;
    private javax.swing.JButton sign1;
    // End of variables declaration//GEN-END:variables
}
