<%-- 
    Document   : RunComositionService
    Created on : Jan 28, 2017, 4:54:34 PM
    Author     : Amr Saidam
--%>

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
        <h1>Hello World!</h1>
        <div name="container" class="row">


            <form method="POST" action="CompositionService.jsp" class="form">


                <div class="col-lg-12">
                    <div name="personIno" class="col-lg-6" >

                        <div class="panel panel-success">
                            <div class="panel-heading">Personal Information</div>
                            <div class="panel-body">
                                <div>
                                    <label>User Name </label>
                                    <input name="name" class="form-control" type="text" pattern="\w+( )\w+( )\w+"/>
                                </div>
                                <div>
                                </div>
                                <div>
                                    <label>Email </label>
                                    <input name="email" class="form-control" type="email" />
                                </div>
                                <div>
                                    <label>Phone Number</label>
                                    <input name="phoneNumber" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Address</label>
                                    <input name="address" class="form-control" type="text" />
                                </div>
                            </div>
                        </div>
                    </div>



                    <div name="creditCardService" class="col-lg-6" >
                        <div class="panel panel-success">
                            <div class="panel-heading">Credit Card Information</div>
                            <div class="panel-body">

                                <div>
                                    <label>Credit Card Number </label>
                                    <input name="creditCardNumber" class="form-control" type="text" pattern="([1-9]{4})-([1-9]{4})-([1-9]{4})-([1-9]{4})"/>
                                </div>
                                <div>
                                    <label>Balance</label>
                                    <input name="creditCardBalance" class="form-control" type="number" />
                                </div>
                                <div>
                                    <label>Expire Date</label>
                                    <input name="creditCardExpireDate" class="form-control" type="date" />
                                </div>
                            </div>
                        </div>
                    </div>


                </div>
                <div class="col-lg-12">
                    <div name="carReservationService" class="col-lg-12" >
                        <div class="panel panel-success">
                            <div class="panel-heading">Car Reservation</div>
                            <div class="panel-body">

                                <div>
                                    <label>Vevhicle Brand</label>
                                    <input name="vevhicleBrand" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Vevhicle Color</label>
                                    <input name="vevhicleColor" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Promotional Code</label>
                                    <input name="promotionalCode" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Rate Type</label>
                                    <input name="rateType" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Rate Value</label>
                                    <input name="rateValue" class="form-control" type="number" />
                                </div>
                                  <div>
                                    <label>Rental Period</label>
                                    <input name="rentalPeriod" class="form-control" type="number" />
                                </div>
                                <div>
                                    <label>Distance</label>
                                    <select name="distance" class="form-control">
                                        <option>Limited</option>
                                        <option>Unlimited</option>
                                    </select>
                                </div>
                                <div>
                                    <label>Rank</label>
                                    <select name="rank" class="form-control">
                                        <option>Leisure</option>
                                        <option>Corporate</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>


                <div class="col-lg-12">
                    <div name="hotelReservationService" class="col-lg-12" >
                        <div class="panel panel-success">
                            <div class="panel-heading">Hotel Reservation</div>
                            <div class="panel-body">
                                <div>
                                    <label>Price Range </label>
                                    <input name="priceRange" class="form-control" type="text" placeholdre="xxx-xxx" />
                                </div>
                                <div>
                                    <label>Date(s)</label>
                                    <input name="dates" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Date Range <span class="small">(Optinal)</span></label>
                                    <input name="dateRange" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Room Type(s)</label>
                                    <input name="roomTypes" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Service(s)</label>
                                    <input name="services" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Amenities</label>
                                    <input name="amenities" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Room Rate</label>
                                    <select name="roomRate" class="form-control">
                                        <option>Regular</option>
                                        <option>High Class</option>
                                        <option>Anything</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>





                <div class="col-lg-12">
                    <div name="flightReservationService" class="col-lg-12" >
                        <div class="panel panel-success">
                            <div class="panel-heading">Flight Reservation</div>
                            <div class="panel-body">

                                <div>
                                    <label>City</label>
                                    <input name="city" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Country</label>
                                    <input name="country" class="form-control" type="text" />
                                </div>
                                 <div>
                                    <label>Class Degree</label>
                                    <input name="classDegree" class="form-control" type="number" />
                                </div>
                                <div>
                                    <label>Flight Type</label>
                                    <input name="flightType" class="form-control" type="text" />
                                </div>
                                <div>
                                    <label>Airline</label>
                                    <input name="airline" class="form-control" type="text"/>
                                </div>
                                <div>
                                    <label>Number Of Passenger</label>
                                    <input name="numberOfPassenger" class="form-control" type="number" />
                                </div>
                                <div>
                                    <label>Passengers Type</label>
                                    <input name="passengerTypes" class="form-control" type="text" pattern="\w+(,)"/>
                                </div>
                                <div>
                                    <label>Trip Date</label>
                                    <input name="tripDate" class="form-control" type="date"/>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="col-lg-5"></div>
                    <div class="col-lg-6">
                        <input name="submit" type="submit" value="Submit" class="btn btn-success"/>
                        <input name="reset" type="reset" value="Reset" class="btn btn-danger"/>
                    </div>
                </div>
            </form>
        </div>
    </div>
</body>
</html>
