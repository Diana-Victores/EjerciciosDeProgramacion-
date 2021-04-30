
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class Arreglos extends javax.swing.JFrame {
      int sum;
        
    /**
     * Creates new form Arreglos
     */
    public Arreglos() {
            initComponents();
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    int i=0;
    int datos[] = new int[10];
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btningresar = new javax.swing.JButton();
        btnmostrardatos = new javax.swing.JButton();
        resul = new javax.swing.JTextField();
        btbsuma = new javax.swing.JButton();
        resulsuma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ARREGLOS"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btningresar.setText("INGRESE DATOS");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 160, -1));

        btnmostrardatos.setText("MOSTRAR DATOS");
        btnmostrardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrardatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnmostrardatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, -1));
        jPanel1.add(resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 216, -1));

        btbsuma.setText("SUMA DE DATOS");
        btbsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbsumaActionPerformed(evt);
            }
        });
        jPanel1.add(btbsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));
        jPanel1.add(resulsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        // INGRESAR DATOS
        String pregunta;
        pregunta = JOptionPane.showInputDialog("Ingrese numero:");
        if(pregunta.equals("")){
        JOptionPane.showMessageDialog(this, "Debe ingresar un numero");
        }
        else {
        datos[i] = Integer.parseInt(pregunta);
        JOptionPane.showMessageDialog(this, "Numero Guardado");
        i=i+1;
        }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnmostrardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrardatosActionPerformed
        // MOSTRAR DATOS
        String union = "";
        int longi = datos.length;
        int x;
        for(x=0;x<longi;x=x+1){
        union = union + String.valueOf(datos[x] + " - ");
        }
        resul.setText(union);
    }//GEN-LAST:event_btnmostrardatosActionPerformed

    private void btbsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbsumaActionPerformed
        // SUMA DE DATOS
    String operation=resul.getText();
    String aux=operation.replace(" ", " ");
    Pattern pattern=Pattern.compile("[+-]?[0-9]+");
    Matcher matcher=pattern.matcher(aux);
    Integer num=0;
    while(matcher.find()){
        sum +=Integer.valueOf(matcher.group());
        
    }
    String tot=String.valueOf(sum);
    resulsuma.setText(tot);
    }//GEN-LAST:event_btbsumaActionPerformed

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
            java.util.logging.Logger.getLogger(Arreglos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbsuma;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnmostrardatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resul;
    private javax.swing.JTextField resulsuma;
    // End of variables declaration//GEN-END:variables
}