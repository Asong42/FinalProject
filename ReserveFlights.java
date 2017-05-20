package FlightOrder;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class ReserveFlights {
//by 濮明扬

	private static ArrayList<Order> orderList;
	private int passageID;
	private int orderNumber;
	private String seat;
	private Flight flight;
	private Date createDate;
	private String orderStatus;
	private String flightStatus;
	
	public ReserveFlights (int passageID,int orderNumber,String seat,Flight flight,Date createDate, String orderStatus){
		this.passageID=passageID;
		this.orderNumber=orderNumber;
		this.seat=seat;
		this.flight=flight;
		this.createDate=createDate;
		this.orderStatus=orderStatus;
	}
	
	public ReserveFlights() {
		
	}

	public int getPassageID() {
		return passageID;
	}
	public void setPassageID(int passageID) {
		this.passageID = passageID;
	}
		
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getSeat(){
		return seat;
	}
	public void setSeat(String seat){
		this.seat=seat;
	}
	
	public Flight getFlight(){
		return flight;		
}
	public void setFlight(Flight flight){
		this.flight=flight;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<Order> orderList) {
		Order.orderList = orderList;
	}

	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus){
		this.flightStatus=flightStatus;
	}
	
	
	
	public static void reserve(String yourFlightID,String passageID) {
		Order order=new Order();
		for (int i = 0; i < Flight.flightList.size(); i++) {
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID) && Flight.flightList.get(i).getFlightStatus().equals("UNPUBLISH")){
				System.out.println("抱歉，此航班尚未发布，您无法预定该航班.");
			}
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID) && Flight.flightList.get(i).getFlightStatus().equals("FULL")){
				System.out.println("抱歉，此航班已订满，您无法预定该航班。");
			}
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID) && Flight.flightList.get(i).getFlightStatus().equals("TERMINATE")){
				System.out.println("抱歉，此航班预定系统已关闭，您无法预定该航班。");
			}
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID) && Flight.flightList.get(i).getFlightStatus().equals("AVAILABLE")) {
				order.getOrder(yourFlightID,passageID);
				
			}
				
		}
  }

	public ReserveFlights(ArrayList<Order> orderList) {
		this.orderList=orderList;
		
	}
	
}
