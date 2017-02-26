
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rentalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rentalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicle" type="{http://xml.netbeans.org/schema/RequestSchema}vehicleType"/>
 *         &lt;element name="rate" type="{http://xml.netbeans.org/schema/RequestSchema}rateType"/>
 *         &lt;element name="rentalPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PIN" type="{http://xml.netbeans.org/schema/RequestSchema}creditPINType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rentalType", propOrder = {
    "vehicle",
    "rate",
    "rentalPeriod",
    "pin"
})
public class RentalType {

    @XmlElement(required = true)
    protected VehicleType vehicle;
    @XmlElement(required = true)
    protected RateType rate;
    protected double rentalPeriod;
    @XmlElement(name = "PIN", required = true)
    protected String pin;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleType }
     *     
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleType }
     *     
     */
    public void setVehicle(VehicleType value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRate(RateType value) {
        this.rate = value;
    }

    /**
     * Gets the value of the rentalPeriod property.
     * 
     */
    public double getRentalPeriod() {
        return rentalPeriod;
    }

    /**
     * Sets the value of the rentalPeriod property.
     * 
     */
    public void setRentalPeriod(double value) {
        this.rentalPeriod = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

}
