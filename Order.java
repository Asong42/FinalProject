package FlightOrder;
import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	//这个类用于查询、修改订单信息。
	//包括航班的乘客ID、座位（String）、航班号（Flight）、时间（Date）、航班状态（OrderSatus）
	ArrayList<Order> OrderList=new ArrayList<Order>();
	private int orderNumber;
	private String seat;
	private Flight flight;
	private int passageID;
	private Date createDate;
	
	public Order (int passageID,String seat,Flight flight,Date createDate){
		this.passageID=passageID;
		this.seat=seat;
		this.flight=flight;
		this.createDate=createDate;
	}
	public ArrayList<Order> getOrderList() {
		return OrderList;
	}
	public void setOrderList(ArrayList<Order> orderList) {
		OrderList = orderList;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getPassageID() {
		return passageID;
	}
	public void setPassageID(int passageID) {
		this.passageID = passageID;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Order() {
		// TODO Auto-generated constructor stub
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
	/*public OrderStatus getStatus(){
		return status;		
}
	public void setSatus(OrderStatus newValue){
		status=newValue;
	}*/
	
	//显示已有订单
	public void showOrder(){
		for(Order list:OrderList){
			System.out.println(list);
		}
	}
	

	
	//下订单
	


	

}
