/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.compras;

import com.carmelitascoffee.controlador.compras.CProveedores;
import com.carmelitascoffee.pojo.Proveedor;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Proveedores extends JInternalFrame {

    /**
     * Creates new form InternalFrameZ
     */
    Session s;
    CProveedores controlador;

    public Proveedores(Session s) {
        initComponents();
        controlador = new CProveedores(s);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tProveedores = new swing.Controles.TableZ();
        lNombre = new swing.Controles.LabelZ();
        tfNombre = new swing.Controles.TextFieldZ();
        lDescripcion = new swing.Controles.LabelZ();
        tfDescripcion = new swing.Controles.TextFieldZ();
        labelZ3 = new swing.Controles.LabelZ();
        lCorreo = new swing.Controles.LabelZ();
        tfCorreo = new swing.Controles.TextFieldZ();
        labelZ5 = new swing.Controles.LabelZ();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDirección = new swing.Controles.TextAreaZ();
        bAgregarProveedor = new swing.Controles.ButtonZ();
        tfTelefono = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Proveedores");
        setName(""); // NOI18N
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Teléfono", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tProveedores.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tProveedores);
        tProveedores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        lNombre.setText("Nombre del proveedor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lNombre, gridBagConstraints);

        tfNombre.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfNombre, gridBagConstraints);

        lDescripcion.setText("Descripción: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lDescripcion, gridBagConstraints);

        tfDescripcion.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfDescripcion, gridBagConstraints);

        labelZ3.setText("Teléfono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(labelZ3, gridBagConstraints);

        lCorreo.setText("Correo: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(lCorreo, gridBagConstraints);

        tfCorreo.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfCorreo, gridBagConstraints);

        labelZ5.setText("Dirección: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(labelZ5, gridBagConstraints);

        taDirección.setEditable(true);
        taDirección.setColumns(20);
        taDirección.setRows(5);
        taDirección.setText("");
        jScrollPane2.setViewportView(taDirección);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        bAgregarProveedor.setText("Agregar Proveedo");
        bAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarProveedorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(bAgregarProveedor, gridBagConstraints);

        tfTelefono.setFormatterFactory(new javax.swing.JFormattedTextField.AbstractFormatterFactory() {
            public javax.swing.JFormattedTextField.AbstractFormatter
            getFormatter(javax.swing.JFormattedTextField tf){

                try {
                    return new javax.swing.text.MaskFormatter("####-####");
                }
                catch (java.text.ParseException pe){
                    pe.printStackTrace();
                }
                return null;
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(tfTelefono, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarProveedorActionPerformed
        String mensaje = validarDatos();
        if (mensaje.isEmpty()) {
            Proveedor p = new Proveedor();
            p.setCorreo(tfCorreo.getText());
            p.setDescripcion(tfDescripcion.getText());
            p.setDireccion(taDirección.getText());
            p.setNombreProveedor(tfNombre.getText());
            p.setTelefono(tfTelefono.getText());
            if (controlador.agregarProveedores(p)) {
                JOptionPane.showMessageDialog(this, "Proveedor agregado con éxito!");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el proveedor");
            }
        }
    }//GEN-LAST:event_bAgregarProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ bAgregarProveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.Controles.LabelZ lCorreo;
    private swing.Controles.LabelZ lDescripcion;
    private swing.Controles.LabelZ lNombre;
    private swing.Controles.LabelZ labelZ3;
    private swing.Controles.LabelZ labelZ5;
    private swing.Controles.TableZ tProveedores;
    private swing.Controles.TextAreaZ taDirección;
    private swing.Controles.TextFieldZ tfCorreo;
    private swing.Controles.TextFieldZ tfDescripcion;
    private swing.Controles.TextFieldZ tfNombre;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

    private String validarDatos() {
        String error = "";
        if (tfNombre.getText().length() > 50) {
            error += "Nombre del proveedor muy largo (>50)\n";
        }
        if (tfDescripcion.getText().length() > 70) {
            error += "Descripción demasiado largo (>70)\n";
        }
        if (tfCorreo.getText().length() > 30) {
            error += "Correo demasiado largo (>30)\n";
        } else {
            Pattern pattern = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
            Matcher mather = pattern.matcher(tfCorreo.getText());
            if (mather.find() == false) {
                error += "El email ingresado es inválido.\n";
            }
        }
        return error;
    }

    private void cargarTabla() {
        DefaultTableModel model = (DefaultTableModel) tProveedores.getModel();
        model.setRowCount(0);
        List l = controlador.getProveedores();
        for (Object object : l) {
            Proveedor p = (Proveedor) object;
            Object[] row = new Object[4];
            row[0] = p.getNombreProveedor();
            row[1] = p.getDescripcion();
            row[2] = p.getTelefono();
            row[3] = p.getCorreo();
            model.addRow(row);
        }
        tProveedores.setModel(model);
    }

}
