
package org.netbeans.xml.schema.creditcardschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specificCreditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specificCreditCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PIN" type="{http://xml.netbeans.org/schema/creditCardSchema}creditPINType"/>
 *         &lt;element name="transactionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specificCreditCardType", propOrder = {

})
public class SpecificCreditCardType {

    @XmlElement(name = "PIN", required = true)
    protected String pin;
    @XmlElement(required = true)
    protected String transactionName;

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

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
    }

}
