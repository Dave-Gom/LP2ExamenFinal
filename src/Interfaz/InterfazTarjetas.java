/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Extracto.Extracto;
import Extracto.ExtractoComponent;
import TarjetaDeCredito.PagoTarjeta;
import TarjetaDeCredito.TarjetaDeCredito;
import TarjetaDeCredito.TransaccionTarjeta;
import java.awt.BorderLayout;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author bancocontinental05
 */
public class InterfazTarjetas extends javax.swing.JPanel {

    TarjetaDeCredito tarjetaSeleccionada;
    PagoTarjetaInterfaz pagarVentana;
    private javax.swing.JPanel contenidoDinamico;

    /**
     * Creates new form InterfazTarjetas
     *
     * @param misTarjetas lista de tarjetas del usuario
     */
    public InterfazTarjetas(TarjetaDeCredito miTarjeta, javax.swing.JPanel contenidoDinamico) {

        initComponents();
        this.contenidoDinamico = contenidoDinamico;
        this.tarjetaSeleccionada = miTarjeta;
        jLabel1.setText(miTarjeta.getTipoTarjeta() + " " + miTarjeta.getAfinidad());

        jLabel5.setText(String.format("%.2f", miTarjeta.getDeudaAlcierre()));
        jLabel6.setText(String.format("%.2f", miTarjeta.getDeudaTotal()));
        jLabel7.setText(String.format("%.2f", miTarjeta.getLineaCredito()));
        jLabel2.setText("Deuda al Cierre: ");
        jLabel3.setText("DeudaTotal");
        jLabel4.setText("Linea de credito Total");
        jButton1.setText("Pagar Deuda");

        ArrayList<Extracto> extractoTarjeta = miTarjeta.getExtracto();

        if (!extractoTarjeta.isEmpty()) {
            cargarExtracto(extractoTarjeta);
        } else {
            jScrollPane2.setVisible(false);
            jButton1.setVisible(false);
        }

    }

    public void cargarExtracto(ArrayList<Extracto> extracto) {
        setSize(300, 200);

        // Crear un JPanel para contener los componentes personalizados
        JPanel panel = new JPanel();

        // Iterar sobre el array y agregar instancias de ExtractoComponent al panel
        for (Extracto item : extracto) {

            if (item instanceof PagoTarjeta) {
                PagoTarjeta miPago = (PagoTarjeta) item;
                ExtractoComponent extractoComponent = new ExtractoComponent("Pago", new Double(String.format("%.2f", miPago.getMonto() * -1)));
                panel.add(extractoComponent);

            } else {
                TransaccionTarjeta miTransaccion = (TransaccionTarjeta) item;
                ExtractoComponent extractoComponent = new ExtractoComponent(miTransaccion.getConcepto(),
                        new Double(String.format("%.2f", miTransaccion.getMonto())));
                panel.add(extractoComponent);
            }
        }

        // Establecer un layout al panel (puedes ajustarlo según tus necesidades)
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar el panel al JScrollPane
        jScrollPane2.setViewportView(panel);

        jScrollPane2.setVisible(true);
    }

    private void showPanel(JPanel jp) {
        jp.setSize(600, 470);
        jp.setLocation(0, 0);
        contenidoDinamico.removeAll();
        contenidoDinamico.add(jp, BorderLayout.CENTER);
        contenidoDinamico.revalidate();
        contenidoDinamico.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(157, 157, 157))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (tarjetaSeleccionada != null) {
            PagoTarjetaInterfaz pago = new PagoTarjetaInterfaz(tarjetaSeleccionada, contenidoDinamico);
            showPanel(pago);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
