package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;
public class systemRun {
	

	//������
	public static void main(String[] args) {
		//��ʼ��
		
		//��ʼ��������Ϣ�б�
		ArrayList<Flight> flightList=new ArrayList<Flight>();
		Flight flight0=new Flight();
		
		//��ʼ������Ա�б�
		Admin s0=new Admin("admin","admin");//��ʼ���ʼ�Ĺ���Ա
		ArrayList<Admin> adminList=new ArrayList<Admin>();
		adminList.add(s0);
		
		/*
		 * ����Ա�Ĳ���
		 * for(Admin j:adminList){
		 
			System.out.print(j.getAdminName()+j.getAdminPW());
		}
		*/
		
		//¼�뺽��-��һ��
		flight0.createFlight("0215001","0800","1000","����","����","2017��2��15��",600,0,100, "UNPUBLISH");
		flight0.createFlight("0215002","0800","1000","����","�Ϻ�","2017��2��15��",400,0,100, "UNPUBLISH");
		flight0.createFlight("0215003","0800","1000","����","�Ϻ�","2017��2��15��",300,0,100, "UNPUBLISH");
		flight0.createFlight("0215004","0800","1000","����","����","2017��2��15��",600,0,100, "UNPUBLISH");
		flight0.createFlight("0215005","0800","1000","�Ϻ�","����","2017��2��15��",300,0,100, "UNPUBLISH");
		flight0.createFlight("0215006","0800","1000","�Ϻ�","����","2017��2��15��",500,0,100, "UNPUBLISH");
		//¼�뺽��-�ڶ���
		flight0.createFlight("0123456","0100","1000","����","����","2017��2��17��",666,0,100, "UNPUBLISH");
		flight0.createFlight("1234567","0200","1001","����","����","2017��2��18��",664,0,100, "UNPUBLISH");
		flight0.createFlight("2345678","0300","1002","����","�Ϻ�","2017��2��17��",555,0,100, "UNPUBLISH");
		flight0.createFlight("3456789","0400","1003","����","����","2017��2��17��",666,0,100, "UNPUBLISH");
		flight0.createFlight("4567892","0500","1004","����","����","2017��2��18��",664,0,100, "UNPUBLISH");
		flight0.createFlight("4567893","0600","1005","����","�Ϻ�","2017��2��17��",233,0,100, "UNPUBLISH");
		//¼�뺽��-������
		flight0.createFlight("4567894","0700","1006","����","�Ϻ�","2017��2��18��",234,0,100, "UNPUBLISH");
		flight0.createFlight("4567895","0800","1007","�Ϻ�","����","2017��2��17��",555,0,100, "UNPUBLISH");
		flight0.createFlight("4567896","0900","1008","�Ϻ�","����","2017��2��18��",556,0,100, "UNPUBLISH");
		flight0.createFlight("4567897","1000","1009","�Ϻ�","����","2017��2��17��",233,0,100, "UNPUBLISH");
		flight0.createFlight("4567898","1100","1010","�Ϻ�","����","2017��2��18��",234,0,100, "UNPUBLISH");
		flight0.createFlight("4567899","1200","1011","�Ϻ�","����","2017��2��19��",257,0,100, "UNPUBLISH");

		
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
				String adminName=input.nextLine();
				System.out.println("���������Ա����");
				String adminPW=input.nextLine();
				Admin admin0=new Admin(adminName,adminPW);
				boolean login=admin0.loginAdmin(adminName, adminPW);
				
				//��֤ͨ��ѡ����һ������
				if(login==true){
					Admin admin=new Admin();
					System.out.println("1.��������Ա\n"
							+ "2.��Ӻ���\n"
							+ "3.�޸ĺ���״̬\n"
							+ "4.��ѯ������Ϣ\n"
							+ "");
					
					int function = input.nextInt();
					if(function==1){
						adminList.add(admin.createAdmin());
					}
					
					else if(function==2){
						
					}
				}
				else{
					System.out.print("�û������������");
				}
				//�����ظ����û�ûд
				
			}
			//��ѯ������Ϣ
			else if(number==2){
				//��ʼ��
				for (Flight j : flightList) {
					System.out.println(j.getarravalTime());
				}
			}
			
			//�˳�����
			else if(number==6){
				System.exit(0);
			}
				
			}
				
		}

	}


