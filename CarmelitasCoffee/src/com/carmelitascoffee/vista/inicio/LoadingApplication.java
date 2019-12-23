/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.vista.inicio;

/**
 *
 * @author Axel Eleazar García Darce
 */
public class LoadingApplication extends javax.swing.JFrame {

    /**
     * Creates new form LoadingApplication
     */
    public LoadingApplication() {
        initComponents();
        setSize(650, 530);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
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

        labelZ1 = new swing.Controles.LabelZ();
        pbCargando = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelZ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/carmelitascoffee/img/logo.png"))); // NOI18N
        labelZ1.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(labelZ1, gridBagConstraints);

        pbCargando.setForeground(new java.awt.Color(0, 0, 0));
        pbCargando.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(pbCargando, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.LabelZ labelZ1;
    private javax.swing.JProgressBar pbCargando;
    // End of variables declaration//GEN-END:variables
    public void cambiarValorAumentandoEn(int acum) {
        int valorActual = pbCargando.getValue();
        valorActual = (valorActual == 90) ? 0 : valorActual;
        pbCargando.setValue(valorActual + acum);

    }
}
