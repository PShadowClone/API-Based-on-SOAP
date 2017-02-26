
package org.netbeans.xml.schema.carrentalrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rankType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="leisure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corporate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rankType", propOrder = {
    "leisure",
    "corporate"
})
public class RankType {

    protected String leisure;
    protected String corporate;

    /**
     * Gets the value of the leisure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeisure() {
        return leisure;
    }

    /**
     * Sets the value of the leisure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeisure(String value) {
        this.leisure = value;
    }

    /**
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporate(String value) {
        this.corporate = value;
    }

}
