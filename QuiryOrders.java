package FlightOrder;

import java.util.ArrayList;

//by �����
public class QuiryOrders {
	private ArrayList<Order> orderList;
	
	public QuiryOrders(ArrayList<Order> orderList){
		this.orderList=orderList;
	}
	
	public void quiryOrders(String userName){
		int t=orderList.size();
		if(t!=0){
			System.out.println("���Ķ�����"+orderList.size()+"��:");
			for(Order j:orderList){
				if(userName.equals(j.getPassageID())){
					System.out.println(j.getOrderNumber()+" "+j.getPassageID()+" "+j.getSeat()+" "+
						j.getFlight()+" "+j.getOrderStatus());
			}
		}
		}
		else{
			System.out.println("��û�ж���");
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
