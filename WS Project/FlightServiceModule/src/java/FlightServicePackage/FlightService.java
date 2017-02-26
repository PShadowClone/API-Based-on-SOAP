/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightServicePackage;

import FlightServiceOperations.ReservationsOperations;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.flightservice.flightservicewsdl.FlightServiceWSDLPortType;

/**
 *
 * @author Amr Saidam
 */
@WebService(serviceName = "FlightServiceWSDLService", portName = "FlightServiceWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.flightservice.flightservicewsdl.FlightServiceWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/FlightService/FlightServiceWSDL", wsdlLocation = "META-INF/wsdl/FlightService/FlightServiceWSDLWrapper.wsdl")
@Stateless
public class FlightService implements FlightServiceWSDLPortType {

    public org.netbeans.xml.schema.flightservicetypes.FlightServiceResponse reserveFlightTrip(org.netbeans.xml.schema.flightservicetypes.FlightServiceType flightServiceInformation) {
        return ReservationsOperations.makeReservation(flightServiceInformation);
    }
}
