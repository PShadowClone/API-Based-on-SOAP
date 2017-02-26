/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HotelReservationOperation;

import DBOperations.StoreInformation;
import HotelReservationAdapterPackage.HotelReservationAdapter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.hotelavailabilityschema.HotelReservationApplicationType;
import org.netbeans.xml.schema.hotelavailabilityschema.RomRates;

/**
 *
 * @author Amr Saidam
 */
public class MakeHotelReservation {

    private StoreInformation storeInformation;
    private static final String EXCEPTION = "EXCEPTION";

    public MakeHotelReservation() {
        try {
            this.storeInformation = new StoreInformation();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String makeReservation(HotelReservationApplicationType hotelApplication) {
        try {
            return this.storeInformation.saveHotelReservation(HotelReservationAdapter.convertingFromHRATToEntity(hotelApplication));
        } catch (IOException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return EXCEPTION + " : " + ex.getMessage();
        }

    }

    public static void main(String[] args) {
        MakeHotelReservation makeHotelReservation = new MakeHotelReservation();
        HotelReservationApplicationType applicationType = new HotelReservationApplicationType();
        applicationType.setPIN("4444-4444-4444-5555");
        applicationType.setPriceRange("32");
        RomRates roomRates = new RomRates();
        roomRates.setAnyone("anyone");
        applicationType.setRoomRate(roomRates);
        applicationType.setDateRange("12-12-2013 / 15-12-2012");
      String result = makeHotelReservation.makeReservation(applicationType);
        System.out.println(result);


    }
}
