package View;

import Controllers.IngredienteController;
import Model.Ingrediente;
import Model.TipoIngrediente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaIngrediente extends javax.swing.JFrame {

    public VentanaIngrediente() throws SQLException {
        initComponents();
        cargarTabla();
        limpiarComponentes();
    }
    /**
     * Instancia la controladora de Ingrediente (que contiene tipoIngrediente e
     * ingrediente).
     */
    IngredienteController controller = new IngredienteController();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        lblNombreIngrediente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPrecioIngrediente = new javax.swing.JLabel();
        txtIngrediente = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cmbTipoIng = new javax.swing.JComboBox<>();
        panelDatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableIng = new javax.swing.JTable();
        panelBotones = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingredientes");
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(getIconImage());
        setName("VentanaIngredientes"); // NOI18N
        setSize(new java.awt.Dimension(0, 0));

        lblNombreIngrediente.setBackground(new java.awt.Color(204, 204, 255));
        lblNombreIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Ingredientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N
        lblNombreIngrediente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Ingrediente:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        lblPrecioIngrediente.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecioIngrediente.setText("Precio");

        txtIngrediente.setBackground(new java.awt.Color(204, 255, 204));

        txtPrecio.setBackground(new java.awt.Color(204, 255, 204));

        cmbTipoIng.setBackground(new java.awt.Color(204, 255, 204));
        cmbTipoIng.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTipoIng.setToolTipText("Elige el tipo de ingrediente");
        cmbTipoIng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbTipoIng.setFocusTraversalPolicyProvider(true);
        cmbTipoIng.setInheritsPopupMenu(true);
        cmbTipoIng.setName("Tipo de Ingredientes"); // NOI18N

        javax.swing.GroupLayout lblNombreIngredienteLayout = new javax.swing.GroupLayout(lblNombreIngrediente);
        lblNombreIngrediente.setLayout(lblNombreIngredienteLayout);
        lblNombreIngredienteLayout.setHorizontalGroup(
            lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNombreIngredienteLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblPrecioIngrediente)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIngrediente)
                    .addGroup(lblNombreIngredienteLayout.createSequentialGroup()
                        .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoIng, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 383, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lblNombreIngredienteLayout.setVerticalGroup(
            lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNombreIngredienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(lblNombreIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecioIngrediente)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        cmbTipoIng.getAccessibleContext().setAccessibleName("Tipos de Ingredientes");

        panelDatos.setBackground(new java.awt.Color(153, 204, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Lista de Ingredientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        tableIng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO INGREDEINTE", "NOMBRE DEL INGREDIENTE", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(tableIng);

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setBackground(new java.awt.Color(204, 204, 255));
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/pngwing.com (1).png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/pngwing.com (2).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/pngwing.com.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 51), null));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/ok.png"))); // NOI18N
        btnGuardar.setText("OK");
        btnGuardar.setToolTipText("Para guardar los datos cargados.");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setText("Volver al Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblNombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton1))
        );

        lblNombreIngrediente.getAccessibleContext().setAccessibleName("Datos");
        lblNombreIngrediente.getAccessibleContext().setAccessibleDescription("");
        panelDatos.getAccessibleContext().setAccessibleDescription("Lista de Ingredientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * accion del boton guardar. Llama al metodo llenar camboBox y habilita los
     * campos. Llama al método guardar de la controladora.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      
        String nombre = this.txtIngrediente.getText().trim();
        int precio = Integer.parseInt(this.txtPrecio.getText());
        String tipoIing = cmbTipoIng.getSelectedItem().toString();
        int pos = tipoIing.indexOf(" -");
        int i = Integer.parseInt(tipoIing.substring(0, pos));

        try {
            controller.guardarIngrediente(nombre, precio, i);
            cargarTabla();
            limpiarComponentes();
            JOptionPane.showMessageDialog(null, "El ingrediente fue guardado correctamente.");
           
        } catch (SQLException ex) {
            Logger.getLogger(VentanaIngrediente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * Accion del botón agregar. Llama al metodo llenar camboBox y habilita los
     * campos.
     */

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            llenarTipoIngr();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaIngrediente.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitarComponentes();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.btnGuardar.setEnabled(true);
        this.btnAgregar.setEnabled(false);
        this.btnEditar.setEnabled(false);
        
        int fila = tableIng.getSelectedRow();
        if (fila >= 0) {
        
        // Obtener el id y nombre del ingrediente seleccionado en la tabla.
            int idIngrediente = (int) tableIng.getValueAt(fila,0 );
            String nombreIng = tableIng.getValueAt(fila, 2).toString();
        
        // Cuadro de diálogo para confirmar la eliminación.
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el ingrediente: " + nombreIng + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                    try {
                        // Se llama al método para eliminar el ingrediente Por id de la controladora 
                        controller.eliminarIngrediente(idIngrediente);
                    } catch (Exception ex) {
                        Logger.getLogger(VentanaIngrediente.class.getName()).log(Level.SEVERE, null, ex);
                    }

                // Luego de eliminar, actualiza la tabla 

                DefaultTableModel model = (DefaultTableModel) tableIng.getModel();
                model.removeRow(fila);
                limpiarComponentes();

                JOptionPane.showMessageDialog(null, "Ingrediente eliminado correctamente.");
            }
        } else {
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningún ingrediente para eliminar.");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.btnAgregar.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        
        

        int fila = tableIng.getSelectedRow();
        String tIng, nombre, precio;
        if (fila >= 0) {
            try {
                tIng = tableIng.getValueAt(fila, 1).toString();
                System.out.println(tIng);
                nombre = tableIng.getValueAt(fila, 2).toString();
                precio = tableIng.getValueAt(fila, 3).toString();
                
                txtIngrediente.setText(nombre);
                txtPrecio.setText(precio);
                cmbTipoIng.setSelectedItem(tIng);
                llenarTipoIngr();
                habilitarComponentes();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaIngrediente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun ingrediente");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();     
        VentanaInicio ventanaInicio = new VentanaInicio();
        ventanaInicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * método llenar campos que trae de la base de datos los tipos de
     * ingredientes cargados para mostar en el comboBox
     */
    private void llenarTipoIngr() throws SQLException {
        List<TipoIngrediente> listaTipoIngr = controller.listarTipoIngrediente();
        cmbTipoIng.removeAllItems();

        for (int i = 0; i < listaTipoIngr.size(); i++) {
            cmbTipoIng.addItem(listaTipoIngr.get(i).getIdTipoIngrediente() + " - " + listaTipoIngr.get(i).getDetalle());
        }
    }

    /**
     * Método para llenar la tabla con los ingredientes cargados. Pero no me devuelve los datos en la vista, no encuentro en qué está el error.
     */
    private void cargarTabla() throws SQLException {
        DefaultTableModel tabla = (DefaultTableModel) tableIng.getModel();
        tableIng.setModel(tabla);
        tabla.setRowCount(0); // Limpiar la tabla

        ArrayList<Ingrediente> lista = (ArrayList<Ingrediente>) controller.listarIngredientes();
        System.out.println(lista.size());
        for (Ingrediente i : lista) {
            System.out.println(i);
            Object[] fila = new Object[4];
            fila[0] = i.getId();
            fila[1] = i.getTipoIngrediente();
            fila[2] = i.getNombreIngrediente();
            fila[3] = i.getPrecio();
            
            tabla.addRow(fila);
        }
        tableIng.setModel(tabla);
    }

    /**
     * Método limpiar componentes y deshabilitar botón guardar y los text de
     * ingrediente y precio.
     */
    private void limpiarComponentes() {
        this.txtIngrediente.setText("");
        this.txtPrecio.setText("");
        this.btnGuardar.setEnabled(false);
        this.txtIngrediente.setEnabled(false);
        this.txtPrecio.setEnabled(false);
        this.btnAgregar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.cmbTipoIng.setEnabled(false);
        cmbTipoIng.insertItemAt("Seleccione tipo Ingrediente", 0);
        cmbTipoIng.setSelectedIndex(0);
       
    }

    /**
     * Métodos para habilitar los componentes.
     */
    private void habilitarComponentes() {
        this.txtIngrediente.setEnabled(true);
        this.txtPrecio.setEnabled(true);
        this.cmbTipoIng.setEnabled(true);
         cmbTipoIng.insertItemAt("Seleccione tipo Ingrediente", 0);
         cmbTipoIng.setSelectedIndex(0);
        this.btnGuardar.setEnabled(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbTipoIng;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel lblNombreIngrediente;
    private javax.swing.JLabel lblPrecioIngrediente;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTable tableIng;
    private javax.swing.JTextField txtIngrediente;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
