
package pe.egcc.mnapp2.view;

import javax.swing.JInternalFrame;

public class NewMDIApplication extends javax.swing.JFrame {

    public NewMDIApplication() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    private final int biseccion = 1;
    private final int falso = 2;
    private final int secante = 3;
    private final int newton = 4;
    private final int punto = 5;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnBiseccion = new javax.swing.JButton();
        btnFalsoPosicion = new javax.swing.JButton();
        btnSecante = new javax.swing.JButton();
        btnNewton = new javax.swing.JButton();
        btnPuntoFijo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnSalir = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuBiseccion = new javax.swing.JMenuItem();
        menuFalsoPosicion = new javax.swing.JMenuItem();
        menuSecante = new javax.swing.JMenuItem();
        menuNewton = new javax.swing.JMenuItem();
        menuPuntoFijo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Métodos numéricos");

        jToolBar1.setRollover(true);

        btnBiseccion.setText("Bisección");
        btnBiseccion.setToolTipText("Metodo Biseccion");
        btnBiseccion.setFocusable(false);
        btnBiseccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBiseccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiseccionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBiseccion);

        btnFalsoPosicion.setText("Falso posición");
        btnFalsoPosicion.setToolTipText("Metodo Falso Posicion");
        btnFalsoPosicion.setFocusable(false);
        btnFalsoPosicion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFalsoPosicion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFalsoPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFalsoPosicionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFalsoPosicion);

        btnSecante.setText("Secante");
        btnSecante.setToolTipText("Metodo de la Secante");
        btnSecante.setFocusable(false);
        btnSecante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSecante.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecanteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSecante);

        btnNewton.setText("Newton");
        btnNewton.setToolTipText("Metodo de Newton");
        btnNewton.setFocusable(false);
        btnNewton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewtonActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNewton);

        btnPuntoFijo.setText("Punto fijo");
        btnPuntoFijo.setToolTipText("Metodo de punto fijo");
        btnPuntoFijo.setFocusable(false);
        btnPuntoFijo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPuntoFijo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoFijoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPuntoFijo);
        jToolBar1.add(jSeparator1);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/egcc/mnapp2/img/door2.png"))); // NOI18N
        btnSalir.setToolTipText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        jMenu1.setText("Inicio");

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        menuBar.add(jMenu1);

        jMenu2.setText("Metodos");

        menuBiseccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuBiseccion.setText("Biseccion");
        menuBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBiseccionActionPerformed(evt);
            }
        });
        jMenu2.add(menuBiseccion);

        menuFalsoPosicion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuFalsoPosicion.setText("Falso posicion");
        menuFalsoPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFalsoPosicionActionPerformed(evt);
            }
        });
        jMenu2.add(menuFalsoPosicion);

        menuSecante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSecante.setText("Secante");
        menuSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSecanteActionPerformed(evt);
            }
        });
        jMenu2.add(menuSecante);

        menuNewton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNewton.setText("Newton");
        menuNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewtonActionPerformed(evt);
            }
        });
        jMenu2.add(menuNewton);

        menuPuntoFijo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPuntoFijo.setText("Punto fijo");
        menuPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPuntoFijoActionPerformed(evt);
            }
        });
        jMenu2.add(menuPuntoFijo);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBiseccionActionPerformed
        cargar(biseccion);
    }//GEN-LAST:event_menuBiseccionActionPerformed

    private void menuFalsoPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFalsoPosicionActionPerformed
        cargar(falso);
    }//GEN-LAST:event_menuFalsoPosicionActionPerformed

    private void menuSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSecanteActionPerformed
        cargar(secante);
    }//GEN-LAST:event_menuSecanteActionPerformed

    private void btnBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiseccionActionPerformed
        cargar(biseccion);
    }//GEN-LAST:event_btnBiseccionActionPerformed

    private void btnFalsoPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFalsoPosicionActionPerformed
        cargar(falso);
    }//GEN-LAST:event_btnFalsoPosicionActionPerformed

    private void btnSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecanteActionPerformed
        cargar(secante);
    }//GEN-LAST:event_btnSecanteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewtonActionPerformed
        cargar(newton);
    }//GEN-LAST:event_btnNewtonActionPerformed

    private void menuNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewtonActionPerformed
        cargar(newton);
    }//GEN-LAST:event_menuNewtonActionPerformed

    private void menuPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPuntoFijoActionPerformed
        cargar(punto);
    }//GEN-LAST:event_menuPuntoFijoActionPerformed

    private void btnPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoFijoActionPerformed
        cargar(punto);
    }//GEN-LAST:event_btnPuntoFijoActionPerformed
    
    private void cargar(int op){
        switch(op){
            case biseccion:{
                mostrar(BiseccionView.class);
                break;
            }
            case falso:{
                mostrar(FalsoPosicionView.class);
                break;
            }
            case secante:{
                mostrar(SecanteView.class);
                break;
            }
            case newton:{
                mostrar(NewtonView.class);
                break;
            }
            case punto:{
                mostrar(PuntoFijoView.class);
                break;
            }
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMDIApplication().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiseccion;
    private javax.swing.JButton btnFalsoPosicion;
    private javax.swing.JButton btnNewton;
    private javax.swing.JButton btnPuntoFijo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSecante;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBiseccion;
    private javax.swing.JMenuItem menuFalsoPosicion;
    private javax.swing.JMenuItem menuNewton;
    private javax.swing.JMenuItem menuPuntoFijo;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenuItem menuSecante;
    // End of variables declaration//GEN-END:variables

    private void mostrar(Class<?> aClass) {
        
        try {
            JInternalFrame view = null;
            for(JInternalFrame form:desktopPane.getAllFrames()){
                if (aClass.isInstance(form)) {
                    view = form;
                    break;
                }
            }
            if (view == null) {
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                desktopPane.add(view);
                view.setVisible(true);
            }
            view.setSelected(true);
        } catch (Exception e) {
        }
    }
  
}
