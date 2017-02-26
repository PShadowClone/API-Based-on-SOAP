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
public class DestinationOfTrip implements Serializable{

    private String country;
    private String city;

    public DestinationOfTrip() {
    }

    public DestinationOfTrip(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country : " + this.getCountry() + "\nCity" + this.getCity();
    }
}
