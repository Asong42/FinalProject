package FlightOrder;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Order {
	
	//��������ڲ�ѯ���޸Ķ�����Ϣ��
	//��������ĳ˿�ID����λ��String��������ţ�Flight����Ԥ�����ڣ�Date��������״̬��orderSatus��
	public static ArrayList<Order> orderList=new ArrayList<Order>();
	//Order��Ϣ����
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

	//��ʾ���ж���
	public void showOrder(){
		for(Order list:orderList){
			System.out.println(list);
		}
	}

	
	
	
	//�¶���
	public  void getOrder(String yourFlightID,String passageID) {

		String orderNumber=yourFlightID+" "+passageID;
		for (int i = 0; i < Flight.flightList.size(); i++) {
			if (Flight.flightList.get(i).getFlightID().equals(yourFlightID)) {
			String flight = String.valueOf("����ţ�"+Flight.flightList.get(i).getFlightID()+"/n���ʱ�䣺"+Flight.flightList.get(i).getStartTime()+"/n����ʱ�䣺"
					+Flight.flightList.get(i).getArravalTime()+"/n��ɳ��У�"+Flight.flightList.get(i).getStartCity()+"/n������У�"+Flight.flightList.get(i).getArrivalCity()
					+"/n�������ڣ�"+Flight.flightList.get(i).getDepartureDate()+"/n����۸�"+Flight.flightList.get(i).getPrice()+"/n�˿�������"+Flight.flightList.get(i).getCurrentPassengers()
					+"/n����������"+Flight.flightList.get(i).getSeatCapacity()+"/n����״̬��"+Flight.flightList.get(i).getFlightStatus());
		   String seat = String.valueOf(Flight.flightList.get(i).getCurrentPassengers()+1);
			}
		
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String createDate = df.format(new Date());
		String orderStatus = "UNPAID";
		
		Order o = new Order(passageID,orderNumber,seat,flight, createDate,orderStatus);
		System.out.println("�û�����"+o.getPassageID()+"/n������ţ�"+o.getOrderNumber()+"/n��λ�ţ�"+
		o.getSeat()+"������Ϣ��"+o.getFlight()+"Ԥ�����ڣ�"+o.getCreateDate()+"����״̬��"+o.getOrderStatus());
		orderList.add(o);
		if (orderStatus.equals("UNPAID"))
		{
			System.out.println("ȷ��֧����?(����д \"��\" ���� \"��\")");
		    Scanner yn = new Scanner(System.in);
			String y = yn.next();

			if (y.equals("��"))
			{
				System.out.println("Ԥ���ɹ���");
				o.setOrderStatus("PAID");
				for (int i1 = 0; i1 < Flight.flightList.size(); i1++) {
					if (Flight.flightList.get(i1).getFlightID().equals(yourFlightID)){
						int m = Flight.flightList.get(i1).getCurrentPassengers();
						m++;
						 Flight.flightList.get(i1).setCurrentPassengers(m);//Ԥ���ɹ�����ǰ�˿���+1
						 if(Flight.flightList.get(i1).getCurrentPassengers()==Flight.flightList.get(i1).getSeatCapacity()){
							Flight.flightList.get(i1).getFlightStatus().equals("FULL");//������״̬�仯Ϊ��
						 }
					}
	            }
			}
		   }
		}

}

	public static String Orders() {
		// TODO Auto-generated method stub
		return null;
	}



		
	
	public void delOrder(){
		
	}




}