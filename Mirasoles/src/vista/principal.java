package vista;

import controlador.ventas;

/**
 *
 * @author Thais Cartuche
 */
public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }
    double suma = 0;
    double promedio = 0;
    ventas newVenta = new ventas();
    double matriz1 [][] = new double [3][4];
    double matriz2 [][] = new double [3][4];
    double matriz3 [][] = new double [3][4];
    double matriz4 [][] = new double [3][4];
    double matriz5 [][] = new double [3][4];
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        bntIngresar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AtxtMostrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVentaAnual = new javax.swing.JTextArea();
        btnVentaAnual = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPromedio = new javax.swing.JTextArea();
        btnPromedio = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnVentaAnual1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMayores = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSuma = new javax.swing.JTextArea();
        btnMenor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtMenor = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnJson = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("numero de agencia: ");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agencia", "1", "2", "3", "4", "5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        bntIngresar.setText("INGRESAR MATRIZ ANUAL DE VENTAS");
        bntIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIngresarActionPerformed(evt);
            }
        });

        btnMostrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnMostrar.setText("Mostrar matriz de ventas");
        btnMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        AtxtMostrar.setEditable(false);
        AtxtMostrar.setColumns(20);
        AtxtMostrar.setRows(5);
        jScrollPane2.setViewportView(AtxtMostrar);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("VENTAS ANUALES");

        jLabel3.setText("TOTAL VENTAS ANUALES:");

        txtVentaAnual.setEditable(false);
        txtVentaAnual.setColumns(20);
        txtVentaAnual.setRows(5);
        jScrollPane1.setViewportView(txtVentaAnual);

        btnVentaAnual.setText("Mostrar ventas anuales");
        btnVentaAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaAnualActionPerformed(evt);
            }
        });

        jLabel4.setText("PROMEDIO VENTAS:");

        txtPromedio.setEditable(false);
        txtPromedio.setColumns(20);
        txtPromedio.setRows(5);
        jScrollPane3.setViewportView(txtPromedio);

        btnPromedio.setText("promedio ventas");
        btnPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromedioActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel5.setText("AGENCIA CON MAS VENTAS EN EL MES:");

        btnVentaAnual1.setText("Agencia con mas ventas");
        btnVentaAnual1.setActionCommand("Agencia con mas ventas");
        btnVentaAnual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaAnual1ActionPerformed(evt);
            }
        });

        txtMayores.setEditable(false);
        txtMayores.setColumns(20);
        txtMayores.setRows(5);
        jScrollPane4.setViewportView(txtMayores);

        jLabel6.setText("SUMA TOTAL DE LAS VENTAS:");

        txtSuma.setEditable(false);
        txtSuma.setColumns(20);
        txtSuma.setRows(5);
        jScrollPane5.setViewportView(txtSuma);

        btnMenor.setText("Menor mes de ventas");
        btnMenor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });

        jLabel7.setText("MES CON MENORES VENTAS");

        txtMenor.setEditable(false);
        txtMenor.setColumns(20);
        txtMenor.setRows(5);
        jScrollPane6.setViewportView(txtMenor);

        jLabel8.setText("Thais Cartuche");

        btnJson.setText("Generar archivo Json");
        btnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bntIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(47, 47, 47))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnVentaAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnVentaAnual1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                                .addGap(97, 97, 97)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnJson, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnVentaAnual))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 72, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenor)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromedio))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVentaAnual1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addComponent(btnJson, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bntIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIngresarActionPerformed
        int je = jComboBox1.getSelectedIndex();
        switch (je) {
            case 1:
                newVenta.ingresar_ventas(matriz1, "AGENCIA 1");
                break;
            case 2:
                newVenta.ingresar_ventas(matriz2, "AGENCIA 2");
                break;
            case 3:
                newVenta.ingresar_ventas(matriz3, "AGENCIA 3");
                break;
            case 4:
                newVenta.ingresar_ventas(matriz4, "AGENCIA 4");
                break;
            case 5:
                newVenta.ingresar_ventas(matriz5, "AGENCIA 5");
                break;
        }
    }//GEN-LAST:event_bntIngresarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int je = jComboBox1.getSelectedIndex();
        switch (je) {
            case 1:
                newVenta.matriz(matriz1, AtxtMostrar);
                break;
            case 2:
                newVenta.matriz(matriz2, AtxtMostrar);
                break;
            case 3:
                newVenta.matriz(matriz3, AtxtMostrar);
                break;
            case 4:
                newVenta.matriz(matriz4, AtxtMostrar);
                break;
            case 5:
                newVenta.matriz(matriz5, AtxtMostrar);
                break;
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnVentaAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaAnualActionPerformed
        int je = jComboBox1.getSelectedIndex();
        switch (je) {
            case 1:
                newVenta.ventasAnuales(matriz1, txtVentaAnual, suma);
                break;
            case 2:
                newVenta.ventasAnuales(matriz2, txtVentaAnual, suma);
                break;
            case 3:
                newVenta.ventasAnuales(matriz3, txtVentaAnual, suma);
                break;
            case 4:
               newVenta.ventasAnuales(matriz4, txtVentaAnual, suma);
                break;
            case 5:
              newVenta.ventasAnuales(matriz5, txtVentaAnual, suma);
                break;
        }
    }//GEN-LAST:event_btnVentaAnualActionPerformed

    private void btnPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromedioActionPerformed
        int mes = jComboBox2.getSelectedIndex();
        switch (mes) {
            case 1:
                newVenta.promedio(0, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 2:
                newVenta.promedio(1, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 3:
                newVenta.promedio(2, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 4:
                newVenta.promedio(3, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 5:
                newVenta.promedio(0, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 6:
                newVenta.promedio(1, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 7:
                newVenta.promedio(2, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 8:
                newVenta.promedio(3, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 9:
                newVenta.promedio(0, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 10:
                newVenta.promedio(1, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 11:
                newVenta.promedio(2, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
            case 12:
                newVenta.promedio(3, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtPromedio, suma, promedio);
                break;
        }
    }//GEN-LAST:event_btnPromedioActionPerformed

    private void btnVentaAnual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaAnual1ActionPerformed
        int mes = jComboBox2.getSelectedIndex();
        switch (mes) {
            case 1:
                newVenta.ventaMayor(0, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 2:
                newVenta.ventaMayor(1, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 3:
                newVenta.ventaMayor(2, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 4:
                newVenta.ventaMayor(3, 0, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 5:
                newVenta.ventaMayor(0, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 6:
                newVenta.ventaMayor(1, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 7:
                newVenta.ventaMayor(2, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 8:
                newVenta.ventaMayor(3, 1, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 9:
                newVenta.ventaMayor(0, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 10:
                newVenta.ventaMayor(1, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 11:
                newVenta.ventaMayor(2, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
            case 12:
                newVenta.ventaMayor(3, 2, matriz1, matriz2, matriz3, matriz4, matriz5, txtMayores);
                break;
        }
    }//GEN-LAST:event_btnVentaAnual1ActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
       newVenta.ventaMenor(matriz1, matriz2, matriz3, matriz4, matriz5, txtSuma, txtMenor);    
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonActionPerformed
        int json = jComboBox1.getSelectedIndex();
        switch (json) {
            case 1:
                newVenta.Json(matriz1, "AGENCIA_1");
                break;
            case 2:
                newVenta.Json(matriz2, "AGENCIA_2");
                break;
            case 3:
                newVenta.Json(matriz3, "AGENCIA_3");
                break;
            case 4:
                newVenta.Json(matriz4, "AGENCIA_4");
                break;
            case 5:
                newVenta.Json(matriz5, "AGENCIA_5");
                break;
        }
    }//GEN-LAST:event_btnJsonActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AtxtMostrar;
    private javax.swing.JButton bntIngresar;
    private javax.swing.JButton btnJson;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnPromedio;
    private javax.swing.JButton btnVentaAnual;
    private javax.swing.JButton btnVentaAnual1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtMayores;
    private javax.swing.JTextArea txtMenor;
    private javax.swing.JTextArea txtPromedio;
    private javax.swing.JTextArea txtSuma;
    private javax.swing.JTextArea txtVentaAnual;
    // End of variables declaration//GEN-END:variables
}
