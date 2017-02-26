
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditRootType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditRootType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="person" type="{http://xml.netbeans.org/schema/RequestSchema}personInformationType"/>
 *         &lt;element name="creditCardInfo" type="{http://xml.netbeans.org/schema/RequestSchema}creditCardType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditRootType", propOrder = {
    "person",
    "creditCardInfo"
})
public class CreditRootType {

    @XmlElement(required = true)
    protected PersonInformationType person;
    @XmlElement(required = true)
    protected CreditCardType creditCardInfo;

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformationType }
     *     
     */
    public PersonInformationType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformationType }
     *     
     */
    public void setPerson(PersonInformationType value) {
        this.person = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *     
     */
    public CreditCardType getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *     
     */
    public void setCreditCardInfo(CreditCardType value) {
        this.creditCardInfo = value;
    }

}
