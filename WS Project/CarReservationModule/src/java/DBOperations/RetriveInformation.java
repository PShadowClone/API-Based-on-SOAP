/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import java.math.BigInteger;
import java.sql.*;

/**
 *
 * @author Amr Saidam
 */
public class RetriveInformation {

    private final static String DB_URL = "jdbc:mysql://localhost/frs_db";
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static String INSERT_CAR_TRANSACTION;

    public RetriveInformation() {
        connection = null;
        preparedStatement = null;
        INSERT_CAR_TRANSACTION = "INSERT INTO carRental (vehicleBrand,vehiclceColor,rateType,rateCodes," +
                "rateRank,rateDistance,ratePromotionalCodes,carRentalPeriod," +
                "PIN) VALUES (?,?,?,?,?,?,?,?,?)";
    }

//    public boolean saveCarTransaction(RentalType rentalType) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//
//
//        preparedStatement = connection.prepareStatement(INSERT_CAR_TRANSACTION);
//        preparedStatement.setString(1, rentalType.getVehicle().getBrand());
//        preparedStatement.setString(2, rentalType.getVehicle().getColor());
//        preparedStatement.setString(3, rentalType.getRate().getType());
//        preparedStatement.setString(4, rentalType.getRate().getCodes());
//        preparedStatement.setString(5, rentalType.getRate().getRank().getCorporate() == null ? rentalType.getRate().getRank().getLeisure() : rentalType.getRate().getRank().getCorporate());
//        preparedStatement.setString(6, rentalType.getRate().getDistance().getLimited() == null ? rentalType.getRate().getDistance().getUnlimited() : rentalType.getRate().getDistance().getLimited());
//        preparedStatement.setString(7, rentalType.getRate().getPromotionalCodes());
//        preparedStatement.setDouble(8, rentalType.getRentalPeriod());
//        preparedStatement.setString(9, rentalType.getPIN());
//
//        return preparedStatement.execute();
//
//    }
//    private final static String FETCH_ALL_CREDIT_CARDS = "SELECT * FROM creditcards WHERE creditNumber = ?";
//    private final static String FETCH_TRANSACTION = "SELECT * FROM sale WHERE salePIN = ? AND saleTransaction  = ? AND saleStatus = ?";
//    private final static String FETCH_PERSON_INFO = "SELECT * FROM person WHERE personId = (SELECT personId FROM creditcards WHERE creditNumber = ?)";
//    private final static String FETCH_SPECIFIC_TRANSACTION = "SELECT * FROM sale WHERE salePIN = ? AND saleTransaction = ?";
//
//    public static CreditCardType checkCreditCardExisting(String PIN) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_ALL_CREDIT_CARDS);
//        preparedStatement.setString(1, "" + PIN + "");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        CreditCardType creditInfo = null;
//        creditInfo = returnCreditInfo(resultSet);
//        System.out.println(resultSet.getRow());
//        System.out.println(resultSet.next());
////        if (!resultSet.next()) {
////            creditInfo = null;
////        } else {
////            creditInfo = new CreditCardType();
////
////        }
//        closeDBSession();
//        return creditInfo;
//    }
//
//    public static Transaction getTransactionDetails(SpecificCreditCardType transactionInfo) throws ClassNotFoundException, SQLException {
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_TRANSACTION);
//        preparedStatement.setString(1, transactionInfo.getPIN());
//        preparedStatement.setString(2, transactionInfo.getTransactionName());
//        preparedStatement.setString(3, MakeSale.DONE_STATUS);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//        resultSet.afterLast();
//        Transaction transaction = new Transaction();
//        MakeSaleType makeSale = new MakeSaleType();
//        while (resultSet.previous()) {
//            transaction.setTransactionId("" + resultSet.getInt("saleId"));
//            makeSale.setPIN(resultSet.getString("salePIN"));
//            makeSale.setPayment(resultSet.getDouble("salePayment"));
//            makeSale.setTransactionName(resultSet.getString("saleTransaction"));
//        }
//
//        transaction.setTransactionInfo(makeSale);
//        closeDBSession();
//        return transaction;
//
//    }
//
//    public static CreditRootType retriveCreditCardPerson(String PIN) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_PERSON_INFO);
//        preparedStatement.setString(1, PIN);
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//
//        CreditRootType allPersonInfo = new CreditRootType();
//        PersonInformationType personInfo = new PersonInformationType();
//        while (resultSet.next()) {
//            UserNameType userName = new UserNameType();
//            userName.setFirstName(resultSet.getString("firstName"));
//            userName.setMiddleName(resultSet.getString("middleName"));
//            userName.setLastName(resultSet.getString("lastName"));
//            personInfo.setName(userName);
//            personInfo.setAddress(resultSet.getString("address"));
//            personInfo.setEmail(resultSet.getString("email"));
//            personInfo.setPhoneNumber(resultSet.getString("phoneNumber"));
//
//        }
//        allPersonInfo.setPerson(personInfo);
//        allPersonInfo.setCreditCardInfo(checkCreditCardExisting(PIN));
//        closeDBSession();
//        return allPersonInfo;
//    }
//
//    public static Transaction getSpecificTransaction(SpecificCreditCardType specificCreditCardType) throws ClassNotFoundException, SQLException {
//
//        setConnectionHeadr();
//        preparedStatement = connection.prepareStatement(FETCH_SPECIFIC_TRANSACTION);
//        preparedStatement.setString(1, specificCreditCardType.getPIN());
//        preparedStatement.setString(2, specificCreditCardType.getTransactionName());
//        ResultSet resultSet = preparedStatement.executeQuery();
//        if (!resultSet.next()) {
//            return null;
//        }
//        resultSet.afterLast();
//        System.out.println("Here");
//        Transaction transaction = new Transaction();
//        while (resultSet.previous()) {
//
//            System.out.println(resultSet.getString("salePIN"));
//            transaction.setTransactionId("" + resultSet.getInt("saleId"));
//            MakeSaleType makeSale = new MakeSaleType();
//            makeSale.setPIN(resultSet.getString("salePIN"));
//            makeSale.setPayment(resultSet.getDouble("salePayment"));
//            makeSale.setTransactionName(resultSet.getString("saleTransaction"));
//            transaction.setTransactionInfo(makeSale);
//            transaction.setTransactionStatus(resultSet.getString("saleStatus"));
//            transaction.setTransactionDate("" + resultSet.getDate("created_at"));
//            System.out.println(transaction.getTransactionStatus());
//
//        }
//
//        closeDBSession();
//        return transaction;
//    }
//

    private static void setConnectionHeadr() throws ClassNotFoundException, SQLException {
        String myDriver = "org.gjt.mm.mysql.Driver";
        connection = DriverManager.getConnection(DB_URL, "root", "");
        Class.forName(myDriver);
    }

    private static void closeDBSession() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
    }
//    private static CreditCardType returnCreditInfo(ResultSet resultSet) throws SQLException {
//        CreditCardType creditInfo = new CreditCardType();
//        while (resultSet.next()) {
//            creditInfo.setPIN(resultSet.getString("creditNumber"));
//            creditInfo.setExpiredDate(resultSet.getString("expireDate"));
//            creditInfo.setBalance(resultSet.getDouble("balance"));
//        }
//        return creditInfo;
//    }
}
