/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightServiceOperations;

import DBOperations.StoreInformation;
import Entity.DestinationOfTrip;
import Entity.FilghtServiceEntity;
import FlightServiceAdapter.FlightAdapter;
import org.netbeans.xml.schema.flightservicetypes.DestinationType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.flightservicetypes.ClientPreferencesType;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceResponse;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceType;
import org.netbeans.xml.schema.flightservicetypes.PassengerType;

/**
 *
 * @author Amr Saidam
 */
public class ReservationsOperations {

    public static final String EXCEPTION = "EXCEPTION";

    public static FlightServiceResponse makeReservation(FlightServiceType flightServiceInformation) {
        FilghtServiceEntity flightInfo = new FilghtServiceEntity();
        try {
            StoreInformation storeInformation = new StoreInformation();
            flightInfo = storeInformation.storeFilghtReservation(FlightAdapter.convertingFromFlightServiceTypeToEntity(flightServiceInformation));
            return FlightAdapter.reversingConverterFromEntityToFlightServiceResponse(flightInfo);
        } catch (FileNotFoundException ex) {
            flightInfo.setStatus(EXCEPTION + ": FileNotFoundException");
            return FlightAdapter.reversingConverterFromEntityToFlightServiceResponse(flightInfo);
        } catch (IOException ex) {
            flightInfo.setStatus(EXCEPTION + ": IOException");
            return FlightAdapter.reversingConverterFromEntityToFlightServiceResponse(flightInfo);
        } catch (ClassNotFoundException ex) {
            flightInfo.setStatus(EXCEPTION + ": ClassNotFoundException");
            return FlightAdapter.reversingConverterFromEntityToFlightServiceResponse(flightInfo);
        }

    }

    public static void main(String[] args) {
        FlightServiceType flightServiceType = new FlightServiceType();

        ClientPreferencesType clientPreferencesType = new ClientPreferencesType();
        clientPreferencesType.setAirlines("gaza");
        clientPreferencesType.setClassDegree(1);
        clientPreferencesType.setFlightType("s");
        flightServiceType.setClientPreferences(clientPreferencesType);



        PassengerType passengerType = new PassengerType();
        passengerType.setNumberOfPassenger(22);


        passengerType.getTypeOfPassengers().add("das");


        flightServiceType.setPassenger(passengerType);

        DestinationType destination = new DestinationType();
        destination.setCity("fds");
        destination.setCountry("32");
        flightServiceType.setDestination(destination);
        flightServiceType.setTripDate("2323");
        FlightServiceResponse flightServiceResponse = ReservationsOperations.makeReservation(flightServiceType);
        System.out.println(flightServiceResponse.getStatus());
    }
}
