/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightServiceAdapter;

import Entity.ClientPreferences;
import Entity.DestinationOfTrip;
import Entity.FilghtServiceEntity;
import Entity.Passenger;
import org.netbeans.xml.schema.flightservicetypes.DestinationType;
import org.netbeans.xml.schema.flightservicetypes.ClientPreferencesType;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceResponse;
import org.netbeans.xml.schema.flightservicetypes.FlightServiceType;
import org.netbeans.xml.schema.flightservicetypes.PassengerType;

/**
 *
 * @author Amr Saidam
 */
public class FlightAdapter {

    public static FilghtServiceEntity convertingFromFlightServiceTypeToEntity(FlightServiceType flightServiceType) {
        FilghtServiceEntity flightEntity = new FilghtServiceEntity();

        if (flightServiceType.getClientPreferences() == null) {
            flightEntity.setClientPreferences(new ClientPreferences());
        } else {
            ClientPreferences clientPreferences = new ClientPreferences();
            clientPreferences.setAirlines(flightServiceType.getClientPreferences().getAirlines() == null ? "" : flightServiceType.getClientPreferences().getAirlines());
            clientPreferences.setClassDegree(flightServiceType.getClientPreferences().getClassDegree() == null ? -1 : flightServiceType.getClientPreferences().getClassDegree());
            clientPreferences.setFlightType(flightServiceType.getClientPreferences().getFlightType() == null ? "" : flightServiceType.getClientPreferences().getFlightType());
            flightEntity.setClientPreferences(clientPreferences);
        }
        DestinationOfTrip destination = new DestinationOfTrip();
        destination.setCity(flightServiceType.getDestination().getCity());
        destination.setCountry(flightServiceType.getDestination().getCountry());
        flightEntity.setDestinationOfTrip(destination);

        Passenger passenger = new Passenger();
        passenger.setNumberOfPassengers(flightServiceType.getPassenger().getNumberOfPassenger());
        passenger.setTypeOfPassengers(flightServiceType.getPassenger().getTypeOfPassengers());
        flightEntity.setPassenger(passenger);

        flightEntity.setTripDate(flightServiceType.getTripDate());
        return flightEntity;
    }

    public static FlightServiceResponse reversingConverterFromEntityToFlightServiceResponse(FilghtServiceEntity flightEntity) {
        FlightServiceResponse flightServiceResponse = new FlightServiceResponse();
        FlightServiceType flightServiceType = new FlightServiceType();
        if (flightEntity.getClientPreferences() == null) {
            flightServiceType.setClientPreferences(new ClientPreferencesType());
        } else {
            ClientPreferencesType clientPreferencesType = new ClientPreferencesType();
            clientPreferencesType.setAirlines(flightEntity.getClientPreferences().getAirlines());
            clientPreferencesType.setClassDegree(flightEntity.getClientPreferences().getClassDegree());
            clientPreferencesType.setFlightType(flightEntity.getClientPreferences().getFlightType());
            flightServiceType.setClientPreferences(clientPreferencesType);
        }


        PassengerType passengerType = new PassengerType();
      //  passengerType.setNumberOfPassenger(flightEntity.getPassenger().getNumberOfPassengers());

        for (String temp : flightEntity.getPassenger().getTypeOfPassengers()) {
            passengerType.getTypeOfPassengers().add(temp);
        }

        flightServiceType.setPassenger(passengerType);

        DestinationType destination = new DestinationType();
        destination.setCity(flightEntity.getDestinationOfTrip().getCity());
        destination.setCountry(flightEntity.getDestinationOfTrip().getCountry());
        flightServiceType.setDestination(destination);
        flightServiceType.setTripDate(flightEntity.getTripDate());
        flightServiceResponse.setFlightServiceInformation(flightServiceType);
        flightServiceResponse.setStatus(flightEntity.getStatus());

        return flightServiceResponse;

    }
}
