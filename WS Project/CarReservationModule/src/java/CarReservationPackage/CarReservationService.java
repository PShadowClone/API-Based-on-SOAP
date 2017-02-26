/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CarReservationPackage;

import CarReservationOperation.MakeReservation;
import java.io.Serializable;
import javax.ejb.Stateless;
import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.carrentalmodule.carrentalservice.CarRentalServicePortType;

/**
 *
 * @author Amr Saidam
 */
@WebService(serviceName = "CarRentalServiceService", portName = "CarRentalServicePort", endpointInterface = "org.netbeans.j2ee.wsdl.carrentalmodule.carrentalservice.CarRentalServicePortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/CarRentalModule/CarRentalService", wsdlLocation = "META-INF/wsdl/CarReservationService/CarRentalServiceWrapper.wsdl")
@Stateless
public class CarReservationService implements CarRentalServicePortType, Serializable {

    public boolean carRentalServiceOperation(org.netbeans.xml.schema.carrentalrequest.RentalType rentalInfo) {
        MakeReservation makeReservation = new MakeReservation();

        return makeReservation.makeCarReservation(rentalInfo);

    }
}


