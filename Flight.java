package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;
public class Flight {
	//Flight信息处理
	private String FlightID;
	private String startTime;
	private String arravalTime;
	private String startCity;
	private String arrivalCity;
	private String departureDate;
	private int price;//价格
	private int currentPassengers;//人数
	private int seatCapacity;//容量
	private String flightStatus;
	public ArrayList<Passage> passengerID;
	public static ArrayList<Flight> flightList;
	
	public Flight(String FlightID ,String startTime ,String arravalTime,  String startCity ,String arrivalCity ,
			String departureDate ,int price , int currentPassengers , int seatCapacity , String flightStatus){
		this.FlightID=FlightID;
		this.startTime=startTime;
		this.arravalTime=arravalTime;
		this.startCity=startCity;
		this.arrivalCity=arrivalCity;
		this.departureDate=departureDate;
		this.price=price;
		this.seatCapacity=seatCapacity;
		this.flightStatus=flightStatus;
				}
	

	public Flight(String flightID2, String startTime2, String arravalTime2, String startCity2, String arrivalCity2, String departureDate2, int price2, int currentPassengers2, int seatCapacity2, String flightStatus2, ArrayList<Flight> flightList2) {
		this.FlightID=FlightID;
		this.startTime=startTime;
		this.arravalTime=arravalTime;
		this.startCity=startCity;
		this.arrivalCity=arrivalCity;
		this.departureDate=departureDate;
		this.price=price;
		this.seatCapacity=seatCapacity;
		this.flightStatus=flightStatus;
		this.flightList=flightList2;
	}

	public Flight() {
		// TODO Auto-generated constructor stub
	}


	//获取航班号、设置航班号
	public String getFlightID(){
		return FlightID;
	}
	
	public void setFlightID(String newValue){
		FlightID = newValue;
	}
	
	//设置起飞时间、获取起飞时间
	public String getStartTime(){
		return startTime;
	}
	
	public void setStartTime(String newValue){
		startTime = newValue;
	}
	
	//设置起飞时间、获取起飞时间
	public String getarravalTime(){
		return arravalTime;
	}
	
	public void setArravalTime(String newValue){
		arravalTime = newValue;
	}
	
	//起飞城市
	public String getStartCity(){
		return startCity;
	}
	
	public void setStartCity(String newValue){
		startCity = newValue;
	}
	
	//降落城市
	public String getArrivalCity(){
		return arrivalCity;
	}
	
	public void setArrivalCity(String newValue){
		arrivalCity = newValue;
	}
	

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCurrentPassengers() {
		return currentPassengers;
	}

	public void setCurrentPassengers(int currentPassengers) {
		this.currentPassengers = currentPassengers;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}

	public ArrayList<Passage> getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(ArrayList<Passage> passengerID) {
		this.passengerID = passengerID;
	}

	public String getArravalTime() {
		return arravalTime;
	}
	
	ArrayList<Flight> FlightList=new ArrayList<Flight>();
	
	public ArrayList<Flight> getFlightList() {
		return FlightList;
	}

	public void setFlightList(ArrayList<Flight> flightList) {
		FlightList = flightList;
	}
	//显示全部航班信息
	public void showFlightList(ArrayList<Flight> flightList){
		for (Flight j : flightList) {
			System.out.println(j);
		}
	}

	//创建初始航班
	public void createFlight(String FlightID ,String startTime ,String arravalTime,  String startCity ,String arrivalCity ,
			String departureDate ,int price , int currentPassengers , int seatCapacity , String flightStatus, ArrayList<Flight> flightList){
		Flight flight =new Flight(  FlightID , startTime , arravalTime,  startCity , arrivalCity , 
				departureDate , price , currentPassengers , seatCapacity,flightStatus ,flightList);
		FlightList.add(flight);
	}
	
	//创建航班方法
	public Flight createFlight(){
		Scanner input=new Scanner(System.in);
		System.out.println(getFlightID());
		
		return null;
		
	}
	//删除航班
	public void deleteFlight(String FlightID ,String startTime ,String arravalTime,  String startCity ,String arrivalCity ,String departureDate ,int price , int currentPassengers , int seatCapacity , String flightStatus ){
		Flight flight =new Flight(  FlightID , startTime , arravalTime,  startCity , arrivalCity , departureDate , price , currentPassengers , seatCapacity,flightStatus );
		FlightList.remove(flight);
	}
	
	//查询flightList中特定航班的下标
	public void quiryFlightIndex(ArrayList<Flight> flightList){
		Scanner input=new Scanner(System.in);
		Flight flight=new Flight();
		int index=0;
		index=input.nextInt();
		
		System.out.println("修改航班状态为：");
		String status=input.next();
		
	}
	//修改航班状态
	//public void changeFlightStatus(String ){
		
	//}
	
	
	public static void main(String []args){

	
		
		
	}
	
}
