/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz;

import datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import datos.medicoJDBC;
import dominios.Medico;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MARTHA
 */
public class Historiales extends javax.swing.JInternalFrame {

    Conexion enlace = new Conexion();
    Connection connect;
    
    public Historiales() throws SQLException{
        this.connect = enlace.getConnection();
        initComponents();
        
    }
    public void mostrarDatosMedicos(){
        
        DefaultTableModel tHistorial = new DefaultTableModel();
        
        tHistorial.addColumn("CodigoTarjetaProfesional");
        tHistorial.addColumn("Especialidad");
        tHistorial.addColumn("AñosExperiencia");
        tHistorial.addColumn("Nombres");
        tHistorial.addColumn("Apellidos");
        tHistorial.addColumn("Medico");
        
        tablaHistorial.setModel(tHistorial);
        
        String[] datos = new String[6];
        
        try{
            Statement leer = connect.createStatement();
            
            ResultSet resultado = leer.executeQuery("SELECT medicos.CodigoTarjetaProfesional,medicos.Especialidad,medicos.AñosExperiencia, "
                    + "paciente.Nombres,paciente.Apellidos,paciente.Medico FROM medicos JOIN paciente "
                    + "ON paciente.Medico = medicos.CodigoTarjetaProfesional WHERE medicos.CodigoTarjetaProfesional = "+medicoTextEdit.getText());
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                
                tHistorial.addRow(datos);
            }
            tablaHistorial.setModel(tHistorial);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e, "Error en SELECT Medicos",2);
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
        tablaHistorial = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        medicoTextEdit = new javax.swing.JTextField();
        historialButton = new javax.swing.JButton();
        borrarHistorialButton = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Tarjeta Profesional", "Especialidad", "Años Experiencia", "Nombres Pacientes", "Apellidos Pacientes", "Medico"
            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        jLabel1.setText("Codigo Tarjeta Profesional Medico:");

        medicoTextEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoTextEditActionPerformed(evt);
            }
        });

        historialButton.setText("Ver Historial");
        historialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialButtonActionPerformed(evt);
            }
        });

        borrarHistorialButton.setText("Borrar Historial");
        borrarHistorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarHistorialButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(medicoTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(historialButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarHistorialButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(medicoTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historialButton)
                    .addComponent(borrarHistorialButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medicoTextEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoTextEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicoTextEditActionPerformed

    private void historialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialButtonActionPerformed
        // TODO add your handling code here:
        mostrarDatosMedicos();
    }//GEN-LAST:event_historialButtonActionPerformed

    private void borrarHistorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarHistorialButtonActionPerformed
        // TODO add your handling code here:
        if(medicoTextEdit.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe Ingresar el Codigo de Tarjeta Profesional del medico");
            return;
        }
        Medico objetoMedico = new Medico();
        medicoJDBC objetoMedicoJDBC = new medicoJDBC();
        
        objetoMedico.setCodigoTarjetaProfesional(medicoTextEdit.getText());
        
        int confirmacionEliminacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el medico?","Confirmación Eliminación",JOptionPane.YES_NO_OPTION);
        
        try {
            if(confirmacionEliminacion == JOptionPane.YES_OPTION){
                objetoMedicoJDBC.delete(objetoMedico);
                JOptionPane.showMessageDialog(null,"Eliminado Correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex,"Error borrar Historial",1);
        }
        
    }//GEN-LAST:event_borrarHistorialButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrarHistorialButton;
    private javax.swing.JButton historialButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicoTextEdit;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}
