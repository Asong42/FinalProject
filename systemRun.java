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
		
		//初始化航班信息列表
		ArrayList<Flight> flightList=new ArrayList<Flight>();
		
		//初始化管理员列表
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		
		
		/*for (Admin j : adminList) {
			System.out.println(j.getAdminName()+" "+j.getAdminPW());
		
		}
		
		
		 * 管理员的测试
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		
		//录入航班-第一天
				Flight f1 = new Flight("SZ0615001","08:00:00","10:30:00","深圳","北京","2017-6-15",600,0,100, "UNPUBLISH");
				Flight f2 = new Flight("SZ0615002","08:00:00","10:00:00","深圳","上海","2017-6-15",400,0,100, "UNPUBLISH");
				Flight f3 = new Flight("BJ0615003","08:00:00","09:30:00","北京","上海","2017-6-15",300,0,100, "UNPUBLISH");
				Flight f4 = new Flight("BJ0615004","09:00:00","11:30:00","北京","深圳","2017-6-15",600,0,100, "UNPUBLISH");
				Flight f5 = new Flight("SH0615005","14:30:00","16:30:00","上海","深圳","2017-6-15",300,0,100, "UNPUBLISH");
				Flight f6 = new Flight("SH0615006","16:00:00","17:30:00","上海","北京","2017-6-15",500,0,100, "UNPUBLISH");
				//录入航班-第二天
				Flight f7 = new Flight("SZ0123456","10:00:00","12:30:00","深圳","北京","2017-6-17",666,0,100, "UNPUBLISH");
				Flight f8 = new Flight("SZ1234567","12:00:00","14:30:00","深圳","北京","2017-6-18",664,0,100, "UNPUBLISH");
				Flight f9 = new Flight("SZ2345678","10:00:00","12:02:00","深圳","上海","2017-6-18",555,0,100, "UNPUBLISH");
				Flight f10 = new Flight("BJ3456789","14:00:00","16:40:00","北京","深圳","2017-6-17",666,0,100, "UNPUBLISH");
				Flight f11 = new Flight("BJ4567892","18:00:00","20:40:00","北京","深圳","2017-6-18",664,0,100, "UNPUBLISH");
				Flight f12 = new Flight("BJ4567893","16:00:00","17:30:00","北京","上海","2017-6-17",233,0,100, "UNPUBLISH");
				//录入航班-第三天
				Flight f13 = new Flight("BJ4567894","16:00:00","17:30:00","北京","上海","2017-6-18",234,0,100, "UNPUBLISH");
				Flight f14 = new Flight("SH4567895","14:30:00","16:30:00","上海","深圳","2017-6-17",555,0,100, "UNPUBLISH");
				Flight f15 = new Flight("SH4567896","09:00:00","11:08:00","上海","深圳","2017-6-18",556,0,100, "UNPUBLISH");
				Flight f16 = new Flight("SH4567897","10:00:00","11:30:00","上海","北京","2017-6-17",233,0,100, "UNPUBLISH");
				Flight f17 = new Flight("SH4567898","11:00:00","12:40:00","上海","北京","2017-6-18",234,0,100, "UNPUBLISH");
				Flight f18 = new Flight("SH4567899","12:20:00","14:00:00","上海","北京","2017-6-19",257,0,100, "UNPUBLISH");
				flightList.add(f1);
				flightList.add(f2);
				flightList.add(f3);
				flightList.add(f4);
				flightList.add(f5);
				flightList.add(f6);
				flightList.add(f7);
				flightList.add(f8);
				flightList.add(f9);
				flightList.add(f10);
				flightList.add(f11);
				flightList.add(f12);
				flightList.add(f13);
				flightList.add(f14);
				flightList.add(f15);
				flightList.add(f16);
				flightList.add(f17);
				flightList.add(f18);


		
		while(true){
			//选择功能
			System.out.println("1.管理员登录, 2.查询航班信息, 3.查询订单, 4.预定航班, 5.取消订单,6.退出系统");
			System.out.print("请选择功能");
			
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			
			
			
			//管理员登录
			if(number==1){

				//系统运行
				System.out.println("请输入管理员名");
				String adminName=input.next();
				System.out.println("请输入管理员密码");
				String adminPW=input.next();
				
				Admin admin0=new Admin(adminName,adminPW);
				Admin s0=new Admin("admin","admin");//初始化最开始的管理员
				adminList.add(s0);
				boolean login=adminList.contains(s0);
				

				//认证通过选择下一步功能
				if(login==true){
					Admin admin=new Admin();
					System.out.println(
							"1.新增管理员\n"
							+ "2.添加航班\n"
							+ "3.修改航班状态\n"
							+ "4.查询航班信息\n"
							);
					
					int function = input.nextInt();
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					//添加航班
					else if(function==2){
						int function1=0;
						function1 = input.nextInt();
					for(Flight j:flightList){
						j.showFlightList(flightList);
						}
					}
					//修改航班状态
					else if (function==3){
						
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
					System.out.println("请输入起飞城市");
					String yourStartCity = input.next();
					System.out.println("请输入到达城市");
					String yourArrivalCity = input.next();
					System.out.println("请输入出行时间");
					String yourDepartureDate = input.next();
					QuiryFlight.quiry1(yourStartCity, yourArrivalCity, yourDepartureDate);
				}

				// 通过航班号查询
				if (cxm == 2) {
						System.out.println("Please input the Flight ID you want:");
						String yourFlightID = input.next();
					QuiryFlight.quiry2(yourFlightID);
				}
				
				//显示全部航班
				if(cxm == 3){
					for(Flight flight:flightList){
						System.out.println(flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
					}
				}
			}
	
			//第六个功能
			//退出程序
			else if(number==6){
				System.exit(0);
			}
				
		}

		}

	}


