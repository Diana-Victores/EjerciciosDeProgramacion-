 
import javax.swing.table.DefaultTableModel;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Diana
 */
public class project_piramidenumeros extends javax.swing.JFrame {

    /**
     * Creates new form project_piramidenumeros
     */
    public project_piramidenumeros() {
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

        numeros = new javax.swing.ButtonGroup();
        tabla = new javax.swing.JPanel();
        uno = new javax.swing.JRadioButton();
        dos = new javax.swing.JRadioButton();
        tres = new javax.swing.JRadioButton();
        cuatro = new javax.swing.JRadioButton();
        cinco = new javax.swing.JRadioButton();
        seis = new javax.swing.JRadioButton();
        siete = new javax.swing.JRadioButton();
        ocho = new javax.swing.JRadioButton();
        nueve = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        xtabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBorder(javax.swing.BorderFactory.createTitledBorder("NUMEROS"));

        numeros.add(uno);
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        numeros.add(dos);
        dos.setText("2");

        numeros.add(tres);
        tres.setText("3");

        numeros.add(cuatro);
        cuatro.setText("4");

        numeros.add(cinco);
        cinco.setText("5");

        numeros.add(seis);
        seis.setText("6");

        numeros.add(siete);
        siete.setText("7");

        numeros.add(ocho);
        ocho.setText("8");

        numeros.add(nueve);
        nueve.setText("9");

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addComponent(uno)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(tablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablaLayout.createSequentialGroup()
                        .addComponent(tres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nueve))
                    .addGroup(tablaLayout.createSequentialGroup()
                        .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cuatro)
                            .addGroup(tablaLayout.createSequentialGroup()
                                .addComponent(dos)
                                .addGap(2, 2, 2)
                                .addComponent(cinco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siete)
                            .addComponent(ocho))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaLayout.createSequentialGroup()
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno)
                    .addComponent(cuatro)
                    .addComponent(siete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dos)
                    .addComponent(cinco)
                    .addComponent(ocho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tres)
                    .addComponent(seis)
                    .addComponent(nueve))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        getContentPane().add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setText("grados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, 50));

        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        xtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cadena", "Longitud"
            }
        ));
        jScrollPane1.setViewportView(xtabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 DefaultTableModel model=( DefaultTableModel) xtabla.getModel();
        
        String numero="",c1;
        String pal="";
        int i, k, conteo, cont;
        
        if (uno.isSelected()){
            numero="1";
         }
        
         if (dos.isSelected()){
            numero="2";
         }
         
          if (tres.isSelected()){
            numero="3";
         }
        
           if (cuatro.isSelected()){
            numero="4";
         }
        
            if (cinco.isSelected()){
            numero="5";
         }
             if (seis.isSelected()){
            numero="6";
         }
              if (siete.isSelected()){
            numero="7";
         }
               if (ocho.isSelected()){
            numero="8";
         }
                if (nueve.isSelected()){
            numero="9";
         }
            
    c1=c.getText();
    cont=Integer.parseInt(c1);

    for (i=1;i<=cont;i=i+1){
        for(k=1;k<=i;k=k+1){
            pal=pal+numero;
        }
       
        Object  [] fila=new Object [2];
        fila [0]= pal;
        fila [1]= i;
        model.addRow(fila);
        pal="";
         
xtabla.setModel(model);
        
}



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
            java.util.logging.Logger.getLogger(project_piramidenumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project_piramidenumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project_piramidenumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project_piramidenumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project_piramidenumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c;
    private javax.swing.JRadioButton cinco;
    private javax.swing.JRadioButton cuatro;
    private javax.swing.JRadioButton dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nueve;
    private javax.swing.ButtonGroup numeros;
    private javax.swing.JRadioButton ocho;
    private javax.swing.JRadioButton seis;
    private javax.swing.JRadioButton siete;
    private javax.swing.JPanel tabla;
    private javax.swing.JRadioButton tres;
    private javax.swing.JRadioButton uno;
    private javax.swing.JTable xtabla;
    // End of variables declaration//GEN-END:variables
}
