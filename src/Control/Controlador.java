//NICOL VALENTINA BARAJAS RIVERA
package Control;

import Modelo.Mover;
import Vista.FrmFormula1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;


public class Controlador implements ActionListener{
    private FrmFormula1 objF;
    private Mover objM;
  
    public Controlador() {
        //objM 
        objF = new FrmFormula1();
        objF.getBtnIniciar().addActionListener(this);
        objF.getBtnSalir().addActionListener(this);
    }
    
    public void iniciar(){
        objF.setVisible(true);
        objF.setLocationRelativeTo(null);
    }

    
    @Override
            public void actionPerformed(ActionEvent e){

                if(e.getSource() == this.objF.getBtnIniciar()){
                System.out.println("Inicio");
                Random aleatorio = new Random(System.currentTimeMillis());
                //Producir nuevo int aleatorio entre 0 y 10
                int intAleatorio = aleatorio.nextInt(10);
                
                Mover hiloAuto1 = new Mover(100, 550, objF.getLblCarro1(), intAleatorio);
                aleatorio = new Random(System.currentTimeMillis());
                intAleatorio = aleatorio.nextInt(10);
                Mover hiloAuto2 = new Mover(350, 550, objF.getLblCarro2(), intAleatorio);
                aleatorio = new Random(System.currentTimeMillis());
                intAleatorio = aleatorio.nextInt(10);
                Mover hiloAuto3 = new Mover(580, 550, objF.getLblCarro3(), intAleatorio);
                System.out.print("\nEl podio es: \n");
                hiloAuto1.start();
                hiloAuto2.start();
                hiloAuto3.start();
                
                //objM.llegada();
            }
                if(e.getSource() == this.objF.getBtnSalir()){
                          int resp = objF.setCapturaDecision("Desea salir del programa?...");
                          if(resp == 0){
                              System.exit(0);
                          }
                }
            }
}
