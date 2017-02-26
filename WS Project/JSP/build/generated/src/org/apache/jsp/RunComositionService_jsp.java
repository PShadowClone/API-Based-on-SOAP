package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RunComositionService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        ");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <div name=\"container\" class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"CompositionService.jsp\" class=\"form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div name=\"personIno\" class=\"col-lg-6\" >\n");
      out.write("\n");
      out.write("                        <div class=\"panel panel-success\">\n");
      out.write("                            <div class=\"panel-heading\">Personal Information</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div>\n");
      out.write("                                    <label>User Name </label>\n");
      out.write("                                    <input name=\"name\" class=\"form-control\" type=\"text\" pattern=\"\\w+( )\\w+( )\\w+\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Email </label>\n");
      out.write("                                    <input name=\"email\" class=\"form-control\" type=\"email\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Phone Number</label>\n");
      out.write("                                    <input name=\"phoneNumber\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Address</label>\n");
      out.write("                                    <input name=\"address\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div name=\"creditCardService\" class=\"col-lg-6\" >\n");
      out.write("                        <div class=\"panel panel-success\">\n");
      out.write("                            <div class=\"panel-heading\">Credit Card Information</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Credit Card Number </label>\n");
      out.write("                                    <input name=\"creditCardNumber\" class=\"form-control\" type=\"text\" pattern=\"([1-9]{4})-([1-9]{4})-([1-9]{4})-([1-9]{4})\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Balance</label>\n");
      out.write("                                    <input name=\"creditCardBalance\" class=\"form-control\" type=\"number\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Expire Date</label>\n");
      out.write("                                    <input name=\"creditCardExpireDate\" class=\"form-control\" type=\"date\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div name=\"carReservationService\" class=\"col-lg-12\" >\n");
      out.write("                        <div class=\"panel panel-success\">\n");
      out.write("                            <div class=\"panel-heading\">Car Reservation</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Vevhicle Brand</label>\n");
      out.write("                                    <input name=\"vevhicleBrand\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Vevhicle Color</label>\n");
      out.write("                                    <input name=\"vevhicleColor\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Promotional Code</label>\n");
      out.write("                                    <input name=\"promotionalCode\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Rate Type</label>\n");
      out.write("                                    <input name=\"rateType\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Rate Value</label>\n");
      out.write("                                    <input name=\"rateValue\" class=\"form-control\" type=\"number\" />\n");
      out.write("                                </div>\n");
      out.write("                                  <div>\n");
      out.write("                                    <label>Rental Period</label>\n");
      out.write("                                    <input name=\"rentalPeriod\" class=\"form-control\" type=\"number\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Distance</label>\n");
      out.write("                                    <select name=\"distance\" class=\"form-control\">\n");
      out.write("                                        <option>Limited</option>\n");
      out.write("                                        <option>Unlimited</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Rank</label>\n");
      out.write("                                    <select name=\"rank\" class=\"form-control\">\n");
      out.write("                                        <option>Leisure</option>\n");
      out.write("                                        <option>Corporate</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div name=\"hotelReservationService\" class=\"col-lg-12\" >\n");
      out.write("                        <div class=\"panel panel-success\">\n");
      out.write("                            <div class=\"panel-heading\">Hotel Reservation</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Price Range </label>\n");
      out.write("                                    <input name=\"priceRange\" class=\"form-control\" type=\"text\" placeholdre=\"xxx-xxx\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Date(s)</label>\n");
      out.write("                                    <input name=\"dates\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Date Range <span class=\"small\">(Optinal)</span></label>\n");
      out.write("                                    <input name=\"dateRange\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Room Type(s)</label>\n");
      out.write("                                    <input name=\"roomTypes\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Service(s)</label>\n");
      out.write("                                    <input name=\"services\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Amenities</label>\n");
      out.write("                                    <input name=\"amenities\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Room Rate</label>\n");
      out.write("                                    <select name=\"roomRate\" class=\"form-control\">\n");
      out.write("                                        <option>Regular</option>\n");
      out.write("                                        <option>High Class</option>\n");
      out.write("                                        <option>Anything</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div name=\"flightReservationService\" class=\"col-lg-12\" >\n");
      out.write("                        <div class=\"panel panel-success\">\n");
      out.write("                            <div class=\"panel-heading\">Flight Reservation</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                <div>\n");
      out.write("                                    <label>City</label>\n");
      out.write("                                    <input name=\"city\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Country</label>\n");
      out.write("                                    <input name=\"country\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                 <div>\n");
      out.write("                                    <label>Class Degree</label>\n");
      out.write("                                    <input name=\"classDegree\" class=\"form-control\" type=\"number\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Flight Type</label>\n");
      out.write("                                    <input name=\"flightType\" class=\"form-control\" type=\"text\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Airline</label>\n");
      out.write("                                    <input name=\"airline\" class=\"form-control\" type=\"text\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Number Of Passenger</label>\n");
      out.write("                                    <input name=\"numberOfPassenger\" class=\"form-control\" type=\"number\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Passengers Type</label>\n");
      out.write("                                    <input name=\"passengerTypes\" class=\"form-control\" type=\"text\" pattern=\"\\w+(,)\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>Trip Date</label>\n");
      out.write("                                    <input name=\"tripDate\" class=\"form-control\" type=\"date\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"col-lg-5\"></div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <input name=\"submit\" type=\"submit\" value=\"Submit\" class=\"btn btn-success\"/>\n");
      out.write("                        <input name=\"reset\" type=\"reset\" value=\"Reset\" class=\"btn btn-danger\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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