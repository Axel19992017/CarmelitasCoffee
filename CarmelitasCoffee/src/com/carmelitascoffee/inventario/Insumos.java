/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carmelitascoffee.inventario;

import javax.swing.JInternalFrame;

/**
 *
 * @author admin
 */
public class Insumos extends JInternalFrame {

    /**
     * Creates new form InternalFrameZ
     */
    public Insumos() {
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

        labelZ2 = new swing.Controles.LabelZ();
        textFieldZ8 = new swing.Controles.TextFieldZ();
        buttonZ3 = new swing.Controles.ButtonZ();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableZ1 = new swing.Controles.TableZ();
        labelZ1 = new swing.Controles.LabelZ();
        textFieldZ5 = new swing.Controles.TextFieldZ();
        textFieldZ2 = new swing.Controles.TextFieldZ();
        labelZ5 = new swing.Controles.LabelZ();
        labelZ4 = new swing.Controles.LabelZ();
        textFieldZ4 = new swing.Controles.TextFieldZ();
        textFieldZ3 = new swing.Controles.TextFieldZ();
        buttonZ4 = new swing.Controles.ButtonZ();
        buttonZ1 = new swing.Controles.ButtonZ();
        labelZ3 = new swing.Controles.LabelZ();

        setBackground(new java.awt.Color(0, 51, 102));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);

        labelZ2.setText("Código de insumo");
        labelZ2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        textFieldZ8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        textFieldZ8.setText("");
        textFieldZ8.setCaretColor(new java.awt.Color(255, 255, 255));
        textFieldZ8.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textFieldZ8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        buttonZ3.setBackground(new java.awt.Color(204, 204, 204));
        buttonZ3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        buttonZ3.setForeground(new java.awt.Color(0, 51, 102));
        buttonZ3.setText("Buscar");
        buttonZ3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        tableZ1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tableZ1);

        labelZ1.setText("Código");
        labelZ1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        textFieldZ5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        textFieldZ5.setText("");
        textFieldZ5.setCaretColor(new java.awt.Color(255, 255, 255));
        textFieldZ5.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textFieldZ5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        textFieldZ2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        textFieldZ2.setText("");
        textFieldZ2.setCaretColor(new java.awt.Color(255, 255, 255));
        textFieldZ2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textFieldZ2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        labelZ5.setText("Nombre");
        labelZ5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        labelZ4.setText("Precio");
        labelZ4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        textFieldZ4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        textFieldZ4.setText("");
        textFieldZ4.setCaretColor(new java.awt.Color(255, 255, 255));
        textFieldZ4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textFieldZ4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        textFieldZ3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        textFieldZ3.setText("");
        textFieldZ3.setCaretColor(new java.awt.Color(255, 255, 255));
        textFieldZ3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        textFieldZ3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        buttonZ4.setBackground(new java.awt.Color(204, 204, 204));
        buttonZ4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        buttonZ4.setForeground(new java.awt.Color(0, 51, 102));
        buttonZ4.setText("Editar");
        buttonZ4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        buttonZ1.setBackground(new java.awt.Color(204, 204, 204));
        buttonZ1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        buttonZ1.setForeground(new java.awt.Color(0, 51, 102));
        buttonZ1.setText("Guardar");
        buttonZ1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonZ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZ1ActionPerformed(evt);
            }
        });

        labelZ3.setText("Cantidad");
        labelZ3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(labelZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(buttonZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(labelZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(textFieldZ8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(buttonZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(labelZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(157, 157, 157)
                                        .addComponent(labelZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textFieldZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(textFieldZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textFieldZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textFieldZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(buttonZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldZ8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldZ3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldZ2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldZ4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonZ1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonZ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonZ1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Controles.ButtonZ buttonZ1;
    private swing.Controles.ButtonZ buttonZ3;
    private swing.Controles.ButtonZ buttonZ4;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.Controles.LabelZ labelZ1;
    private swing.Controles.LabelZ labelZ2;
    private swing.Controles.LabelZ labelZ3;
    private swing.Controles.LabelZ labelZ4;
    private swing.Controles.LabelZ labelZ5;
    private swing.Controles.TableZ tableZ1;
    private swing.Controles.TextFieldZ textFieldZ2;
    private swing.Controles.TextFieldZ textFieldZ3;
    private swing.Controles.TextFieldZ textFieldZ4;
    private swing.Controles.TextFieldZ textFieldZ5;
    private swing.Controles.TextFieldZ textFieldZ8;
    // End of variables declaration//GEN-END:variables
}
