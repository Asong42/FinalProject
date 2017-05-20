package FlightOrder;
import java.util.ArrayList;

public class QuiryFlight {
	private String startCity;
	private String arrivalCity;
	private String departureDate;
	private ArrayList<Flight> flightList;
	
	public QuiryFlight(String startCity,String arrivalCity, String departureDate,ArrayList<Flight> flightList){
		this.startCity=startCity;
		this.arrivalCity=arrivalCity;
		this.departureDate=departureDate;
		this.flightList=flightList;
	}
	
	public String getStartCity() {
		return startCity;
	}


	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}


	public String getArravalCity() {
		return arrivalCity;
	}


	public void setArravalCity(String arravalCity) {
		this.arrivalCity = arravalCity;
	}


	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public ArrayList<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(ArrayList<Flight> flightList) {
		this.flightList = flightList;
	}
	//按照起飞城市查询
	//method
		// 按起飞城市，到达城市，出发日期查询
		public static void quiry1(String yourStartCity,String yourArrivalCity, String yourDepartureDate){
		

			System.out.printf("航班的起飞城市为%s,到达城市为 %s,出发日期为 %s的航班有:\n",
					yourStartCity, yourArrivalCity, yourDepartureDate);
			System.out.println("航班号                             价格                  航班状态");

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
			

				System.out.printf("航班的航班号中包含%s的航班有:\n", yourFlightID);
				System.out.println("航班号                             价格                  航班状态");

				for (int i = 0; i < Flight.flightList.size(); i++) {
					if (Flight.flightList.get(i).getFlightID().contains(yourFlightID)) {
						System.out.println(Flight.flightList.get(i).getFlightID()+"   "+Flight.flightList.get(i).getPrice()
								+ "     "+Flight.flightList.get(i).getFlightStatus());
					
					}
				}
			}
}
		
