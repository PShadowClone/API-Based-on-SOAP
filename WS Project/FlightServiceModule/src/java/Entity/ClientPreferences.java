/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;

/**
 *
 * @author Amr Saidam
 */
public class ClientPreferences implements Serializable{

    private String airlines;
    private String flightType;
    private int classDegree;

    public ClientPreferences() {
    }

    public ClientPreferences(String airlines, String flightType, int classDegree) {
        this.airlines = airlines;
        this.flightType = flightType;
        this.classDegree = classDegree;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public int getClassDegree() {
        return classDegree;
    }

    public void setClassDegree(int classDegree) {
        this.classDegree = classDegree;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    @Override
    public String toString() {
        return "Airline(s) : " + this.getAirlines() + "\nFlight Type : " + this.getFlightType() + "\nClass Degree : " + this.getClassDegree();
    }
}
