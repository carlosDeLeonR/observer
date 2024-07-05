/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


package tobserver;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Carlos Andres
 */
public interface sujeto {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
