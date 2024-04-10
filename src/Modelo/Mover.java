//NICOL VALENTINA BARAJAS RIVERA
package Modelo;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Mover extends Thread{
    int posicionInicialX,limite, velocidad, j=0;
    JLabel lblAux;
    //boolean ganador=false;
    //ArrayList <String> llegada = new ArrayList<String>();
    
    //ArrayList  llegada = new ArrayList();

   /* public ArrayList getLlegada() {
        return llegada;
    }

    public void setLlegada(ArrayList llegada) {
        this.llegada = llegada;
    }*/
    
    public Mover(int posicionInicialX, int limite, JLabel lblAux, int velocidad) {
        this.posicionInicialX = posicionInicialX;
        this.limite = limite;
        this.lblAux = lblAux;
        this.velocidad = velocidad;
    }
    public void run(){
        for (int i = this.limite; i > 0; i--) {
            this.lblAux.setBounds(posicionInicialX, i, 80, 110);
            if(i == 1 && posicionInicialX==100 /*&& ganador==false*/){
                System.out.println("carro 1");
               /* llegada.add("Gano el carro 1");
                ganador=true;
                llegadaFinal();*/
            }
            if(i == 1 && posicionInicialX==350 /*&& ganador==false*/){
                System.out.println("carro 2");
                /*llegada.add("Gano el carro 2");
                ganador=true;
                llegadaFinal();*/
            }
            if(i == 1 && posicionInicialX==580 /*&& ganador==false*/){
                System.out.println("carro 3");
                /*llegada.add("Gano el carro 3");
                ganador=true;
                llegadaFinal();*/
            }
            try{
                sleep(velocidad);
            }catch(Exception e){}
            // System.out.println(posicionInicialX+ "  "+ i);
        }
        
       
    }
   /* 
   public void llegadaFinal(){
       
        JOptionPane.showMessageDialog(null, llegada.get(0));
        
   }*/
    
}
