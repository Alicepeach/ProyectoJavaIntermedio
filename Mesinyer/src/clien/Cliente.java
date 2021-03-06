/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clien;

/**
 *
 * @author alice
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        txtHost = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        lblPuerto = new javax.swing.JLabel();
        lblHost = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnConectar = new javax.swing.JButton();
        txtConversacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, -1));
        jPanel1.add(txtPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 90, -1));

        lblPuerto.setText("PUERTO:");
        jPanel1.add(lblPuerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        lblHost.setText("HOST:");
        jPanel1.add(lblHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 330, 30));

        btnEnviar.setText("Enviar");
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, 30));

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        txtConversacion.setColumns(20);
        txtConversacion.setRows(5);
        jPanel1.add(txtConversacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 400, 130));
        txtConversacion.getAccessibleContext().setAccessibleParent(txtConversacion);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        /*
        *Mandamos el host y el pueto para iniciar el Chat
        */
        Chat.iniciaCliente(txtHost.getText(), Integer.parseInt(txtPuerto.getText()));
    }//GEN-LAST:event_btnConectarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPuerto;
    public static javax.swing.JTextArea txtConversacion;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
}
