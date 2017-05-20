package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;
public class QuiryFlight {
	private String startCity;
	private String arravalCity;
	private String date;
	
	
	public String getStartCity() {
		return startCity;
	}


	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}


	public String getArravalCity() {
		return arravalCity;
	}


	public void setArravalCity(String arravalCity) {
		this.arravalCity = arravalCity;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	//按照起飞城市查询
	//method
		// 按起飞城市，到达城市，出发日期查询
		public static void quiry1(String yourStartCity,String yourArrivalCity, String yourDepartureDate){
		

			System.out.printf("The flights whose start city is %s, arrival city is %s, departure date "
					+ "is %s are:\n",
					yourStartCity, yourArrivalCity, yourDepartureDate);
			System.out.println("FlightID    Price   Flight Status");

			for (int i = 0; i < Flight.flightList.size(); i++) {
				if (Flight.flightList.get(i).getStartCity().equals(yourStartCity)
						&& Flight.flightList.get(i).getArrivalCity().equals(yourArrivalCity)
						&& Flight.flightList.get(i).getDepartureDate().equals(yourDepartureDate)){
					System.out.println(Flight.flightList.get(i).getFlightID()+"   "+Flight.flightList.get(i).getPrice()
							+ "     "+Flight.flightList.get(i).getFlightStatus());
				} 
			}
			
		}


			// 通过航班号查询
		public static void quiry2(String yourFlightID){
			

				System.out.printf("The flights whose Flight ID contains %s are:\n", yourFlightID);
				System.out.println("FlightID    Price   Flight Status");

				for (int i = 0; i < Flight.flightList.size(); i++) {
					if (Flight.flightList.get(i).getFlightID().contains(yourFlightID)) {
						System.out.println(Flight.flightList.get(i).getFlightID()+"   "+Flight.flightList.get(i).getPrice()
								+ "     "+Flight.flightList.get(i).getFlightStatus());
					
					}
				}
			}
		
