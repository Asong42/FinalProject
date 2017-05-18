package FlightOrder;

import java.util.Scanner;
import java.util.ArrayList;

public class reserveFlights {
//by å§Ã÷Ñï

	public static String getFlightStatus() {
		return flightStatus;
	}
	public static String getFlightID(){
		return flightID;
	}
	public static int getPassengerID(){
		return passengerID;
	}
	public static String getStartCity(){
		return startCity;
	}
	public static String getArrivalCity(){
		return arrivalCity;
	}
	public static void reserveFlight() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please entre the flightID of the flight you want to reserve:");
		String yourFlightID = input.next();
		for (Flight f : Admin.flights) {
			if (f.getFlightID().equals(yourFlightID) && f.getFlightStatus() == "FULL") {
				System.out.println("Sorry, this flight has been full. You can't reserve this flight.");
			}
			if (f.getFlightID().equals(yourFlightID) && f.getFlightStatus() == "AVAILABLE") {
				Order.Orders();
				if (status == "UNPAID")
				{
					System.out.println("Pay for the order?(Please enter \"yes\" or \"no\")");
					String y = "yes";
					String x = input.next();
					if (x.equals(y))
					{
						System.out.println("Congratulations! You have ordered this flight.");
						r1.remove(status);
						r1.add("PAID");
					}
			} else {
				System.out.println("Sorry, there is no flights for you.");
			}
		}
	}
  }
}
