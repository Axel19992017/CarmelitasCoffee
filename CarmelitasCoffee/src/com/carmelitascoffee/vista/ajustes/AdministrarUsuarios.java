/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.ajustes;

import com.carmelitascoffee.controlador.ajustes.CAdministrarUsuarios;
import com.carmelitascoffee.pojo.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

/**
 *
 * @author darce
 */
public class AdministrarUsuarios extends javax.swing.JInternalFrame {

    Session s;
    CAdministrarUsuarios controlador;

    /**
     * Creates new form AdministrarUsuarios
     */
    public AdministrarUsuarios() {
        initComponents();
    }

    public AdministrarUsuarios(Session s) {
        this.s = s;
        initComponents();
        controlador = new CAdministrarUsuarios(s);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneZ1 = new swing.Contenedores.TabbedPaneZ();
        panelZ1 = new swing.Contenedores.PanelZ();
        labelZ1 = new swing.Controles.LabelZ();
        panelZ2 = new swing.Contenedores.PanelZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        tUsuarios = new swing.Controles.TableZ();

        setBackground(new java.awt.Color(255, 247, 162));
        setClosable(true);
        setIconifiable(true);
        setTitle("Administración de Usuarios");

        panelZ1.setLayout(new java.awt.GridBagLayout());

        labelZ1.setText("DISPONIBLE MUY PRONTO");
        panelZ1.add(labelZ1, new java.awt.GridBagConstraints());

        tabbedPaneZ1.addTab("Agregar Usuario", panelZ1);

        tUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "empleado", "usuario", "rol", "contraseña"
            }
        ));
        jScrollPane1.setViewportView(tUsuarios);

        panelZ2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabbedPaneZ1.addTab("Ver Usuarios", panelZ2);

        getContentPane().add(tabbedPaneZ1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ labelZ1;
    private swing.Contenedores.PanelZ panelZ1;
    private swing.Contenedores.PanelZ panelZ2;
    private swing.Controles.TableZ tUsuarios;
    private swing.Contenedores.TabbedPaneZ tabbedPaneZ1;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) tUsuarios.getModel();
        Object[] row = new Object[5];
        List l = controlador.getUsuarios();
        for (Object object : l) {
            Usuario user = (Usuario) object;
            row[0] = user.getEmpleado().getPrimerNombre() + " " + user.getEmpleado().getPrimerApellido();
            row[1] = user.getNombre();
            row[2] = user.getRol();
            row[3] = user.getClaveAcceso();
            defaultTableModel.addRow(row);
        }
        tUsuarios.setModel(defaultTableModel);
    }
}
