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
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     */
    public Operaciones() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        PanelTools = new javax.swing.JPanel();
        CmdSAB = new javax.swing.JButton();
        CmdRAB = new javax.swing.JButton();
        CmdMAB = new javax.swing.JButton();
        CmdDAB = new javax.swing.JButton();
        CmdReset = new javax.swing.JButton();
        PanelMatrix = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MatrizA = new javax.swing.JTable();
        CmdDefA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MatrizB = new javax.swing.JTable();
        CmdDefB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Result.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        Result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Result.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(Result);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 400, 200));

        PanelTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        CmdSAB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdSAB.setText("A+B");
        CmdSAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdSAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSABActionPerformed(evt);
            }
        });

        CmdRAB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdRAB.setText("A-B");
        CmdRAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdRAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdRABActionPerformed(evt);
            }
        });

        CmdMAB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdMAB.setText("A*B");
        CmdMAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdMAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdMABActionPerformed(evt);
            }
        });

        CmdDAB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdDAB.setText("A/B");
        CmdDAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdDAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDABActionPerformed(evt);
            }
        });

        CmdReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdReset.setText("Reiniciar");
        CmdReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelToolsLayout = new javax.swing.GroupLayout(PanelTools);
        PanelTools.setLayout(PanelToolsLayout);
        PanelToolsLayout.setHorizontalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmdSAB)
                            .addComponent(CmdRAB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmdMAB)
                            .addComponent(CmdDAB)))
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(CmdReset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelToolsLayout.setVerticalGroup(
            PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmdMAB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelToolsLayout.createSequentialGroup()
                        .addComponent(CmdSAB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CmdRAB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmdDAB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelTools, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        PanelMatrix.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrices"));

        MatrizA.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        MatrizA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        MatrizA.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(MatrizA);

        CmdDefA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdDefA.setText("Definir Matriz A");
        CmdDefA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdDefA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDefAActionPerformed(evt);
            }
        });

        MatrizB.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        MatrizB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        MatrizB.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(MatrizB);

        CmdDefB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CmdDefB.setText("Definir Matriz B");
        CmdDefB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CmdDefB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdDefBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMatrixLayout = new javax.swing.GroupLayout(PanelMatrix);
        PanelMatrix.setLayout(PanelMatrixLayout);
        PanelMatrixLayout.setHorizontalGroup(
            PanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMatrixLayout.createSequentialGroup()
                .addGroup(PanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdDefB)
                    .addGroup(PanelMatrixLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelMatrixLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(CmdDefA)))))
                .addGap(442, 442, 442))
        );
        PanelMatrixLayout.setVerticalGroup(
            PanelMatrixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMatrixLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(CmdDefA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdDefB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelMatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 510));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int nA, mA; int nB, mB;
    double[][] matrizA;
    double[][] matrizB;
    String[][] matrizR;
    private void CmdSABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSABActionPerformed
        if((nA==nB)&&(mA==mB)){
            matrizR = new String[nA][mB];
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    matrizR[i][j]=String.valueOf(matrizA[i][j]+matrizB[i][j]);
                }
            }
            DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
            modeloR.setRowCount(nA);
            modeloR.setColumnCount(mB);
            Result.setModel(modeloR);
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    Result.setValueAt(String.valueOf(matrizR[i][j]), i, j);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Matrices con diferentes dimensiones!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CmdSABActionPerformed

    private void CmdRABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdRABActionPerformed
        if((nA==nB)&&(mA==mB)){
            matrizR = new String[nA][mB];
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    matrizR[i][j]=String.valueOf(matrizA[i][j]-matrizB[i][j]);
                }
            }
            DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
            modeloR.setRowCount(nA);
            modeloR.setColumnCount(mB);
            Result.setModel(modeloR);
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    Result.setValueAt(String.valueOf(matrizR[i][j]), i, j);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Matrices con diferentes dimensiones!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CmdRABActionPerformed

    private void CmdMABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdMABActionPerformed
        if((nA==nB)&&(mA==mB)){
            matrizR = new String[nA][mB];
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    matrizR[i][j]=String.valueOf(matrizA[i][j]*matrizB[i][j]);
                }
            }
            DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
            modeloR.setRowCount(nA);
            modeloR.setColumnCount(mB);
            Result.setModel(modeloR);
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    Result.setValueAt(String.valueOf(matrizR[i][j]), i, j);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Matrices con diferentes dimensiones!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CmdMABActionPerformed

    private void CmdDABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDABActionPerformed
        if((nA==nB)&&(mA==mB)){
            matrizR = new String[nA][mB];
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    if(matrizB[i][j]==0){
                        matrizR[i][j]="∞";
                    }
                    else{
                        matrizR[i][j]=String.valueOf(matrizA[i][j]/matrizB[i][j]);
                    }
                }
            }
            DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
            modeloR.setRowCount(nA);
            modeloR.setColumnCount(mB);
            Result.setModel(modeloR);
            for(int i=0; i<nA; i++){
                for(int j=0; j<mB; j++){
                    Result.setValueAt(String.valueOf(matrizR[i][j]), i, j);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Matrices con diferentes dimensiones!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CmdDABActionPerformed

    private void CmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdResetActionPerformed
        DefaultTableModel modeloA = (DefaultTableModel) MatrizA.getModel();
        DefaultTableModel modeloB = (DefaultTableModel) MatrizB.getModel();
        DefaultTableModel modeloR = (DefaultTableModel) Result.getModel();
        //-----------------------------------------------------------//
        modeloA.setRowCount(0); modeloA.setColumnCount(0);
        MatrizA.setModel(modeloA);
        //-------------------------------------------------------------//
        modeloB.setRowCount(0); modeloB.setColumnCount(0);
        MatrizB.setModel(modeloB);
        //-------------------------------------------------------------//
        modeloR.setRowCount(0); modeloR.setColumnCount(0);
        Result.setModel(modeloR);
        //----------------------------------------------------------------//
        nA=0; mA=0; nB=0; mB=0;
    }//GEN-LAST:event_CmdResetActionPerformed

    private void CmdDefAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDefAActionPerformed

        nA=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Filas de A"));
        mA=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Columnas de A"));
        //------------------------------------------------------------------------------//
        matrizA = new double[nA][mA];
        //-------------------------//
        for(int i=0; i<nA; i++){
            for(int j=0; j<mA; j++){
                matrizA[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Elemento "+i+","+j));
            }
        }
        //---------------------------------------------------------------------------------//
        DefaultTableModel modeloA = (DefaultTableModel) MatrizA.getModel();
        modeloA.setRowCount(nA);
        modeloA.setColumnCount(mA);
        MatrizA.setModel(modeloA);
        //----------------------------------------------------------------------//
        for(int i=0; i<nA; i++){
            for(int j=0; j<mA; j++){
                MatrizA.setValueAt(String.valueOf(matrizA[i][j]), i, j);
            }
        }
        //-----------------------------------------------------------------------//
    }//GEN-LAST:event_CmdDefAActionPerformed

    private void CmdDefBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdDefBActionPerformed

        nB=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Filas de B"));
        mB=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Columnas de B"));
        //------------------------------------------------------------------------------//
        matrizB = new double[nB][mB];
        //-------------------------//
        for(int i=0; i<nB; i++){
            for(int j=0; j<mB; j++){
                matrizB[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Elemento "+i+","+j));
            }
        }
        //---------------------------------------------------------------------------------//
        DefaultTableModel modeloB = (DefaultTableModel) MatrizB.getModel();
        modeloB.setRowCount(nB);
        modeloB.setColumnCount(mB);
        MatrizB.setModel(modeloB);
        //----------------------------------------------------------------------//
        for(int i=0; i<nB; i++){
            for(int j=0; j<mB; j++){
                MatrizB.setValueAt(String.valueOf(matrizB[i][j]), i, j);
            }
        }
        //-----------------------------------------------------------------------//
    }//GEN-LAST:event_CmdDefBActionPerformed

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdDAB;
    private javax.swing.JButton CmdDefA;
    private javax.swing.JButton CmdDefB;
    private javax.swing.JButton CmdMAB;
    private javax.swing.JButton CmdRAB;
    private javax.swing.JButton CmdReset;
    private javax.swing.JButton CmdSAB;
    private javax.swing.JTable MatrizA;
    private javax.swing.JTable MatrizB;
    private javax.swing.JPanel PanelMatrix;
    private javax.swing.JPanel PanelTools;
    private javax.swing.JTable Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
