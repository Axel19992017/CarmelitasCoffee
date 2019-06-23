/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.egresos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Dell Inspiron
 */
public class Egresos extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Egresos
     */
    public Egresos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL_consultardepositos = new swing.Contenedores.PanelZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_depositos = new swing.Controles.TableZ();
        labelZ1 = new swing.Controles.LabelZ();
        TEXTFIELD_busquedadepositos = new swing.Controles.TextFieldZ();
        BTN_actualizardepositos = new swing.Controles.ButtonZ();
        BTN_salirdepositos = new swing.Controles.ButtonZ();
        Panel = new swing.Contenedores.PanelZ();
        MENUBAR = new javax.swing.JMenuBar();
        MENU_consultar = new javax.swing.JMenu();
        MENUITEM_consultardepositos = new javax.swing.JMenuItem();
        MENU_consultarpagos = new javax.swing.JMenu();
        MENUITEM_consultarempleado = new javax.swing.JMenuItem();
        MENUITEM_consultarinsumo = new javax.swing.JMenuItem();
        MENUITEM_consultarmantenimiento = new javax.swing.JMenuItem();
        MENU_nuevo = new javax.swing.JMenu();
        MENUITEM_nuevodeposito = new javax.swing.JMenuItem();
        MENU_nuevopago = new javax.swing.JMenu();
        MENUITEM_nuevoempleado = new javax.swing.JMenuItem();
        MENUITEM_nuevoinsumo = new javax.swing.JMenuItem();
        MENUITEM_nuevomantenimiento = new javax.swing.JMenuItem();

        PANEL_consultardepositos.setPreferredSize(new java.awt.Dimension(715, 509));

        jScrollPane1.setViewportView(TABLE_depositos);

        labelZ1.setText("Busqueda personalizada:");

        TEXTFIELD_busquedadepositos.setText("");
        TEXTFIELD_busquedadepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTFIELD_busquedadepositosActionPerformed(evt);
            }
        });

        BTN_actualizardepositos.setText("Actualizar");
        BTN_actualizardepositos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        BTN_salirdepositos.setBackground(new java.awt.Color(102, 0, 0));
        BTN_salirdepositos.setText("Salir");
        BTN_salirdepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_salirdepositosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL_consultardepositosLayout = new javax.swing.GroupLayout(PANEL_consultardepositos);
        PANEL_consultardepositos.setLayout(PANEL_consultardepositosLayout);
        PANEL_consultardepositosLayout.setHorizontalGroup(
            PANEL_consultardepositosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_consultardepositosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_consultardepositosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_consultardepositosLayout.createSequentialGroup()
                        .addComponent(labelZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TEXTFIELD_busquedadepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(BTN_salirdepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_actualizardepositos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PANEL_consultardepositosLayout.setVerticalGroup(
            PANEL_consultardepositosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_consultardepositosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PANEL_consultardepositosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_salirdepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXTFIELD_busquedadepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelZ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_actualizardepositos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Egresos");
        setBackground(new java.awt.Color(0, 51, 102));
        setName("EgresosFRM"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(715, 509));

        Panel.setMinimumSize(new java.awt.Dimension(715, 509));
        Panel.setName("panel"); // NOI18N

        MENUBAR.setBackground(new java.awt.Color(0, 0, 51));
        MENUBAR.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 51)));
        MENUBAR.setForeground(new java.awt.Color(255, 255, 255));

        MENU_consultar.setText("Consultar");

        MENUITEM_consultardepositos.setText("Depositos");
        MENUITEM_consultardepositos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITEM_consultardepositosActionPerformed(evt);
            }
        });
        MENU_consultar.add(MENUITEM_consultardepositos);

        MENU_consultarpagos.setText("Pagos");

        MENUITEM_consultarempleado.setText("...de empleado");
        MENU_consultarpagos.add(MENUITEM_consultarempleado);

        MENUITEM_consultarinsumo.setText("...de insumo");
        MENU_consultarpagos.add(MENUITEM_consultarinsumo);

        MENUITEM_consultarmantenimiento.setText("...de mantenimiento");
        MENU_consultarpagos.add(MENUITEM_consultarmantenimiento);

        MENU_consultar.add(MENU_consultarpagos);

        MENUBAR.add(MENU_consultar);

        MENU_nuevo.setText("Nuevo/Editar");

        MENUITEM_nuevodeposito.setText("Deposito");
        MENU_nuevo.add(MENUITEM_nuevodeposito);

        MENU_nuevopago.setText("Pago");

        MENUITEM_nuevoempleado.setText("...de empleado");
        MENU_nuevopago.add(MENUITEM_nuevoempleado);

        MENUITEM_nuevoinsumo.setText("...de insumo");
        MENU_nuevopago.add(MENUITEM_nuevoinsumo);

        MENUITEM_nuevomantenimiento.setText("...de mantenimiento");
        MENU_nuevopago.add(MENUITEM_nuevomantenimiento);

        MENU_nuevo.add(MENU_nuevopago);

        MENUBAR.add(MENU_nuevo);

        setJMenuBar(MENUBAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUITEM_consultardepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITEM_consultardepositosActionPerformed
        this.Panel.add(this.PANEL_consultardepositos);
        this.Panel.revalidate();
        this.Panel.repaint();
    }//GEN-LAST:event_MENUITEM_consultardepositosActionPerformed

    private void TEXTFIELD_busquedadepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTFIELD_busquedadepositosActionPerformed

    }//GEN-LAST:event_TEXTFIELD_busquedadepositosActionPerformed

    private void BTN_salirdepositosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_salirdepositosActionPerformed
        this.ReiniciarPANEL_consultardepositos();
        this.Panel.removeAll();
        this.Panel.revalidate();
        this.Panel.repaint();
    }//GEN-LAST:event_BTN_salirdepositosActionPerformed

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
            java.util.logging.Logger.getLogger(Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Egresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Egresos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ BTN_actualizardepositos;
    private swing.Controles.ButtonZ BTN_salirdepositos;
    private javax.swing.JMenuBar MENUBAR;
    private javax.swing.JMenuItem MENUITEM_consultardepositos;
    private javax.swing.JMenuItem MENUITEM_consultarempleado;
    private javax.swing.JMenuItem MENUITEM_consultarinsumo;
    private javax.swing.JMenuItem MENUITEM_consultarmantenimiento;
    private javax.swing.JMenuItem MENUITEM_nuevodeposito;
    private javax.swing.JMenuItem MENUITEM_nuevoempleado;
    private javax.swing.JMenuItem MENUITEM_nuevoinsumo;
    private javax.swing.JMenuItem MENUITEM_nuevomantenimiento;
    private javax.swing.JMenu MENU_consultar;
    private javax.swing.JMenu MENU_consultarpagos;
    private javax.swing.JMenu MENU_nuevo;
    private javax.swing.JMenu MENU_nuevopago;
    private swing.Contenedores.PanelZ PANEL_consultardepositos;
    private swing.Contenedores.PanelZ Panel;
    private swing.Controles.TableZ TABLE_depositos;
    private swing.Controles.TextFieldZ TEXTFIELD_busquedadepositos;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ labelZ1;
    // End of variables declaration//GEN-END:variables
    
    private void  ReiniciarPANEL_consultardepositos(){
        this.TEXTFIELD_busquedadepositos.setText(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
