/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.ventas;

import com.carmelitascoffee.controlador.ventas.CNuevaOrden;
import com.carmelitascoffee.pojo.DetalleOrdenProducto;
import com.carmelitascoffee.pojo.DetalleOrdenServicio;
import com.carmelitascoffee.pojo.Orden;
import com.carmelitascoffee.pojo.Producto;
import com.carmelitascoffee.pojo.Servicio;
import com.carmelitascoffee.vista.inventario.Productos;
import com.carmelitascoffee.vista.inventario.Servicios;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class NuevaOrden extends JInternalFrame {

    Session s;
    int idEmpleado;
    CNuevaOrden controlador;

    /**
     * Creates new form InternalFrameZ
     *
     * @param s session
     * @param idEmpleado para ingresar ordenes
     */
    public NuevaOrden(Session s, int idEmpleado) {
        initComponents();
        this.s = s;
        this.idEmpleado = idEmpleado;
        tfEmpleadoid.setText("" + idEmpleado);
        controlador = new CNuevaOrden(s);

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

        lEmpleadoid = new swing.Controles.LabelZ();
        tfEmpleadoid = new swing.Controles.TextFieldZ();
        lNumeroFactura = new swing.Controles.LabelZ();
        tfNumeroFactura = new swing.Controles.TextFieldZ();
        lTipoOrden = new swing.Controles.LabelZ();
        cbtipoOrden = new swing.Controles.ComboBoxZ();
        lFechaRegistro = new swing.Controles.LabelZ();
        lIDClientes = new swing.Controles.LabelZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        tOrden = new swing.Controles.TableZ();
        bRegistrarOrden = new swing.Controles.ButtonZ();
        tfIdCliente = new swing.Controles.TextFieldZ();
        pAgregarPSO = new swing.Contenedores.PanelZ();
        lTitulo2 = new swing.Controles.LabelZ();
        tfId = new swing.Controles.TextFieldZ();
        bPersonasContactoVista = new swing.Controles.ButtonZ();
        tfFechaRegistro = new swing.Controles.SpinnerZ();
        bProductosVista = new swing.Controles.ButtonZ();
        bServiciosVista = new swing.Controles.ButtonZ();
        lTotal = new swing.Controles.LabelZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nueva Orden");
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lEmpleadoid.setText("Empleado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(lEmpleadoid, gridBagConstraints);

        tfEmpleadoid.setEditable(false);
        tfEmpleadoid.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(tfEmpleadoid, gridBagConstraints);

        lNumeroFactura.setText("Número de Factura: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(lNumeroFactura, gridBagConstraints);

        tfNumeroFactura.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(tfNumeroFactura, gridBagConstraints);

        lTipoOrden.setText("Tipo de Orden: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(lTipoOrden, gridBagConstraints);

        cbtipoOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Producto", "Servicio" }));
        cbtipoOrden.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(cbtipoOrden, gridBagConstraints);

        lFechaRegistro.setText("Fecha de registro de la Orden: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(lFechaRegistro, gridBagConstraints);

        lIDClientes.setText("Id Cliente: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(lIDClientes, gridBagConstraints);

        tOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Orden", "Nombre", "Precio", "Cantidad", "Descuento Unit", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tOrden.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tOrdenKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tOrden);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        bRegistrarOrden.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        bRegistrarOrden.setText("Registrar Orden");
        bRegistrarOrden.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        bRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarOrdenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(bRegistrarOrden, gridBagConstraints);

        tfIdCliente.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfIdCliente, gridBagConstraints);

        lTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo2.setText("Digite el Id del Producto/Servicio:");
        pAgregarPSO.add(lTitulo2, java.awt.BorderLayout.NORTH);

        tfId.setText("");
        tfId.setToolTipText("");
        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIdKeyPressed(evt);
            }
        });
        pAgregarPSO.add(tfId, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(pAgregarPSO, gridBagConstraints);

        bPersonasContactoVista.setBackground(new java.awt.Color(255, 247, 162));
        bPersonasContactoVista.setBorder(null);
        bPersonasContactoVista.setForeground(new java.awt.Color(10, 13, 67));
        bPersonasContactoVista.setText("Ver clientes registrados");
        bPersonasContactoVista.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        bPersonasContactoVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bPersonasContactoVistaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bPersonasContactoVistaMouseEntered(evt);
            }
        });
        bPersonasContactoVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersonasContactoVistaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(bPersonasContactoVista, gridBagConstraints);

        tfFechaRegistro.setModel(new javax.swing.SpinnerDateModel());
        tfFechaRegistro.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(tfFechaRegistro, gridBagConstraints);

        bProductosVista.setBackground(new java.awt.Color(255, 247, 162));
        bProductosVista.setBorder(null);
        bProductosVista.setForeground(new java.awt.Color(10, 13, 67));
        bProductosVista.setText("Ver productos registrados");
        bProductosVista.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        bProductosVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bProductosVistaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bProductosVistaMouseEntered(evt);
            }
        });
        bProductosVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProductosVistaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(bProductosVista, gridBagConstraints);

        bServiciosVista.setBackground(new java.awt.Color(255, 247, 162));
        bServiciosVista.setBorder(null);
        bServiciosVista.setForeground(new java.awt.Color(10, 13, 67));
        bServiciosVista.setText("Ver servicios registrados");
        bServiciosVista.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        bServiciosVista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bServiciosVistaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bServiciosVistaMouseEntered(evt);
            }
        });
        bServiciosVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bServiciosVistaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(bServiciosVista, gridBagConstraints);

        lTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lTotal.setText("Total: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(lTotal, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void bPersonasContactoVistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPersonasContactoVistaMouseExited
        bPersonasContactoVista.setBackground(new Color(255, 247, 162));
    }//GEN-LAST:event_bPersonasContactoVistaMouseExited

    private void bPersonasContactoVistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPersonasContactoVistaMouseEntered
        bPersonasContactoVista.setBackground(new Color(255, 247, 162));
    }//GEN-LAST:event_bPersonasContactoVistaMouseEntered

    private void bPersonasContactoVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersonasContactoVistaActionPerformed
        JDesktopPane jdp = getDesktopPane();
        ClienteVista clienteVista = new ClienteVista(s);
        clienteVista.setVisible(true);
        clienteVista.pack();
        jdp.add(clienteVista);
        clienteVista.toFront();
    }//GEN-LAST:event_bPersonasContactoVistaActionPerformed

    private void bProductosVistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProductosVistaMouseExited
        bProductosVista.setBackground(new Color(255, 247, 162));

    }//GEN-LAST:event_bProductosVistaMouseExited

    private void bProductosVistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProductosVistaMouseEntered
        bProductosVista.setBackground(new Color(255, 247, 162));
    }//GEN-LAST:event_bProductosVistaMouseEntered

    private void bProductosVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProductosVistaActionPerformed
        JDesktopPane jdp = getDesktopPane();
        Productos productos = new Productos(s);
        productos.setVisible(true);
        productos.pack();
        jdp.add(productos);
        productos.toFront();
    }//GEN-LAST:event_bProductosVistaActionPerformed

    private void bServiciosVistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bServiciosVistaMouseExited
        bServiciosVista.setBackground(new Color(255, 247, 162));
    }//GEN-LAST:event_bServiciosVistaMouseExited

    private void bServiciosVistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bServiciosVistaMouseEntered
        bServiciosVista.setBackground(new Color(255, 247, 162));

    }//GEN-LAST:event_bServiciosVistaMouseEntered

    private void bServiciosVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bServiciosVistaActionPerformed
        JDesktopPane jdp = getDesktopPane();
        Servicios servicios = new Servicios(s);
        servicios.setVisible(true);
        servicios.pack();
        jdp.add(servicios);
        servicios.toFront();
    }//GEN-LAST:event_bServiciosVistaActionPerformed

    private void tOrdenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tOrdenKeyReleased
        try {
            int rowSelect = tOrden.getSelectedRow();
            int columnSelect = tOrden.getSelectedColumn();
            int cantidad = Integer.parseInt(tOrden.getValueAt(rowSelect, 3) + "");
            float descuento = Float.parseFloat(tOrden.getValueAt(rowSelect, 4) + "");
            String nombre = (String) tOrden.getValueAt(rowSelect, 1);
            nombre = nombre.split("-")[0];
            int idProducto = Integer.parseInt(nombre);
            Producto p = controlador.getProducto(idProducto);

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                if (columnSelect == 4) {
                    if (descuento > 1 || descuento < 0) {
                        JOptionPane.showMessageDialog(this, "El descuento tiene que estar entre 0 y 1");
                        descuento = 0;
                        tOrden.setValueAt(0, rowSelect, 4);
                    }
                } else if (columnSelect == 3) {

                    if (cantidad < 0 || cantidad > p.getCantidadEnInventario()) {
                        JOptionPane.showMessageDialog(this, "La Cantidad debe de estar entre 0 y el número de unidades en inventario");
                        tOrden.setValueAt(0, rowSelect, 3);
                        cantidad = 0;
                    }
                }
                tOrden.setValueAt(cantidad * p.getPrecio().floatValue() * (1 - descuento), rowSelect, 5);
                calcularTotal();
            }
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                rowSelect = tOrden.getSelectedRow();
                if (JOptionPane.showConfirmDialog(this, "¿Seguro de eliminar la fila seleccionada?") == 0) {
                    eliminarFila(rowSelect);
                    calcularTotal();
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_tOrdenKeyReleased

    private void tfIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyTyped

    }//GEN-LAST:event_tfIdKeyTyped

    private void tfIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //agregar detalle orden producto
            if (cbtipoOrden.getSelectedIndex() == 0) {
                try {
                    int idProducto = Integer.parseInt(tfId.getText());
                    if (controlador.existeProducto(idProducto)) {
                        Producto p = controlador.getProducto(idProducto);
                        agregarFila(p);
                    } else {
                        JOptionPane.showMessageDialog(this, "El id ingresado no pertenece a los id's registrados de los productos\n"
                                + "De click al botón \"Ver productos registrados\" para encontrar el id a ingresar.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "La cadena digitada no corresponde al formato de los productos identificados\n"
                            + "De click al botón \"Ver productos registrados\" para encontrar el id a ingresar.");
                }
            } else if (cbtipoOrden.getSelectedIndex() == 1) { // agregar detalle orden servicio
                try {
                    int idServicio = Integer.parseInt(tfId.getText());
                    if (controlador.existeServicio(idServicio)) {
                        Servicio serv = controlador.getServicios(idServicio);
                        agregarFila(serv);
                    } else {
                        JOptionPane.showMessageDialog(this, "El id ingresado no pertenece a los id's registrados de los servicios\n"
                                + "De click al botón \"Ver servicios registrados\" para encontrar el id a ingresar.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "La cadena digitada no corresponde al formato de los servicios identificados\n"
                            + "De click al botón \"Ver servicios registrados\" para encontrar el id a ingresar.");
                }
            }
        }
    }//GEN-LAST:event_tfIdKeyPressed

    private void bRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarOrdenActionPerformed
        if (validarDatos().isEmpty()) {
            try {
                int idCliente = Integer.parseInt(tfIdCliente.getText());

                Orden o = new Orden(controlador.getCliente(idCliente), controlador.getEmpleado(idEmpleado));
                o.setNumeroFactura(tfNumeroFactura.getText());
                o.setFechaOrden((Date) tfFechaRegistro.getValue());
                o.setFechaRequerida((Date) tfFechaRegistro.getValue());
                o.setFechaEntrega((Date) tfFechaRegistro.getValue());
                o.setTipoOrden("Productos/Servicios");
                o = controlador.agregarOrden(o);

                DefaultTableModel model = (DefaultTableModel) tOrden.getModel();
                for (int i = 0; i < model.getRowCount(); i++) {
                    String tipoOrden = (String) model.getValueAt(i, 0);
                    int cantidad = Integer.parseInt(tOrden.getValueAt(i, 3) + "");
                    float descuento = Float.parseFloat(tOrden.getValueAt(i, 4) + "");
                    float precio = Float.parseFloat(tOrden.getValueAt(i, 2) + "");
                    String celda1 = (String) tOrden.getValueAt(i, 1);
                    if ("Servicio".equals(tipoOrden)) {
                        int idServicio = Integer.parseInt(celda1.split("-")[0]);
                        Servicio servicio = controlador.getServicios(idServicio);
                        DetalleOrdenServicio dos = new DetalleOrdenServicio(o, servicio);
                        dos.setCantidad(cantidad);
                        dos.setDescuento(new BigDecimal(descuento));
                        dos.setPrecio(new BigDecimal(precio));
                        controlador.agregarDetalleOrdenServicio(dos);

                    } else if ("Producto".equals(tipoOrden)) {
                        int idProducto = Integer.parseInt(celda1.split("-")[0]);
                        Producto producto = controlador.getProducto(idProducto);
                        DetalleOrdenProducto dop = new DetalleOrdenProducto(o, producto);
                        dop.setCantidad(cantidad);
                        dop.setDescuento(new BigDecimal(descuento));
                        dop.setPrecio(new BigDecimal(precio));
                        controlador.agregarDetalleOrdenProducto(dop);

                    }
                }
            } catch (NumberFormatException | HibernateException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, validarDatos());
        }

    }//GEN-LAST:event_bRegistrarOrdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ bPersonasContactoVista;
    private swing.Controles.ButtonZ bProductosVista;
    private swing.Controles.ButtonZ bRegistrarOrden;
    private swing.Controles.ButtonZ bServiciosVista;
    private swing.Controles.ComboBoxZ cbtipoOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ lEmpleadoid;
    private swing.Controles.LabelZ lFechaRegistro;
    private swing.Controles.LabelZ lIDClientes;
    private swing.Controles.LabelZ lNumeroFactura;
    private swing.Controles.LabelZ lTipoOrden;
    private swing.Controles.LabelZ lTitulo2;
    private swing.Controles.LabelZ lTotal;
    private swing.Contenedores.PanelZ pAgregarPSO;
    private swing.Controles.TableZ tOrden;
    private swing.Controles.TextFieldZ tfEmpleadoid;
    private swing.Controles.SpinnerZ tfFechaRegistro;
    private swing.Controles.TextFieldZ tfId;
    private swing.Controles.TextFieldZ tfIdCliente;
    private swing.Controles.TextFieldZ tfNumeroFactura;
    // End of variables declaration//GEN-END:variables

    private void agregarFila(Producto p) {
        DefaultTableModel model = (DefaultTableModel) tOrden.getModel();
        Object[] row = new Object[6];
        row[0] = cbtipoOrden.getSelectedItem();
        row[1] = p.getIdProducto() + "-" + p.getDescripcion();
        row[2] = p.getPrecio().toString();
        row[3] = 1;
        row[4] = 0;
        row[5] = p.getPrecio().doubleValue() * Double.parseDouble(row[3] + "");
        model.addRow(row);
        calcularTotal();
    }

    private void agregarFila(Servicio p) {
        DefaultTableModel model = (DefaultTableModel) tOrden.getModel();
        Object[] row = new Object[6];
        row[0] = cbtipoOrden.getSelectedItem();
        row[1] = p.getIdServicio() + "-" + p.getDescripcion();
        row[2] = p.getPrecio().toString();
        row[3] = 1;
        row[4] = 0;
        row[5] = p.getPrecio().doubleValue() * Double.parseDouble(row[3] + "");
        model.addRow(row);
        calcularTotal();

    }

    private void calcularTotal() {
        DefaultTableModel model = (DefaultTableModel) tOrden.getModel();
        float total = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            total += Double.parseDouble(model.getValueAt(i, 5) + "");
        }
        lTotal.setText("Total: " + total);
    }

    private void eliminarFila(int rowSelect) {
        DefaultTableModel model = (DefaultTableModel) tOrden.getModel();
        model.removeRow(rowSelect);
        tOrden.setModel(model);
    }

    private String validarDatos() {
        String mensaje = "";
        try {
            int idCliente = Integer.parseInt(tfIdCliente.getText());
            if (controlador.getCliente(idCliente) == null) {
                mensaje += "No existe un cliente con ese id!!";
            }
            if (tfNumeroFactura.getText().length() != 5) {
                mensaje += "La Factura debe de tener 5 digitos";
            }
        } catch (NumberFormatException numberFormatException) {
        }

        return mensaje;
    }
}
