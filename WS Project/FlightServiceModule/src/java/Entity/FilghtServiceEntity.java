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
public class FilghtServiceEntity implements Serializable{

    private DestinationOfTrip destinationOfTrip;
    private ClientPreferences clientPreferences;
    private Passenger passenger;
    private String tripDate;
    private String status;

    public FilghtServiceEntity() {
    }

    public FilghtServiceEntity(DestinationOfTrip destinationOfTrip, ClientPreferences clientPreferences, Passenger passenger, String tripDate, String status) {
        this.destinationOfTrip = destinationOfTrip;
        this.clientPreferences = clientPreferences;
        this.passenger = passenger;
        this.tripDate = tripDate;
        this.status = status;
    }

    public ClientPreferences getClientPreferences() {
        return clientPreferences;
    }

    public void setClientPreferences(ClientPreferences clientPreferences) {
        this.clientPreferences = clientPreferences;
    }

    public DestinationOfTrip getDestinationOfTrip() {
        return destinationOfTrip;
    }

    public void setDestinationOfTrip(DestinationOfTrip destinationOfTrip) {
        this.destinationOfTrip = destinationOfTrip;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTripDate() {
        return tripDate;
    }

    public void setTripDate(String tripDate) {
        this.tripDate = tripDate;
    }
    
    


}
