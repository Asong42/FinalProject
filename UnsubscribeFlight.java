package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;

public class UnsubscribeFlight {
	private ArrayList<Order> orderList;
	private ArrayList<Flight> flightList;
	
	public UnsubscribeFlight(ArrayList<Order> orderList,ArrayList<Flight> flightList){
		this.orderList=orderList;
		this.flightList=flightList;
	}
	
	public void unsubscribeFlight(ArrayList<Order> orderList,ArrayList<Flight> flightList){
	System.out.println("������Ҫ�˶������ID");
	Scanner input =new Scanner(System.in);
	String flightID	= input.next();
	
	
	for(Flight flight:Flight.flightList){
		if(input.equals(flight.getFlightID())){
			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
					+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
					+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
			flight.getFlightStatus();	
	}
		String status = flight.getFlightStatus();
	
	System.out.println("ȷ���˶�������1������������0");
	int n =input.nextInt();
	if(n==1){
		int m = flight.getCurrentPassengers();
		m--;
		flight.setCurrentPassengers(m);//��ǰԤ��������һ 
		System.out.println("�˶��ɹ����˿��ѷ���");
	
	    if(status.equals("FULL")){
		   flight.setFlightStatus("AVAILABLE");//״̬�仯Ϊ��Ԥ��
	    }
	}

}
	}
}
