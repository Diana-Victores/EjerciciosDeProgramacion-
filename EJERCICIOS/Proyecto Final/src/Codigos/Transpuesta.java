/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WALTER
 */
public class Transpuesta extends javax.swing.JFrame {

    /**
     * Creates new form Transpuesta
     */
    public Transpuesta() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Matriz1 = new javax.swing.JTable();
        CmdDefM = new javax.swing.JButton();
        CmdRev = new javax.swing.JButton();
        CmdRe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 86, 33));

        Result.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Result.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Result);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 400, 200));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz"));

        Matriz1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Matriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Matriz1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Matriz1);

        CmdDefM.setBackground(new java.awt.Color(255, 255, 255));
        CmdDefM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdDefM.setText("Definir Matriz");
        CmdDefM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdDefM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDefMActionPerformed(evt);
            }
        });

        CmdRev.setBackground(new java.awt.Color(255, 255, 255));
        CmdRev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdRev.setText("Revertir");
        CmdRev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdRevActionPerformed(evt);
            }
        });

        CmdRe.setBackground(new java.awt.Color(255, 255, 255));
        CmdRe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdRe.setText("Reiniciar");
        CmdRe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdReActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmdDefM)
                    .addComponent(CmdRev, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CmdDefM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(CmdRev, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 int n;
    int[][] mA;
    
    private void CmdDefMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDefMActionPerformed
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Filas y Columnas de la Matriz"));
        mA=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mA[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Elemento "+i+", "+j));
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) Matriz1.getModel();
        modelo.setRowCount(n);
        modelo.setColumnCount(n);
        Matriz1.setModel(modelo);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Matriz1.setValueAt(mA[i][j], i, j);
            }
        }
    }//GEN-LAST:event_CmdDefMActionPerformed

    private void CmdRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdRevActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) Result.getModel();
        modelo.setRowCount(n);
        modelo.setColumnCount(n);
        Result.setModel(modelo);
        int aux=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                aux=mA[i][j];
                mA[i][j]=mA[j][i];
                mA[j][i]=aux;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                Result.setValueAt(mA[i][j], i, j);
            }
        }
    }//GEN-LAST:event_CmdRevActionPerformed

    private void CmdReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdReActionPerformed
        DefaultTableModel modeloA = (DefaultTableModel) Matriz1.getModel();
        DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
        modeloA.setRowCount(0); modeloA.setColumnCount(0);
        modeloR.setRowCount(0); modeloR.setColumnCount(0);
        Matriz1.setModel(modeloA);
        Result.setModel(modeloR);
    }//GEN-LAST:event_CmdReActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transpuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transpuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transpuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transpuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transpuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDefM;
    private javax.swing.JButton CmdRe;
    private javax.swing.JButton CmdRev;
    private javax.swing.JTable Matriz1;
    private javax.swing.JTable Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
