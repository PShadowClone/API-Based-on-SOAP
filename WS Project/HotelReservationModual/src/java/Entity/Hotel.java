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
public class Hotel implements Serializable {

    private List<String> date;
    private String dateRange;
    private String priceRange;
    private List<String> roomTypes;
    private RoomRate roomRate;
    private List<String> services;
    private List<String> amenities;
    private String pin;
    private double price;

    public Hotel() {
    }

    public Hotel(double price, List<String> date, String dateRange, String priceRange, List<String> roomTypes, RoomRate roomRate, List<String> services, List<String> amenities, String pin) {
        this.date = date;
        this.dateRange = dateRange;
        this.priceRange = priceRange;
        this.roomTypes = roomTypes;
        this.roomRate = roomRate;
        this.services = services;
        this.amenities = amenities;
        this.pin = pin;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public RoomRate getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(RoomRate roomRate) {
        this.roomRate = roomRate;
    }

    public List<String> getRoomTypes() {
        return roomTypes;
    }

    public void setRoomTypes(List<String> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }
}
