package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;

public class systemRun {
	//一次性输出全部的航班信息
	/*public void showFlight(ArrayList<Flight> flightList){
		Flight flight=new Flight();
		System.out.println(flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
				+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
				+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
	}*/

	//主程序
	public static void main(String[] args) {
		//初始化
		
		
		
		//初始化管理员列表
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		
		//初始化订单列表
		ArrayList<Order> orderList=new ArrayList<Order>();
		
		//初始化乘客列表
		ArrayList<Passage> passageList=new ArrayList<Passage>();
		
		Passage passage0=new Passage("user","user");
		passageList.add(passage0);//初始化最开始的管理员
		

		Admin s0=new Admin("admin","admin");//初始化最开始的管理员
		adminList.add(s0);
		/*for (Admin j : adminList) {
		 * 
			System.out.println(j.getAdminName()+" "+j.getAdminPW());
		
		}
		
		
		 * 管理员的测试
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		
		//录入航班-第一天
				Flight f1 = new Flight("SZ0615001","08:00:00","10:30:00","深圳","北京","2017-06-15",600,0,100, "UNPUBLISH");
				Flight f2 = new Flight("SZ0615002","08:00:00","10:00:00","深圳","上海","2017-06-15",400,0,100, "UNPUBLISH");
				Flight f3 = new Flight("BJ0615003","08:00:00","09:30:00","北京","上海","2017-06-15",300,0,100, "UNPUBLISH");
				Flight f4 = new Flight("BJ0615004","09:00:00","11:30:00","北京","深圳","2017-06-15",600,0,100, "UNPUBLISH");
				Flight f5 = new Flight("SH0615005","14:30:00","16:30:00","上海","深圳","2017-06-15",300,0,100, "UNPUBLISH");
				Flight f6 = new Flight("SH0615006","16:00:00","17:30:00","上海","北京","2017-06-15",500,0,100, "UNPUBLISH");
				//录入航班-第二天
				Flight f7 = new Flight("SZ0123456","10:00:00","12:30:00","深圳","北京","2017-06-17",666,0,100, "UNPUBLISH");
				Flight f8 = new Flight("SZ1234567","12:00:00","14:30:00","深圳","北京","2017-06-18",664,0,100, "UNPUBLISH");
				Flight f9 = new Flight("SZ2345678","10:00:00","12:02:00","深圳","上海","2017-06-18",555,0,100, "UNPUBLISH");
				Flight f10 = new Flight("BJ3456789","14:00:00","16:40:00","北京","深圳","2017-06-17",666,0,100, "UNPUBLISH");
				Flight f11 = new Flight("BJ4567892","18:00:00","20:40:00","北京","深圳","2017-06-18",664,0,100, "UNPUBLISH");
				Flight f12 = new Flight("BJ4567893","16:00:00","17:30:00","北京","上海","2017-06-17",233,0,100, "UNPUBLISH");
				//录入航班-第三天
				Flight f13 = new Flight("BJ4567894","16:00:00","17:30:00","北京","上海","2017-06-18",234,0,100, "UNPUBLISH");
				Flight f14 = new Flight("SH4567895","14:30:00","16:30:00","上海","深圳","2017-06-17",555,0,100, "UNPUBLISH");
				Flight f15 = new Flight("SH4567896","09:00:00","11:08:00","上海","深圳","2017-06-18",556,0,100, "UNPUBLISH");
				Flight f16 = new Flight("SH4567897","10:00:00","11:30:00","上海","北京","2017-06-17",233,0,100, "UNPUBLISH");
				Flight f17 = new Flight("SH4567898","11:00:00","12:40:00","上海","北京","2017-06-18",234,0,100, "UNPUBLISH");
				Flight f18 = new Flight("SH4567899","12:20:00","14:00:00","上海","北京","2017-06-19",257,0,100, "AVAILABLE");
				Flight.flightList.add(f1);
				Flight.flightList.add(f2);
				Flight.flightList.add(f3);
				Flight.flightList.add(f4);
				Flight.flightList.add(f5);
				Flight.flightList.add(f6);
				Flight.flightList.add(f7);
				Flight.flightList.add(f8);
				Flight.flightList.add(f9);
				Flight.flightList.add(f10);
				Flight.flightList.add(f11);
				Flight.flightList.add(f12);
				Flight.flightList.add(f13);
				Flight.flightList.add(f14);
				Flight.flightList.add(f15);
				Flight.flightList.add(f16);
				Flight.flightList.add(f17);
				Flight.flightList.add(f18);


		
		while(true){
			//选择功能
			System.out.println("1.管理员登录, 2.查询航班信息, 3.查询订单, 4.预定航班, 5.取消订单,6.新用户注册,7.退出系统");
			System.out.print("请选择功能");
			
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			
			
			
			//管理员登录
			if(number==1){

				//管理员登录
				System.out.println("请输入管理员名");
				String adminName=input.next();
				System.out.println("请输入管理员密码");
				String adminPW=input.next();
				
				//Admin admin0=new Admin(adminName,adminPW);
				//Admin s0=new Admin("admin","admin");//初始化最开始的管理员
				//adminList.add(s0);
				/*for(Admin j : adminList){
					System.out.println(j.getAdminName()+j.getAdminPW());
				}*/
				
				//登录方法
				boolean login=false;
				for(Admin j:adminList){
					if(j.getAdminName().equals(adminName)&&j.getAdminPW().equals(adminPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				

				//认证通过选择下一步功能
				if(login==true){
					Admin admin=new Admin();
					System.out.println(
							"1.新增管理员\n"
							+ "2.添加航班\n"
							+ "3.修改航班信息\n"
							
							);
					
					int function = input.nextInt();
					//新增管理员
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					//添加航班
					else if(function==2){
						Flight flight=new Flight();
						Flight.flightList.add(flight.createFlight(Flight.flightList));
						//添加航班之后显示全部航班
						for(Flight flight1:Flight.flightList){
							System.out.println(Flight.flightList.indexOf(flight1)+" "+flight1.getFlightID()+" "+flight1.getStartTime()+" "+flight1.getArravalTime()+" "
							+flight1.getStartCity()+" "+flight1.getArrivalCity()+" "+flight1.getDepartureDate()+" "+flight1.getPrice()+" "
							+flight1.getCurrentPassengers()+" "+flight1.getSeatCapacity()+" "+flight1.getFlightStatus());
						}
					}
					//修改航班状态
					else if (function==3){
						UpdateFlight updateFlight=new UpdateFlight();
						updateFlight.change(Flight.flightList);
					}
					
					
				}
				else if(login==false){
					System.out.print("用户名或密码错误");
				}
				
				
			}
			//查询航班信息
			else if(number==2){
				int cxm=0;
				System.out.println("请选择航班查询方式：\n"
						+ "1.按照起飞城市，到达城市，出发日期查询\n"
						+ "2.通过航班号查询\n"
						+ "3.显示全部航班\n");
				cxm=input.nextInt();
				// 按起飞城市，到达城市，出发日期查询
				if (cxm == 1) {
					Scanner cx1=new Scanner(System.in);
					System.out.println("请输入起飞城市");
					String yourStartCity = cx1.next();
					System.out.println("请输入到达城市");
					String yourArrivalCity = cx1.next();
					System.out.println("请输入出行时间");
					String yourDepartureDate = cx1.next();
					QuiryFlight.quiry1(yourStartCity, yourArrivalCity, yourDepartureDate);
				}

				// 通过航班号查询
				if (cxm == 2) {
					Scanner cx2=new Scanner(System.in);
					System.out.println("请输入您想查询的航班号（可模糊查询）:");
					String yourFlightID = cx2.next();
				QuiryFlight.quiry2(yourFlightID);
				}
				
				//显示全部航班
				if(cxm == 3){
					for(Flight flight:Flight.flightList){
						System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
					}
				}
			}
			
			//第三个功能,查询订单
			else if(number==3){
				
				System.out.print("用户登录\n");
				System.out.println("请输入用户名");
				String userName=input.next();
				System.out.println("请输入用户密码");
				String userPW=input.next();
				
				//用户登录
				boolean login=false;
				for(Passage j:passageList){
					if(j.getPassengerID().equals(userName)&&j.getPassword().equals(userPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				System.out.print(login);

				if(login==true){
					
						//查询订单
						QuiryOrders quiry=new QuiryOrders(orderList);
						quiry.quiryOrders(userName);
						
					}
				else{
					System.out.println("用户不存在");
				}
				
			}
			
			//第四个功能
			//预定航班
			else if(number==4){
				//显示所有航班
				for(Flight flight:Flight.flightList){
					System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
					+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
					+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
				}
				//预定航班操作
				System.out.print("用户登录\n");
				System.out.println("请输入用户名");
				String userName=input.next();
				System.out.println("请输入用户密码");
				String userPW=input.next();
				//用户登录
				boolean login=false;
				for(Passage j:passageList){
					if(j.getPassengerID().equals(userName)&&j.getPassword().equals(userPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				if(login){

				Scanner r = new Scanner(System.in);
				System.out.println("请输入您将预定的航班的航班号:");
				String yourFlightID = r.next();

				ReserveFlights.reserve(yourFlightID, userName);
			}
				else {
					System.out.print("用户不存在");
				}
			}
			//第五个功能
			//取消订单
			else if(number==5){
				System.out.print("用户登录\n");
				System.out.println("请输入用户名");
				String userName=input.next();
				System.out.println("请输入用户密码");
				String userPW=input.next();
				
				//用户登录
				boolean login=false;
				for(Passage j:passageList){
					if(j.getPassengerID().equals(userName)&&j.getPassword().equals(userPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				
				UnsubscribeFlight unsubscribeFlight=new UnsubscribeFlight(orderList, Flight.flightList);
				unsubscribeFlight.unsubscribeFlight(orderList, Flight.flightList);
			}
			
			//第六个功能
			//新用户注册
			else if (number==6){
				Passage passage =new Passage();
				passageList.add(passage.createPassage());
			}
			//第七个功能
			//退出程序
			else if(number==7){
				System.out.println("感谢您选择我们的航班服务系统！");
				break;
			}
				
		}

		}

	}


