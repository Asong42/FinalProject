package FlightOrder;

import java.util.Date;

public class Order {
	
	//��������ڲ�ѯ���޸Ķ�����Ϣ��
	//��������ĳ˿�ID����λ��String��������ţ�Flight����ʱ�䣨Date��������״̬��OrderSatus��
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
	
	//status����״̬
	public OrderStatus getStatus(){
		return status;		
}
	public void setSatus(OrderStatus newValue){
		status=newValue;
	}
	

	

}
