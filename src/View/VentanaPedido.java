package View;

import Controllers.IngredienteController;
import Controllers.PedidoController;
import Controllers.TacoController;
import Model.Ingrediente;
import Model.Pedido;
import Model.Taco;
import Model.TipoIngrediente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaPedido extends javax.swing.JFrame {

    private List<Ingrediente> ingredientesSeleccionados = new ArrayList<>();
    private List<Taco> listaTacos = new ArrayList<>();

    public VentanaPedido() throws SQLException {
        initComponents();
        CargarComboXtipoIngrediente();
    }
    PedidoController pedidoController = new PedidoController();
    IngredienteController controller = new IngredienteController();
    TacoController controllerT = new TacoController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanelTaco = new javax.swing.JPanel();
        lblTorilla = new javax.swing.JLabel();
        cmboxTortilla = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbAlimento = new javax.swing.JComboBox<>();
        lblTorilla1 = new javax.swing.JLabel();
        cmbSalsa = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaIng = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePedido = new javax.swing.JTable();
        btnFinalizarPedido = new javax.swing.JButton();
        lblNumeroTaco1 = new javax.swing.JLabel();
        txtPrecioTotalPedido = new javax.swing.JTextField();
        lblNumeroTaco2 = new javax.swing.JLabel();
        txtTacoMasEconomico = new javax.swing.JTextField();
        lblNumeroTaco3 = new javax.swing.JLabel();
        txtTacoMasCaro = new javax.swing.JTextField();
        lblNumeroTaco4 = new javax.swing.JLabel();
        txtTacoPromedio = new javax.swing.JTextField();

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alimentos: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana Pedidos");
        setBackground(new java.awt.Color(173, 202, 94));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("vntPedidos"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        jLabel2.setBackground(new java.awt.Color(190, 251, 122));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/iconoBarra.jpg"))); // NOI18N

        lblTorilla.setForeground(new java.awt.Color(0, 0, 0));
        lblTorilla.setText("Tortilla");

        cmboxTortilla.setToolTipText("Elige un tipo de Tortilla");
        cmboxTortilla.setFocusTraversalPolicyProvider(true);
        cmboxTortilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxTortillaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Alimentos: ");

        cmbAlimento.setFocusTraversalPolicyProvider(true);
        cmbAlimento.setInheritsPopupMenu(true);
        cmbAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlimentoActionPerformed(evt);
            }
        });

        lblTorilla1.setForeground(new java.awt.Color(0, 0, 0));
        lblTorilla1.setText("Salsa");

        cmbSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalsaActionPerformed(evt);
            }
        });

        tablaIng.setForeground(new java.awt.Color(0, 0, 0));
        tablaIng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ingrediente:", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaIng);
        if (tablaIng.getColumnModel().getColumnCount() > 0) {
            tablaIng.getColumnModel().getColumn(1).setMinWidth(80);
            tablaIng.getColumnModel().getColumn(1).setPreferredWidth(80);
            tablaIng.getColumnModel().getColumn(1).setMaxWidth(80);
        }
        tablaIng.getAccessibleContext().setAccessibleName("");

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/pngwing.com.png"))); // NOI18N
        btnAgregar.setText(" Agregar al pedido");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 51), null));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/remove_delete_trash_icon_255976.png"))); // NOI18N

        tablePedido.setForeground(new java.awt.Color(0, 0, 0));
        tablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nº Taco", "Ingredientes:", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePedido.setDragEnabled(true);
        tablePedido.setName("tablePedido"); // NOI18N
        jScrollPane1.setViewportView(tablePedido);
        if (tablePedido.getColumnModel().getColumnCount() > 0) {
            tablePedido.getColumnModel().getColumn(0).setMinWidth(80);
            tablePedido.getColumnModel().getColumn(0).setPreferredWidth(80);
            tablePedido.getColumnModel().getColumn(0).setMaxWidth(80);
            tablePedido.getColumnModel().getColumn(2).setMinWidth(80);
            tablePedido.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablePedido.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        btnFinalizarPedido.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarPedido.setText("Finalizar Pedido");
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTacoLayout = new javax.swing.GroupLayout(jPanelTaco);
        jPanelTaco.setLayout(jPanelTacoLayout);
        jPanelTacoLayout.setHorizontalGroup(
            jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTacoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTacoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelTacoLayout.createSequentialGroup()
                        .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTacoLayout.createSequentialGroup()
                                .addComponent(lblTorilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTacoLayout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTacoLayout.createSequentialGroup()
                                .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblTorilla))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbAlimento, 0, 182, Short.MAX_VALUE)
                                    .addComponent(cmboxTortilla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTacoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFinalizarPedido)))
                .addContainerGap())
        );
        jPanelTacoLayout.setVerticalGroup(
            jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTacoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTacoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxTortilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTorilla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTorilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        cmboxTortilla.getAccessibleContext().setAccessibleName("");
        cmboxTortilla.getAccessibleContext().setAccessibleDescription("Elige una tortilla");

        lblNumeroTaco1.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        lblNumeroTaco1.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroTaco1.setText("Total:");

        txtPrecioTotalPedido.setEditable(false);

        lblNumeroTaco2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblNumeroTaco2.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroTaco2.setText("Taco más económico:");

        txtTacoMasEconomico.setEditable(false);

        lblNumeroTaco3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblNumeroTaco3.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroTaco3.setText("Taco más caro:");

        txtTacoMasCaro.setEditable(false);

        lblNumeroTaco4.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblNumeroTaco4.setForeground(new java.awt.Color(0, 0, 0));
        lblNumeroTaco4.setText("Taco promedio:");

        txtTacoPromedio.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroTaco2)
                            .addComponent(lblNumeroTaco3)
                            .addComponent(lblNumeroTaco4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTacoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacoMasCaro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacoMasEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeroTaco1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTaco3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacoMasCaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTaco2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacoMasEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTaco4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTacoPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTaco1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed

        try {
            Pedido pedido = pedidoController.crearPedido(listaTacos);
            System.out.println(pedido);
            limpiarTablasYCombos();
            JOptionPane.showMessageDialog(null, "Pedido:" + pedido.getNumeroPedido() + "Precio Total: " + pedido.getPrecioTotalPedido(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();

            VentanaInicio ventanaInicio = new VentanaInicio();
            ventanaInicio.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            Taco taco = controllerT.cargarTaco(ingredientesSeleccionados);
            listaTacos.add(taco);
            System.out.println(taco);
            agregarTacoATablaPedidos();
            txtPrecioTotalPedido.setText(String.valueOf(calcularPrecioTotalPedido()));
            txtTacoMasCaro.setText(String.valueOf(calcularTacoMasCaro()));
            txtTacoMasEconomico.setText(String.valueOf(calcularTacoMasEconomico()));
            txtTacoPromedio.setText(String.valueOf(calcularTacoProm()));
            limpiarTablaIngredientesYCombos();

        } catch (SQLException ex) {
            Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmboxTortillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxTortillaActionPerformed
        
        if (cmboxTortilla.getSelectedIndex() != 0) {
            String nombreTortilla = cmboxTortilla.getSelectedItem().toString();
            Ingrediente ingredienteTortilla;
            try {
                ingredienteTortilla = obtenerIngredientePorNombre(nombreTortilla);
                agregarIngredienteALista(ingredienteTortilla);
                mostrarIngredientesEnTabla();

            } catch (SQLException ex) {
                Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_cmboxTortillaActionPerformed

    private void cmbAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlimentoActionPerformed
        if (cmbAlimento.getSelectedIndex() != 0) {
            String nombreAlimento = cmbAlimento.getSelectedItem().toString();
            Ingrediente ingredienteAlimento;
            try {
                ingredienteAlimento = obtenerIngredientePorNombre(nombreAlimento);
                agregarIngredienteALista(ingredienteAlimento);
                mostrarIngredientesEnTabla();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cmbAlimentoActionPerformed

    private void cmbSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalsaActionPerformed
        if (cmbSalsa.getSelectedIndex() != 0) {
            String nombreSalsa = cmbSalsa.getSelectedItem().toString();
            Ingrediente ingredienteSalsa;
            try {
                ingredienteSalsa = obtenerIngredientePorNombre(nombreSalsa);
                agregarIngredienteALista(ingredienteSalsa);
                mostrarIngredientesEnTabla();

            } catch (SQLException ex) {
                Logger.getLogger(VentanaPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }//GEN-LAST:event_cmbSalsaActionPerformed
    private void CargarComboXtipoIngrediente() throws SQLException {
        List<Ingrediente> listaIngredientes = controller.listarIngredientes();
        for (Ingrediente ingrediente : listaIngredientes) {
            TipoIngrediente tipoIngrediente = controller.buscarTipoIngredientePorId(ingrediente.getTipoIngrediente().getIdTipoIngrediente());
            if (tipoIngrediente != null) {
                String nombreIngrediente = ingrediente.getNombreIngrediente();
                if (nombreIngrediente != null && !nombreIngrediente.isEmpty()) {
                    switch (tipoIngrediente.getDetalle()) {
                        case "Salsa":
                            cmbSalsa.addItem(nombreIngrediente);
                            break;
                        case "Alimento":
                            cmbAlimento.addItem(nombreIngrediente);
                            break;
                        case "Tortilla":
                            cmboxTortilla.addItem(nombreIngrediente);
                            break;
                    }
                }
            }
        }
        cmbSalsa.insertItemAt("Seleccione una salsa", 0);
        cmbSalsa.setSelectedIndex(0);
        cmbAlimento.insertItemAt("Seleccione un alimento", 0);
        cmbAlimento.setSelectedIndex(0);
        cmboxTortilla.insertItemAt("Seleccione una tortilla", 0);
        cmboxTortilla.setSelectedIndex(0);
    }

    private void agregarIngredienteALista(Ingrediente ingrediente) {
        if (ingrediente != null) {
            ingredientesSeleccionados.add(ingrediente);
        }
    }

    private void mostrarIngredientesEnTabla() throws SQLException {
        DefaultTableModel tabla = (DefaultTableModel) tablaIng.getModel();
        tablaIng.setModel(tabla);

        tabla.setRowCount(0); // Limpiar la tabla

        for (Ingrediente ingrediente : ingredientesSeleccionados) {
            Object[] fila = new Object[2];
            fila[0] = ingrediente.getNombreIngrediente();
            fila[1] = controller.precioIng(ingrediente.getId());
            tabla.addRow(fila);
        }
    }

    private Ingrediente obtenerIngredientePorNombre(String nombre) throws SQLException {
        List<Ingrediente> listaIngredientes = controller.listarIngredientes();
        for (Ingrediente ingrediente : listaIngredientes) {
            if (ingrediente.getNombreIngrediente().equals(nombre)) {
                return ingrediente;
            }
        }
        return null;
    }

    private void agregarTacoATablaPedidos() {
        DefaultTableModel tabla = (DefaultTableModel) tablePedido.getModel();
        tablePedido.setModel(tabla);
        tabla.setRowCount(0); // Limpiar la tabla

        System.out.println(listaTacos.size());
        for (Taco taco : listaTacos) {
            System.out.println(taco);

            Object[] fila = new Object[3];
            fila[0] = taco.getNumeroTaco();
            fila[1] = obtenerNombresIngredientes(taco.getIngredientes());
            fila[2] = taco.getPrecioTotal();

            tabla.addRow(fila);
        }
    }

    
    private int calcularPrecioTotal() throws SQLException {
        int total = controllerT.calcularPrecioTotal(ingredientesSeleccionados);
        return total;
    }
     private int calcularPrecioTotalPedido() throws SQLException {
         int total = pedidoController.calcularPrecioTotalPedido(listaTacos);
        return total;
    }
     private int calcularTacoMasCaro(){
         int tacoMasCaro = pedidoController.calcularTacoMasCaro(listaTacos);
         return tacoMasCaro;
     }
     private int calcularTacoMasEconomico(){
         int tacoMasEco = pedidoController.calcularTacoMasEconomico(listaTacos);
         return tacoMasEco;
     }
     private double calcularTacoProm(){
         double tacoProm = pedidoController.calcularTacoPromedio(listaTacos);
         return tacoProm;
     }
    private String obtenerNombresIngredientes(List<Ingrediente> ingredientes) {
        StringBuilder nombres = new StringBuilder();
        for (Ingrediente ingrediente : ingredientes) {
            if (nombres.length() > 0) {
                nombres.append(", ");
            }
            nombres.append(ingrediente.getNombreIngrediente());
        }
        return nombres.toString();
    }

    private void limpiarTablaIngredientesYCombos() throws SQLException {
        cmbSalsa.setSelectedIndex(0);
        cmbAlimento.setSelectedIndex(0);
        cmboxTortilla.setSelectedIndex(0);
        ingredientesSeleccionados.clear();
        mostrarIngredientesEnTabla();
    }
     private void limpiarTablasYCombos() throws SQLException {
        cmbSalsa.setSelectedIndex(0);
        cmbAlimento.setSelectedIndex(0);
        cmboxTortilla.setSelectedIndex(0);
        ingredientesSeleccionados.clear();
        listaTacos.clear();
        mostrarIngredientesEnTabla();
        agregarTacoATablaPedidos();    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JComboBox<String> cmbAlimento;
    private javax.swing.JComboBox<String> cmbSalsa;
    private javax.swing.JComboBox<String> cmboxTortilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelTaco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNumeroTaco1;
    private javax.swing.JLabel lblNumeroTaco2;
    private javax.swing.JLabel lblNumeroTaco3;
    private javax.swing.JLabel lblNumeroTaco4;
    private javax.swing.JLabel lblTorilla;
    private javax.swing.JLabel lblTorilla1;
    private javax.swing.JTable tablaIng;
    private javax.swing.JTable tablePedido;
    private javax.swing.JTextField txtPrecioTotalPedido;
    private javax.swing.JTextField txtTacoMasCaro;
    private javax.swing.JTextField txtTacoMasEconomico;
    private javax.swing.JTextField txtTacoPromedio;
    // End of variables declaration//GEN-END:variables
}
