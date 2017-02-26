
package org.netbeans.xml.schema.requestschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.requestschema package. 
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

    private final static QName _Request_QNAME = new QName("http://xml.netbeans.org/schema/RequestSchema", "request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.requestschema
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
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link PersonInformationType }
     * 
     */
    public PersonInformationType createPersonInformationType() {
        return new PersonInformationType();
    }

    /**
     * Create an instance of {@link RomRates }
     * 
     */
    public RomRates createRomRates() {
        return new RomRates();
    }

    /**
     * Create an instance of {@link RentalType }
     * 
     */
    public RentalType createRentalType() {
        return new RentalType();
    }

    /**
     * Create an instance of {@link UserNameType }
     * 
     */
    public UserNameType createUserNameType() {
        return new UserNameType();
    }

    /**
     * Create an instance of {@link SpecificCreditCardType }
     * 
     */
    public SpecificCreditCardType createSpecificCreditCardType() {
        return new SpecificCreditCardType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link CreditCardType }
     * 
     */
    public CreditCardType createCreditCardType() {
        return new CreditCardType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link RankType }
     * 
     */
    public RankType createRankType() {
        return new RankType();
    }

    /**
     * Create an instance of {@link MakeSaleType }
     * 
     */
    public MakeSaleType createMakeSaleType() {
        return new MakeSaleType();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link DistanceType }
     * 
     */
    public DistanceType createDistanceType() {
        return new DistanceType();
    }

    /**
     * Create an instance of {@link ClientPreferencesType }
     * 
     */
    public ClientPreferencesType createClientPreferencesType() {
        return new ClientPreferencesType();
    }

    /**
     * Create an instance of {@link FlightServiceResponse }
     * 
     */
    public FlightServiceResponse createFlightServiceResponse() {
        return new FlightServiceResponse();
    }

    /**
     * Create an instance of {@link FlightServiceType }
     * 
     */
    public FlightServiceType createFlightServiceType() {
        return new FlightServiceType();
    }

    /**
     * Create an instance of {@link CreditRootType }
     * 
     */
    public CreditRootType createCreditRootType() {
        return new CreditRootType();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.netbeans.org/schema/RequestSchema", name = "request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

}
