
package org.netbeans.xml.schema.flightservicetypes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.xml.schema.flightservicetypes package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.xml.schema.flightservicetypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientPreferencesType }
     * 
     */
    public ClientPreferencesType createClientPreferencesType() {
        return new ClientPreferencesType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link FlightServiceType }
     * 
     */
    public FlightServiceType createFlightServiceType() {
        return new FlightServiceType();
    }

    /**
     * Create an instance of {@link FlightServiceResponse }
     * 
     */
    public FlightServiceResponse createFlightServiceResponse() {
        return new FlightServiceResponse();
    }

}
