/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tobserver;

/**
 *
 * @author Carlos Andres
 */
public class Tobserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        estacion clima = new estacion();

        mostrartemp mostrador = new mostrartemp();

        clima.addObserver(mostrador);

        System.out.println("se detecto 26 grados");
        clima.setTemperature(26);
        System.out.println("");
        System.out.println("detectando 30 grados");
        clima.setTemperature(30);
        // TODO code application logic here
    }
    
}
