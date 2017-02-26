<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <%-- <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>--%>
        <meta http-equiv="Content-Type">
        <title>JSP Page</title>
    </head>
    <body>

        <%

                    String personUserName = request.getParameter("name");
                    String personEmail = request.getParameter("email");
                    String personAddress = request.getParameter("address");
                    String personPhoneNumber = request.getParameter("phoneNumber");

                    String creditCardNumber = request.getParameter("creditCardNumber");
                    String creditCardBalance = request.getParameter("creditCardBalance");
                    String creditCardExpireDate = request.getParameter("creditCardExpireDate");

                    String vevhicleBrand = request.getParameter("vevhicleBrand");
                    String vevhicleColor = request.getParameter("vevhicleColor");
                    String promotionalCode = request.getParameter("promotionalCode");
                    String rateType = request.getParameter("rateType");
                    String rateValue = request.getParameter("rateValue");
                    String distance = request.getParameter("distance");
                    String rank = request.getParameter("rank");
                    String rentalPeriod = request.getParameter("rentalPeriod");

                    String dates = request.getParameter("dates");
                    String dateRange = request.getParameter("dateRange");
                    String roomTypes = request.getParameter("roomTypes");
                    String services = request.getParameter("services");
                    String amenities = request.getParameter("amenities");
                    String roomRate = request.getParameter("roomRate");
                    String priceRange = request.getParameter("priceRange");

                    String city = request.getParameter("city");
                    String classDegree = request.getParameter("classDegree");
                    String country = request.getParameter("country");
                    String flightType = request.getParameter("flightType");
                    String airline = request.getParameter("airline");
                    String numberOfPassenger = request.getParameter("numberOfPassenger");
                    String passengerTypes = request.getParameter("passengerTypes");
                    String tripDate = request.getParameter("tripDate");


                   org.netbeans.xml.schema.requestschema.HotelReservationApplicationType hotelApplication  = getHotelReservationInstance(dates ,
                    dateRange , roomTypes ,services,  amenities ,  roomRate ,  creditCardNumber ,  priceRange);

                   org.netbeans.xml.schema.requestschema.RentalType rental = getCarRservationInstance( vevhicleBrand, vevhicleColor, promotionalCode,
                 rateType,rateValue,distance ,rank ,creditCardNumber,rentalPeriod);

                   org.netbeans.xml.schema.requestschema.CreditRootType creditCard = getCreditCardInstance( personUserName ,  personEmail
                 ,  personAddress, personPhoneNumber, creditCardNumber,  creditCardBalance, creditCardExpireDate);

                   org.netbeans.xml.schema.requestschema.FlightServiceType flight = getFlightReservationInstance( city, country,  flightType,
                         airline,  numberOfPassenger ,  passengerTypes , tripDate, classDegree);


                   String result = runComposition(
                        hotelApplication,
                       rental,
                        creditCard,
                        flight);

                   out.print(result);
                   out.print("<div class='row ' style=' text-align: center; font-size:17px;font-family: Palatino Linotype, Book Antiqua, Palatino, serif !important;>");
                   out.print("<div class='col-lg-12'>");
                   out.print(resultProcessing(result , personUserName));
                   out.print("</div>");
                   out.print("</div>");








        %>

        <%!

         private org.netbeans.xml.schema.requestschema.HotelReservationApplicationType getHotelReservationInstance(String dates ,
                 String dateRange , String rommTypes , String services, String amenities , String roomRate , String creditCardNumber , String priceRange)
                    {
     
             org.netbeans.xml.schema.requestschema.HotelReservationApplicationType hotelApplication = new org.netbeans.xml.schema.requestschema.HotelReservationApplicationType();
                org.netbeans.xml.schema.requestschema.RomRates roomRateInstance = new org.netbeans.xml.schema.requestschema.RomRates();
                roomRateInstance.setAnyone(roomRate.equalsIgnoreCase("Anything") ? "Anything" : "");
                roomRateInstance.setHighClass(roomRate.equalsIgnoreCase("High Class") ? "High Class" : "");
                roomRateInstance.setRegular(roomRate.equalsIgnoreCase("Regular") ? "Regular" : "");
                hotelApplication.setRoomRate(roomRateInstance);
                hotelApplication.setPIN(creditCardNumber);
                hotelApplication.setDateRange(dateRange);
                hotelApplication.setPrice(10.0);
                hotelApplication.setPriceRange(priceRange);
                        return hotelApplication;
                    }


         private org.netbeans.xml.schema.requestschema.RentalType getCarRservationInstance(String vevhicleBrand,String vevhicleColor,String promotionalCode,
                String rateType,  String rateValue, String distance ,  String rank , String creditCardNumber,String rentalPeriod)
                    {
                        org.netbeans.xml.schema.requestschema.RentalType rentalType = new org.netbeans.xml.schema.requestschema.RentalType();
                        org.netbeans.xml.schema.requestschema.VehicleType vehicle = new org.netbeans.xml.schema.requestschema.VehicleType();

                        vehicle.setBrand(vevhicleBrand);
                        vehicle.setColor(vevhicleColor);

                        org.netbeans.xml.schema.requestschema.RateType rate = new org.netbeans.xml.schema.requestschema.RateType();
                        rate.setCodes("$");
                        org.netbeans.xml.schema.requestschema.DistanceType distanceType = new org.netbeans.xml.schema.requestschema.DistanceType();
                        distanceType.setLimited(distance.equalsIgnoreCase("Limited") ? "Limited" : "");
                        distanceType.setUnlimited(distance.equalsIgnoreCase("Unlimited") ? "Unlimited" : "");
                        rate.setDistance(distanceType);
                        rate.setPromotionalCodes(promotionalCode);
                        rate.setRateValue(Double.parseDouble(rateValue+""));
                        rate.setType(rateType);
                        org.netbeans.xml.schema.requestschema.RankType rankType = new org.netbeans.xml.schema.requestschema.RankType();
                        rankType.setCorporate(rank.equalsIgnoreCase("Corporate") ? "Corporate" : "");
                        rankType.setLeisure(rank.equalsIgnoreCase("Leisure") ? "Leisure" : "");
                        rate.setRank(rankType);
                        rentalType.setRate(rate);
                        rentalType.setRentalPeriod(Double.parseDouble(""+rentalPeriod));
                        rentalType.setVehicle(vehicle);
                        rentalType.setPIN(creditCardNumber);


     
                        return rentalType;
                    }






            private org.netbeans.xml.schema.requestschema.CreditRootType getCreditCardInstance(String personUserName , String personEmail
                 , String personAddress,String personPhoneNumber,String creditCardNumber, String creditCardBalance,String creditCardExpireDate)
                    {

                        org.netbeans.xml.schema.requestschema.CreditRootType creditRootType = new org.netbeans.xml.schema.requestschema.CreditRootType();
                        org.netbeans.xml.schema.requestschema.CreditCardType creditCardType = new org.netbeans.xml.schema.requestschema.CreditCardType();


                        creditCardType.setBalance(Double.parseDouble(creditCardBalance));
                        creditCardType.setPIN(creditCardNumber);
                        creditCardType.setExpiredDate(creditCardExpireDate);


                        org.netbeans.xml.schema.requestschema.PersonInformationType personInfo = new org.netbeans.xml.schema.requestschema.PersonInformationType();
                        personInfo.setAddress(personAddress);
                        personInfo.setEmail(personEmail);
                        personInfo.setPhoneNumber(personPhoneNumber);
                        org.netbeans.xml.schema.requestschema.UserNameType userNameType = new org.netbeans.xml.schema.requestschema.UserNameType();
                        String[] names = personUserName.split(" ");
                        userNameType.setFirstName(names[0]);
                        userNameType.setMiddleName(names[1]);
                        userNameType.setLastName(names[2]);
                        personInfo.setName(userNameType);

                        creditRootType.setCreditCardInfo(creditCardType);
                        creditRootType.setPerson(personInfo);
                        return creditRootType;
                    }




    

               private org.netbeans.xml.schema.requestschema.FlightServiceType getFlightReservationInstance(String city,String country, String flightType,
                        String airline, String numberOfPassenger , String passengerTypes ,String tripDate,String classDegree)
                    {

                        org.netbeans.xml.schema.requestschema.FlightServiceType flightServiceType = new org.netbeans.xml.schema.requestschema.FlightServiceType();

                        org.netbeans.xml.schema.requestschema.ClientPreferencesType clientPreferencesType = new org.netbeans.xml.schema.requestschema.ClientPreferencesType();
                        clientPreferencesType.setAirlines(airline);
                        clientPreferencesType.setClassDegree(Integer.parseInt(classDegree));
                        clientPreferencesType.setFlightType(flightType);

                        org.netbeans.xml.schema.requestschema.DestinationType destinationType = new org.netbeans.xml.schema.requestschema.DestinationType();


                        destinationType.setCity(city);
                        destinationType.setCountry(country);

                        org.netbeans.xml.schema.requestschema.PassengerType passengerType = new org.netbeans.xml.schema.requestschema.PassengerType();


                        passengerType.setNumberOfPassenger(Integer.parseInt(numberOfPassenger));
                        //java.util.List<String> passengers = new java.util.ArrayList<String>();
                        String[] listOfTypes = passengerTypes.split(",");

                        fillList(passengerType.getTypeOfPassengers(),listOfTypes);
               
              

                        flightServiceType.setClientPreferences(clientPreferencesType);
                        flightServiceType.setDestination(destinationType);
                        flightServiceType.setPassenger(passengerType);
                        flightServiceType.setTripDate(tripDate);

                        return flightServiceType;
                    }







               private java.lang.String  runComposition(
                       org.netbeans.xml.schema.requestschema.HotelReservationApplicationType hotelApplication,
                       org.netbeans.xml.schema.requestschema.RentalType rental,
                       org.netbeans.xml.schema.requestschema.CreditRootType creditCard,
                       org.netbeans.xml.schema.requestschema.FlightServiceType flight)
               {


                      rca.RCAService1 service = new rca.RCAService1();
                        rca.CompositeServiceWSDLPortType port = service.getCasaPort1();
                                        org.netbeans.xml.schema.requestschema.RequestType reservationInfo = new org.netbeans.xml.schema.requestschema.RequestType();

                        reservationInfo.setFlightServiceInformation(flight);
                        reservationInfo.setCreditCard(creditCard);
                        reservationInfo.setHotelReservationApplication(hotelApplication);
                        reservationInfo.setRental(rental);

              
                        // TODO process result here
                        java.lang.String result = port.reservationOperation(reservationInfo);
                       return result;


               }

               private void fillList(java.util.List<String> passengers , String[] toList)
               {
                   for(int counter = 0; counter < toList.length ; counter++)
                   {
                       passengers.add(toList[counter]);

                   }

               }

               private java.lang.String resultProcessing(java.lang.String result , String userName)
               {

                   String[] results = result.split(" ");
         String className = "info";
                   String outResult = result;
                   String header = "info";
                   String icon = "<i class='glyphicon glyphicon-plane'></i>";
                   try{

                       String getTheFirstElement = results[1];
                                              String getTheFirsstElement = results[1];

                   if(results[0].equalsIgnoreCase("Error") || results[0].equalsIgnoreCase("EXCEPTION"))
                   {
                       header = results[0];
                        className = "danger";
                        outResult = "Somthing went wrong durring running the Composition Service<br/>"+result;
                   }
                   }catch(ArrayIndexOutOfBoundsException exception)
                   {

                       header = "Done";
                       className = "success";
                       outResult = "Thank You "+userName+" for your registration<br/>your Informaiton has been saved successfully <br/> Enjoy with your trip "+icon;
          
                   }

                   String resultForm = "<div class='panel panel-"+className+"'>" +
                           "<div class='panel-heading text-uppercase'>"+header+"</div>" +
                           "<div class='panel-body'>"+outResult+"</div>" +
                           "</div>";
              

                       return resultForm;

               }


        %>

    </body>
</html>
