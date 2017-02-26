
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rateValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="promotionalCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rank" type="{http://xml.netbeans.org/schema/RequestSchema}rankType"/>
 *         &lt;element name="distance" type="{http://xml.netbeans.org/schema/RequestSchema}distanceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateType", propOrder = {
    "type",
    "codes",
    "rateValue",
    "promotionalCodes",
    "rank",
    "distance"
})
public class RateType {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String codes;
    protected double rateValue;
    protected String promotionalCodes;
    @XmlElement(required = true)
    protected RankType rank;
    @XmlElement(required = true)
    protected DistanceType distance;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the codes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodes() {
        return codes;
    }

    /**
     * Sets the value of the codes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodes(String value) {
        this.codes = value;
    }

    /**
     * Gets the value of the rateValue property.
     * 
     */
    public double getRateValue() {
        return rateValue;
    }

    /**
     * Sets the value of the rateValue property.
     * 
     */
    public void setRateValue(double value) {
        this.rateValue = value;
    }

    /**
     * Gets the value of the promotionalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionalCodes() {
        return promotionalCodes;
    }

    /**
     * Sets the value of the promotionalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionalCodes(String value) {
        this.promotionalCodes = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link RankType }
     *     
     */
    public RankType getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link RankType }
     *     
     */
    public void setRank(RankType value) {
        this.rank = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setDistance(DistanceType value) {
        this.distance = value;
    }

}
