/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package HotelReservationPackage;

import HotelReservationOperation.MakeHotelReservation;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.hotelreservationmodual.hotelreservationwsdl.HotelReservationWSDLPortType;

/**
 *
 * @author Amr Saidam
 */
@WebService(serviceName = "HotelReservationWSDLService", portName = "HotelReservationWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.hotelreservationmodual.hotelreservationwsdl.HotelReservationWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/HotelReservationModual/HotelReservationWSDL", wsdlLocation = "META-INF/wsdl/HotelReservationService/HotelReservationWSDLWrapper.wsdl")
@Stateless
public class HotelReservationService implements HotelReservationWSDLPortType{

    public java.lang.String hotelReservationWSDLOperation(org.netbeans.xml.schema.hotelavailabilityschema.HotelReservationApplicationType hotelReservationRequest) {


        MakeHotelReservation hotelReservation = new MakeHotelReservation();
        return hotelReservation.makeReservation(hotelReservationRequest);

    }

}
