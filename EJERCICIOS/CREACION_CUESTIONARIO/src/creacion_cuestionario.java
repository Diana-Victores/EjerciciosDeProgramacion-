
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana
 */
public class creacion_cuestionario extends javax.swing.JFrame {

    /**
     * Creates new form creacion_cuestionario
     */
    public creacion_cuestionario() {
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

        jcb1 = new javax.swing.JComboBox<>();
        jcb2 = new javax.swing.JComboBox<>();
        jcb3 = new javax.swing.JComboBox<>();
        jcb4 = new javax.swing.JComboBox<>();
        jcb5 = new javax.swing.JComboBox<>();
        jcb6 = new javax.swing.JComboBox<>();
        jcb7 = new javax.swing.JComboBox<>();
        jcb8 = new javax.swing.JComboBox<>();
        jcb9 = new javax.swing.JComboBox<>();
        jcb10 = new javax.swing.JComboBox<>();
        pregunta1 = new javax.swing.JTextField();
        pregunta2 = new javax.swing.JTextField();
        pregunta3 = new javax.swing.JTextField();
        pregunta4 = new javax.swing.JTextField();
        pregunta5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pregunta6 = new javax.swing.JTextField();
        pregunta7 = new javax.swing.JTextField();
        pregunta8 = new javax.swing.JTextField();
        pregunta9 = new javax.swing.JTextField();
        pregunta10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        aciertos = new javax.swing.JTextField();
        resul = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " ", " " }));

        jcb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " " }));

        jcb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " " }));

        jcb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " " }));
        jcb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb4ActionPerformed(evt);
            }
        });

        jcb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " " }));

        jcb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " ", " ", " " }));

        jcb7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));

        jcb8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));

        jcb9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " ", " ", " " }));

        jcb10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", " " }));

        pregunta1.setEditable(false);
        pregunta1.setText("1. Metodo que permite obtener dato desde textifeld?");

        pregunta2.setText("2. Compara dos cadenas de Caracteres?");

        pregunta3.setText("3. Se le conoce como operador \"AND\"");

        pregunta4.setText("4. Metodo que envia datos a una etiqueta?");

        pregunta5.setText("5. Devuelve verdadero si el valor string pasado es el mismo de ahora");

        jLabel1.setText("A. equals");

        jLabel2.setText("B. setText");

        jLabel3.setText("C. getText");

        jLabel4.setText("D. &&");

        jLabel5.setText("E. boolean");

        pregunta6.setText("6. Devuelve un nuevo String con todos los caracteres en minusculas o en mayusculas");
        pregunta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pregunta6ActionPerformed(evt);
            }
        });

        pregunta7.setText("7. Invierte los caracteres, devuelve una referencia asi mismo");

        pregunta8.setText("8. Cuál es la estructura de la instrucción for ? ");

        pregunta9.setText("9. Elimina caracteres de la posicion start hasta end-1");

        pregunta10.setText("10. Adjunta el String al final del stringbuffer actual");

        jLabel6.setText("F. Builder reverse ");

        jLabel7.setText("G.String toLowerCase");

        jLabel8.setText("H. Builder delete");

        jLabel9.setText("I. ejecuta codigo repetitivamente");

        jLabel10.setText("J. Builder append");

        jLabel11.setText("ACIERTOS");

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("CALIFICACION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pregunta1)
                            .addComponent(pregunta2)
                            .addComponent(pregunta3)
                            .addComponent(pregunta4)
                            .addComponent(pregunta5)
                            .addComponent(pregunta6)
                            .addComponent(pregunta7)
                            .addComponent(pregunta8)
                            .addComponent(pregunta9)
                            .addComponent(pregunta10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)
                                .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton1)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pregunta10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(aciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(resul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int conteo = 0;
    String r1 = "", r2 = "", r3 = "", r4 = "", r5="",r6="",r7="",r8="",r9="",r10="";
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        conteo = 0;
        r1 = jcb1.getSelectedItem().toString();
        r2 = jcb2.getSelectedItem().toString();
        r3 = jcb3.getSelectedItem().toString();
        r4 = jcb4.getSelectedItem().toString();
        r5 = jcb5.getSelectedItem().toString();
        r6 = jcb6.getSelectedItem().toString();
        r7 = jcb7.getSelectedItem().toString();
        r8 = jcb8.getSelectedItem().toString();
        r9 = jcb9.getSelectedItem().toString();
        r10 = jcb10.getSelectedItem().toString();        
      
        if (r1.equals("C")){
        conteo = conteo + 1;
        pregunta1.setBackground(Color.green);
        } else {
        pregunta1.setBackground(Color.red);
        }
        
        if (r2.equals("A")){
        conteo = conteo + 1;
        pregunta2.setBackground(Color.green);
        } else {
        pregunta2.setBackground(Color.red);
        }
        
        if (r3.equals("D")){
        conteo = conteo + 1;
        pregunta3.setBackground(Color.green);
        } else {
        pregunta3.setBackground(Color.red);
        }
        
        if (r4.equals("B")){
        conteo = conteo + 1;
        pregunta4.setBackground(Color.green);
        } else {
        pregunta4.setBackground(Color.red);
        }
        
        if (r5.equals("E")){
        conteo = conteo + 1;
        pregunta5.setBackground(Color.green);
        } else {
        pregunta5.setBackground(Color.red);
        }
        
        if (r6.equals("G")){
        conteo = conteo + 1;
        pregunta6.setBackground(Color.green);
        } else {
        pregunta6.setBackground(Color.red);
        } 
        
          if (r7.equals("F")){
        conteo = conteo + 1;
        pregunta7.setBackground(Color.green);
        } else {
        pregunta7.setBackground(Color.red);
        } 
          
          if (r8.equals("I")){
        conteo = conteo + 1;
        pregunta8.setBackground(Color.green);
        } else {
        pregunta8.setBackground(Color.red);
        }
        
        if (r9.equals("H")){
        conteo = conteo + 1;
        pregunta9.setBackground(Color.green);
        } else {
        pregunta9.setBackground(Color.red);
        }
        
        if (r10.equals("J")){
        conteo = conteo + 1;
        pregunta10.setBackground(Color.green);
        } else {
        pregunta10.setBackground(Color.red);
        }
        
    
        aciertos.setText(String.valueOf(conteo));
        resul.setText(String.valueOf(conteo * 10));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb4ActionPerformed

    private void pregunta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pregunta6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pregunta6ActionPerformed

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
            java.util.logging.Logger.getLogger(creacion_cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creacion_cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creacion_cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creacion_cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creacion_cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aciertos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcb1;
    private javax.swing.JComboBox<String> jcb10;
    private javax.swing.JComboBox<String> jcb2;
    private javax.swing.JComboBox<String> jcb3;
    private javax.swing.JComboBox<String> jcb4;
    private javax.swing.JComboBox<String> jcb5;
    private javax.swing.JComboBox<String> jcb6;
    private javax.swing.JComboBox<String> jcb7;
    private javax.swing.JComboBox<String> jcb8;
    private javax.swing.JComboBox<String> jcb9;
    private javax.swing.JTextField pregunta1;
    private javax.swing.JTextField pregunta10;
    private javax.swing.JTextField pregunta2;
    private javax.swing.JTextField pregunta3;
    private javax.swing.JTextField pregunta4;
    private javax.swing.JTextField pregunta5;
    private javax.swing.JTextField pregunta6;
    private javax.swing.JTextField pregunta7;
    private javax.swing.JTextField pregunta8;
    private javax.swing.JTextField pregunta9;
    private javax.swing.JTextField resul;
    // End of variables declaration//GEN-END:variables
}
