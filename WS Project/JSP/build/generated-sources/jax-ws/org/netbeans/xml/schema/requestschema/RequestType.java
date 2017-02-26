
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="flightServiceInformation" type="{http://xml.netbeans.org/schema/RequestSchema}flightServiceType"/>
 *         &lt;element name="creditCard" type="{http://xml.netbeans.org/schema/RequestSchema}creditRootType"/>
 *         &lt;element name="rental" type="{http://xml.netbeans.org/schema/RequestSchema}rentalType"/>
 *         &lt;element name="hotelReservationApplication" type="{http://xml.netbeans.org/schema/RequestSchema}hotelReservationApplicationType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestType", propOrder = {

})
public class RequestType {

    @XmlElement(required = true)
    protected FlightServiceType flightServiceInformation;
    @XmlElement(required = true)
    protected CreditRootType creditCard;
    @XmlElement(required = true)
    protected RentalType rental;
    @XmlElement(required = true)
    protected HotelReservationApplicationType hotelReservationApplication;

    /**
     * Gets the value of the flightServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlightServiceType }
     *     
     */
    public FlightServiceType getFlightServiceInformation() {
        return flightServiceInformation;
    }

    /**
     * Sets the value of the flightServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightServiceType }
     *     
     */
    public void setFlightServiceInformation(FlightServiceType value) {
        this.flightServiceInformation = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditRootType }
     *     
     */
    public CreditRootType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditRootType }
     *     
     */
    public void setCreditCard(CreditRootType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the rental property.
     * 
     * @return
     *     possible object is
     *     {@link RentalType }
     *     
     */
    public RentalType getRental() {
        return rental;
    }

    /**
     * Sets the value of the rental property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalType }
     *     
     */
    public void setRental(RentalType value) {
        this.rental = value;
    }

    /**
     * Gets the value of the hotelReservationApplication property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationApplicationType }
     *     
     */
    public HotelReservationApplicationType getHotelReservationApplication() {
        return hotelReservationApplication;
    }

    /**
     * Sets the value of the hotelReservationApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationApplicationType }
     *     
     */
    public void setHotelReservationApplication(HotelReservationApplicationType value) {
        this.hotelReservationApplication = value;
    }

}
