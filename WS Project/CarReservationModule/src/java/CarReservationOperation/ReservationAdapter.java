/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CarReservationOperation;

import Entity.*;
import Entity.Rank;
import java.util.Vector;
import org.netbeans.xml.schema.carrentalrequest.RankType;
import org.netbeans.xml.schema.carrentalrequest.RentalType;
import org.netbeans.xml.schema.carrentalrequest.VehicleType;

/**
 *
 * @author Amr Saidam
 */
public class ReservationAdapter {

    public static Rental convertingToRental(RentalType rentalType) {

        if (rentalType == null) {
            return null;
        }

        Rental rental = new Rental();

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(rentalType.getVehicle().getBrand());
        vehicle.setColor(rentalType.getVehicle().getColor());

        Rank rank = new Rank();
        rank.setCorporate(rentalType.getRate().getRank().getCorporate());
        rank.setLeisure(rentalType.getRate().getRank().getLeisure());

        Distance distance = new Distance();
        distance.setLimited(rentalType.getRate().getDistance().getLimited());
        distance.setUnlimited(rentalType.getRate().getDistance().getUnlimited());

        Rate rate = new Rate();
        rate.setCodes(rentalType.getRate().getCodes());
        rate.setRank(rank);
        rate.setDistance(distance);
        rate.setPromotionalCodes(rentalType.getRate().getPromotionalCodes());
        rate.setType(rentalType.getRate().getType());
        rate.setRateValue(calculatePromotionalCodes(rentalType.getRate().getRateValue(), rentalType.getRate().getPromotionalCodes()));

        rental.setRate(rate);
        rental.setPIN(rentalType.getPIN());
        rental.setVehicle(vehicle);
        rental.setRentalPeriod(rentalType.getRentalPeriod());

        return rental;
    }

    private static double calculatePromotionalCodes(double rateValue, String promotionalCodes) {
        if (promotionalCodes.isEmpty()) {
            return rateValue;
        }


        double result = rateValue * (Double.parseDouble(promotionalCodes.split("%")[0]) / 100);
        return rateValue - result;


    }

}
