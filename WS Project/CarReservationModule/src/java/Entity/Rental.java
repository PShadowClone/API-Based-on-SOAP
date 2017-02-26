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
public class Rental implements Serializable {

    private Vehicle vehicle;
    private Rate rate;
    private double rentalPeriod;
    private String PIN;

    public Rental(Vehicle vehicle, Rate rate, double rentalPeriod, String PIN) {
        this.vehicle = vehicle;
        this.rate = rate;
        this.rentalPeriod = rentalPeriod;
        this.PIN = PIN;
    }

    public Rental() {
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public double getRentalPeriod() {
        return rentalPeriod;
    }

    public void setRentalPeriod(double rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
