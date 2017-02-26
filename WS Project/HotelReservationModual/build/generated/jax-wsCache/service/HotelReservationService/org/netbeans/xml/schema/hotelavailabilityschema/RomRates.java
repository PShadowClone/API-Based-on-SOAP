
package org.netbeans.xml.schema.hotelavailabilityschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for romRates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="romRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="regular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="highClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="anyone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "romRates", propOrder = {
    "regular",
    "highClass",
    "anyone"
})
public class RomRates {

    protected String regular;
    protected String highClass;
    protected String anyone;

    /**
     * Gets the value of the regular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegular() {
        return regular;
    }

    /**
     * Sets the value of the regular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegular(String value) {
        this.regular = value;
    }

    /**
     * Gets the value of the highClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighClass() {
        return highClass;
    }

    /**
     * Sets the value of the highClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighClass(String value) {
        this.highClass = value;
    }

    /**
     * Gets the value of the anyone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyone() {
        return anyone;
    }

    /**
     * Sets the value of the anyone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyone(String value) {
        this.anyone = value;
    }

}
