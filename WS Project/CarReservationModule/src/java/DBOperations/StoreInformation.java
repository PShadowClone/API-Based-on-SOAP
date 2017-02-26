/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

//import Entity.Person;
import Entity.Rental;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.netbeans.xml.schema.carrentalrequest.DistanceType;
import org.netbeans.xml.schema.carrentalrequest.RankType;
import org.netbeans.xml.schema.carrentalrequest.RateType;
import org.netbeans.xml.schema.carrentalrequest.RentalType;
import org.netbeans.xml.schema.carrentalrequest.VehicleType;

/**
 *
 * @author Amr Saidam
 */
public class StoreInformation {

    private final static String DB_PQSSWORD = "mpswFufy4uUQyEbH";
    private final static String DB_USERNAME = "root";
    private final static String DB_URL = "jdbc:mysql://localhost/frs_db";
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static String FILE_NAME = "carReservations.dat";
//    private final static String INSERT_CREDIT_CARD = "INSERT INTO creditcards(creditNumber,expireDate,balance) VALUES (?,?,?)";
//    private final static String TRANSACTION_INSERTION = "INSERT INTO sale(saleTransaction,salePIN,salePayment,saleStatus) VALUES (?,?,?,?)";
//    private final static String UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance - ? WHERE creditNumber = ? ";
//    private final static String WITHDRAWING_UPDATE_ACCOUNT = "UPDATE creditcards SET balance = balance + ? WHERE creditNumber = ? ";
//    private final static String DELETE_TRANSACTION = "DELETE FROM sale WHERE saleId = ?";
    private static String INSERT_CAR_TRANSACTION;

    public StoreInformation() {
        connection = null;
        preparedStatement = null;
        INSERT_CAR_TRANSACTION = "INSERT INTO carrental (vehicleBrand,vehiclceColor,rateType,rateCodes," +
                "rateRank,rateDistance,ratePromotionalCodes,carRentalPeriod," +
                "PIN) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    public boolean saveCarTransaction(RentalType rentalType) throws ClassNotFoundException, SQLException {

        setConnectionHeadr();

        preparedStatement = connection.prepareStatement(INSERT_CAR_TRANSACTION);
        preparedStatement.setString(1, rentalType.getVehicle().getBrand());
        preparedStatement.setString(2, rentalType.getVehicle().getColor());
        preparedStatement.setString(3, rentalType.getRate().getType());
        preparedStatement.setString(4, rentalType.getRate().getCodes());
        preparedStatement.setString(5, rentalType.getRate().getRank().getCorporate() == null ? rentalType.getRate().getRank().getLeisure() : rentalType.getRate().getRank().getCorporate());
        preparedStatement.setString(6, rentalType.getRate().getDistance().getLimited() == null ? rentalType.getRate().getDistance().getUnlimited() : rentalType.getRate().getDistance().getLimited());
        preparedStatement.setString(7, rentalType.getRate().getPromotionalCodes());
        preparedStatement.setDouble(8, rentalType.getRentalPeriod());
        preparedStatement.setString(9, rentalType.getPIN());

        return !preparedStatement.execute();

    }

    public void saveInFile(Rental rentalType) throws IOException, FileNotFoundException, ClassNotFoundException {
        File file = new File(FILE_NAME);
        List<Rental> carReservations = new ArrayList<Rental>();
        if (file.exists()) {
            carReservations = addReservationToExistedFile(rentalType, file);
        } else {
            file.createNewFile();
        }


        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        carReservations.add(rentalType);
        objectOutputStream.writeObject(carReservations);
        objectOutputStream.close();
        fileOutputStream.close();



    }

    private List<Rental> addReservationToExistedFile(Rental rentalType, File reservationFile) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(reservationFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Rental> carReservations = (List<Rental>) objectInputStream.readObject();

        return carReservations;

    }
//
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        RentalType rentalType = new RentalType();
//        VehicleType vehicleType = new VehicleType();
//        vehicleType.setBrand("BMW");
//        vehicleType.setColor("red");
//        rentalType.setVehicle(vehicleType);
//        RateType rate = new RateType();
//        rate.setCodes("7982374-342");
//        DistanceType distanceType = new DistanceType();
//        distanceType.setLimited("Limited");
//
//        RankType rankType = new RankType();
//        rate.setDistance(distanceType);
//        rankType.setCorporate("Corporate");
//        rate.setRank(rankType);
//        rate.setPromotionalCodes("323");
//        rate.setType("weiurq");
//        rentalType.setRate(rate);
//        rentalType.setRentalPeriod(2323);
//        rentalType.setPIN("4444-4444-5445-4455");
//        System.out.println(new StoreInformation().saveCarTransaction(rentalType));
//    }

//    public static CreditCardType storeCreditInfo(org.netbeans.xml.schema.creditcardschema.CreditCardType creditInfo) {
//        CreditCardType creditInfoResult = new CreditCardType();
//        try {getPIN().
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(INSERT_CREDIT_CARD);
//            preparedStatement.setString(1, creditInfo.getPIN());
//            preparedStatement.setString(2, creditInfo.getExpiredDate());
//            preparedStatement.setDouble(3, Double.parseDouble("" + creditInfo.getBalance()));
//            preparedStatement.execute();
//            return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
//        } catch (ClassNotFoundException ex) {
//            return null;
//
//        } catch (SQLException ex) {
//            if (ex instanceof MySQLIntegrityConstraintViolationException) {
//                try {
//                    return RetriveInformation.checkCreditCardExisting(creditInfo.getPIN());
//
//                } catch (ClassNotFoundException ex1) {
//                    return null;
//                } catch (SQLException ex1) {
//                    return null;
//                }
//            }
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return null;
//
//            }
//        }
//
//        return null;
//    }
//
//    public static boolean storeTransactionInfo(MakeSaleType makeSaleInstance, String status) {
//        MakeSaleType makeSale = new MakeSaleType();
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(TRANSACTION_INSERTION);
//            preparedStatement.setString(1, makeSaleInstance.getTransactionName());
//            preparedStatement.setString(2, makeSaleInstance.getPIN());
//            preparedStatement.setDouble(3, makeSaleInstance.getPayment());
//            preparedStatement.setString(4, status);
//            preparedStatement.execute();
//            return true;
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//    }
//
    private static void closeDBSession() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }
//
//    public static boolean updateAccount(String PIN, double payment) {
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(UPDATE_ACCOUNT);
//
//            preparedStatement.setDouble(1, payment);
//            preparedStatement.setString(2, PIN);
//            int updateResult = preparedStatement.executeUpdate();
//            if (updateResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }
//
//    public static boolean wothrawing_updateAccount(String PIN, double payment) {
//        try {
//
//            setConnectionHeadr();
//
//            preparedStatement = connection.prepareStatement(WITHDRAWING_UPDATE_ACCOUNT);
//
//            preparedStatement.setDouble(1, payment);
//            preparedStatement.setString(2, PIN);
//            int updateResult = preparedStatement.executeUpdate();
//            if (updateResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//
//            return false;
//
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }
//
//    public static boolean deleteTransaction(int transactionId) {
//        try {
//            setConnectionHeadr();
//            preparedStatement = connection.prepareStatement(DELETE_TRANSACTION);
//            preparedStatement.setInt(1, transactionId);
//            int deletionResult = preparedStatement.executeUpdate();
//            if (deletionResult == 1) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//            return false;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        } finally {
//            try {
//                closeDBSession();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//                return false;
//
//            }
//        }
//
//
//    }

    private static void setConnectionHeadr() throws ClassNotFoundException, SQLException {
        String myDriver = "org.gjt.mm.mysql.Driver";
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PQSSWORD);
        Class.forName(myDriver);
    }
}
