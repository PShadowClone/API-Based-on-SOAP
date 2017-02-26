
package org.netbeans.xml.schema.creditcardschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestedBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestedBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carReservationBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HotelReservationBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestedBalance", propOrder = {
    "carReservationBalance",
    "hotelReservationBalance"
})
public class RequestedBalance {

    protected double carReservationBalance;
    @XmlElement(name = "HotelReservationBalance")
    protected double hotelReservationBalance;

    /**
     * Gets the value of the carReservationBalance property.
     * 
     */
    public double getCarReservationBalance() {
        return carReservationBalance;
    }

    /**
     * Sets the value of the carReservationBalance property.
     * 
     */
    public void setCarReservationBalance(double value) {
        this.carReservationBalance = value;
    }

    /**
     * Gets the value of the hotelReservationBalance property.
     * 
     */
    public double getHotelReservationBalance() {
        return hotelReservationBalance;
    }

    /**
     * Sets the value of the hotelReservationBalance property.
     * 
     */
    public void setHotelReservationBalance(double value) {
        this.hotelReservationBalance = value;
    }

}
