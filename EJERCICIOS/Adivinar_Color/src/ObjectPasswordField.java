
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class ObjectPasswordField extends javax.swing.JFrame {

    /**
     * Creates new form ObjectPasswordField
     */
    public ObjectPasswordField() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jpcolor = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        color = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        txmensaje = new javax.swing.JTextField();
        resul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        otravez = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        pb1 = new javax.swing.JProgressBar();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRRESE COLOR A ADIVINAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 97, -1, -1));
        getContentPane().add(jpcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 94, 186, -1));

        jLabel4.setText("INGRESE COLOR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 151, -1, -1));
        getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 148, 186, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLAY GAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 259, 182, -1));
        jPanel1.add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 297, 182, -1));

        jLabel3.setText("INTENTOS FALLIDOS ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 300, -1, -1));

        jLabel2.setText("MENSAJE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 262, -1, -1));

        otravez.setText("OTRA VEZ");
        otravez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otravezActionPerformed(evt);
            }
        });
        jPanel1.add(otravez, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 208, -1, -1));

        aceptar.setText("JUGAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 208, -1, -1));

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 208, -1, -1));

        jLabel5.setText("ESTADO DEL JUEGO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 427, -1, -1));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 424, 213, -1));
        jPanel1.add(pb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 356, 204, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int conteo = 0;
 
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        String clave = "verde";
        String ingresa;
        ingresa = jpcolor.getText();
        //--------------------------------------
        String coloradivinar;
        coloradivinar= color.getText();
        pb1.setStringPainted(true);
        pb1.setForeground(Color.black);
        
        
        
        if(coloradivinar.equals(ingresa)){
        txmensaje.setText("Correcto -- Adivinaste");
        txmensaje.setBackground(Color.yellow);
        jpcolor.setEditable(false);
        aceptar.setEnabled(false);
        } 
        
        else {
        txmensaje.setText("Color Incorrecto");
        txmensaje.setBackground(Color.red);
        jpcolor.setText("");
        conteo = conteo + 1;
        }
        
        
        if(conteo ==3){
        estado.setText("GAME OVER");
        jpcolor.setEditable(false);
        jpcolor.setBackground(Color.LIGHT_GRAY);
        aceptar.setEnabled(false);
        
        
        }
        
       int valor = 0;
        valor = pb1.getValue() + 33;
        if(valor>pb1.getMaximum()){
        valor=pb1.getMaximum();
          }
        pb1.setValue(valor);

        resul.setText(String.valueOf(conteo));
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void otravezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otravezActionPerformed
        // TODO add your handling code here:
        int valor=0;
        aceptar.setEnabled(true);
        jpcolor.setEditable(true);
        aceptar.setEnabled(true);
        color.setEditable(true);
        jpcolor.setBackground(Color.white);
        color.setBackground(Color.white);
        txmensaje.setBackground(Color.white);
        color.setText("");
        jpcolor.setText("");
        txmensaje.setText("");
        resul.setText("");
        estado.setText("");
        pb1.setValue(valor);
        conteo=0;
    }//GEN-LAST:event_otravezActionPerformed
   
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
            java.util.logging.Logger.getLogger(ObjectPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ObjectPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ObjectPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ObjectPasswordField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ObjectPasswordField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JPasswordField color;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jpcolor;
    private javax.swing.JButton otravez;
    private javax.swing.JProgressBar pb1;
    private javax.swing.JTextField resul;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txmensaje;
    // End of variables declaration//GEN-END:variables
}
