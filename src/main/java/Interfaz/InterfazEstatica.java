package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 * Clase que extiende de JFrame lo cual servira para mostrar
 * la interfaz de estatica del menubar y la dinamica
 * @author AlanNuñez
 */

public class InterfazEstatica extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz1
     */
    public InterfazEstatica() {
        initComponents();
        InterfazHome h1 = new InterfazHome();
        JButton [] botones = {Ayuda,Cuenta,Home,Pagos,Tarjetas,Transferencias};
        for (JButton boton : botones){
            boton.setBackground(new Color(0,0,0));
            boton.setUI(new BasicButtonUI());
            boton.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    boton.setBackground(new Color(54,81,207));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    boton.setBackground(new Color(0,0,0));
                }
                
            });
        }
        showPanel(h1);
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
        contenidoDinamico = new javax.swing.JPanel();
        Tarjetas = new javax.swing.JButton();
        Cuenta = new javax.swing.JButton();
        Pagos = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        Transferencias = new javax.swing.JButton();
        Saludo = new javax.swing.JLabel();
        Home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 480));
        setPreferredSize(new java.awt.Dimension(770, 470));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 470));

        contenidoDinamico.setPreferredSize(new java.awt.Dimension(650, 470));

        javax.swing.GroupLayout contenidoDinamicoLayout = new javax.swing.GroupLayout(contenidoDinamico);
        contenidoDinamico.setLayout(contenidoDinamicoLayout);
        contenidoDinamicoLayout.setHorizontalGroup(
            contenidoDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        contenidoDinamicoLayout.setVerticalGroup(
            contenidoDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        Tarjetas.setBackground(new java.awt.Color(0, 0, 0));
        Tarjetas.setForeground(new java.awt.Color(255, 255, 255));
        Tarjetas.setText("Tarjetas");
        Tarjetas.setBorder(null);
        Tarjetas.setBorderPainted(false);
        Tarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetasActionPerformed(evt);
            }
        });

        Cuenta.setBackground(new java.awt.Color(0, 0, 0));
        Cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Cuenta.setText("Cuenta");
        Cuenta.setBorder(null);
        Cuenta.setBorderPainted(false);
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });

        Pagos.setBackground(new java.awt.Color(0, 0, 0));
        Pagos.setForeground(new java.awt.Color(255, 255, 255));
        Pagos.setText("Pagos");
        Pagos.setBorder(null);
        Pagos.setBorderPainted(false);
        Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagosActionPerformed(evt);
            }
        });

        Ayuda.setBackground(new java.awt.Color(0, 0, 0));
        Ayuda.setForeground(new java.awt.Color(255, 255, 255));
        Ayuda.setText("Ayuda");
        Ayuda.setBorder(null);
        Ayuda.setBorderPainted(false);
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });

        Transferencias.setBackground(new java.awt.Color(0, 0, 0));
        Transferencias.setForeground(new java.awt.Color(255, 255, 255));
        Transferencias.setText("Transferencias");
        Transferencias.setBorder(null);
        Transferencias.setBorderPainted(false);
        Transferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciasActionPerformed(evt);
            }
        });

        Saludo.setBackground(new java.awt.Color(10, 90, 10));
        Saludo.setForeground(new java.awt.Color(255, 255, 255));
        Saludo.setText("Hola,Usuario");

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("<");
        Home.setBorder(null);
        Home.setBorderPainted(false);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Saludo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Transferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenidoDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home)
                    .addComponent(Saludo))
                .addGap(34, 34, 34)
                .addComponent(Cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Transferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(contenidoDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetasActionPerformed
        InterfazTarjetas t1 = new InterfazTarjetas();
        showPanel(t1);
    }//GEN-LAST:event_TarjetasActionPerformed

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        InterfazCuenta c1 = new InterfazCuenta();
        showPanel(c1);
    }//GEN-LAST:event_CuentaActionPerformed

    private void PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagosActionPerformed
        InterfazPagos p1 = new InterfazPagos();
        showPanel(p1);
    }//GEN-LAST:event_PagosActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        InterfazAcercaDelSistema y1 = new InterfazAcercaDelSistema();
        showPanel(y1);
    }//GEN-LAST:event_AyudaActionPerformed

    private void TransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciasActionPerformed
        InterfazTransferencias f1 = new InterfazTransferencias();
        showPanel(f1);
    }//GEN-LAST:event_TransferenciasActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        InterfazHome h1 = new InterfazHome();
        showPanel(h1);
    }//GEN-LAST:event_HomeActionPerformed
    /**
     * funcion la cual muestra el JPanel jp 
     * en el panel contenidoDinamico de Interfaz1
     * @return void
     * @param jp 
     */
    private void showPanel(JPanel jp){
        jp.setSize(600,470);
        jp.setLocation(0,0);
        contenidoDinamico.removeAll();
        contenidoDinamico.add(jp,BorderLayout.CENTER);
        contenidoDinamico.revalidate();
        contenidoDinamico.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton Cuenta;
    private javax.swing.JButton Home;
    private javax.swing.JButton Pagos;
    private javax.swing.JLabel Saludo;
    private javax.swing.JButton Tarjetas;
    private javax.swing.JButton Transferencias;
    private javax.swing.JPanel contenidoDinamico;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
