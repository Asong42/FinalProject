package FlightOrder;

import java.util.Date;

public class Order {
	
	//这个类用于查询、修改订单信息。
	//包括航班的乘客ID、座位（String）、航班号（Flight）、时间（Date）、航班状态（OrderSatus）
	private String seat;
	private OrderStatus status;
	private Flight flight;
	private int passageID;
	private Date createDate;
	
	public Order (int passageID,String seat,Flight flight,Date createDate,OrderStatus status){
		this.passageID=passageID;
		this.seat=seat;
		this.flight=flight;
		this.createDate=createDate;
		this.status=status;
	}
	//passageID
	public int getID(){
		return passageID;		
}
	public void setID(int newValue){
		passageID=newValue;
	}
	
	//seat
	public String getSeat(){
		return seat;		
}
	public void setSeat(String newValue){
		seat=newValue;
	}
	
	//flight
	public Flight getFlight(){
		return flight;		
}
	public void setFlight(Flight newValue){
		flight=newValue;
	}
	
	//date
	public Date getDate(){
		return createDate;		
}
	public void getDate(Date newValue){
		createDate=newValue;
	}
	
	//status订单状态
	public OrderStatus getStatus(){
		return status;		
}
	public void setSatus(OrderStatus newValue){
		status=newValue;
	}
	

	

}
