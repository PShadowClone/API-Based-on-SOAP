
package org.netbeans.xml.schema.creditcardschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIN" type="{http://xml.netbeans.org/schema/creditCardSchema}creditPINType"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="expiredDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardType", propOrder = {
    "pin",
    "balance",
    "expiredDate"
})
public class CreditCardType {

    @XmlElement(name = "PIN", required = true)
    protected String pin;
    protected double balance;
    @XmlElement(required = true)
    protected String expiredDate;

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
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the expiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiredDate() {
        return expiredDate;
    }

    /**
     * Sets the value of the expiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiredDate(String value) {
        this.expiredDate = value;
    }

}
