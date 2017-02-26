
package org.netbeans.xml.schema.requestschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfPassenger" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeOfPassengers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerType", propOrder = {
    "numberOfPassenger",
    "typeOfPassengers"
})
public class PassengerType {

    protected int numberOfPassenger;
    @XmlElement(required = true)
    protected List<String> typeOfPassengers;

    /**
     * Gets the value of the numberOfPassenger property.
     * 
     */
    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    /**
     * Sets the value of the numberOfPassenger property.
     * 
     */
    public void setNumberOfPassenger(int value) {
        this.numberOfPassenger = value;
    }

    /**
     * Gets the value of the typeOfPassengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeOfPassengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeOfPassengers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeOfPassengers() {
        if (typeOfPassengers == null) {
            typeOfPassengers = new ArrayList<String>();
        }
        return this.typeOfPassengers;
    }

}
