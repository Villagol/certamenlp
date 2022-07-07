
package gui;

/**
 *
 * @author vicen
 */
public class FrmMain extends javax.swing.JFrame {
    FrmStock a1 = new FrmStock();
    FrmIngresar a2 = new FrmIngresar();
    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        dpMain.add(a1);
        dpMain.add(a2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpMain = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuStock = new javax.swing.JMenu();
        mnuStock2 = new javax.swing.JMenuItem();
        mnuIngresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpMainLayout = new javax.swing.GroupLayout(dpMain);
        dpMain.setLayout(dpMainLayout);
        dpMainLayout.setHorizontalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dpMainLayout.setVerticalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuStock.setText("Menu");

        mnuStock2.setText("Ver Stock");
        mnuStock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuStock2ActionPerformed(evt);
            }
        });
        mnuStock.add(mnuStock2);

        mnuIngresar.setText("Ingresar Producto");
        mnuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresarActionPerformed(evt);
            }
        });
        mnuStock.add(mnuIngresar);

        jMenuBar2.add(mnuStock);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuStock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuStock2ActionPerformed
        // TODO add your handling code here:
        a1.setVisible(true);
        a2.setVisible(false);
    }//GEN-LAST:event_mnuStock2ActionPerformed

    private void mnuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresarActionPerformed
        // TODO add your handling code here:
        a1.setVisible(false);
        a2.setVisible(true);
    }//GEN-LAST:event_mnuIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpMain;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mnuIngresar;
    private javax.swing.JMenu mnuStock;
    private javax.swing.JMenuItem mnuStock2;
    // End of variables declaration//GEN-END:variables
}
