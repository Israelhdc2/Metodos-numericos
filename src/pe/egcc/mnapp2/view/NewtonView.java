
package pe.egcc.mnapp2.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pe.egcc.mnapp2.service.MyMath;

public class NewtonView extends javax.swing.JInternalFrame {

    public NewtonView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDerivada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Intervalo1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Intervalo2 = new javax.swing.JTextField();
        Error = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Método de newton");

        jLabel3.setText("Error");

        Intervalo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "i", "Xi", "f(Xi) ", "f '(Xi)", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Intervalo2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Intervalo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intervalo2ActionPerformed(evt);
            }
        });

        Error.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("Función");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Metodo de newton");

        jLabel5.setText("Derivada");

        jLabel2.setText("Intervalo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(Intervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDerivada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Intervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtDerivada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar)
                    .addComponent(btnLimpiar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Intervalo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intervalo2ActionPerformed
       
    }//GEN-LAST:event_Intervalo2ActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        try{
            Double x = Double.parseDouble(Intervalo1.getText());
            Double y = Double.parseDouble(Intervalo2.getText());
            numeros(x, y);
            Double errorIngresado = Double.parseDouble(Error.getText());
            //double Xi[] = new double[17];
            ArrayList<Double> Xi = new ArrayList<>();
            //double fXi[] = new double[17];
            ArrayList<Double> fXi = new ArrayList<>();
            //double fXi2[] = new double[17];
            ArrayList<Double> fXi2 = new ArrayList<>();
            //double fe[] = new double[17];
            ArrayList<Double> fe = new ArrayList<>();

            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            boolean salir=false;

            String F = txtFuncion.getText();
            MyMath fs = new MyMath(F);
            String der = fs.derivar(F);
            txtDerivada.setText(der);

            String F2 = txtDerivada.getText();

            MyMath fs2 = new MyMath(F2);

            int i=2;
            //Xi[0] = x;
            Xi.add(0, x);
            //Xi[1] = y;
            Xi.add(1, y);
            //fXi[0] = fs.evaluar(Xi[0]);
            fXi.add(0, fs.evaluar(Xi.get(0)));
            //fXi[1] = fs.evaluar(Xi[1]);
            fXi.add(1, fs.evaluar(Xi.get(1)));
            //fXi2[0] = fs2.evaluar(Xi[0]);
            fXi2.add(0, fs2.evaluar(Xi.get(0)));
            //fXi2[1] = fs2.evaluar(Xi[1]);
            fXi2.add(1, fs2.evaluar(Xi.get(1)));
            //fe[0] = 0;
            fe.add(0, 0.0);
            //fe[1] = 0;
            fe.add(1, 0.0);
        
            do {
                //Xi[i] = fs.procesarx(fXi[i-1], fXi2[i-1], Xi[i-1]);
                Xi.add(i, fs.procesarx(fXi.get(i-1), fXi2.get(i-1), Xi.get(i-1)));
                //fXi[i] = fs.evaluar(Xi[i]);
                fXi.add(i, fs.evaluar(Xi.get(i)));
                //fXi2[i] = fs2.evaluar(Xi[i]);
                fXi2.add(i, fs2.evaluar(Xi.get(i)));
                //fe[i] = fs.calError(Xi[i], Xi[i-1]);
                fe.add(i, fs.calError(Xi.get(i), Xi.get(i-1)));
                if (fe.get(i) < errorIngresado) {
                    salir = true;
                }
                i++;
            } while (salir==false);
            tabla.setRowCount(0);
            for (int j = 0; j < Xi.size(); j++) {
                //Object[] o={j, Xi[j], fXi[j], fXi2[j], fe[j]};
                Object[] o = {j, Xi.get(j), fXi.get(j), fXi2.get(j), fe.get(j)};
                tabla.addRow(o);
            }
        }catch(NumberFormatException n){
            System.out.println(n.getMessage());
        }catch(Rango r){
            System.out.println(r.getMessage());
        }catch(OutOfMemoryError o){
            System.out.println(o.getMessage());
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDerivada.setText("");
        txtFuncion.setText("");
        Intervalo1.setText("");
        Intervalo2.setText("");
        Error.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void numeros(double x, double y) throws Rango{
        if(x > y){
            throw new Rango("Error. Limite inferior mayor que el superior");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Error;
    private javax.swing.JTextField Intervalo1;
    private javax.swing.JTextField Intervalo2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDerivada;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}
