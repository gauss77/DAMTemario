
package tarea2_navegador_g;

/**
 * Ventana del simulador del navegador simple
 * Incluye todos los componentes del dise�o
 * 
 * @author Gema
 * @version enero 2023
 * 
 * */
public class Ventana extends javax.swing.JFrame {

    /**
     * Constructor de la ventana: llamado por el m�todo main cuando se inicia la
     * apliaci�n.
     */
    public Ventana() {
        //Inicia los componentes del dise�o 
        initComponents();
        //Si queremos poner URL de partida dentro del cuadro de texto
        //Texto_URL.setText("https://www.boe.es/boe/dias/2010/05/20/pdfs/BOE-A-2010-8067.pdf");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CuadroTexto_URL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Boton_GO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Salida = new javax.swing.JTextArea();
        Boton_Salir = new javax.swing.JButton();
        Boton_Limpiar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navegador");

        CuadroTexto_URL.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        CuadroTexto_URL.setForeground(new java.awt.Color(51, 51, 255));
        CuadroTexto_URL.setText("Introduce una URL v�lida");
        CuadroTexto_URL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroTexto_URLActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tarea PSP05");

        Boton_GO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_GO.setForeground(new java.awt.Color(51, 51, 255));
        Boton_GO.setText("GO");
        Boton_GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GOActionPerformed(evt);
            }
        });

        TextArea_Salida.setColumns(20);
        TextArea_Salida.setRows(5);
        jScrollPane1.setViewportView(TextArea_Salida);

        Boton_Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_Salir.setForeground(new java.awt.Color(255, 51, 102));
        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        Boton_Limpiar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Boton_Limpiar1.setForeground(new java.awt.Color(51, 51, 255));
        Boton_Limpiar1.setText("Limpiar");
        Boton_Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Limpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CuadroTexto_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_GO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Limpiar1)
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CuadroTexto_URL)
                            .addComponent(Boton_GO, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Limpiar1)))
                .addGap(18, 18, 18)
                .addComponent(Boton_Salir)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
   * Responde al clic en el bot�n 'GO'.   *
   * Como en cualquier otra aplicaci�n de ventana, la realizaci�n de una
   * tarea acaparadora de recursos (como es la descarga de un fichero o p�gina
   * de Internet) debe colocarse en un hilo independiente para que la ventana
   * no se bloquee.
   * Crea un objeto de tipo EjecutaNavegador que llamar� al m�todo navegar().
   * EjecutaNavegador recibe el texto contenido en el cuadro de texto y el �rea
   * de texto donde debe poner la salida.
   * @param evt
   */
    
    private void Boton_GOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GOActionPerformed
       EjecutaVentana navegador = new EjecutaVentana (CuadroTexto_URL.getText(), TextArea_Salida);
       navegador.navegar();
       
    }//GEN-LAST:event_Boton_GOActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void Boton_Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Limpiar1ActionPerformed
        TextArea_Salida.setText("");    //Borra el contenido del TextArea
        CuadroTexto_URL.setText("Introduce una URL v�lida ...");
    }//GEN-LAST:event_Boton_Limpiar1ActionPerformed

    private void CuadroTexto_URLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroTexto_URLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroTexto_URLActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_GO;
    private javax.swing.JButton Boton_Limpiar1;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JTextField CuadroTexto_URL;
    private javax.swing.JTextArea TextArea_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
