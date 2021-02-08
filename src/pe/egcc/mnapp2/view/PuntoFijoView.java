
package pe.egcc.mnapp2.view;

import javax.swing.table.DefaultTableModel;
import pe.egcc.mnapp2.service.MyMath;

public class PuntoFijoView extends javax.swing.JInternalFrame {

    public PuntoFijoView() {
        initComponents();
        txtDeri1.setEnabled(false);
        txtDeri2.setEnabled(false);
        txtDesp1.setEnabled(false);
        txtDesp2.setEnabled(false);
        txtFuncion.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        txtFuncion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDesp2 = new javax.swing.JTextField();
        txtDeri2 = new javax.swing.JTextField();
        txtDesp1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtDeri1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Método punto fijo");

        jLabel6.setText("Derivada");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "i", "Xi", "G", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "x", "f(x)"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setText("Función");

        jLabel3.setText("Despeje 1");

        jLabel4.setText("Despeje 2");

        jLabel5.setText("Derivada");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Método Punto Fijo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(23, 23, 23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(146, 146, 146)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDesp2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDeri2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(43, 43, 43)
                                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDeri1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDesp1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 304, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtDesp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtDesp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtDeri1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtDeri2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(btnProcesar)
                            .addGap(11, 11, 11))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        double i=-5;
        int j=0;
        double g1=0, g2=0;
        boolean salir=false;
        double f[] = new double[20];

        String func = "x^3 + x - 6";
        MyMath funcion = new MyMath(func);
        txtFuncion.setText(func);

        String despeje1 = "(6-x)^(1/3)";
        txtDesp1.setText(despeje1);
        MyMath desp1 = new MyMath(despeje1);
        String r1 = desp1.derivar(despeje1);
        txtDeri1.setText(r1);
        MyMath Operaderi1 = new MyMath(r1);

        String despeje2 = "6 - x^3";
        txtDesp2.setText(despeje2);
        MyMath dep2 = new MyMath(despeje2);
        String r2 = dep2.derivar(despeje2);
        txtDeri2.setText(r2);
        MyMath Operaderi2 = new MyMath(r2);

        DefaultTableModel tabla2 = (DefaultTableModel) jTable2.getModel();

        do{
            f[j] = funcion.evaluar(i);
            f[j+1] = funcion.evaluar(i+1);
            if (f[j] < 0 && f[j+1] > 0) {
                salir = true;
                g1 = i;
                g2 = i+1;
            }
            i++;
            j++;
        }while(salir==false);
        i=-5;
        tabla2.setRowCount(0);
        for (int k = 0; k <= j; k++) {
            Object o[] = {i+k, f[k]};
            tabla2.addRow(o);
        }

        double media = funcion.medio(g1, g2);
        double apto1 = Operaderi1.evaluar(funcion.medio(g1, g2));
        double apto2 = Operaderi2.evaluar(funcion.medio(g1, g2));

        int procesar=0 ;

        if (apto1 < 1 && apto1 > -1) {
            procesar = 1;
        }
        else if (apto2 < 1 && apto2 > -1) {
            procesar = 2;
        }

        double Xi[] = new double[20];
        double Gi[] = new double[20];
        double e[] = new double[20];
        int cont=1;
        boolean salir2 = false;
        e[0] = 0;

        if (procesar == 1) {

            Xi[0] = media;
            Gi[0] = desp1.evaluar(Xi[0]);
            do{
                Xi[cont] = Gi[cont-1];
                Gi[cont] = desp1.evaluar(Xi[cont]);
                if (Xi[cont] == Gi[cont]) {
                    salir2 = true;
                }

                e[cont] = Gi[cont] - Gi[cont-1];
                cont++;

            }while(salir2 == false);
            DefaultTableModel tabla1 = (DefaultTableModel) jTable1.getModel();
            for (int k = 0; k < cont; k++) {
                Object o[] = {k, Xi[k], Gi[k], e[k]};
                tabla1.addRow(o);
            }

        }
        else if (procesar == 2) {

            Xi[0] = media;
            Gi[0] = dep2.evaluar(Xi[0]);
            do{
                Xi[cont] = Gi[cont-1];
                Gi[cont] = dep2.evaluar(Xi[cont]);
                if (Xi[cont] == Gi[cont]) {
                    salir2 = true;
                }
                e[cont] = Gi[cont] - Gi[cont-1];
                cont++;
            }while(salir2 == false);
            DefaultTableModel tabla1 = (DefaultTableModel) jTable1.getModel();
            for (int k = 0; k <= cont; k++) {
                Object o[] = {k, Xi[k], Gi[k], e[k]};
                tabla1.addRow(o);
            }

        }
    }//GEN-LAST:event_btnProcesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtDeri1;
    private javax.swing.JTextField txtDeri2;
    private javax.swing.JTextField txtDesp1;
    private javax.swing.JTextField txtDesp2;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}
