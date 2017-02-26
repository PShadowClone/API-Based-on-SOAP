/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

//import Entity.Person;
import Entity.Hotel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.List;
import org.netbeans.xml.schema.hotelavailabilityschema.HotelReservationApplicationType;

/**
 *
 * @author Amr Saidam
 */
public class StoreInformation {

    private File file;
    private RetriveInformation retriveInformation;
    public final static String HOTEL_FILE_NAME = "hotelReservation.dat";
    public final static String DONE = "Done!";
    public final static String EXISTED_RESERVATIONS_FOUND = "There are reservations for this CreditCard";
    public final static String REPEATED_RESERVATION = "the reservations has been canceled beacause you have got the same one before";

    public StoreInformation() throws IOException {
        this.file = new File(HOTEL_FILE_NAME);
        if (!this.file.exists()) {
            this.file.createNewFile();
        }
        this.retriveInformation = new RetriveInformation(file);
    }

    public String saveHotelReservation(Hotel hotel) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Hotel> hotelReservations = this.retriveInformation.getAllHotelReservations();
        String result = DONE;

        if (this.retriveInformation.checkForRepeatedReservation(hotel)) {
            return REPEATED_RESERVATION;
        }
        if (this.retriveInformation.checkForAnotherReservationsForPIN(hotel.getPin())) {
            result = result + "\n" + EXISTED_RESERVATIONS_FOUND;
        }
        hotelReservations.add(hotel);
        saveList(hotelReservations, file);
        return result;



    }

    private void saveList(List<Hotel> hotelReservations, File file) throws FileNotFoundException, IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(hotelReservations);
        objectOutputStream.close();
        fileOutputStream.close();

    }
//    private final static String DB_URL = "jdbc:mysql://localhost/frs_db";
//    private static Connection connection = null;
//    private static PreparedStatement preparedStatement = null;
//    public static String ROOM_RATES[] = {"regular", "highClass", "anyone"};
////    private final static String INSERT_CREDIT_CARD = "INSERT INTO creditcards(creditNumber,expireDate,balance) VALUES (?,?,?)";
////    private final static String TRANSACTION_INSERTION = "INSERT INTO sale(saleTransaction,salePIN,salePayment,saleStatus) VALUES (?,?,?,?)";
////    private final static String UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance - ? WHERE creditNumber = ? ";
////    private final static String WITHDRAWING_UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance + ? WHERE creditNumber = ? ";
////    private final static String DELETE_TRANSACTION = "DELETE FROM sale WHERE saleId = ?";
//    private static String INSERT_HOTEL_TRANSACTION;
//    private static String INSERT_HOTEL_SERVICES;
//    private static String INSERT_HOTEL_DATES;
//    private static String INSERT_ROOM_TYPES;
//    private static String INSERT_AMENITIES;
//
//    public StoreInformation() throws ClassNotFoundException, SQLException {
//        setConnectionHeadr();
//
//        preparedStatement = null;
//        INSERT_HOTEL_SERVICES = "INSERT INTO services (hotelReservationId,serviceName) VALUES (?,?)";
//        INSERT_HOTEL_TRANSACTION = "INSERT INTO hotelreservation (PIN,dateRange,priceRange,roomRate) VALUES (?,?,?,?)";
//        INSERT_HOTEL_DATES = "INSERT INTO dates (hotelReservationId,date) VALUES (?,?)";
//        INSERT_ROOM_TYPES = "INSERT INTO roomtypes (hotelReservationId,roomTypes) VALUES (?,?)";
//        INSERT_AMENITIES = "INSERT INTO amenities (hotelReservationId,amenitie) VALUES (?,?)";
//    }
//
//    public boolean saveBasicHotelReservationInfo(HotelReservationApplicationType hotelApplication) throws ClassNotFoundException, SQLException {
//
//        preparedStatement = connection.prepareStatement(INSERT_HOTEL_TRANSACTION, Statement.RETURN_GENERATED_KEYS);
//        preparedStatement.setString(1, hotelApplication.getPIN());
//        preparedStatement.setString(2, hotelApplication.getDateRange());
//        preparedStatement.setString(3, hotelApplication.getPriceRange());
//        String roomRate = null;
//        boolean[] checkOperationCompletion = new boolean[4];
//        if (hotelApplication.getRoomRate().getRegular() != null) {
//            roomRate = ROOM_RATES[0];
//        } else if (hotelApplication.getRoomRate().getHighClass() != null) {
//            roomRate = ROOM_RATES[1];
//
//        } else {
//            roomRate = ROOM_RATES[2];
//
//        }
//        preparedStatement.setString(4, roomRate);
//        int rowId = preparedStatement.executeUpdate();
//        checkOperationCompletion[0] = saveHotelServices(rowId, hotelApplication);
//        checkOperationCompletion[1] = saveHotelDates(rowId, hotelApplication);
//        checkOperationCompletion[2] = saveHotelRoomTypes(rowId, hotelApplication);
//        checkOperationCompletion[3] = saveHotelAmenities(rowId, hotelApplication);
//
//        closeDBSession();
//        return checkOperationCompletion(checkOperationCompletion);
//
//    }
//
//    private boolean saveHotelServices(int hotelReservationId, HotelReservationApplicationType hotelApplication) throws SQLException {
//        if (hotelApplication.getServices().isEmpty() || hotelApplication.getServices() == null) {
//            return true;
//        }
//        preparedStatement = connection.prepareCall(INSERT_HOTEL_SERVICES);
//        boolean executionFlag = false;
//
//        for (String serviceName : hotelApplication.getServices()) {
//            preparedStatement.setInt(1, hotelReservationId);
//            preparedStatement.setString(2, serviceName);
//            executionFlag = preparedStatement.execute();
//        }
//        closeDBSession();
//        return executionFlag;
//
//    }
//
//    private boolean saveHotelDates(int hotelReservationId, HotelReservationApplicationType hotelApplication) throws SQLException {
//        if (hotelApplication.getDate().isEmpty() || hotelApplication.getDate() == null) {
//            return true;
//        }
//        preparedStatement = connection.prepareStatement(INSERT_HOTEL_DATES);
//        boolean executionFlag = false;
//
//        for (String date : hotelApplication.getDate()) {
//            preparedStatement.setInt(1, hotelReservationId);
//            preparedStatement.setString(2, date);
//            executionFlag = preparedStatement.execute();
//        }
//        closeDBSession();
//        return executionFlag;
//    }
//
//    private boolean saveHotelRoomTypes(int hotelReservationId, HotelReservationApplicationType hotelApplication) throws SQLException {
//
//        if (hotelApplication.getRoomTypes().isEmpty() || hotelApplication.getRoomTypes() == null) {
//            return true;
//        }
//        preparedStatement = connection.prepareStatement(INSERT_ROOM_TYPES);
//        boolean executionFlag = false;
//        for (String roomType : hotelApplication.getRoomTypes()) {
//            preparedStatement.setInt(1, hotelReservationId);
//            preparedStatement.setString(2, roomType);
//            executionFlag = preparedStatement.execute();
//        }
//        closeDBSession();
//        return executionFlag;
//
//    }
//
//    private boolean saveHotelAmenities(int hotelReservationId, HotelReservationApplicationType hotelApplication) throws SQLException {
//        if (hotelApplication.getAmenities().isEmpty() || hotelApplication.getAmenities() == null) {
//            return true;
//        }
//        preparedStatement = connection.prepareCall(INSERT_AMENITIES);
//        boolean executionFlag = false;
//        for (String amenitie : hotelApplication.getAmenities()) {
//            preparedStatement.setInt(1, hotelReservationId);
//            preparedStatement.setString(2, amenitie);
//            executionFlag = preparedStatement.execute();
//        }
//        closeDBSession();
//        return executionFlag;
//    }
//
//    private boolean checkOperationCompletion(boolean[] operationsFlag) {
//        for (int counter = 0; counter < operationsFlag.length; counter++) {
//            if (operationsFlag[counter] == false) {
//                return false;
//            }
//        }
//        return true;
//    }
//
////
////    public  boolean saveCarTransaction(RentalType rentalType) throws ClassNotFoundException, SQLException {
////
////        setConnectionHeadr();
////
////        preparedStatement = connection.prepareStatement(INSERT_CAR_TRANSACTION);
////        preparedStatement.setString(1, rentalType.getVehicle().getBrand());
////        preparedStatement.setString(2, rentalType.getVehicle().getColor());
////        preparedStatement.setString(3, rentalType.getRate().getType());
////        preparedStatement.setString(4, rentalType.getRate().getCodes());
////        preparedStatement.setString(5, rentalType.getRate().getRank().getCorporate() == null ? rentalType.getRate().getRank().getLeisure() : rentalType.getRate().getRank().getCorporate());
////        preparedStatement.setString(6, rentalType.getRate().getDistance().getLimited() == null ? rentalType.getRate().getDistance().getUnlimited() : rentalType.getRate().getDistance().getLimited());
////        preparedStatement.setString(7, rentalType.getRate().getPromotionalCodes());
////        preparedStatement.setDouble(8, rentalType.getRentalPeriod());
////        preparedStatement.setString(9, rentalType.getPIN());
////
////        return !preparedStatement.execute();
////
////    }
////
////    public static void main(String[] args) throws ClassNotFoundException, SQLException {
////        RentalType rentalType = new RentalType();
////        VehicleType vehicleType = new VehicleType();
////        vehicleType.setBrand("BMW");
////        vehicleType.setColor("red");
////        rentalType.setVehicle(vehicleType);
////        RateType rate = new RateType();
////        rate.setCodes("7982374-342");
////        DistanceType distanceType = new DistanceType();
////        distanceType.setLimited("Limited");
////
////        RankType rankType = new RankType();
////        rate.setDistance(distanceType);
////        rankType.setCorporate("Corporate");
////        rate.setRank(rankType);
////        rate.setPromotionalCodes("323");
////        rate.setType("weiurq");
////        rentalType.setRate(rate);
////        rentalType.setRentalPeriod(2323);
////        rentalType.setPIN("4444-4444-5445-4455");
////        System.out.println(new StoreInformation().saveCarTransaction(rentalType));
////    }
////    public static CreditCardType storeCreditInfo(org.netbeans.xml.schema.creditcardschema.CreditCardType creditInfo) {
////        CreditCardType creditInfoResult = new CreditCardType();
////        try {getPIN().
////
////            setConnectionHeadr();
////
////            preparedStatement = connection.prepareStatement(INSERT_CREDIT_CARD);
////            preparedStatement.setString(1, creditInfo.getPIN());
////            preparedStatement.setString(2, creditInfo.getExpiredDate());
////            preparedStatement.setDouble(3, Double.parseDouble("" + creditInfo.getBalance()));
////            preparedStatement.execute();
////            return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
////        } catch (ClassNotFoundException ex) {
////            return null;
////
////        } catch (SQLException ex) {
////            if (ex instanceof MySQLIntegrityConstraintViolationException) {
////                try {
////                    return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
////
////                } catch (ClassNotFoundException ex1) {
////                    return null;
////                } catch (SQLException ex1) {
////                    return null;
////                }
////            }
////
////        } finally {
////            try {
////                closeDBSession();
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////                return null;
////
////            }
////        }
////
////        return null;
////    }
////
////    public static boolean storeTransactionInfo(MakeSaleType makeSaleInstance, String status) {
////        MakeSaleType makeSale = new MakeSaleType();
////        try {
////
////            setConnectionHeadr();
////
////            preparedStatement = connection.prepareStatement(TRANSACTION_INSERTION);
////            preparedStatement.setString(1, makeSaleInstance.getTransactionName());
////            preparedStatement.setString(2, makeSaleInstance.getPIN());
////            preparedStatement.setDouble(3, makeSaleInstance.getPayment());
////            preparedStatement.setString(4, status);
////            preparedStatement.execute();
////            return true;
////        } catch (ClassNotFoundException ex) {
////            ex.printStackTrace();
////            return false;
////
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////
////            return false;
////
////        } finally {
////            try {
////                closeDBSession();
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////                return false;
////
////            }
////        }
////
////    }
////
//    private static void closeDBSession() throws SQLException {
//        if (connection != null) {
//            connection.close();
//        }
//        if (preparedStatement != null) {
//            preparedStatement.close();
//        }
//    }
////
////    public static boolean updateAccount(String PIN, double payment) {
////        try {
////
////            setConnectionHeadr();
////
////            preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT);
////
////            preparedStatement.setDouble(1, payment);
////            preparedStatement.setString(2, PIN);
////            int updateResult = preparedStatement.executeUpdate();
////            if (updateResult == 1) {
////                return true;
////            } else {
////                return false;
////            }
////
////        } catch (ClassNotFoundException ex) {
////            ex.printStackTrace();
////            return false;
////
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////
////            return false;
////
////        } finally {
////            try {
////                closeDBSession();
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////                return false;
////
////            }
////        }
////
////
////    }
////
////    public static boolean wothrawing_updateAccount(String PIN, double payment) {
////        try {
////
////            setConnectionHeadr();
////
////            preparedStatement = connection.prepareStatement(WITHDRAWING_UPDATE_ACCOUNT);
////
////            preparedStatement.setDouble(1, payment);
////            preparedStatement.setString(2, PIN);
////            int updateResult = preparedStatement.executeUpdate();
////            if (updateResult == 1) {
////                return true;
////            } else {
////                return false;
////            }
////
////        } catch (ClassNotFoundException ex) {
////            ex.printStackTrace();
////            return false;
////
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////
////            return false;
////
////        } finally {
////            try {
////                closeDBSession();
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////                return false;
////
////            }
////        }
////
////
////    }
////
////    public static boolean deleteTransaction(int transactionId) {
////        try {
////            setConnectionHeadr();
////            preparedStatement = connection.prepareStatement(DELETE_TRANSACTION);
////            preparedStatement.setInt(1, transactionId);
////            int deletionResult = preparedStatement.executeUpdate();
////            if (deletionResult == 1) {
////                return true;
////            } else {
////                return false;
////            }
////        } catch (ClassNotFoundException ex) {
////            ex.printStackTrace();
////            return false;
////        } catch (SQLException ex) {
////            ex.printStackTrace();
////            return false;
////        } finally {
////            try {
////                closeDBSession();
////            } catch (SQLException ex) {
////                ex.printStackTrace();
////                return false;
////
////            }
////        }
////
////
////    }
//
//    private static void setConnectionHeadr() throws ClassNotFoundException, SQLException {
//        String myDriver = "org.gjt.mm.mysql.Driver";
//        connection = DriverManager.getConnection(DB_URL, "root", "");
//        Class.forName(myDriver);
//    }
}
