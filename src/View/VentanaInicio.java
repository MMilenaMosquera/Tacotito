
package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public final class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio()  {
        initComponents();
    }
    
      
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelinicio = new javax.swing.JPanel();
        TiTulo = new javax.swing.JLabel();
        LogoTaco = new javax.swing.JLabel();
        btnNuevoPedido = new javax.swing.JButton();
        btnListaIngredientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TiTulo.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        TiTulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TiTulo.setText("TACOTITO'S FOOD TRUCK ");

        LogoTaco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tacotito/Recursos/INICIO.png"))); // NOI18N

        btnNuevoPedido.setText("NUEVO PEDIDO");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        btnListaIngredientes.setText("LISTA DE INGREDIENTES ");
        btnListaIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaIngredientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelinicioLayout = new javax.swing.GroupLayout(Panelinicio);
        Panelinicio.setLayout(PanelinicioLayout);
        PanelinicioLayout.setHorizontalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelinicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaIngredientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoTaco, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(TiTulo, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );
        PanelinicioLayout.setVerticalGroup(
            PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelinicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TiTulo)
                .addGroup(PanelinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LogoTaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelinicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoPedido)
                        .addGap(18, 18, 18)
                        .addComponent(btnListaIngredientes)
                        .addGap(73, 73, 73))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(Panelinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        VentanaPedido vntPedido = null;
        try {
          vntPedido = new VentanaPedido();
           
        } catch (SQLException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        vntPedido.setVisible(true);
        vntPedido.setLocationRelativeTo(null);
        this.dispose();        
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnListaIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaIngredientesActionPerformed
       VentanaIngrediente vntIngr = null;
        try {
            vntIngr = new VentanaIngrediente();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       vntIngr.setVisible(true);
       vntIngr.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_btnListaIngredientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoTaco;
    public javax.swing.JPanel Panelinicio;
    private javax.swing.JLabel TiTulo;
    private javax.swing.JButton btnListaIngredientes;
    private javax.swing.JButton btnNuevoPedido;
    // End of variables declaration//GEN-END:variables

    
}
