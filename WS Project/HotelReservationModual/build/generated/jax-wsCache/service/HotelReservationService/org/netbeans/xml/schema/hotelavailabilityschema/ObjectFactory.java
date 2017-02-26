
package org.netbeans.xml.schema.hotelavailabilityschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.hotelavailabilityschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HotelReservationApplication_QNAME = new QName("http://xml.netbeans.org/schema/HotelAvailabilitySchema", "hotelReservationApplication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.hotelavailabilityschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HotelReservationApplicationType }
     * 
     */
    public HotelReservationApplicationType createHotelReservationApplicationType() {
        return new HotelReservationApplicationType();
    }

    /**
     * Create an instance of {@link RomRates }
     * 
     */
    public RomRates createRomRates() {
        return new RomRates();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelReservationApplicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/HotelAvailabilitySchema", name = "hotelReservationApplication")
    public JAXBElement<HotelReservationApplicationType> createHotelReservationApplication(HotelReservationApplicationType value) {
        return new JAXBElement<HotelReservationApplicationType>(_HotelReservationApplication_QNAME, HotelReservationApplicationType.class, null, value);
    }

}
