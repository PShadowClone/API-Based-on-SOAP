
package org.netbeans.xml.schema.flightservicetypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightServiceInformation" type="{http://xml.netbeans.org/schema/FlightServiceTypes}flightServiceType"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightServiceResponse", propOrder = {
    "flightServiceInformation",
    "status"
})
public class FlightServiceResponse {

    @XmlElement(required = true)
    protected FlightServiceType flightServiceInformation;
    @XmlElement(required = true)
    protected String status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
