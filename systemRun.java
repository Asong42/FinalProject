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
		
		//��ʼ��������Ϣ�б�
		ArrayList<Flight> flightList=new ArrayList<Flight>();
		
		//��ʼ������Ա�б�
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		
		
		/*for (Admin j : adminList) {
			System.out.println(j.getAdminName()+" "+j.getAdminPW());
		
		}
		
		
		 * ����Ա�Ĳ���
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		
		//¼�뺽��-��һ��
				Flight f1 = new Flight("SZ0615001","08:00:00","10:30:00","����","����","2017-6-15",600,0,100, "UNPUBLISH");
				Flight f2 = new Flight("SZ0615002","08:00:00","10:00:00","����","�Ϻ�","2017-6-15",400,0,100, "UNPUBLISH");
				Flight f3 = new Flight("BJ0615003","08:00:00","09:30:00","����","�Ϻ�","2017-6-15",300,0,100, "UNPUBLISH");
				Flight f4 = new Flight("BJ0615004","09:00:00","11:30:00","����","����","2017-6-15",600,0,100, "UNPUBLISH");
				Flight f5 = new Flight("SH0615005","14:30:00","16:30:00","�Ϻ�","����","2017-6-15",300,0,100, "UNPUBLISH");
				Flight f6 = new Flight("SH0615006","16:00:00","17:30:00","�Ϻ�","����","2017-6-15",500,0,100, "UNPUBLISH");
				//¼�뺽��-�ڶ���
				Flight f7 = new Flight("SZ0123456","10:00:00","12:30:00","����","����","2017-6-17",666,0,100, "UNPUBLISH");
				Flight f8 = new Flight("SZ1234567","12:00:00","14:30:00","����","����","2017-6-18",664,0,100, "UNPUBLISH");
				Flight f9 = new Flight("SZ2345678","10:00:00","12:02:00","����","�Ϻ�","2017-6-18",555,0,100, "UNPUBLISH");
				Flight f10 = new Flight("BJ3456789","14:00:00","16:40:00","����","����","2017-6-17",666,0,100, "UNPUBLISH");
				Flight f11 = new Flight("BJ4567892","18:00:00","20:40:00","����","����","2017-6-18",664,0,100, "UNPUBLISH");
				Flight f12 = new Flight("BJ4567893","16:00:00","17:30:00","����","�Ϻ�","2017-6-17",233,0,100, "UNPUBLISH");
				//¼�뺽��-������
				Flight f13 = new Flight("BJ4567894","16:00:00","17:30:00","����","�Ϻ�","2017-6-18",234,0,100, "UNPUBLISH");
				Flight f14 = new Flight("SH4567895","14:30:00","16:30:00","�Ϻ�","����","2017-6-17",555,0,100, "UNPUBLISH");
				Flight f15 = new Flight("SH4567896","09:00:00","11:08:00","�Ϻ�","����","2017-6-18",556,0,100, "UNPUBLISH");
				Flight f16 = new Flight("SH4567897","10:00:00","11:30:00","�Ϻ�","����","2017-6-17",233,0,100, "UNPUBLISH");
				Flight f17 = new Flight("SH4567898","11:00:00","12:40:00","�Ϻ�","����","2017-6-18",234,0,100, "UNPUBLISH");
				Flight f18 = new Flight("SH4567899","12:20:00","14:00:00","�Ϻ�","����","2017-6-19",257,0,100, "UNPUBLISH");
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
			//ѡ����
			System.out.println("1.����Ա��¼, 2.��ѯ������Ϣ, 3.��ѯ����, 4.Ԥ������, 5.ȡ������,6.�˳�ϵͳ");
			System.out.print("��ѡ����");
			
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			
			
			
			//����Ա��¼
			if(number==1){

				//ϵͳ����
				System.out.println("���������Ա��");
				String adminName=input.next();
				System.out.println("���������Ա����");
				String adminPW=input.next();
				
				Admin admin0=new Admin(adminName,adminPW);
				Admin s0=new Admin("admin","admin");//��ʼ���ʼ�Ĺ���Ա
				adminList.add(s0);
				boolean login=adminList.contains(s0);
				

				//��֤ͨ��ѡ����һ������
				if(login==true){
					Admin admin=new Admin();
					System.out.println(
							"1.��������Ա\n"
							+ "2.��Ӻ���\n"
							+ "3.�޸ĺ���״̬\n"
							+ "4.��ѯ������Ϣ\n"
							);
					
					int function = input.nextInt();
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					//��Ӻ���
					else if(function==2){
						int function1=0;
						function1 = input.nextInt();
					for(Flight j:flightList){
						j.showFlightList(flightList);
						}
					}
					//�޸ĺ���״̬
					else if (function==3){
						
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
					System.out.println("��������ɳ���");
					String yourStartCity = input.next();
					System.out.println("�����뵽�����");
					String yourArrivalCity = input.next();
					System.out.println("���������ʱ��");
					String yourDepartureDate = input.next();
					QuiryFlight.quiry1(yourStartCity, yourArrivalCity, yourDepartureDate);
				}

				// ͨ������Ų�ѯ
				if (cxm == 2) {
						System.out.println("Please input the Flight ID you want:");
						String yourFlightID = input.next();
					QuiryFlight.quiry2(yourFlightID);
				}
				
				//��ʾȫ������
				if(cxm == 3){
					for(Flight flight:flightList){
						System.out.println(flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
					}
				}
			}
	
			//����������
			//�˳�����
			else if(number==6){
				System.exit(0);
			}
				
		}

		}

	}


