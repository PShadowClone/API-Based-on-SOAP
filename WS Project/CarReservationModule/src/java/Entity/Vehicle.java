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
public class Vehicle implements Serializable{

    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
