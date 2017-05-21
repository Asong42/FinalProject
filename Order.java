package FlightOrder;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Order {
	
	//这个类用于查询、修改订单信息。
	//包括航班的乘客ID、座位（String）、航班号（Flight）、预订日期（Date）、航班状态（orderSatus）
	public static ArrayList<Order> orderList=new ArrayList<Order>();
	//Order信息处理
	private String passageID;
	private String orderNumber;
	private String seat;
	private String flight;
	private String createDate;
	private String orderStatus;
	
	public Order (String passageID,String orderNumber,String seat,String flight,String createDate, String orderStatus){
		this.passageID=passageID;
		this.orderNumber=orderNumber;
		this.seat=seat;
		this.flight=flight;
		this.createDate=createDate;
		this.orderStatus=orderStatus;
	}
	
	public String getPassageID() {
		return passageID;
	}
	public void setPassageID(String passageID) {
		this.passageID = passageID;
	}
		
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getSeat(){
		return seat;
	}
	public void setSeat(String seat){
		this.seat=seat;
	}
	
	public String getFlight(){
		return flight;		
}
	public void setFlight(String flight){
		this.flight=flight;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
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

	public Order() {
		
	}
	
	
	

	public Order(ArrayList<Order> orderList) {
		// TODO Auto-generated constructor stub
	}

	//显示已有订单
	public void showOrder(){
		for(Order list:orderList){
			System.out.println(list);
		}
	}

	
	
	
	//下订单
	public  Order getOrder(String yourFlightID,String passageID) {

		String orderNumber=yourFlightID+" "+passageID;
		String seat = null;
		for (int i = 0; i < Flight.flightList.size(); i++) {
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID)) {
			String flight = String.valueOf("航班号："+Flight.flightList.get(i).getFlightID()+"/n起飞时间："+Flight.flightList.get(i).getStartTime()+"/n到达时间："
					+Flight.flightList.get(i).getArravalTime()+"/n起飞城市："+Flight.flightList.get(i).getStartCity()+"/n到达城市："+Flight.flightList.get(i).getArrivalCity()
					+"/n出发日期："+Flight.flightList.get(i).getDepartureDate()+"/n航班价格："+Flight.flightList.get(i).getPrice()+"/n乘客人数："+Flight.flightList.get(i).getCurrentPassengers()
					+"/n航班容量："+Flight.flightList.get(i).getSeatCapacity()+"/n航班状态："+Flight.flightList.get(i).getFlightStatus());
		   seat = String.valueOf(Flight.flightList.get(i).getCurrentPassengers()+1);
			}
		}
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String createDate = df.format(new Date());
		String orderStatus = "UNPAID";
		
		Order o = new Order(passageID,orderNumber,seat,yourFlightID, createDate,orderStatus);
		System.out.println("用户名："+o.getPassageID()+"\n订单编号："+o.getOrderNumber()+"\n座位号："+
		o.getSeat()+"航班信息："+o.getFlight()+"预定日期："+o.getCreateDate()+"订单状态："+o.getOrderStatus());

		if (orderStatus.equals("UNPAID"))
		{
			System.out.println("确认支付吗?(请填写 \"是\" 或者 \"否\")");
		    Scanner yn = new Scanner(System.in);
			String y = yn.next();

			if (y.equals("是"))
			{
				System.out.println("预定成功！");
				o.setOrderStatus("PAID");
				for (int i1 = 0; i1 < Flight.flightList.size(); i1++) {
					if (Flight.flightList.get(i1).getFlightID().equals(yourFlightID)){
						int m = Flight.flightList.get(i1).getCurrentPassengers();
						m++;
						 Flight.flightList.get(i1).setCurrentPassengers(m);//预定成功，当前乘客数+1
						 if(Flight.flightList.get(i1).getCurrentPassengers()==Flight.flightList.get(i1).getSeatCapacity()){
							Flight.flightList.get(i1).getFlightStatus().equals("FULL");//订满，状态变化为满
							
						 }
					}
	         
				break;}
			}
			
		   }
		
		return o;
}

	

	public static String Orders() {
		// TODO Auto-generated method stub
		return null;
	}



		
	
	public void delOrder(){
		
	}




}