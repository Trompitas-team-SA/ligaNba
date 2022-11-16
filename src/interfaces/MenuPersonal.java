/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import logica.EquiposLogica;

/**
 *
 * @author nico2
 */
public class MenuPersonal extends javax.swing.JFrame {

    String[][] infoPlayers = new String[2][9];
    String[] infoWorker = new String[7];
    boolean showHolder = true;

    Timer contadorTiempo = new Timer();
    TimerTask contadorTareaSucces = new TimerTask() {
        @Override
        public void run() {
            msgSucces.setVisible(false);
        }
    };
    TimerTask contadorTareaError = new TimerTask() {
        @Override
        public void run() {
            msgError.setVisible(false);
        }
    };

    /**
     * Creates new form NewJFrame
     */
    public MenuPersonal() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));

        nombreTF.setBackground(new Color(0, 0, 0, 0));
        nombreTF.requestFocus();
        experienciaTF.setBackground(new Color(0, 0, 0, 0));
        cargoTF.setBackground(new Color(0, 0, 0, 0));

        logoNBAx2.setVisible(false);
        msgSucces.setVisible(false);
        msgError.setVisible(false);
        guardar.setVisible(true);
        guardarEquipo.setVisible(false);

        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/nombre.png")));
        experiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/experiencia.png")));
        cargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/cargo.png")));

        pHolder(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void pHolder(boolean UWU) {
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        msgError = new javax.swing.JLabel();
        experienciaTF = new javax.swing.JTextField();
        cargoTF = new javax.swing.JTextField();
        nombreTF = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        experiencia = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();
        guardar = new javax.swing.JLabel();
        guardarEquipo = new javax.swing.JLabel();
        msgSucces = new javax.swing.JLabel();
        numeroJugador = new javax.swing.JLabel();
        mostrarInformacion = new javax.swing.JLabel();
        inscribirInformacio = new javax.swing.JLabel();
        inscribirJugadores = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        logoNBAx2 = new javax.swing.JLabel();
        logoNBA = new javax.swing.JLabel();
        shapeBackground1 = new javax.swing.JLabel();
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

        msgError.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        msgError.setForeground(new java.awt.Color(255, 102, 102));
        msgError.setText("Por favor no dejar casillas vacias");
        jPanel1.add(msgError, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 380, 40));

        experienciaTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        experienciaTF.setForeground(new java.awt.Color(255, 255, 255));
        experienciaTF.setBorder(null);
        experienciaTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                experienciaTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                experienciaTFFocusLost(evt);
            }
        });
        experienciaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                experienciaTFActionPerformed(evt);
            }
        });
        jPanel1.add(experienciaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 410, 40));

        cargoTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cargoTF.setForeground(new java.awt.Color(255, 255, 255));
        cargoTF.setBorder(null);
        cargoTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cargoTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cargoTFFocusLost(evt);
            }
        });
        cargoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoTFActionPerformed(evt);
            }
        });
        jPanel1.add(cargoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 410, 40));

        nombreTF.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nombreTF.setForeground(new java.awt.Color(255, 255, 255));
        nombreTF.setBorder(null);
        nombreTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTFFocusLost(evt);
            }
        });
        nombreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTFActionPerformed(evt);
            }
        });
        jPanel1.add(nombreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 410, 40));

        nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/nombre.png"))); // NOI18N
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        experiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/experiencia.png"))); // NOI18N
        jPanel1.add(experiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, -1, -1));

        cargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/cargo.png"))); // NOI18N
        jPanel1.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/guardarBTN.png"))); // NOI18N
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarMouseExited(evt);
            }
        });
        guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guardarKeyPressed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        guardarEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/guardarBTN.png"))); // NOI18N
        guardarEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarEquipoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarEquipoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarEquipoMouseExited(evt);
            }
        });
        guardarEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guardarEquipoKeyPressed(evt);
            }
        });
        jPanel1.add(guardarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        msgSucces.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        msgSucces.setForeground(new java.awt.Color(0, 204, 0));
        msgSucces.setText("Datos guardados exitosamente");
        jPanel1.add(msgSucces, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 370, 40));

        numeroJugador.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        numeroJugador.setText("1");
        jPanel1.add(numeroJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, -1, 80));

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

        shapeBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/shapeBackground.png"))); // NOI18N
        jPanel1.add(shapeBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

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

    }//GEN-LAST:event_inscribirJugadoresMouseClicked

    private void volverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseEntered
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/VolverHover.png")));
    }//GEN-LAST:event_volverMouseEntered

    private void volverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseExited
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/Volver.png")));
    }//GEN-LAST:event_volverMouseExited

    private void nombreTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFFocusGained

    private void nombreTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFFocusLost

    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTFActionPerformed

    private void experienciaTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_experienciaTFFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_experienciaTFFocusGained

    private void experienciaTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_experienciaTFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_experienciaTFFocusLost

    private void experienciaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_experienciaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_experienciaTFActionPerformed

    private void cargoTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargoTFFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoTFFocusGained

    private void cargoTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargoTFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoTFFocusLost

    private void cargoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoTFActionPerformed

    private void guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseEntered
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/guardarHover.png")));
    }//GEN-LAST:event_guardarMouseEntered

    private void guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseExited
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/guardarBTN.png")));
    }//GEN-LAST:event_guardarMouseExited

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        MenuInicio menuInicio = new MenuInicio();
        menuInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverMouseClicked

    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        String nombrePersonal = nombreTF.getText();
        String cargoPersonal = cargoTF.getText();
        String experienciaPersonal = experienciaTF.getText();

        nombreTF.requestFocus();

        if (nombrePersonal.isEmpty() || cargoPersonal.isEmpty() || experienciaPersonal.isEmpty()) {
            msgError.setVisible(true);
            contadorTiempo.schedule(contadorTareaError, 2000);

        } else {
            String[] personalEquipo = {nombrePersonal, experienciaPersonal, cargoPersonal};

            for (int i = 0; i < 3; i++) {
                this.infoWorker[i] = personalEquipo[i];
            }

            nombreTF.setText(null);
            cargoTF.setText(null);
            experienciaTF.setText(null);

            nombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/nombreEquipo.png")));
            experiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/locacion.png")));
            cargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/images/temporadasGanadas.png")));

            guardarEquipo.setVisible(true);
            guardar.setVisible(false);

            pHolder(false);

            int iteracionNumero = Integer.parseInt(numeroJugador.getText());
            iteracionNumero += 1;

            if (iteracionNumero < 3) {
                String iteracionNumeroLabel = Integer.toString(iteracionNumero);
                numeroJugador.setText(iteracionNumeroLabel);
            }
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void guardarEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEquipoMouseClicked

        if (nombreTF.getText().isEmpty() || experienciaTF.getText().isEmpty() || cargoTF.getText().isEmpty()) {
            msgError.setVisible(true);
            contadorTiempo.schedule(contadorTareaError, 2000);
        } else {
            String[] infoProvisionalEquipo = {nombreTF.getText(), experienciaTF.getText(), cargoTF.getText(), "0", "0", "0", "0"};

            EquiposLogica equipoLog = new EquiposLogica();
            
            try{
            equipoLog.escribirEquipoNuevo(infoProvisionalEquipo, infoPlayers, this.infoWorker);
            }
            catch( Exception e ){
                JOptionPane.showMessageDialog( null, "Error en guardar equipo " + e.getMessage() );
            }

            //equipoLog.imprimirDataEquipos();
            nombreTF.setText(null);
            cargoTF.setText(null);
            experienciaTF.setText(null);

            guardarEquipo.setVisible(false);
            guardar.setVisible(false);

            msgSucces.setVisible(true);
            contadorTiempo.schedule(contadorTareaSucces, 3000);
        }


    }//GEN-LAST:event_guardarEquipoMouseClicked

    private void guardarEquipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEquipoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarEquipoMouseEntered

    private void guardarEquipoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEquipoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarEquipoMouseExited

    private void guardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardarKeyPressed

    }//GEN-LAST:event_guardarKeyPressed

    private void guardarEquipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardarEquipoKeyPressed

    }//GEN-LAST:event_guardarEquipoKeyPressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new MenuPersonal().setVisible(true);
            }
        });
    }

    public void setDataEquipo(String[][] dataPlayers) {
        infoPlayers = dataPlayers;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel cargo;
    public static javax.swing.JTextField cargoTF;
    private javax.swing.JLabel experiencia;
    public static javax.swing.JTextField experienciaTF;
    private javax.swing.JLabel guardar;
    private javax.swing.JLabel guardarEquipo;
    private javax.swing.JLabel inscribirInformacio;
    private javax.swing.JLabel inscribirJugadores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoNBA;
    private javax.swing.JLabel logoNBAx2;
    private javax.swing.JLabel mostrarInformacion;
    private javax.swing.JLabel msgError;
    private javax.swing.JLabel msgSucces;
    private javax.swing.JLabel nombre;
    public static javax.swing.JTextField nombreTF;
    private javax.swing.JLabel numeroJugador;
    private javax.swing.JLabel shapeBackground;
    private javax.swing.JLabel shapeBackground1;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
