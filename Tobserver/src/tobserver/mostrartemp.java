/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tobserver;

/**
 *
 * @author Carlos Andres
 */
public class mostrartemp implements Observer{

    @Override
    public void update(int temperatura) {
System.out.println("la temperatura actual es: " + temperatura);
    }
    
}
