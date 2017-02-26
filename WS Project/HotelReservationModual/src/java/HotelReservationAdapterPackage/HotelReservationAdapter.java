/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationAdapterPackage;

import Entity.Hotel;
import Entity.RoomRate;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.xml.schema.hotelavailabilityschema.HotelReservationApplicationType;

/**
 *
 * @author Amr Saidam
 */
public class HotelReservationAdapter {

    public static Hotel convertingFromHRATToEntity(HotelReservationApplicationType applicationType) {
        Hotel hotel = new Hotel();
        hotel.setPin(applicationType.getPIN());
        hotel.setPriceRange(applicationType.getPriceRange());
        RoomRate roomRate = new RoomRate();
        roomRate.setAnyone(applicationType.getRoomRate().getAnyone());
        roomRate.setRegular(applicationType.getRoomRate().getRegular());
        roomRate.setHighClass(applicationType.getRoomRate().getHighClass());
        hotel.setRoomRate(roomRate);

        List<String> dates = new ArrayList<String>();
        dates = applicationType.getDate();
        hotel.setDate(dates);

        List<String> services = new ArrayList<String>();
        services = applicationType.getServices();
        hotel.setServices(services);

        List<String> animities = new ArrayList<String>();
        animities = applicationType.getAmenities();
        hotel.setAmenities(animities);

        List<String> roomTypes = new ArrayList<String>();
        roomTypes = applicationType.getRoomTypes();
        hotel.setRoomTypes(roomTypes);

        return hotel;


    }
}
