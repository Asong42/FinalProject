package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;

public class systemRun {
	//һ�������ȫ���ĺ�����Ϣ
	/*public void showFlight(ArrayList<Flight> flightList){
		Flight flight=new Flight();
		System.out.println(flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
				+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
				+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
	}*/

	//������
	public static void main(String[] args) {
		//��ʼ��
		
		
		
		//��ʼ������Ա�б�
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		
		//��ʼ�������б�
		ArrayList<Order> orderList=new ArrayList<Order>();
		
		//��ʼ���˿��б�
		ArrayList<Passage> passageList=new ArrayList<Passage>();
		
		Passage passage0=new Passage("user","user");
		passageList.add(passage0);//��ʼ���ʼ�Ĺ���Ա
		

		Admin s0=new Admin("admin","admin");//��ʼ���ʼ�Ĺ���Ա
		adminList.add(s0);
		/*for (Admin j : adminList) {
		 * 
			System.out.println(j.getAdminName()+" "+j.getAdminPW());
		
		}
		
		
		 * ����Ա�Ĳ���
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		
		//¼�뺽��-��һ��
				Flight f1 = new Flight("SZ0615001","08:00:00","10:30:00","����","����","2017-06-15",600,0,100, "UNPUBLISH");
				Flight f2 = new Flight("SZ0615002","08:00:00","10:00:00","����","�Ϻ�","2017-06-15",400,0,100, "UNPUBLISH");
				Flight f3 = new Flight("BJ0615003","08:00:00","09:30:00","����","�Ϻ�","2017-06-15",300,0,100, "UNPUBLISH");
				Flight f4 = new Flight("BJ0615004","09:00:00","11:30:00","����","����","2017-06-15",600,0,100, "UNPUBLISH");
				Flight f5 = new Flight("SH0615005","14:30:00","16:30:00","�Ϻ�","����","2017-06-15",300,0,100, "UNPUBLISH");
				Flight f6 = new Flight("SH0615006","16:00:00","17:30:00","�Ϻ�","����","2017-06-15",500,0,100, "UNPUBLISH");
				//¼�뺽��-�ڶ���
				Flight f7 = new Flight("SZ0123456","10:00:00","12:30:00","����","����","2017-06-17",666,0,100, "UNPUBLISH");
				Flight f8 = new Flight("SZ1234567","12:00:00","14:30:00","����","����","2017-06-18",664,0,100, "UNPUBLISH");
				Flight f9 = new Flight("SZ2345678","10:00:00","12:02:00","����","�Ϻ�","2017-06-18",555,0,100, "UNPUBLISH");
				Flight f10 = new Flight("BJ3456789","14:00:00","16:40:00","����","����","2017-06-17",666,0,100, "UNPUBLISH");
				Flight f11 = new Flight("BJ4567892","18:00:00","20:40:00","����","����","2017-06-18",664,0,100, "UNPUBLISH");
				Flight f12 = new Flight("BJ4567893","16:00:00","17:30:00","����","�Ϻ�","2017-06-17",233,0,100, "UNPUBLISH");
				//¼�뺽��-������
				Flight f13 = new Flight("BJ4567894","16:00:00","17:30:00","����","�Ϻ�","2017-06-18",234,0,100, "UNPUBLISH");
				Flight f14 = new Flight("SH4567895","14:30:00","16:30:00","�Ϻ�","����","2017-06-17",555,0,100, "UNPUBLISH");
				Flight f15 = new Flight("SH4567896","09:00:00","11:08:00","�Ϻ�","����","2017-06-18",556,0,100, "UNPUBLISH");
				Flight f16 = new Flight("SH4567897","10:00:00","11:30:00","�Ϻ�","����","2017-06-17",233,0,100, "UNPUBLISH");
				Flight f17 = new Flight("SH4567898","11:00:00","12:40:00","�Ϻ�","����","2017-06-18",234,0,100, "UNPUBLISH");
				Flight f18 = new Flight("SH4567899","12:20:00","14:00:00","�Ϻ�","����","2017-06-19",257,0,100, "AVAILABLE");
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
			//ѡ����
			System.out.println("1.����Ա��¼, 2.��ѯ������Ϣ, 3.��ѯ����, 4.Ԥ������, 5.ȡ������,6.���û�ע��,7.�˳�ϵͳ");
			System.out.print("��ѡ����");
			
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			
			
			
			//����Ա��¼
			if(number==1){

				//����Ա��¼
				System.out.println("���������Ա��");
				String adminName=input.next();
				System.out.println("���������Ա����");
				String adminPW=input.next();
				
				//Admin admin0=new Admin(adminName,adminPW);
				//Admin s0=new Admin("admin","admin");//��ʼ���ʼ�Ĺ���Ա
				//adminList.add(s0);
				/*for(Admin j : adminList){
					System.out.println(j.getAdminName()+j.getAdminPW());
				}*/
				
				//��¼����
				boolean login=false;
				for(Admin j:adminList){
					if(j.getAdminName().equals(adminName)&&j.getAdminPW().equals(adminPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				

				//��֤ͨ��ѡ����һ������
				if(login==true){
					Admin admin=new Admin();
					System.out.println(
							"1.��������Ա\n"
							+ "2.��Ӻ���\n"
							+ "3.�޸ĺ�����Ϣ\n"
							+ "4.��ѯע���û���Ϣ\n"
							+ "5.��ѯ���к�����Ϣ"
							
							);
					
					int function = input.nextInt();
					//��������Ա
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					//��Ӻ���
					else if(function==2){
						Flight flight=new Flight();
						Flight.flightList.add(flight.createFlight(Flight.flightList));
						//��Ӻ���֮����ʾȫ������
						for(Flight flight1:Flight.flightList){
							System.out.println(Flight.flightList.indexOf(flight1)+" "+flight1.getFlightID()+" "+flight1.getStartTime()+" "+flight1.getArravalTime()+" "
							+flight1.getStartCity()+" "+flight1.getArrivalCity()+" "+flight1.getDepartureDate()+" "+flight1.getPrice()+" "
							+flight1.getCurrentPassengers()+" "+flight1.getSeatCapacity()+" "+flight1.getFlightStatus());
						}
					}
					//�޸ĺ���״̬
					else if (function==3){
						UpdateFlight updateFlight=new UpdateFlight();
						updateFlight.change(Flight.flightList);
					}
					
					//��ѯ�˿���Ϣ
					else if(function==4){
						System.out.println("��ע���û�\n"
								+ "�û���       ��ʵ����      ֤����      ����");
						for(Passage j:passageList){
							int t=0;
							t++;
							System.out.println(t+" "+j.getPassengerID()+" "+j.getRealName()+" "+j.getIdentityID()+" "+j.getOrderList());
						}
					}
					
					//��ѯ������Ϣ
					else if(function==5){
						System.out.println("Ŀǰ������Ϣ");
						for(Order o:orderList){
							for(Order f:orderList){
									System.out.println(o.getOrderNumber()+" "+o.getFlight()+" "+o.getPassageID()+" "+o.getSeat());
								
							}
					}
					}
				}
				else if(login==false){
					System.out.print("�û������������");
				}
				
				
			}
			//��ѯ������Ϣ
			else if(number==2){
				int cxm=0;
				System.out.println("��ѡ�񺽰��ѯ��ʽ��\n"
						+ "1.������ɳ��У�������У��������ڲ�ѯ\n"
						+ "2.ͨ������Ų�ѯ\n"
						+ "3.��ʾȫ������\n");
				cxm=input.nextInt();
				// ����ɳ��У�������У��������ڲ�ѯ
				if (cxm == 1) {
					Scanner cx1=new Scanner(System.in);
					System.out.println("��������ɳ���");
					String yourStartCity = cx1.next();
					System.out.println("�����뵽�����");
					String yourArrivalCity = cx1.next();
					System.out.println("���������ʱ��");
					String yourDepartureDate = cx1.next();
					QuiryFlight.quiry1(yourStartCity, yourArrivalCity, yourDepartureDate);
				}

				// ͨ������Ų�ѯ
				if (cxm == 2) {
					Scanner cx2=new Scanner(System.in);
					System.out.println("�����������ѯ�ĺ���ţ���ģ����ѯ��:");
					String yourFlightID = cx2.next();
				QuiryFlight.quiry2(yourFlightID);
				}
				
				//��ʾȫ������
				if(cxm == 3){
					for(Flight flight:Flight.flightList){
						System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
					}
				}
			}
			
			//����������,��ѯ����
			else if(number==3){
				
				System.out.print("�û���¼\n");
				System.out.println("�������û���");
				String userName=input.next();
				System.out.println("�������û�����");
				String userPW=input.next();
				
				//�û���¼
				boolean login=false;
				for(Passage j:passageList){
					if(j.getPassengerID().equals(userName)&&j.getPassword().equals(userPW)){
						login=true;
					}
					else{
						login=false;
					}
				}

				if(login==true){
					
						//��ѯ����
						QuiryOrders quiry=new QuiryOrders(orderList);
						quiry.quiryOrders(userName,orderList);

					}
				else{
					System.out.println("�û�������");
				}
				
			}
			
			//���ĸ�����
			//Ԥ������
			else if(number==4){
				//��ʾ���к���
				for(Flight flight:Flight.flightList){
					System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
					+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
					+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
				}
				//Ԥ���������
				System.out.print("�û���¼\n");
				System.out.println("�������û���");
				String userName=input.next();
				System.out.println("�������û�����");
				String userPW=input.next();
				//�û���¼
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
				System.out.println("����������Ԥ���ĺ���ĺ����:");
				String yourFlightID = r.next();

				orderList.add(ReserveFlights.reserve(yourFlightID, userName));
				
			}
				else {
					System.out.print("�û�������");
				}
			}
			//���������
			//ȡ������
			else if(number==5){
				System.out.print("�û���¼\n");
				System.out.println("�������û���");
				String userName=input.next();
				System.out.println("�������û�����");
				String userPW=input.next();
				
				//�û���¼
				boolean login=false;
				for(Passage j:passageList){
					if(j.getPassengerID().equals(userName)&&j.getPassword().equals(userPW)){
						login=true;
					}
					else{
						login=false;
					}
				}
				if(login==true){
				UnsubscribeFlight unsubscribeFlight=new UnsubscribeFlight(orderList, Flight.flightList);
				unsubscribeFlight.unsubscribeFlight(userName, orderList, Flight.flightList);
			}
				else{
					System.out.println("�û�������");
				}
			}
			//����������
			//���û�ע��
			else if (number==6){
				Passage passage =new Passage();
				passageList.add(passage.createPassage());
			}
			//���߸�����
			//�˳�����
			else if(number==7){
				System.out.println("��л��ѡ�����ǵĺ������ϵͳ��");
				break;
			}
				
		}

		}

	}


