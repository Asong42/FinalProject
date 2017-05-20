package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;
public class Passage {
	
	//�˿���Ϣ
	private String passengerID;
	private String realName;
	private String identityID;
	private String password;
	public ArrayList<Order> orderList;
	
	
	public String getPassengerID() {
		return passengerID;
	}
	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getIdentityID() {
		return identityID;
	}
	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}
	
	public Passage(String passageID, String password){
		this.passengerID=passageID;
		this.password=password;
	}
	
	public Passage(String passageID, String realName, String password,String identityID){
		this.passengerID=passageID;
		this.realName=realName;
		this.password=password;
		this.identityID=identityID;
	}
	
	public Passage() {
		// TODO Auto-generated constructor stub
	}
	//�����ÿͷ���
	public Passage createPassage(){
		
		Scanner input=new Scanner(System.in);
		System.out.println("�������û���");
		String passageID=input.next();
		System.out.println("����������");
		String password=input.next();
		System.out.println("��������ʵ����");
		String realName=input.next();
		System.out.println("������֤����");
		String identityID=input.next();
		
		Passage s=new Passage(passageID, realName, password, identityID);
		return s;
		
	}
	
	

	
}
