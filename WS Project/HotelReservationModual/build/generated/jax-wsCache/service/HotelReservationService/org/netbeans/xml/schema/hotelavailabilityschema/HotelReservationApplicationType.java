
package org.netbeans.xml.schema.hotelavailabilityschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelReservationApplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelReservationApplicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *           &lt;element name="dateRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="priceRange" type="{http://xml.netbeans.org/schema/HotelAvailabilitySchema}priceRange"/>
 *           &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *           &lt;element name="roomTypes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *           &lt;element name="roomRate" type="{http://xml.netbeans.org/schema/HotelAvailabilitySchema}romRates"/>
 *           &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="amenities" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="PIN" type="{http://xml.netbeans.org/schema/HotelAvailabilitySchema}creditPINType"/>
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
@XmlType(name = "hotelReservationApplicationType", propOrder = {
    "date",
    "dateRange",
    "priceRange",
    "price",
    "roomTypes",
    "roomRate",
    "services",
    "amenities",
    "pin"
})
public class HotelReservationApplicationType {

    protected List<String> date;
    protected String dateRange;
    protected String priceRange;
    protected Double price;
    protected List<String> roomTypes;
    protected RomRates roomRate;
    protected List<String> services;
    protected List<String> amenities;
    @XmlElement(name = "PIN")
    protected String pin;

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDate() {
        if (date == null) {
            date = new ArrayList<String>();
        }
        return this.date;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRange(String value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the priceRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * Sets the value of the priceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRange(String value) {
        this.priceRange = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoomTypes() {
        if (roomTypes == null) {
            roomTypes = new ArrayList<String>();
        }
        return this.roomTypes;
    }

    /**
     * Gets the value of the roomRate property.
     * 
     * @return
     *     possible object is
     *     {@link RomRates }
     *     
     */
    public RomRates getRoomRate() {
        return roomRate;
    }

    /**
     * Sets the value of the roomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RomRates }
     *     
     */
    public void setRoomRate(RomRates value) {
        this.roomRate = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServices() {
        if (services == null) {
            services = new ArrayList<String>();
        }
        return this.services;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAmenities() {
        if (amenities == null) {
            amenities = new ArrayList<String>();
        }
        return this.amenities;
    }

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

}
