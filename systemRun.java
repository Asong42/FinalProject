package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;
public class systemRun {
	

	//主程序
	public static void main(String[] args) {
		//初始化
		
		//初始化航班信息列表
		ArrayList<Flight> flightList=new ArrayList<Flight>();
		Flight flight0=new Flight();
		
		//初始化管理员列表
		Admin s0=new Admin("admin","admin");//初始化最开始的管理员
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		adminList.add(s0);
		
		/*
		 * 管理员的测试
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		//录入航班-第一天
		flight0.createFlight("0215001","0800","1000","深圳","北京","2017年2月15日",600,0,100, "UNPUBLISH");
		flight0.createFlight("0215002","0800","1000","深圳","上海","2017年2月15日",400,0,100, "UNPUBLISH");
		flight0.createFlight("0215003","0800","1000","北京","上海","2017年2月15日",300,0,100, "UNPUBLISH");
		flight0.createFlight("0215004","0800","1000","北京","深圳","2017年2月15日",600,0,100, "UNPUBLISH");
		flight0.createFlight("0215005","0800","1000","上海","深圳","2017年2月15日",300,0,100, "UNPUBLISH");
		flight0.createFlight("0215006","0800","1000","上海","北京","2017年2月15日",500,0,100, "UNPUBLISH");
		//录入航班-第二天
		flight0.createFlight("0123456","0100","1000","深圳","北京","2017年2月17日",666,0,100, "UNPUBLISH");
		flight0.createFlight("1234567","0200","1001","深圳","北京","2017年2月18日",664,0,100, "UNPUBLISH");
		flight0.createFlight("2345678","0300","1002","深圳","上海","2017年2月17日",555,0,100, "UNPUBLISH");
		flight0.createFlight("3456789","0400","1003","北京","深圳","2017年2月17日",666,0,100, "UNPUBLISH");
		flight0.createFlight("4567892","0500","1004","北京","深圳","2017年2月18日",664,0,100, "UNPUBLISH");
		flight0.createFlight("4567893","0600","1005","北京","上海","2017年2月17日",233,0,100, "UNPUBLISH");
		//录入航班-第三天
		flight0.createFlight("4567894","0700","1006","北京","上海","2017年2月18日",234,0,100, "UNPUBLISH");
		flight0.createFlight("4567895","0800","1007","上海","深圳","2017年2月17日",555,0,100, "UNPUBLISH");
		flight0.createFlight("4567896","0900","1008","上海","深圳","2017年2月18日",556,0,100, "UNPUBLISH");
		flight0.createFlight("4567897","1000","1009","上海","北京","2017年2月17日",233,0,100, "UNPUBLISH");
		flight0.createFlight("4567898","1100","1010","上海","北京","2017年2月18日",234,0,100, "UNPUBLISH");
		flight0.createFlight("4567899","1200","1011","上海","北京","2017年2月19日",257,0,100, "UNPUBLISH");

		
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
				String adminName=input.nextLine();
				System.out.println("请输入管理员密码");
				String adminPW=input.nextLine();
				Admin admin0=new Admin(adminName,adminPW);
				boolean login=admin0.loginAdmin(adminName, adminPW);
				
				//认证通过选择下一步功能
				if(login==true){
					Admin admin=new Admin();
					System.out.println("1.新增管理员\n"
							+ "2.添加航班\n"
							+ "3.修改航班状态\n"
							+ "4.查询航班信息\n"
							+ "");
					
					int function = input.nextInt();
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					
					else if(function==2){
						
					}
				}
				else{
					System.out.print("用户名或密码错误");
				}
				//内容重复调用还没写
				
			}
			//查询航班信息
			else if(number==2){
				//初始化
				for (Flight j : flightList) {
					System.out.println(j.getarravalTime());
				}
			}
			
			//退出程序
			else if(number==6){
				System.exit(0);
			}
				
			}
				
		}

	}


