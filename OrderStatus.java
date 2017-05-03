package FlightOrder;

public class OrderStatus {
	//这个class可以用来处理有关航班状态（status）
	private String status;
	
	public OrderStatus(String oStatus){
		status= oStatus;
	}
	//method 
	public void setStatus(String newValue){
		status=newValue;
	}
	public String getStatus(String newValue){
		return status=newValue;
	}

}
