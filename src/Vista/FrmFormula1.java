//NICOL VALENTINA BARAJAS RIVERA
package Vista;

import Modelo.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class FrmFormula1 extends javax.swing.JFrame {
    private JLabel lblPista, lblCarro1, lblCarro2, lblCarro3;
    private JButton btnIniciar, btnSalir;
    int alto = 700;
    public FrmFormula1() {
        initComponents();
        setTitle("FORMULA 1 CON HILOS");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        lblPista = new JLabel();
        this.getContentPane().add(this.lblPista);
        this.lblPista.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pista.gif")));
        this.lblPista.setBounds(90, 0, 700, 650);
        this.lblCarro1 = new JLabel();
        this.lblPista.add(this.lblCarro1);
        this.lblCarro1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/carro1.jpg")));
        this.lblCarro1.setBounds(100, 550, 80, 110);
        
        this.lblCarro2 = new JLabel();
        this.lblPista.add(this.lblCarro2);
        this.lblCarro2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/carro2.jpg")));
        this.lblCarro2.setBounds(350, 550, 80, 110);
        
        this.lblCarro3 = new JLabel();
        this.lblPista.add(this.lblCarro3);
        this.lblCarro3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/carro3.jpg")));
        this.lblCarro3.setBounds(580, 550, 80, 110);
        btnIniciar = new JButton("iniciar");
        this.getContentPane().add(btnIniciar);
        this.btnIniciar.setBounds(10, 10, 80, 50);
        btnSalir = new JButton("Salir");                                                 
        this.getContentPane().add(btnSalir);
        this.btnSalir.setBounds(10, 65, 80, 50);
    }

    public JLabel getLblPista() {
        return lblPista;
    }

    public void setLblPista(JLabel lblPista) {
        this.lblPista = lblPista;
    }

    public JLabel getLblCarro1() {
        return lblCarro1;
    }

    public void setLblCarro1(JLabel lblCarro1) {
        this.lblCarro1 = lblCarro1;
    }

    public JLabel getLblCarro2() {
        return lblCarro2;
    }

    public void setLblCarro2(JLabel lblCarro2) {
        this.lblCarro2 = lblCarro2;
    }

    public JLabel getLblCarro3() {
        return lblCarro3;
    }

    public void setLblCarro3(JLabel lblCarro3) {
        this.lblCarro3 = lblCarro3;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public void setBtnIniciar(JButton btnIniciar) {
        this.btnIniciar = btnIniciar;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
    public void getMostrarInformacion(String texto){
        JOptionPane.showMessageDialog(null,texto);
    }
    
    public String setCapturaInformacion(String texto){
        return(JOptionPane.showInputDialog(texto));
    }
    
    public int setCapturaDecision(String texto){
        return(JOptionPane.showConfirmDialog(null, texto, "SALIR CUENTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
