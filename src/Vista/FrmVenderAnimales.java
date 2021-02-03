/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import imagenes.NewJPanel;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amairani
 */
public class FrmVenderAnimales extends javax.swing.JFrame {

    /**
     * Creates new form FrmVenderAlimento
     */
    public FrmVenderAnimales() {
        initComponents();
                //this.setLocationRelativeTo(null);
                this.setExtendedState(MAXIMIZED_BOTH);
                NewJPanel panel=new NewJPanel();
        this.add(panel,BorderLayout.CENTER);
        this.pack();
        iniciar();
    }
        public void iniciar()
    {
        //llenado de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel)tblCondu1.getModel();
        modeloTabla.setRowCount(0);
              try {//coneccion con bd
            Conexion c = new Conexion();
            Connection con = c.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from animal");
            Object datos[] = new Object[5];
            while(rs.next()){
                for(int i=0;i<5;i++){
                    datos[i] = rs.getObject(i+1);
                    //System.out.print(datos[i]);
                }
                modeloTabla.addRow(datos);
            }              
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
              
DefaultTableModel modeloTabla2 = (DefaultTableModel)tblCondu.getModel();
        modeloTabla2.setRowCount(0);
              try {//coneccion con bd
            Conexion c = new Conexion();
            Connection con = c.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from empleado");
            Object datos[] = new Object[5];
            while(rs.next()){
                for(int i=0;i<4;i++){
                    datos[i] = rs.getObject(i+1);
                }
                modeloTabla2.addRow(datos);
            }              
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
                      DefaultTableModel modeloTabla3 = (DefaultTableModel)tblCondu2.getModel();
        modeloTabla3.setRowCount(0);
              try {//coneccion con bd
            Conexion c = new Conexion();
            Connection con = c.conectar();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from alimento");
            Object datos[] = new Object[5];
            while(rs.next()){
                for(int i=0;i<4;i++){
                    datos[i] = rs.getObject(i+1);
                    //System.out.print(datos[i]);
                }
                modeloTabla3.addRow(datos);
            }              
        } catch (SQLException ex) {
            Logger.getLogger(FrmNuevoEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCondu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCondu1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCondu2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tblCondu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Direccion", "Fecha Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCondu);

        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecciona empleado, Animal y comida de regalo");

        jLabel2.setText("Empleado");

        tblCondu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nombre", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCondu1);

        tblCondu2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Tipo", "Contenido neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCondu2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(119, 119, 119)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
FrmPrincipal n=new FrmPrincipal();
n.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int emp=tblCondu.getSelectedRow();
int al=tblCondu1.getSelectedRow();
int al1=tblCondu2.getSelectedRow();
if(al>-1 && emp>-1 && al1>-1)
{
     int resp = JOptionPane.showConfirmDialog(null, "¿Estas segur@?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if(resp==0)
           {

              try {
                Conexion c = new Conexion();
                Connection con = c.conectar();
                Statement st = con.createStatement();
                st.execute("insert into venta_animal(id_ventaanimal, id_empleado,id_alimento,id_animal, fecha_ventaanimal) values (0,'"+(emp+1)+"','"+(al1+1)+"','"+(al+1)+"',now())");
                JOptionPane.showMessageDialog(null,"Registro Exitoso","",JOptionPane.INFORMATION_MESSAGE);
                    
                         this.dispose(); 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: "+ex);
                }
              
            
           }
}
else{
    JOptionPane.showMessageDialog(null,"Seleccion no valida","",JOptionPane.INFORMATION_MESSAGE);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVenderAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenderAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenderAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenderAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenderAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCondu;
    private javax.swing.JTable tblCondu1;
    private javax.swing.JTable tblCondu2;
    // End of variables declaration//GEN-END:variables
}