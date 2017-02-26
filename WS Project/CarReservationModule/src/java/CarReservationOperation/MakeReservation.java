/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CarReservationOperation;

import DBOperations.StoreInformation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.xml.schema.carrentalrequest.DistanceType;
import org.netbeans.xml.schema.carrentalrequest.RankType;
import org.netbeans.xml.schema.carrentalrequest.RateType;
import org.netbeans.xml.schema.carrentalrequest.RentalType;
import org.netbeans.xml.schema.carrentalrequest.VehicleType;

/**
 *
 * @author Amr Saidam
 */
public class MakeReservation implements Serializable{

    private StoreInformation storeInformation;

    public MakeReservation() {
        storeInformation = new StoreInformation();
    }

    public boolean makeCarReservation(RentalType rentalInfo) {

        try {
            storeInformation.saveInFile(ReservationAdapter.convertingToRental(rentalInfo));
            return true;
            //return storeInformation.saveCarTransaction(rentalInfo);
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        } 

    }
//
//    private boolean saveInFiles(RentalType rentalInfo) throws IOException {
//        File file = new File("carReservtions");
//        if (!file.exists()) {
//            file.createNewFile();
//        }
//
//
//
//    }
    public static void main(String[] args) {


        //     RequestType reservationInfo = new RequestType();


        RentalType rental = new RentalType();
        VehicleType vehicle = new VehicleType();
        vehicle.setBrand("Marceds");
        vehicle.setColor("red");

        RateType rate = new RateType();
        rate.setCodes("fklasdfj");
        DistanceType distance = new DistanceType();
        distance.setLimited("Limited");
        rate.setDistance(distance);
        rate.setPromotionalCodes("sdfs");
        rate.setType("sfds");
        RankType rank = new RankType();
        rank.setCorporate("Corporate");


        rental.setRentalPeriod(343);
        rate.setRank(rank);
        rental.setRate(rate);
        rental.setPIN("4444-4444-5445-4455");
        rental.setVehicle(vehicle);
//                    reservationInfo.setRental(rental);
        new MakeReservation().makeCarReservation(rental);
    }
}
