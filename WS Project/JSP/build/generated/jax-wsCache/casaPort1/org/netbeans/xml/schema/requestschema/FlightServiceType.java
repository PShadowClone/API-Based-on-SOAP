
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{http://xml.netbeans.org/schema/RequestSchema}destinationType"/>
 *         &lt;element name="tripDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clientPreferences" type="{http://xml.netbeans.org/schema/RequestSchema}clientPreferencesType" minOccurs="0"/>
 *         &lt;element name="passenger" type="{http://xml.netbeans.org/schema/RequestSchema}passengerType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightServiceType", propOrder = {
    "destination",
    "tripDate",
    "clientPreferences",
    "passenger"
})
public class FlightServiceType {

    @XmlElement(required = true)
    protected DestinationType destination;
    @XmlElement(required = true)
    protected String tripDate;
    protected ClientPreferencesType clientPreferences;
    @XmlElement(required = true)
    protected PassengerType passenger;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestination(DestinationType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the tripDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripDate() {
        return tripDate;
    }

    /**
     * Sets the value of the tripDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripDate(String value) {
        this.tripDate = value;
    }

    /**
     * Gets the value of the clientPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ClientPreferencesType }
     *     
     */
    public ClientPreferencesType getClientPreferences() {
        return clientPreferences;
    }

    /**
     * Sets the value of the clientPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientPreferencesType }
     *     
     */
    public void setClientPreferences(ClientPreferencesType value) {
        this.clientPreferences = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerType }
     *     
     */
    public PassengerType getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerType }
     *     
     */
    public void setPassenger(PassengerType value) {
        this.passenger = value;
    }

}
