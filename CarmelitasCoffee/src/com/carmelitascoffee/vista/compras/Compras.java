/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.compras;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author admin
 */
public class Compras extends JInternalFrame {

    /**
     * Creates new form InternalFrameZ
     */
    public Compras() {
        initComponents();
        setImagenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ltipoCompra = new swing.Controles.LabelZ();
        cbTipoCompra = new swing.Controles.ComboBoxZ();
        lCodigoCompra = new swing.Controles.LabelZ();
        tfCodigoCompra = new swing.Controles.TextFieldZ();
        lProveedores = new swing.Controles.LabelZ();
        cbProveedor = new swing.Controles.ComboBoxZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCompras = new swing.Controles.TableZ();
        buttonZ1 = new swing.Controles.ButtonZ();
        bActualizar = new swing.Controles.ButtonZ();
        bNuevoProveedor = new swing.Controles.ButtonZ();
        pImagen = new swing.Contenedores.PanelZ();
        labelZ1 = new swing.Controles.LabelZ();
        textFieldZ1 = new swing.Controles.TextFieldZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Compras");
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        ltipoCompra.setText("Tipo de Compra: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(ltipoCompra, gridBagConstraints);

        cbTipoCompra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Servicios", "Insumos" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(cbTipoCompra, gridBagConstraints);

        lCodigoCompra.setText("Código de Compra: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lCodigoCompra, gridBagConstraints);

        tfCodigoCompra.setEditable(false);
        tfCodigoCompra.setText("1000-c12222");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfCodigoCompra, gridBagConstraints);

        lProveedores.setText("Proveedor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lProveedores, gridBagConstraints);

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Proveedor 1", "Proveedor 2", "Proveedor 3" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(cbProveedor, gridBagConstraints);

        tCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Compra", "Descripción", "Precio", "Descuento", "Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCompras);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        buttonZ1.setText("Realizar Compras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(buttonZ1, gridBagConstraints);

        bActualizar.setBorder(null);
        bActualizar.setText("");
        bActualizar.setOpaque(false);
        bActualizar.setPreferredSize(new java.awt.Dimension(25, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(bActualizar, gridBagConstraints);

        bNuevoProveedor.setBackground(new java.awt.Color(255, 247, 162));
        bNuevoProveedor.setBorder(null);
        bNuevoProveedor.setForeground(new java.awt.Color(0, 51, 102));
        bNuevoProveedor.setText("Nuevo Proveedor");
        bNuevoProveedor.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        bNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoProveedorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(bNuevoProveedor, gridBagConstraints);

        pImagen.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        getContentPane().add(pImagen, gridBagConstraints);

        labelZ1.setText("Descripción: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(labelZ1, gridBagConstraints);

        textFieldZ1.setText("sha la la la");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(textFieldZ1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoProveedorActionPerformed
        JDesktopPane jdp = getDesktopPane();
        Proveedores proveedores = new Proveedores();
        proveedores.pack();
        proveedores.setVisible(true);
        jdp.add(proveedores);
    }//GEN-LAST:event_bNuevoProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ bActualizar;
    private swing.Controles.ButtonZ bNuevoProveedor;
    private swing.Controles.ButtonZ buttonZ1;
    private swing.Controles.ComboBoxZ cbProveedor;
    private swing.Controles.ComboBoxZ cbTipoCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ lCodigoCompra;
    private swing.Controles.LabelZ lProveedores;
    private swing.Controles.LabelZ labelZ1;
    private swing.Controles.LabelZ ltipoCompra;
    private swing.Contenedores.PanelZ pImagen;
    private swing.Controles.TableZ tCompras;
    private swing.Controles.TextFieldZ textFieldZ1;
    private swing.Controles.TextFieldZ tfCodigoCompra;
    // End of variables declaration//GEN-END:variables
 private void setImagenes() {
        ImageIcon iconoActualizar;
        URL ruta = getClass().getClassLoader().getResource("com//carmelitascoffee//img//update.png");
        iconoActualizar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bActualizar.setIcon(iconoActualizar);
        ruta = getClass().getClassLoader().getResource("com//carmelitascoffee//img//compras.jpg");
        pImagen.setImagenfondo(new ImageIcon(ruta).getImage());
    }
}