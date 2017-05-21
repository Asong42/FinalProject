package FlightOrder;

import java.util.ArrayList;

//by 濮明扬
public class QuiryOrders {
	private ArrayList<Order> orderList;
	
	public QuiryOrders(ArrayList<Order> orderList){
		this.orderList=orderList;
	}
	
	public void quiryOrders(String userName,ArrayList<Order> orderList){
		int t=orderList.size();
		if(t!=0){
			for(Order j:orderList){
				if(userName.equals(j.getPassageID())){
					System.out.println(j.getOrderNumber()+" "+j.getPassageID()+" "+j.getSeat()+" "+
						j.getFlight()+" "+j.getOrderStatus());
			}
		}
		}
		else{
			System.out.println("您没有订单");
		}
	}
	public static String getOrderID()
	{
		return Order.Orders();
	}
	
	public static void quiryOrder()
	{
		System.out.println(getOrderID());
	}
}
