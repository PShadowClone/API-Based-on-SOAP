<%-- 
    Document   : index
    Created on : Jan 27, 2017, 11:47:56 AM
    Author     : Amr Saidam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>    <%-- start web service invocation --%><hr/>
        <%

            out.print("10%".split("%")[0]);

            out.print("Here");
            try {
                rca.RCAService1 service = new rca.RCAService1();
                rca.CompositeServiceWSDLPortType port = service.getCasaPort1();
                // TODO initialize WS operation arguments here
                org.netbeans.xml.schema.requestschema.RequestType reservationInfo = new org.netbeans.xml.schema.requestschema.RequestType();


                org.netbeans.xml.schema.requestschema.FlightServiceType flightServiceType = new org.netbeans.xml.schema.requestschema.FlightServiceType();
                org.netbeans.xml.schema.requestschema.HotelReservationApplicationType hotelReservationApplication = new org.netbeans.xml.schema.requestschema.HotelReservationApplicationType();
                org.netbeans.xml.schema.requestschema.CreditRootType cardType = new org.netbeans.xml.schema.requestschema.CreditRootType();
                org.netbeans.xml.schema.requestschema.RentalType rental = new org.netbeans.xml.schema.requestschema.RentalType();
                org.netbeans.xml.schema.requestschema.VehicleType vehicle = new org.netbeans.xml.schema.requestschema.VehicleType();
                vehicle.setBrand("Marceddss");
                vehicle.setColor("red");

                org.netbeans.xml.schema.requestschema.RateType rate = new org.netbeans.xml.schema.requestschema.RateType();
                rate.setCodes("$");
                org.netbeans.xml.schema.requestschema.DistanceType distance = new org.netbeans.xml.schema.requestschema.DistanceType();
                distance.setLimited("Unlimited");
                rate.setDistance(distance);
                rate.setPromotionalCodes("10%");
                rate.setRateValue(87);
                rate.setType("dollor");
                org.netbeans.xml.schema.requestschema.RankType rank = new org.netbeans.xml.schema.requestschema.RankType();
                rank.setCorporate("Corporate");

                // rate.setRateValue(32.1);
                rate.setRank(rank);

                rental.setRate(rate);
               // rental.setPIN("c");
                rental.setRentalPeriod(323);
                rental.setVehicle(vehicle);


                org.netbeans.xml.schema.requestschema.CreditRootType creditRootType = new org.netbeans.xml.schema.requestschema.CreditRootType();
                org.netbeans.xml.schema.requestschema.CreditCardType creditCardType = new org.netbeans.xml.schema.requestschema.CreditCardType();


                creditCardType.setBalance(3000);
                creditCardType.setPIN("4448-8858-5555-8888");
                creditCardType.setExpiredDate("12-12-2012");


                org.netbeans.xml.schema.requestschema.PersonInformationType personInfo = new org.netbeans.xml.schema.requestschema.PersonInformationType();
                personInfo.setAddress("gaza");
                personInfo.setEmail("2323");
                personInfo.setPhoneNumber("233241413");
                org.netbeans.xml.schema.requestschema.UserNameType userNameType = new org.netbeans.xml.schema.requestschema.UserNameType();
                userNameType.setFirstName("ofjCshdsofdskksfsffldurse");
                userNameType.setMiddleName("aadslksaa");
                userNameType.setLastName("ssdssssjjs");
                personInfo.setName(userNameType);

                creditRootType.setCreditCardInfo(creditCardType);
                creditRootType.setPerson(personInfo);


                // hotelReservationApplication.setPIN("4184-2424-2432-5556");
                hotelReservationApplication.setDateRange("12-12-2012/13-12-2012");
                hotelReservationApplication.setPrice(Double.parseDouble("" + 323));
                hotelReservationApplication.setPriceRange("200");
                org.netbeans.xml.schema.requestschema.RomRates romRates = new org.netbeans.xml.schema.requestschema.RomRates();
                romRates.setRegular("regular");
                hotelReservationApplication.setRoomRate(romRates);




                org.netbeans.xml.schema.requestschema.ClientPreferencesType clientPreferencesType = new org.netbeans.xml.schema.requestschema.ClientPreferencesType();
                clientPreferencesType.setAirlines("gaza");
                clientPreferencesType.setClassDegree(1);
                clientPreferencesType.setFlightType("fun");

                org.netbeans.xml.schema.requestschema.DestinationType destinationType = new org.netbeans.xml.schema.requestschema.DestinationType();


                destinationType.setCity("gaza");
                destinationType.setCountry("gaza");

                org.netbeans.xml.schema.requestschema.PassengerType passengerType = new org.netbeans.xml.schema.requestschema.PassengerType();


                passengerType.setNumberOfPassenger(120);

                flightServiceType.setClientPreferences(clientPreferencesType);
                flightServiceType.setDestination(destinationType);
                flightServiceType.setPassenger(passengerType);
                flightServiceType.setTripDate("12-12-2012");
                reservationInfo.setFlightServiceInformation(flightServiceType);
                reservationInfo.setCreditCard(creditRootType);
                reservationInfo.setHotelReservationApplication(hotelReservationApplication);
                reservationInfo.setRental(rental);

                // TODO process result here
                java.lang.String result = port.reservationOperation(reservationInfo);
                out.println("Result = " + result);
            } catch (Exception ex) {
                out.print(ex.getMessage());
                out.print("<br/>");
                // TODO handle custom exceptions here
                }
        %>
        <%-- end web service invocation --%><hr/>

  




    </body>
</html>
