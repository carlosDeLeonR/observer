/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tobserver;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Carlos Andres
 */
public class estacion implements sujeto {

    private List<Observer> observers;
    private int temp;
    
    public estacion(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp);
        }
    }
    
    public void setTemperature(int tempretatura) {
        this.temp = tempretatura;
        notifyObservers();
    }

}
