/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Diana
 */
public class registar extends javax.swing.JFrame {

    /**
     * Creates new form registar
     */
    public registar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     public void agregarusuarios(){
        
        String pass=String.valueOf(txtPass.getPassword());
        
        String sql ="insert into Login (CodigoNombre,CodigoContrasenia) values (?,?)";
       
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/laboratory", "root", "");//conecta a MYSQL  
            PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?)");
            
            pst.setString(1, txtUsuario.getText().trim()); 
            pst.setString(2, txtPass.getText().trim()); 
           
            pst.executeUpdate();
            
            txtUsuario.setText("");
            txtPass.setText("");
           
        }catch (Exception e){
            e.printStackTrace();
        }
           }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRARSE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTRASE??A");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 170, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, -1));

        jButton1.setText("REGRESAR LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 140, -1));

        jButton2.setText("REGISTRARSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, -1));

        txtpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/fondo login.jpg"))); // NOI18N
        txtpass.setText("jLabel1");
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 531));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         LoginClientes frm = new LoginClientes();
         frm.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JLabel txtpass;
    // End of variables declaration//GEN-END:variables
}
