package FlightOrder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateFlight {

	public void change(ArrayList<Flight> flightList){
    	
    	//��ȡ���ಢ��ӡ
    	System.out.println("������Ҫ�޸ĺ����ID");
    	Scanner input =new Scanner(System.in);
		String flightID	= input.next();
		//int idx= flightList.indexOf(flightID);
		for(Flight flight:Flight.flightList){
			if(flightID.equals(flight.getFlightID())){
				System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
				flight.getFlightStatus();
			}
				//��ô�ѵ�ȡ��status��Ӧ�ϣ�
		String status = flight.getFlightStatus();
		
		//δ����ʱ
		if(status.equals("UNPUBLISHED")){
    		System.out.println("������Ҫ�޸ĺ����ID");
    		//�����޸���Ŀ���޸ĺ������
    		System.out.println("1.��ɳ���, 2.�������, 3.���ʱ��, 4.�������, 5.��ǰ�۸�,6.����");
    		System.out.print("��ѡ���޸���");
    		int number=input.nextInt();
    		
    		//С��4��ʱ��
    		if(number<=4){
    			System.out.print("�������޸ĺ������");
    			String Change =input.next();
    			
    			if(number==1){
       			flight.setStartCity(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
    			}
    			else if(number==2){
       			flight.setArrivalCity(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
    			}
    			else if(number==3){
       			flight.setStartTime(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
    			}
    			else if(number==4){
       			flight.setDepartureDate(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
    			}
    		}
    		//����4��ʱ��4
    	   else{
    			System.out.print("�������޸ĺ������");
    			int Change =input.nextInt();
    			
    			if(number==5){
       			flight.setPrice(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
    			}
    			else if(number==6) {
       			flight.setSeatCapacity(Change);
       			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
						+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
						+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
       		    }
       		    else{
       			System.out.println("��ǰָ�����");
       		    }
    		}
		}
    	
    	
       //������ɲ���2Сʱ
       else if(status.equals("TERMINATE")){
    		System.out.println("������ɲ�������Сʱ������Ϣ�����޸�");
       }
       
       //�����������Ԥ��������
       else{
		   System.out.println("5.��ǰ�۸�,6.����");
   		   System.out.print("��ѡ���޸���");
   		   int number=input.nextInt();
   		   System.out.print("�������޸ĺ������");
		   int Change =input.nextInt();
		   
   		   if(number==5){
   		   flight.setPrice(Change);
   		   System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
				+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
				+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
   		    }
   		    else if(number==6){
   			flight.setSeatCapacity(Change);
   			System.out.println(Flight.flightList.indexOf(flight)+" "+flight.getFlightID()+" "+flight.getStartTime()+" "+flight.getArravalTime()+" "
					+flight.getStartCity()+" "+flight.getArrivalCity()+" "+flight.getDepartureDate()+" "+flight.getPrice()+" "
					+flight.getCurrentPassengers()+" "+flight.getSeatCapacity()+" "+flight.getFlightStatus());
   		     }
   		    else{
   			System.out.println("��ǰָ�����");
   		}
	}
    
    }
    
}
}
