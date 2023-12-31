package gui;

import java.awt.Color;
import app.Main;
/**
 *
 * @author xeon
 */
public class TeoriaDeInventarios extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form ComplexNumberASYS
     */
    public TeoriaDeInventarios(Main main) {
        initComponents();
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlComplexNumbers = new javax.swing.JPanel();
        invLogo = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        lblTema3 = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        invLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlComplexNumbers.setBackground(new java.awt.Color(209, 217, 237));
        pnlComplexNumbers.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlComplexNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InvEjemplo.jpg"))); // NOI18N
        pnlComplexNumbers.add(invLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 510, 300));

        header1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        header1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        header1.setText("Teoria de Inventarios");
        pnlComplexNumbers.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 360, 50));

        lblTema3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTema3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTema3.setText("Tema 4. Teoria de Inventarios. Utiliza la teoría de inventarios como una herramienta para la "); // NOI18N
        pnlComplexNumbers.add(lblTema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 760, 30));

        lblTema1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTema1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema1.setText("mejora operativa de una organización. "); // NOI18N
        pnlComplexNumbers.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 780, 30));

        home.setBackground(new java.awt.Color(209, 217, 237));
        home.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flecha.png"))); // NOI18N
        home.setText("INICIO");
        home.setOpaque(true);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 160, 50));

        invLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventariosNegro.png"))); // NOI18N
        pnlComplexNumbers.add(invLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        main.introduction.setVisible(false);
        main.introduction = null;
        main.mainASYS.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setBackground(new Color(235,239,249));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setBackground(new Color(209,217,237));
    }//GEN-LAST:event_homeMouseExited

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
            java.util.logging.Logger.getLogger(TeoriaDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeoriaDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeoriaDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeoriaDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComplexNumbersASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel header1;
    private javax.swing.JLabel home;
    private javax.swing.JLabel invLogo;
    private javax.swing.JLabel invLogo1;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JLabel lblTema3;
    private javax.swing.JPanel pnlComplexNumbers;
    // End of variables declaration//GEN-END:variables
}
