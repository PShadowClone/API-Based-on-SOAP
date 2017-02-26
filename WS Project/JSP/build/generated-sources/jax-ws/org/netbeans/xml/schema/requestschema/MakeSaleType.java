
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeSaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIN" type="{http://xml.netbeans.org/schema/RequestSchema}creditPINType"/>
 *         &lt;element name="payment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeSaleType", propOrder = {
    "pin",
    "payment",
    "transactionName"
})
public class MakeSaleType {

    @XmlElement(name = "PIN", required = true)
    protected String pin;
    @XmlElement(required = true)
    protected String payment;
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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayment(String value) {
        this.payment = value;
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
