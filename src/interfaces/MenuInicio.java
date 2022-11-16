/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author nico2
 */
public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MenuInicio() {
        initComponents();

        
        try {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
            this.setBackground(new Color(0, 0, 0, 0));

        logoNBAx2.setVisible(false);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null , "Error en MenuInicio por favor contacte al desarrollador " + e.getMessage() );
        }
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
        shapeBackground1 = new javax.swing.JLabel();
        mostrarInformacion = new javax.swing.JLabel();
        inscribirInformacio = new javax.swing.JLabel();
        inscribirJugadores = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        logoNBAx2 = new javax.swing.JLabel();
        logoNBA = new javax.swing.JLabel();
        shapeBackground = new javax.swing.JLabel();
        volver = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shapeBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/shapeBackground.png"))); // NOI18N
        jPanel1.add(shapeBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        mostrarInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarInformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarInformacionMouseExited(evt);
            }
        });
        jPanel1.add(mostrarInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 300, 40));

        inscribirInformacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscribirInformacioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inscribirInformacioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inscribirInformacioMouseExited(evt);
            }
        });
        jPanel1.add(inscribirInformacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, 40));

        inscribirJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscribirJugadoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inscribirJugadoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inscribirJugadoresMouseExited(evt);
            }
        });
        jPanel1.add(inscribirJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 40));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Menu.png"))); // NOI18N
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 240));

        logoNBAx2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/logoNBAx2.png"))); // NOI18N
        logoNBAx2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoNBAx2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoNBAx2MouseExited(evt);
            }
        });
        jPanel1.add(logoNBAx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 200, 180));

        logoNBA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/logoNBA.png"))); // NOI18N
        logoNBA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoNBAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoNBAMouseExited(evt);
            }
        });
        jPanel1.add(logoNBA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 190, 180));

        shapeBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/shapeBackground.png"))); // NOI18N
        jPanel1.add(shapeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, -500, -1, -1));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Volver.png"))); // NOI18N
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volverMouseExited(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 150, 50));

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Backgorund.png"))); // NOI18N
        jPanel1.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inscribirJugadoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirJugadoresMouseEntered
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/inscribirJugadores.png")));
    }//GEN-LAST:event_inscribirJugadoresMouseEntered

    private void inscribirJugadoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirJugadoresMouseExited
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Menu.png")));
    }//GEN-LAST:event_inscribirJugadoresMouseExited

    private void inscribirInformacioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirInformacioMouseEntered
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/inscribirEquipo.png")));
    }//GEN-LAST:event_inscribirInformacioMouseEntered

    private void inscribirInformacioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirInformacioMouseExited
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Menu.png")));
    }//GEN-LAST:event_inscribirInformacioMouseExited

    private void mostrarInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarInformacionMouseEntered
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/mostrarInformacion.png")));
    }//GEN-LAST:event_mostrarInformacionMouseEntered

    private void mostrarInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarInformacionMouseExited
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Menu.png")));
    }//GEN-LAST:event_mostrarInformacionMouseExited

    private void logoNBAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNBAMouseEntered
        logoNBA.setVisible(false);
        logoNBAx2.setVisible(true);
    }//GEN-LAST:event_logoNBAMouseEntered

    private void logoNBAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNBAMouseExited
        logoNBA.setVisible(true);
        logoNBAx2.setVisible(false);
    }//GEN-LAST:event_logoNBAMouseExited

    private void logoNBAx2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNBAx2MouseEntered
        logoNBA.setVisible(false);
        logoNBAx2.setVisible(true);
    }//GEN-LAST:event_logoNBAx2MouseEntered

    private void logoNBAx2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoNBAx2MouseExited
        logoNBA.setVisible(true);
        logoNBAx2.setVisible(false);
    }//GEN-LAST:event_logoNBAx2MouseExited

    private void inscribirJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirJugadoresMouseClicked
        MenuJugadores inscribirJugadores = new MenuJugadores();
        inscribirJugadores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inscribirJugadoresMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/VolverHover.png")));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Volver.png")));
    }//GEN-LAST:event_volverMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void inscribirInformacioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscribirInformacioMouseClicked
        MenuPartido inscribirEquipo = new MenuPartido();
        inscribirEquipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inscribirInformacioMouseClicked

    private void mostrarInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarInformacionMouseClicked
        MenuEstadisticas menuEstadisticas = new MenuEstadisticas();
        menuEstadisticas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarInformacionMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
       dispose();
    }//GEN-LAST:event_volverMouseClicked

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel inscribirInformacio;
    private javax.swing.JLabel inscribirJugadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoNBA;
    private javax.swing.JLabel logoNBAx2;
    private javax.swing.JLabel mostrarInformacion;
    private javax.swing.JLabel shapeBackground;
    private javax.swing.JLabel shapeBackground1;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
