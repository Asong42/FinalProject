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
	
	public void unsubscribeFlight(String userName,ArrayList<Order> orderList,ArrayList<Flight> flightList){
	System.out.println("请输入要退订航班的ID");
	Scanner input =new Scanner(System.in);
	String flightID	= input.next();
	
	//订单操作
	for(Order order:orderList){
		if(flightID.equals(order.getFlight())&&userName.equals(order.getPassageID())==true){
			order.setOrderStatus("CANCEL");
		}
	}
	
	//航班操作
	for(Flight flight:Flight.flightList){
		if(flightID.equals(flight.getFlightID())){
			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
					+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
					+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
			flight.getFlightStatus();	
	}
		String status = flight.getFlightStatus();
	
	System.out.println("确定退订请输入1，否则请输入0");
	int n =input.nextInt();
	if(n==1){
		int m = flight.getCurrentPassengers();
		m--;
		flight.setCurrentPassengers(m);//当前预定人数减一 
		System.out.println("退订成功，退款已返还");
	
	    if(status.equals("FULL")){
		   flight.setFlightStatus("AVAILABLE");//状态变化为可预订
	    }
	    break;
	}

}
	}
}
