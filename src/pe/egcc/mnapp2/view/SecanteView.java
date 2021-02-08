
package pe.egcc.mnapp2.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pe.egcc.mnapp2.service.MyMath;

public class SecanteView extends javax.swing.JInternalFrame {

    public SecanteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Intervalo1 = new javax.swing.JTextField();
        Intervalo2 = new javax.swing.JTextField();
        Error = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Método Secante");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Método de la secante");

        jLabel2.setText("Intervalo");

        jLabel3.setText("Error");

        Intervalo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Intervalo2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Intervalo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intervalo2ActionPerformed(evt);
            }
        });

        Error.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "i", "Xi", "f(Xi) ", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel4.setText("Función");

        txtFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Intervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Intervalo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intervalo2ActionPerformed
    
    }//GEN-LAST:event_Intervalo2ActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        try{
            String F = txtFuncion.getText();
            Double x = Double.parseDouble(Intervalo1.getText());
            Double y = Double.parseDouble(Intervalo2.getText());
            numeros(x, y);
            Double errorIngresado = Double.parseDouble(Error.getText());
            //double Xi[] = new double[20];
            ArrayList<Double> Xi = new ArrayList<>();
            //double fXi[] = new double[20];
            ArrayList<Double> fXi = new ArrayList<>();
            //double fe[] = new double[20];
            ArrayList<Double> fe = new ArrayList<>();
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();

            boolean salir=false;
            MyMath math = new MyMath(F);
            int i=2;
            //Xi[0] = x;
            Xi.add(0, x);
            //Xi[1] = y;
            Xi.add(1, y);
            //fXi[0] = math.evaluar(Xi[0]);
            fXi.add(0, math.evaluar(Xi.get(0)));
            //fXi[1] = math.evaluar(Xi[1]);
            fXi.add(1, math.evaluar(Xi.get(1)));
            //fe[0] = 0;
            fe.add(0, 0.0);
            //fe[1] = 0;
            fe.add(1, 0.0);
        
            do {
                //Xi[i] = math.procesarx_sec(fXi[i-1], fXi[i-2], Xi[i-1], Xi[i-2]);
                
                Xi.add(i, math.procesarx_sec(fXi.get(i-1), fXi.get(i-2), Xi.get(i-1), Xi.get(i-2)));
                
                //fXi[i] = math.evaluar(Xi[i]);
                fXi.add(i, math.evaluar(Xi.get(i)));
                //fe[i] = math.calErrorsec(Xi[i], Xi[i-1]);
                fe.add(i, math.calErrorsec(Xi.get(i), Xi.get(i-1)));
                if (fe.get(i) < errorIngresado) {
                    salir = true;
                }

                i++;
            } while (salir==false);
            tabla.setRowCount(0);
            for (int j = 0; j < Xi.size(); j++) {
                //Object[] o={j-1, Xi[j], fXi[j], fe[j]};
                Object[] o = {j-1, Xi.get(j), fXi.get(j), fe.get(j)};
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
        Intervalo1.setText("");
        Intervalo2.setText("");
        Error.setText("");
        txtFuncion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionActionPerformed
 
    }//GEN-LAST:event_txtFuncionActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}
