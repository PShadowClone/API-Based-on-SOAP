
package org.netbeans.xml.schema.carrentalrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.carrentalrequest package. 
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

    private final static QName _Rental_QNAME = new QName("http://xml.netbeans.org/schema/CarRentalRequest", "rental");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.carrentalrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link RankType }
     * 
     */
    public RankType createRankType() {
        return new RankType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link RentalType }
     * 
     */
    public RentalType createRentalType() {
        return new RentalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RentalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/CarRentalRequest", name = "rental")
    public JAXBElement<RentalType> createRental(RentalType value) {
        return new JAXBElement<RentalType>(_Rental_QNAME, RentalType.class, null, value);
    }

}
