package Interfaz;

import Cuenta.Cuenta;
import Servicio.Servicio;
import Usuario.Usuario;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import Servicio.*;
/**
 * Clase que extiende de Jpanel, la cual se encargará de mostrar 
 * la interfaz de confirmaciónDePagos.
 * @author Axel-Nuñez.
 */
public class Interfaz_ConfirmacionDePago extends javax.swing.JPanel {

    /**
     * Creates new form Interfaz_ConfirmacionDePago
     */
    private Usuario user;
    private Servicio principal;
    public Interfaz_ConfirmacionDePago(Usuario user, Servicio principal) {
        this.user = user;
        this.principal = principal;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(56, 29, 42));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmacion");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pin de Pago");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seguridad");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resumen de Pago");

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPane2);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Realiza pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jPasswordField1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        resumenDePago();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
     
    /**
     * Verificamos que los ingresamos por el usuario(pin transaccional)
     * sean correctos, asi como tambien el Saldo para realizar el Pago.
     * Además, se actualizamos la bandeja de Pagos del usuario. 
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double Pago = principal.consultar();
        char[] arrayC = jPasswordField1.getPassword();
        String pass = new String(arrayC);
        
        /* Verifica si el pin transaccional ingresado es el correcto. */
        if(pass.equals(user.getPinTransaccional()) && !pass.equals("")){              
            try{
                this.principal.pagar(user.getCuentas().get(0));
                JOptionPane.showMessageDialog(null,"El pago se realizo correctamente.");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(null,"El pin Transaccional es incorrecto.");
    }//GEN-LAST:event_jButton1ActionPerformed
     
    /**
     * Brinda informacion del password field.
     * @param evt ActionEvent: brinda informacion sobre la accion del passwordField.
     */
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    
    /**
     * Resetea el texto predeterminado una vez el usuario hizo click
     * en el cuadro de texto.
     * @param evt FocusEvent: brinda informacion de cuando el usuario
     * hace click en el cuadro de texto.
     */
    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained
    
     /**
     * Reemplaza JpanelActual(dinamico) por el que siguiente a ser mostrado.
     * @param jp Panel a ser agregado en el contenido dinamico.
     */
    private void showPanel(JPanel jp){
        jp.setSize(620,500);
        jp.setLocation(0,0);
        jPanel1.removeAll();
        jPanel1.add(jp,BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
     /**
     * Imprime en pantalla el resumen del pago a realizar, como el monto,
     * el servicio a pagar, y la cuenta en la que se realiza el pago.
     */
    public void resumenDePago(){
        jLabel5.setText("Monto: $ " + principal.consultar() + " GS");
        jLabel6.setText("Servicio: "+  principal.getNombre());
        jLabel7.setText("Cuenta: "+  user.getApellido() + "/" + user.getCi());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
