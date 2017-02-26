/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Amr Saidam
 */
public class Passenger implements Serializable{

    private int numberOfPassengers;
    private List<String> typeOfPassengers;

    public Passenger() {
    }

    public Passenger(int numberOfPassengers, List<String> typeOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        this.typeOfPassengers = typeOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public List<String> getTypeOfPassengers() {
        return typeOfPassengers;
    }

    public void setTypeOfPassengers(List<String> typeOfPassengers) {
        this.typeOfPassengers = typeOfPassengers;
    }
}
