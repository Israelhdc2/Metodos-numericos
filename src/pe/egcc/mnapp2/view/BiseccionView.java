
package pe.egcc.mnapp2.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.mnapp2.service.MyMath;

public class BiseccionView extends javax.swing.JInternalFrame {

    public BiseccionView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        primerintervalo = new javax.swing.JTextField();
        segundointervalo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnProcesar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bisección");

        errorfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Bisección");

        jLabel2.setText("Intervalo");

        primerintervalo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        segundointervalo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "i", "a", "b", "m", "f(a)", "f(b)  ", "f(m)  ", "f(a)*f(m)", "Error"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jLabel3.setText("Error");

        jLabel4.setText("Función");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(primerintervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(segundointervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(errorfield))
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(primerintervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(segundointervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(errorfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        try{
            String F = txtFuncion.getText();
            ArrayList<Double> a = new ArrayList<>();
            //double a[] = new double[200];
            ArrayList<Double> b = new ArrayList<>();
            //double b[] = new double[200];
            ArrayList<Double> m = new ArrayList<>();
            //double m[] = new double[200];
            ArrayList<Double> fa = new ArrayList<>();
            //double fa[] = new double[200];
            ArrayList<Double> fb = new ArrayList<>();
            //double fb[] = new double[200];
            ArrayList<Double> fm = new ArrayList<>();
            //double fm[] = new double[200];
            ArrayList<Double> fe = new ArrayList<>();
            //double fe[] = new double[200];
            double x=0,y=0, errorIngresa=0;
            x = Double.parseDouble(primerintervalo.getText());
            y = Double.parseDouble(segundointervalo.getText());
            numeros(x, y);
            errorIngresa = Double.parseDouble(errorfield.getText());
            boolean salir;
            salir = false;
            MyMath math = new MyMath(F);
            DefaultTableModel d = (DefaultTableModel) tabla.getModel();
            //a[0] = x;
            a.add(0, x);
            //b[0] = y;
            b.add(0, y);
            //m[0] = math.mediabis(x, y);
            m.add(0, math.mediabis(x, y));
            int i=0;
            fe.add(0, 0.0);
            do {
                //fa[i] = math.evaluar(a[i]);
                fa.add(i, math.evaluar(a.get(i)));
                //fb[i] = math.evaluar(b[i]);
                fb.add(i, math.evaluar(b.get(i)));
                //fm[i] = math.evaluar(m[i]);
                fm.add(i, math.evaluar(m.get(i)));
                //if(fa[i]*fm[i])
                if (fa.get(i)*fm.get(i) > 0) {
                    //a[i+1]= m[i];
                    a.add(i+1, m.get(i));
                    //b[i+1] = b[i];
                    b.add(i+1, b.get(i));
                }
                //else if(fa[i]*fm[i]<0)
                else if(fa.get(i)*fm.get(i)<0){
                    //b[i+1] = m[i];
                    b.add(i+1, m.get(i));
                    //a[i+1] = a[i];
                    a.add(i+1, a.get(i));
                }
                else if(fa.get(i)*fm.get(i) == 0){
                    b.add(i+1, b.get(i));
                    a.add(i+1, a.get(i));
                }
                //m[i+1] = math.mediabis(a[i+1], b[i+1]);
                m.add(i+1, math.mediabis(a.get(i+1), b.get(i+1)));
                //fe[i+1] = math.calErrorbis(m[i+1], m[i]));
                fe.add(i+1, math.calErrorbis(m.get(i+1), m.get(i)));
                //if(fe[i+1] < errorIngresa)
                if (fe.get(i+1) < errorIngresa) {
                    salir = true;
                }
                i++;
            }while(salir==false);
            d.setRowCount(0);
            for (int j=0; j < a.size()-1; j++) {
                //Object[] fila = {j, a[j], b[j], m[j], fa[j], fb[j], fm[j], fa[j]*fm[j], fe[j]};
                Object[] fila = {j, a.get(j), b.get(j), m.get(j), fa.get(j), fb.get(j), fm.get(j), fa.get(j)*fm.get(j), fe.get(j)};
                d.addRow(fila);
            }       
        }catch(NumberFormatException n){
            System.out.println("no se ingresa texto");
        }catch(Rango r){
            System.out.println(r.getMessage());
        }catch(OutOfMemoryError o){
            System.out.println(o.getMessage());
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        primerintervalo.setText("");
        segundointervalo.setText("");
        errorfield.setText("");
        txtFuncion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void numeros(double x, double y) throws Rango{
        if(x > y){
            throw new Rango("Error. Limite inferior mayor que el superior");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JTextField errorfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField primerintervalo;
    private javax.swing.JTextField segundointervalo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFuncion;
    // End of variables declaration//GEN-END:variables
}
class Rango extends Exception{
    public Rango(String n){
        super(n);
    }
}