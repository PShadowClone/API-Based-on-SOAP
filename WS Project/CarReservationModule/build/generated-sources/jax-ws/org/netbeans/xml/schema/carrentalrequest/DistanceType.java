
package org.netbeans.xml.schema.carrentalrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for distanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="distanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="limited" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unlimited" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distanceType", propOrder = {
    "limited",
    "unlimited"
})
public class DistanceType {

    protected String limited;
    protected String unlimited;

    /**
     * Gets the value of the limited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimited() {
        return limited;
    }

    /**
     * Sets the value of the limited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimited(String value) {
        this.limited = value;
    }

    /**
     * Gets the value of the unlimited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlimited(String value) {
        this.unlimited = value;
    }

}
