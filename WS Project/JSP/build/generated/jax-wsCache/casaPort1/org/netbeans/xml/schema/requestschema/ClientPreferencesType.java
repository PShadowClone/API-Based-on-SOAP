
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classDegree" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientPreferencesType", propOrder = {
    "airlines",
    "flightType",
    "classDegree"
})
public class ClientPreferencesType {

    protected String airlines;
    protected String flightType;
    protected Integer classDegree;

    /**
     * Gets the value of the airlines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlines() {
        return airlines;
    }

    /**
     * Sets the value of the airlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlines(String value) {
        this.airlines = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the classDegree property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClassDegree() {
        return classDegree;
    }

    /**
     * Sets the value of the classDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClassDegree(Integer value) {
        this.classDegree = value;
    }

}
