/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.personal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

/**
 *
 * @author admin
 */
public class Planillas extends JInternalFrame implements ActionListener{

    /**
     * Creates new form InternalFrameZ
     */
    public Planillas() {
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

        PANEL_main = new swing.Contenedores.PanelZ();
        PANEL_planillas = new swing.Contenedores.PanelZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_ordenes = new swing.Controles.TableZ();
        PANEL_empleadoplanilla = new swing.Contenedores.PanelZ();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableZ1 = new swing.Controles.TableZ();
        PANEL_imagen = new swing.Contenedores.PanelZ();
        LABEL_imagen = new swing.Controles.LabelZ();

        setBackground(new java.awt.Color(0, 51, 102));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar planillas");
        setMinimumSize(new java.awt.Dimension(725, 562));
        setName("AgregarEmpleadoFRM"); // NOI18N
        setPreferredSize(new java.awt.Dimension(725, 562));
        setVisible(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        PANEL_planillas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planillas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(28, 40, 51))); // NOI18N

        jScrollPane1.setViewportView(TABLE_ordenes);

        PANEL_planillas.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        PANEL_empleadoplanilla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados de la planilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(28, 40, 51))); // NOI18N

        jScrollPane2.setViewportView(tableZ1);

        PANEL_empleadoplanilla.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout PANEL_mainLayout = new javax.swing.GroupLayout(PANEL_main);
        PANEL_main.setLayout(PANEL_mainLayout);
        PANEL_mainLayout.setHorizontalGroup(
            PANEL_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL_planillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PANEL_empleadoplanilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PANEL_mainLayout.setVerticalGroup(
            PANEL_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_mainLayout.createSequentialGroup()
                .addComponent(PANEL_planillas, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL_empleadoplanilla, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        getContentPane().add(PANEL_main, java.awt.BorderLayout.CENTER);

        PANEL_imagen.setBorder(null);

        LABEL_imagen.setBackground(new java.awt.Color(0, 0, 51));
        LABEL_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/carmelitascoffee/img/planillas.png"))); // NOI18N
        LABEL_imagen.setText("");
        PANEL_imagen.add(LABEL_imagen, java.awt.BorderLayout.CENTER);

        getContentPane().add(PANEL_imagen, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.LabelZ LABEL_imagen;
    private swing.Contenedores.PanelZ PANEL_empleadoplanilla;
    private swing.Contenedores.PanelZ PANEL_imagen;
    private swing.Contenedores.PanelZ PANEL_main;
    private swing.Contenedores.PanelZ PANEL_planillas;
    private swing.Controles.TableZ TABLE_ordenes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.Controles.TableZ tableZ1;
    // End of variables declaration//GEN-END:variables
    
    private void ActualizarPanel(){
        this.PANEL_main.revalidate();
        this.PANEL_main.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

}