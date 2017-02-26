package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>    ");
      out.write("<hr/>\n");
      out.write("        ");


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
        
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
