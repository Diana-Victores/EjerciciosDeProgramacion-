/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class proyecto21 extends javax.swing.JFrame {

    /**
     * Creates new form proyecto21
     */
    public proyecto21() {
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
        parra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        voc = new javax.swing.JTextField();
        con = new javax.swing.JTextField();
        espa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ingrese parrafo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        getContentPane().add(parra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 140, -1));

        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 80, 30));

        jLabel2.setText("vocales");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel3.setText("consonantes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel4.setText("espacios ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        voc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocActionPerformed(evt);
            }
        });
        getContentPane().add(voc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 70, -1));
        getContentPane().add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 70, -1));
        getContentPane().add(espa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     String parrafo,vocal=" ",consonante=" ";
     int i,longi,e=0;
     char ch;
     parrafo=parra.getText();
     longi=parrafo.length();
     for (i=0;i<longi;i=i+1){
         ch=parrafo.charAt(i);
         if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
             vocal=vocal+ch;      
             }
             else if(ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&&ch!='u'){
                 consonante=consonante+ch;
         }
          if (ch==' '){
              e=e+1; 
     }
     }
        voc.setText(vocal);
        con.setText(consonante);
        espa.setText(String.valueOf(e));
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vocActionPerformed

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
            java.util.logging.Logger.getLogger(proyecto21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyecto21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyecto21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyecto21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyecto21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField con;
    private javax.swing.JTextField espa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField parra;
    private javax.swing.JTextField voc;
    // End of variables declaration//GEN-END:variables
}
