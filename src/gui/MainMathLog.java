/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import app.Main;

public class MainMathLog extends javax.swing.JFrame {

    Main main;

    public MainMathLog(Main main) {
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

        bg = new javax.swing.JPanel();
        ProgramacionLineal = new javax.swing.JLabel();
        MetodoDeTransporte = new javax.swing.JLabel();
        logoTecNM = new javax.swing.JLabel();
        header2 = new javax.swing.JLabel();
        lblTema2 = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblTema3 = new javax.swing.JLabel();
        Planeacion = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        lblFoot2 = new javax.swing.JLabel();
        lblTema4 = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        LineaEspera = new javax.swing.JLabel();
        lblTema5 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        header1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inventarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(61, 60, 109));
        bg.setForeground(new java.awt.Color(81, 84, 161));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgramacionLineal.setBackground(new java.awt.Color(61, 60, 109));
        ProgramacionLineal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProgramacionLineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ProgLinear.png"))); // NOI18N
        ProgramacionLineal.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ProgramacionLineal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProgramacionLineal.setOpaque(true);
        ProgramacionLineal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProgramacionLinealMousePressed(evt);
            }
        });
        bg.add(ProgramacionLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 120, 100));

        MetodoDeTransporte.setBackground(new java.awt.Color(61, 60, 109));
        MetodoDeTransporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MetodoDeTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mTransporteBlanco.png"))); // NOI18N
        MetodoDeTransporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MetodoDeTransporte.setOpaque(true);
        MetodoDeTransporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MetodoDeTransporteMouseExited(evt);
            }
        });
        bg.add(MetodoDeTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 120, 90));

        logoTecNM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo itess-blanco new-small.png"))); // NOI18N
        bg.add(logoTecNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 80));

        header2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        header2.setForeground(new java.awt.Color(255, 255, 255));
        header2.setText("ITESS-TICS MPTD MathLong");
        header2.setToolTipText("");
        bg.add(header2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 330, 50));

        lblTema2.setForeground(new java.awt.Color(255, 255, 255));
        lblTema2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema2.setText("Tema2. M Transporte");
        bg.add(lblTema2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, -1));

        lblTema1.setForeground(new java.awt.Color(255, 255, 255));
        lblTema1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema1.setText("Tema1. Prog lineal");
        bg.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 120, -1));

        lblTema3.setForeground(new java.awt.Color(255, 255, 255));
        lblTema3.setText("Tema3. Planeación");
        bg.add(lblTema3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 110, -1));

        Planeacion.setBackground(new java.awt.Color(61, 60, 109));
        Planeacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Planeacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PlaneacionBlanco.png"))); // NOI18N
        Planeacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Planeacion.setOpaque(true);
        Planeacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaneacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlaneacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlaneacionMouseExited(evt);
            }
        });
        bg.add(Planeacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 110, 90));

        lblFoot1.setForeground(new java.awt.Color(255, 255, 255));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        bg.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        lblFoot2.setForeground(new java.awt.Color(255, 255, 255));
        lblFoot2.setText("Francisco Javier Montecillo Puente");
        bg.add(lblFoot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        lblTema4.setForeground(new java.awt.Color(255, 255, 255));
        lblTema4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTema4.setText("Tema4. Inventarios");
        bg.add(lblTema4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 110, -1));

        image1.setBackground(new java.awt.Color(255, 255, 255));
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rt.png"))); // NOI18N
        image1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        image1.setOpaque(true);
        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                image1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                image1MouseExited(evt);
            }
        });
        bg.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 190, 260, 270));

        LineaEspera.setBackground(new java.awt.Color(60, 61, 109));
        LineaEspera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LineaEspera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineaEsperaBlanco.png"))); // NOI18N
        LineaEspera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LineaEspera.setOpaque(true);
        LineaEspera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LineaEsperaMouseExited(evt);
            }
        });
        bg.add(LineaEspera, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 110, 90));

        lblTema5.setForeground(new java.awt.Color(255, 255, 255));
        lblTema5.setText("Tema5. Lin Espera");
        bg.add(lblTema5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 110, -1));

        name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Henández Jiménez Leslye ");
        bg.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 170, 20));

        name2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setText("Moreno Jiménez Leonardo Zaid");
        bg.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, 20));
        name2.getAccessibleContext().setAccessibleDescription("");

        header1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        header1.setForeground(new java.awt.Color(255, 255, 255));
        header1.setText("Portafolio Digital 2023 ");
        header1.setToolTipText("");
        bg.add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 280, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ese.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        Inventarios.setBackground(new java.awt.Color(61, 60, 109));
        Inventarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/InventariosBlanco.png"))); // NOI18N
        Inventarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Inventarios.setOpaque(true);
        Inventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InventariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InventariosMouseExited(evt);
            }
        });
        bg.add(Inventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 818, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked

    }//GEN-LAST:event_image1MouseClicked

    private void image1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseEntered
        // TODO add your handling code here:       
    }//GEN-LAST:event_image1MouseEntered

    private void image1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_image1MouseExited

    private void LineaEsperaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);

        main.LinEsp = new LineaDeEspera1(this.main);
        main.LinEsp.setVisible(true);
    }//GEN-LAST:event_LineaEsperaMouseClicked

    private void LineaEsperaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseEntered
        // TODO add your handling code here:
        LineaEspera.setBackground(new Color(81, 84, 161));
    }//GEN-LAST:event_LineaEsperaMouseEntered

    private void LineaEsperaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaEsperaMouseExited
        // TODO add your handling code here:
        LineaEspera.setBackground(new Color(61, 60, 109));
    }//GEN-LAST:event_LineaEsperaMouseExited

    private void PlaneacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseExited
        // TODO add your handling code here:
        Planeacion.setBackground(new Color(61, 60, 109));
    }//GEN-LAST:event_PlaneacionMouseExited

    private void PlaneacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseEntered
        // TODO add your handling code here:
        Planeacion.setBackground(new Color(81, 84, 161));
    }//GEN-LAST:event_PlaneacionMouseEntered

    private void PlaneacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaneacionMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);

        main.PlanAct = new PlaneacionDeActividades1(this.main);
        main.PlanAct.setVisible(true);
    }//GEN-LAST:event_PlaneacionMouseClicked

    private void MetodoDeTransporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseExited
        MetodoDeTransporte.setBackground(new Color(61, 60, 109));
    }//GEN-LAST:event_MetodoDeTransporteMouseExited

    private void MetodoDeTransporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseEntered
        MetodoDeTransporte.setBackground(new Color(81, 84, 161));
    }//GEN-LAST:event_MetodoDeTransporteMouseEntered

    private void MetodoDeTransporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoDeTransporteMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);

        main.MetTrans = new MetodoDeTransporte1(this.main);
        main.MetTrans.setVisible(true);
    }//GEN-LAST:event_MetodoDeTransporteMouseClicked

    private void ProgramacionLinealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseExited
        ProgramacionLineal.setBackground(new Color(61, 60, 109));
    }//GEN-LAST:event_ProgramacionLinealMouseExited

    private void ProgramacionLinealMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseEntered
        ProgramacionLineal.setBackground(new Color(81, 84, 161));
    }//GEN-LAST:event_ProgramacionLinealMouseEntered

    private void ProgramacionLinealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);

        main.ProgLin = new ProgramacionLineal(this.main);
        main.ProgLin.setVisible(true);
    }//GEN-LAST:event_ProgramacionLinealMouseClicked

    private void InventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);

        main.introduction = new TeoriaDeInventarios(this.main);
        main.introduction.setVisible(true);    }//GEN-LAST:event_InventariosMouseClicked

    private void InventariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseEntered
        Inventarios.setBackground(new Color(81, 84, 161));
    }//GEN-LAST:event_InventariosMouseEntered

    private void InventariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventariosMouseExited
        Inventarios.setBackground(new Color(61, 60, 109));
    }//GEN-LAST:event_InventariosMouseExited

    private void ProgramacionLinealMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProgramacionLinealMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgramacionLinealMousePressed

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
            java.util.logging.Logger.getLogger(MainMathLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMathLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMathLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMathLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                //new MainASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Inventarios;
    private javax.swing.JLabel LineaEspera;
    private javax.swing.JLabel MetodoDeTransporte;
    private javax.swing.JLabel Planeacion;
    private javax.swing.JLabel ProgramacionLineal;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel header1;
    private javax.swing.JLabel header2;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblFoot2;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JLabel lblTema2;
    private javax.swing.JLabel lblTema3;
    private javax.swing.JLabel lblTema4;
    private javax.swing.JLabel lblTema5;
    private javax.swing.JLabel logoTecNM;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    // End of variables declaration//GEN-END:variables
}