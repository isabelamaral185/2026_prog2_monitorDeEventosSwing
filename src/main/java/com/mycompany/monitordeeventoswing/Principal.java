/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.monitordeeventoswing;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        txtTexto = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        check = new javax.swing.JCheckBox();
        btnAcao = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        slider = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        panPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panPrincipalMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panPrincipalMouseMoved(evt);
            }
        });
        panPrincipal.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                panPrincipalMouseWheelMoved(evt);
            }
        });
        panPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panPrincipalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panPrincipalMouseReleased(evt);
            }
        });

        txtConsole.setColumns(20);
        txtConsole.setRows(5);
        jScrollPane1.setViewportView(txtConsole);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        txtTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTextoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTextoFocusLost(evt);
            }
        });
        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });
        txtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTextoKeyTyped(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });

        check.setText("jCheckBox1");
        check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkItemStateChanged(evt);
            }
        });
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        btnAcao.setText("jButton1");

        spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerStateChanged(evt);
            }
        });

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTexto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(btnAcao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        log("Clicou no Enter.");
    }//GEN-LAST:event_txtTextoActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // EESE AQUI EU CLIQUEI SEM QUERER. IGNORE. 
    }//GEN-LAST:event_checkActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtConsole.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyPressed
        //log("KeyPressed: " + evt.getKeyChar()); // Vai mostrar onde o usuário PRESSIONOU no teclado.
    }//GEN-LAST:event_txtTextoKeyPressed

    private void txtTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyReleased
        //log("KeyReleased: " + evt.getKeyChar());
    }//GEN-LAST:event_txtTextoKeyReleased

    private void txtTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTextoKeyTyped
        //log("KeyTyped: " + evt.getKeyChar());
    }//GEN-LAST:event_txtTextoKeyTyped

    private void panPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseEntered
        //log("MouseEntered: "); // Mosta quando o mouse do usuário está no cursor.
    }//GEN-LAST:event_panPrincipalMouseEntered

    private void panPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseExited
        //log("MouseExited: "); // Mostra quando o mouse do usuário sai do cursor.
    }//GEN-LAST:event_panPrincipalMouseExited

    private void panPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMousePressed
        //log("MousePressed: "); // É a ação de clicar com o mouse.
    }//GEN-LAST:event_panPrincipalMousePressed

    private void panPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseReleased
        //log("MouseRealeased: "); // É a ação de soltar o clic do mouse.
    }//GEN-LAST:event_panPrincipalMouseReleased

    private void panPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseClicked
        log("MouseClicked: "); // É a junção do MousePressed e do Mouse Released.
    }//GEN-LAST:event_panPrincipalMouseClicked

    private void panPrincipalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseMoved
        //log("MouseMoved: " + evt.getX() + ", " + evt.getY()); // Vai pegar a posição do seu cursor, a horizontal e a vertical.
    }//GEN-LAST:event_panPrincipalMouseMoved

    private void panPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panPrincipalMouseDragged
        log("MouseDragged: " + evt.getX() + ", " + evt.getY()); // Só vai pegar as posições se você manter o clic do mouse pressionado.
    }//GEN-LAST:event_panPrincipalMouseDragged

    private void panPrincipalMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_panPrincipalMouseWheelMoved
        log("MouseWheelMoved: " + evt.getWheelRotation()); // Faz com que apareça o scroll do mouse.
    }//GEN-LAST:event_panPrincipalMouseWheelMoved

    private void txtTextoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTextoFocusGained
        log("FocusGained: "); // Ganha o foco.
    }//GEN-LAST:event_txtTextoFocusGained

    private void txtTextoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTextoFocusLost
        log("FocusLost: "); // Perde o foco.
    }//GEN-LAST:event_txtTextoFocusLost

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
        log("Item: " + comboBox.getSelectedItem()); // Serve para conferir se o usuário mudou de iten no combobox.
    }//GEN-LAST:event_comboBoxItemStateChanged

    private void checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkItemStateChanged
        if(check.isSelected()){ // Serve para conseferir se a checkbox está maracada ou desmarcada.
            log("Checkbox marcado.");
        }else{
            log("Checkbox desmarcado");
        }
    }//GEN-LAST:event_checkItemStateChanged

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        log("Slider: " + slider.getValue()); // Mostra as alterações que podem ser feitas no Slider.
    }//GEN-LAST:event_sliderStateChanged

    private void spinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerStateChanged
        log("Spinner: " + spinner.getValue()); // Mostra as alterações que podem serfeitas no Spinner.
    }//GEN-LAST:event_spinnerStateChanged

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        log("Janela movida"); // Vai mostar se a janela foi movida.
    }//GEN-LAST:event_formComponentMoved

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        log("Janela redimensionada"); // Vai msotrar se redimensionaram a janela.
    }//GEN-LAST:event_formComponentResized

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox check;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JSlider slider;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
    
    void log(String msg){
        txtConsole.append(msg+"\n");
    }
}
