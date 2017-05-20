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
	//������ɳ��в�ѯ
	//method
		// ����ɳ��У�������У��������ڲ�ѯ
		public static void quiry1(String yourStartCity,String yourArrivalCity, String yourDepartureDate){
		

			System.out.printf("�������ɳ���Ϊ%s,�������Ϊ %s,��������Ϊ %s�ĺ�����:\n",
					yourStartCity, yourArrivalCity, yourDepartureDate);
			System.out.println("�����                             �۸�                  ����״̬");

			for (int i = 0; i < Flight.flightList.size(); i++) {
				if (Flight.flightList.get(i).getStartCity().equals(yourStartCity)
						&& Flight.flightList.get(i).getArrivalCity().equals(yourArrivalCity)
						&& Flight.flightList.get(i).getDepartureDate().equals(yourDepartureDate)){
					System.out.println(Flight.flightList.get(i).getFlightID()+"   "+Flight.flightList.get(i).getPrice()
							+ "     "+Flight.flightList.get(i).getFlightStatus());
				} 
			}
			
		}


			// ͨ������Ų�ѯ
		public static void quiry2(String yourFlightID){
			

				System.out.printf("����ĺ�����а���%s�ĺ�����:\n", yourFlightID);
				System.out.println("�����                             �۸�                  ����״̬");

				for (int i = 0; i < Flight.flightList.size(); i++) {
					if (Flight.flightList.get(i).getFlightID().contains(yourFlightID)) {
						System.out.println(Flight.flightList.get(i).getFlightID()+"   "+Flight.flightList.get(i).getPrice()
								+ "     "+Flight.flightList.get(i).getFlightStatus());
					
					}
				}
			}
}
		
