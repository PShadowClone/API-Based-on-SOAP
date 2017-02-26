/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOperations;

import Entity.FilghtServiceEntity;
import Entity.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.List;

/**
 *
 * @author Amr Saidam
 */
public class StoreInformation {

    private File file;
    private RetriveInformation retriveInformation;
    public static final String FLUGHT_RESERVATION_FILE = "FlightReservation.dat";
    public static final String DONE = "Done!";

    public StoreInformation() throws IOException {

        this.file = new File(FLUGHT_RESERVATION_FILE);
        if (!file.exists()) {
            this.file.createNewFile();
        }

        this.retriveInformation = new RetriveInformation(file);
    }

    public FilghtServiceEntity storeFilghtReservation(FilghtServiceEntity flightInfo) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<FilghtServiceEntity> flightReservations = this.retriveInformation.retriveFlightReservationsList();
        flightReservations.add(flightInfo);
        saveList(file, flightReservations);
        flightInfo.setStatus(DONE);
        return flightInfo;
    }

    private void saveList(File file, List<FilghtServiceEntity> flightReservations) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(flightReservations);
        objectOutputStream.close();
        fileOutputStream.close();
    }
//    public static void storePersonInformationIntoDatabase(Person person) {
//        // create a mysql database connection
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        try {
//            String myDriver = "org.gjt.mm.mysql.Driver";
//            String myUrl = "jdbc:mysql://localhost/frs_db";
//            Class.forName(myDriver);
//            connection = DriverManager.getConnection(myUrl, "root", "");
//            String query = "INSERT INTO person (name,address,phoneNumber,email) VALUES (?,?,?,?)";
//
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, person.getPersonName());
//            preparedStatement.setString(2, person.getPersonAddress());
//            preparedStatement.setString(3, person.getPersonPhoneNumber());
//            preparedStatement.setString(4, person.getPersonEmail());
//            preparedStatement.execute();
//        } catch (Exception excption) {
//            excption.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                }
//            } catch (Exception exception) {
//            }
//
//        }
//    }
}
