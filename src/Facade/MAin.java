package Facade;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by chetan on 28/9/15.
 */
//Let's put together a simple example in Java code to illustrate the pattern.
//Let's take a travel agent site for example, that allows you to book hotels and flights. We have a HotelBooker:

class Hotel
{
    @Override
    public String toString() {
        return super.toString();
    }
}
class Flight
{

}
class HotelBooker {
    public ArrayList<Hotel> getHotelsFor(Date from, Date to) {
        //returns hotels available in the particular date range

        //Below is done to give a specfic structure and remove error
        ArrayList<Hotel> hotels=null;
        Hotel h1= new Hotel();
        Hotel h2= new Hotel();
        hotels.add(h1);
        hotels.add(h2);
        return hotels;
    }
}
//    And a FlightBooker:
class FlightBooker {
    public ArrayList<Flight> getFlightsFor(Date from, Date to) {
     //returns flights available in the particular date range
//Below is done to give a specfic structure and remove error
        ArrayList<Flight> flights=null;
        Flight h1= new Flight();
        Flight h2= new Flight();
        flights.add(h1);
        flights.add(h2);
        return flights;
    }
}
        //Both of these have Hotel and Flight datatypes, which the client has knowledge about.
        // They could be provided in the same package as the Facade for example.
           //     The TravelFacade class allows the user to get their Hotel and Flight information in one call:

    class TravelFacade {
        private HotelBooker hotelBooker;
        private FlightBooker flightBooker;

        public void getFlightsAndHotels(Date from, Date to) {
            ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
            ArrayList<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
                    //process and return
                      }}
           // All that the client needs to worry about is the Facade class:
           class Client {

               public static void main(String[] args) {
                   //Below date is done to give a specfic structure and remove error
                   Date from =null;
                   Date to=null;
                   TravelFacade facade = new TravelFacade();
                   facade.getFlightsAndHotels(from, to);
               }
           }


         //   As you can see, it's just a simple approach to encapsulating data.
