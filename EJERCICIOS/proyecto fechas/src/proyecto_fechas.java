/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class proyecto_fechas extends javax.swing.JFrame {

    /**
     * Creates new form proyecto_fechas
     */
    public proyecto_fechas() {
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

        semana = new javax.swing.ButtonGroup();
        mes = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        an = new javax.swing.JTextField();
        dias = new javax.swing.JPanel();
        lunes = new javax.swing.JRadioButton();
        martes = new javax.swing.JRadioButton();
        miercoles = new javax.swing.JRadioButton();
        jueves = new javax.swing.JRadioButton();
        viernes = new javax.swing.JRadioButton();
        sabado = new javax.swing.JRadioButton();
        domingo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        enero = new javax.swing.JRadioButton();
        febrero = new javax.swing.JRadioButton();
        marzo = new javax.swing.JRadioButton();
        abril = new javax.swing.JRadioButton();
        mayo = new javax.swing.JRadioButton();
        jun = new javax.swing.JRadioButton();
        jul = new javax.swing.JRadioButton();
        ago = new javax.swing.JRadioButton();
        sep = new javax.swing.JRadioButton();
        oct = new javax.swing.JRadioButton();
        nov = new javax.swing.JRadioButton();
        dic = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("numero de dia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 22, -1, -1));
        getContentPane().add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, -1));

        jLabel2.setText("a??o");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
        getContentPane().add(an, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 120, 30));

        dias.setBorder(javax.swing.BorderFactory.createTitledBorder("DIA DE LA SEMANA"));

        semana.add(lunes);
        lunes.setText("1. LUNES");

        semana.add(martes);
        martes.setText("2. MARTES");
        martes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                martesActionPerformed(evt);
            }
        });

        semana.add(miercoles);
        miercoles.setText("3. MIERCOLES");

        semana.add(jueves);
        jueves.setText("4. JUEVES");

        semana.add(viernes);
        viernes.setText("5. VIERNES");

        semana.add(sabado);
        sabado.setText("6. SABADO");

        semana.add(domingo);
        domingo.setText("7. DOMINGO");
        domingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domingoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diasLayout = new javax.swing.GroupLayout(dias);
        dias.setLayout(diasLayout);
        diasLayout.setHorizontalGroup(
            diasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(diasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(miercoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(martes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jueves, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunes)
                    .addComponent(viernes)
                    .addComponent(sabado)
                    .addComponent(domingo))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        diasLayout.setVerticalGroup(
            diasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(martes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(miercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jueves, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viernes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sabado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(domingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 210));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("MES"));

        mes.add(enero);
        enero.setText("01");

        mes.add(febrero);
        febrero.setText("02");
        febrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                febreroActionPerformed(evt);
            }
        });

        mes.add(marzo);
        marzo.setText("03");

        mes.add(abril);
        abril.setText("04");

        mes.add(mayo);
        mayo.setText("05");

        mes.add(jun);
        jun.setText("06");

        mes.add(jul);
        jul.setText("07");

        mes.add(ago);
        ago.setText("08");

        mes.add(sep);
        sep.setText("09");

        mes.add(oct);
        oct.setText("10");

        mes.add(nov);
        nov.setText("11");

        mes.add(dic);
        dic.setText("12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(dic))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(mayo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nov))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(abril)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oct))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(marzo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sep))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(febrero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jul)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enero)
                    .addComponent(jul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(febrero)
                    .addComponent(ago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marzo)
                    .addComponent(sep))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abril)
                    .addComponent(oct))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayo)
                    .addComponent(nov))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jun)
                    .addComponent(dic))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 200));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel3.setText("FECHA EN LETRAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        getContentPane().add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void martesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_martesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_martesActionPerformed

    private void domingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domingoActionPerformed

    private void febreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_febreroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_febreroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String dias="",anios,fin="",mes="",dia="";

dias=numero.getText();
anios=an.getText();

if(lunes.isSelected()){
   dias="lunes";
     fin=dia+" "+dias+" de "+mes+" de "+ anios;
}
if(martes.isSelected()){
   dias="martes";
      fin=dia+" "+dias+" de "+mes+" de "+ anios;
}
if(miercoles.isSelected()){
   dias="miercoles";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}
if(jueves.isSelected()){
    dias="jueves";
         fin=dia+" "+dias+" de "+mes+" de "+ anios; 
}
if(viernes.isSelected()){
    dias="viernes";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(sabado.isSelected()){
 dias="sabado";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}
if(domingo.isSelected()){
   dias="domingo";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(enero.isSelected()){
   mes="enero";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(febrero.isSelected()){
   mes="febrero";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
        
            
        }

if(marzo.isSelected()){
  mes="marzo";
        fin=dia+" "+dias+" de "+mes+" de "+ anios; 
}

if(abril.isSelected()){
  mes="abril";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(mayo.isSelected()){
   mes="mayo";
       fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(jun.isSelected()){
   mes="junio";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(jul.isSelected()){
   mes="julio";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(ago.isSelected()){
   mes="agosto";
       fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(sep.isSelected()){
   mes="septiembre";
      fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(oct.isSelected()){
   mes="octubre";
       fin=dia+" "+dias+" de "+mes+" de "+ anios;
}

if(nov.isSelected()){
  mes="novienbre";
        fin=dia+" "+dias+" de "+mes+" de "+ anios;  
}

if(dic.isSelected()){
   mes="diciembre";
       fin=dia+" "+dias+" de "+mes+" de "+ anios;
}
     resultado.setText(fin);
  
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
            java.util.logging.Logger.getLogger(proyecto_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyecto_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyecto_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyecto_fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyecto_fechas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abril;
    private javax.swing.JRadioButton ago;
    private javax.swing.JTextField an;
    private javax.swing.JPanel dias;
    private javax.swing.JRadioButton dic;
    private javax.swing.JRadioButton domingo;
    private javax.swing.JRadioButton enero;
    private javax.swing.JRadioButton febrero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jueves;
    private javax.swing.JRadioButton jul;
    private javax.swing.JRadioButton jun;
    private javax.swing.JRadioButton lunes;
    private javax.swing.JRadioButton martes;
    private javax.swing.JRadioButton marzo;
    private javax.swing.JRadioButton mayo;
    private javax.swing.ButtonGroup mes;
    private javax.swing.JRadioButton miercoles;
    private javax.swing.JRadioButton nov;
    private javax.swing.JTextField numero;
    private javax.swing.JRadioButton oct;
    private javax.swing.JTextField resultado;
    private javax.swing.JRadioButton sabado;
    private javax.swing.ButtonGroup semana;
    private javax.swing.JRadioButton sep;
    private javax.swing.JRadioButton viernes;
    // End of variables declaration//GEN-END:variables
}
