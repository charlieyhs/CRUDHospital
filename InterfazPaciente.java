
package interfaz;

import dominios.Paciente;
import datos.pacienteJDBC;
import datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class InterfazPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterfazPaciente
     */
    
    public InterfazPaciente() {
        initComponents();
        
        try {
            Conexion enlace = new Conexion();
            Connection connect;       
            connect = enlace.getConnection();            
            String medico;            
            DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();            
            medicoAsignadoComboBox.setModel(modeloComboBox);            
            Statement leer = connect.createStatement();            
            ResultSet resultado = leer.executeQuery("SELECT CodigoTarjetaProfesional FROM medicos");
            
            while(resultado.next()){
                medico = resultado.getString(1);
                System.out.println("Medico: "+medico);
                modeloComboBox.addElement(medico);
            }
            medicoAsignadoComboBox.setModel(modeloComboBox);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex,"Error conectar bbdd combo",1);
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

        jLabel1 = new javax.swing.JLabel();
        nombresTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidosTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        agregarButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        valorCuotaSpinner = new javax.swing.JSpinner();
        tratamientoComboBox = new javax.swing.JComboBox<>();
        identificacionTextField = new javax.swing.JTextField();
        eliminarButton = new javax.swing.JButton();
        medicoAsignadoComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        diaNacimientoSpinner = new javax.swing.JSpinner();
        mesNacimientoSpinner = new javax.swing.JSpinner();
        anioNacimientoSpinner = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        a??oNuevaCitaSpinner = new javax.swing.JSpinner();
        mesNuevaCitaSpinner = new javax.swing.JSpinner();
        diaNuevaCitaSpinner = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CRUD Pacientes");

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Fecha Nacimiento:");

        jLabel4.setText("Identificaci??n:");

        jLabel5.setText("Medico Asignado:");

        jLabel6.setText("??Est?? en tratamiento?");

        jLabel7.setText("Valor Cuota Moderadora:");

        jLabel8.setText("Fecha y hora de nueva cita:");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        tratamientoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        medicoAsignadoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("A??o:");

        jLabel10.setText("Mes:");

        jLabel11.setText("Dia:");

        jLabel12.setText("A??o:");

        jLabel13.setText("Mes:");

        jLabel14.setText("Dia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(identificacionTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidosTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombresTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tratamientoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicoAsignadoComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(anioNacimientoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(mesNacimientoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(diaNacimientoSpinner)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a??oNuevaCitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(mesNuevaCitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addContainerGap())
                            .addComponent(diaNuevaCitaSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarButton)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valorCuotaSpinner)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesNacimientoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anioNacimientoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaNacimientoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(identificacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(medicoAsignadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tratamientoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(valorCuotaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(a??oNuevaCitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesNuevaCitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaNuevaCitaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(actualizarButton)
                    .addComponent(eliminarButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void configurarComboBoxMedicos(){

    }
    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // TODO add your handling code here:

        Paciente objetoPaciente = new Paciente();
        pacienteJDBC objetoPacienteJDBC = new pacienteJDBC();
        String tratamiento = (String) tratamientoComboBox.getSelectedItem();
        int cuota = (int)valorCuotaSpinner.getValue();
        
        int a??oNacimiento = (int)anioNacimientoSpinner.getValue();
        int mesNacimiento = (int)mesNacimientoSpinner.getValue();
        int diaNacimiento = (int)diaNacimientoSpinner.getValue();
            
        Date fechaNacimiento = new Date(a??oNacimiento-1900,mesNacimiento-1,diaNacimiento);
        
        int a??oNuevaCita = (int)a??oNuevaCitaSpinner.getValue();
        int mesNuevaCita = (int)mesNuevaCitaSpinner.getValue();
        int diaNuevaCita = (int)diaNuevaCitaSpinner.getValue();
        
        Date fechaNuevaCita = new Date(a??oNuevaCita-1900, mesNuevaCita-1, diaNuevaCita);
        try {
            objetoPaciente.setNombres(nombresTextField.getText());
            objetoPaciente.setApellidos(apellidosTextField.getText());
            objetoPaciente.setFechaNacimiento(fechaNacimiento);
            objetoPaciente.setIdentificacion(identificacionTextField.getText());
            objetoPaciente.setMedicoAsignado(medicoAsignadoComboBox.getSelectedItem().toString());
            objetoPaciente.setTratamiento(tratamiento);
            objetoPaciente.setCuotaModeradora(cuota);
            objetoPaciente.setFechaNuevaCita(fechaNuevaCita);

            int rows = objetoPacienteJDBC.insert(objetoPaciente);

            JOptionPane.showMessageDialog(this,"insertado correctamente en la tabla pacientes","Insertar correctamete", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex , "Error en Insertar", 1);
        }

    }//GEN-LAST:event_agregarButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
        Paciente objetoPaciente = new Paciente();
        pacienteJDBC objetoPacienteJDBC = new pacienteJDBC();
        String tratamiento = (String) tratamientoComboBox.getSelectedItem();
        int cuota = (int)valorCuotaSpinner.getValue();
        
        int a??oNacimiento = (int)anioNacimientoSpinner.getValue();
        int mesNacimiento = (int)mesNacimientoSpinner.getValue();
        int diaNacimiento = (int)diaNacimientoSpinner.getValue();
            
        Date fechaNacimiento = new Date(a??oNacimiento-1880,mesNacimiento,diaNacimiento);
        
        int a??oNuevaCita = (int)a??oNuevaCitaSpinner.getValue();
        int mesNuevaCita = (int)mesNuevaCitaSpinner.getValue();
        int diaNuevaCita = (int)diaNuevaCitaSpinner.getValue();
        
        Date fechaNuevaCita = new Date(a??oNuevaCita-1880, mesNuevaCita, diaNuevaCita);
        try {
            objetoPaciente.setNombres(nombresTextField.getText());
            objetoPaciente.setApellidos(apellidosTextField.getText());
            objetoPaciente.setFechaNacimiento(fechaNacimiento);
            objetoPaciente.setIdentificacion(identificacionTextField.getText());
            objetoPaciente.setMedicoAsignado(medicoAsignadoComboBox.getSelectedItem().toString());
            objetoPaciente.setTratamiento(tratamiento);
            objetoPaciente.setCuotaModeradora(cuota);
            objetoPaciente.setFechaNuevaCita(fechaNuevaCita);

            objetoPacienteJDBC.update(objetoPaciente);
            JOptionPane.showMessageDialog(this,"Actualizado correctamente en la tabla pacientes","Actualizado correctamete", 2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex , "Error en Actualizar", 2);
        }

    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            Paciente objetoPaciente = new Paciente();
            pacienteJDBC objetoPacienteJDBC = new pacienteJDBC();
            
            objetoPaciente.setIdentificacion(identificacionTextField.getText());

            objetoPacienteJDBC.delete(objetoPaciente);
            JOptionPane.showMessageDialog(this,"Eliminado correctamente en la tabla medicos", "Eliminado correctamete", 1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex,"Error en Eliminar", 1);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton agregarButton;
    private javax.swing.JSpinner anioNacimientoSpinner;
    private javax.swing.JTextField apellidosTextField;
    private javax.swing.JSpinner a??oNuevaCitaSpinner;
    private javax.swing.JSpinner diaNacimientoSpinner;
    private javax.swing.JSpinner diaNuevaCitaSpinner;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField identificacionTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> medicoAsignadoComboBox;
    private javax.swing.JSpinner mesNacimientoSpinner;
    private javax.swing.JSpinner mesNuevaCitaSpinner;
    private javax.swing.JTextField nombresTextField;
    private javax.swing.JComboBox<String> tratamientoComboBox;
    private javax.swing.JSpinner valorCuotaSpinner;
    // End of variables declaration//GEN-END:variables
}
