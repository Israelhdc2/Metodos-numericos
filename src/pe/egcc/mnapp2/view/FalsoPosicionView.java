
package pe.egcc.mnapp2.view;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pe.egcc.mnapp2.service.MyMath;

public class FalsoPosicionView extends javax.swing.JInternalFrame {

    public FalsoPosicionView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Intervalo1 = new javax.swing.JTextField();
        Intervalor2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Error = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Método falso posición");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Falso posición");

        Intervalo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        Intervalor2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("Error");

        Error.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "i", "a", "b", "Xi", "f(a) ", "f(b) ", "f(Xi) ", "f(a)*f(Xi) ", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jLabel1.setText("Intervalo");

        jLabel2.setText("Función");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Intervalor2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Intervalo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Intervalor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Error, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        
        try{
            String F = txtFuncion.getText();
            //double a[] = new double[20];
            ArrayList<Double> a = new ArrayList<>();
            //double b[] = new double[20];
            ArrayList<Double> b = new ArrayList<>();
            //double xi[] = new double[20];
            ArrayList<Double> xi = new ArrayList<>();
            //double fa[] = new double[20];
            ArrayList<Double> fa = new ArrayList<>();
            //double fb[] = new double[20];
            ArrayList<Double> fb = new ArrayList<>();
            //double fx[] = new double[20];
            ArrayList<Double> fx = new ArrayList<>();
            //double fe[] = new double[20];
            ArrayList<Double> fe = new ArrayList<>();
            boolean salida = false;
            double x = Double.parseDouble(Intervalo1.getText());
            double y = Double.parseDouble(Intervalor2.getText());
            numeros(x, y);
            double IngresaError = Double.parseDouble(Error.getText());
            int i=0;
            //a[i] = x;
            a.add(i, x);
            //b[i] = y;
            b.add(i, y);
            //fe[i] = 0;
            fe.add(i, 0.0);
            MyMath math = new MyMath(F);
            //fa[i] = math.evaluar(a[i]);
            fa.add(i, math.evaluar(a.get(i)));
            //fb[i] = math.evaluar(b[i]);
            fb.add(math.evaluar(b.get(i)));
            //xi[i] = math.mediaf_p(fa[i], fb[i], a[i], b[i]);
            xi.add(i, math.mediaf_p(fa.get(i), fb.get(i), a.get(i), b.get(i)));
            //fx[i] = math.evaluar(xi[i]);
            fx.add(i, math.evaluar(xi.get(i)));
            do {
                if (fa.get(i)*fx.get(i) > 0) {
                    //a[i+1] = xi[i];
                    a.add(i+1, xi.get(i));
                    //b[i+1] = b[i];
                    b.add(i+1, b.get(i));
                }
                else if (fa.get(i)*fx.get(i) < 0) {
                    //b[i+1] = xi[i];
                    b.add(i+1, xi.get(i));
                    //a[i+1] = a[i];
                    a.add(i+1, a.get(i));
                }
                else if (fa.get(i)*fx.get(i) == 0) {
                    
                    b.add(i+1, b.get(i));
                    
                    a.add(i+1, a.get(i));
                }
                //fa[i+1] = math.evaluar(a[i+1]);
                fa.add(i+1, math.evaluar(a.get(i+1)));
                //fb[i+1] = math.evaluar(b[i+1]);
                fb.add(i+1, math.evaluar(b.get(i+1)));
                //xi[i+1] = math.mediaf_p(fa[i+1], fb[i+1], a[i+1], b[i+1]);
                xi.add(i+1, math.mediaf_p(fa.get(i+1), fb.get(i+1), a.get(i+1), b.get(i+1)));
                //fx[i+1] = math.evaluar(xi[i+1]);
                fx.add(i+1, math.evaluar(xi.get(i+1)));
                //fe[i+1] = math.calErrorf_p(xi[i+1], xi[i]);
                fe.add(i+1, math.calErrorf_p(xi.get(i+1), xi.get(i)));
                if (fe.get(i+1) < IngresaError) {
                    salida = true;
                }
                i++;
            } while (salida == false);
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            tabla.setRowCount(0);
            for (int j = 0; j < a.size()-1; j++) {
                //Object[] m = {j, a[j], b[j], xi[j], fa[j], fb[j], fx[j], fa[j]*fx[j], fe[j]};
                Object[] m = {j, a.get(j), b.get(j), xi.get(j), fa.get(j), fb.get(j), fx.get(j), fa.get(j)*fx.get(j), fe.get(j)};
                tabla.addRow(m);
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
        Intervalor2.setText("");
        Error.setText("");
        txtFuncion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void numeros(double x, double y) throws Rango{
        if(x > y){
            throw new Rango("Error. Limite inferior mayor que el superior");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Error;
    private javax.swing.JTextField Intervalo1;
    private javax.swing.JTextField Intervalor2;
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
