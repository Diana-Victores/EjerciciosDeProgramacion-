
import javax.swing.DefaultListModel;
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
public class lista_numeros extends javax.swing.JFrame {

    /**
     * Creates new form lista_numeros
     */
    public lista_numeros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
      DefaultListModel list = new DefaultListModel();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist = new javax.swing.JList<>();
        btnAGREGAR = new javax.swing.JButton();
        btnBORRAR = new javax.swing.JButton();
        btnCALCULAR = new javax.swing.JButton();
        resul = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        dato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESE VALOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 78, -1, -1));

        jScrollPane1.setViewportView(jlist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 133, 162, -1));

        btnAGREGAR.setText("AGREGAR");
        btnAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARActionPerformed(evt);
            }
        });
        getContentPane().add(btnAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 133, -1, -1));

        btnBORRAR.setText("BORRAR");
        btnBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBORRARActionPerformed(evt);
            }
        });
        getContentPane().add(btnBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 174, 81, -1));

        btnCALCULAR.setText("CALCULAR");
        btnCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCALCULARActionPerformed(evt);
            }
        });
        getContentPane().add(btnCALCULAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 133, -1, -1));
        getContentPane().add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 167, 85, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA NUMEROS"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                datoKeyTyped(evt);
            }
        });
        jPanel1.add(dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 73, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
        // TODO add your handling code here:
        String valor;

        valor = dato.getText();
        list.addElement(valor);

        jlist.setModel(list);
        
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBORRARActionPerformed
        // TODO add your handling code here:
        int indice;
        indice = jlist.getSelectedIndex();
        list.remove(indice);
    }//GEN-LAST:event_btnBORRARActionPerformed

    private void btnCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCALCULARActionPerformed
        // TODO add your handling code here:
        int indice,longi;
        float elevacion;
        float cadena;

        indice = jlist.getSelectedIndex();
        cadena = (Float.parseFloat(String.valueOf(jlist.getSelectedValue())));

        elevacion= cadena*cadena;
        resul.setText(String.valueOf(elevacion));
    }//GEN-LAST:event_btnCALCULARActionPerformed

    private void datoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMEROS");
        }
    }//GEN-LAST:event_datoKeyTyped

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
            java.util.logging.Logger.getLogger(lista_numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lista_numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lista_numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lista_numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lista_numeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnBORRAR;
    private javax.swing.JButton btnCALCULAR;
    private javax.swing.JTextField dato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlist;
    private javax.swing.JTextField resul;
    // End of variables declaration//GEN-END:variables
}
