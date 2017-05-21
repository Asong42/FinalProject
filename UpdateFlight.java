package FlightOrder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateFlight {

	public void change(ArrayList<Flight> flightList){
    	
    	//调取航班并打印
    	System.out.println("请输入要修改航班的ID");
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
				//怎么把调取的status对应上？
		String status = flight.getFlightStatus();
		
		//未发布时
		if(status.equals("UNPUBLISHED")){
    		System.out.println("请输入要修改航班的ID");
    		//输入修改项目和修改后的内容
    		System.out.println("1.起飞城市, 2.到达城市, 3.起飞时间, 4.起飞日期, 5.当前价格,6.容量,");
    		System.out.print("请选择修改项");
    		int number=input.nextInt();
    		
    		//小于4的时候
    		if(number<=4){
    			System.out.print("请输入修改后的内容");
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
    		//大于4的时候4
    	   else{
    			System.out.print("请输入修改后的内容");
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
       			System.out.println("当前指令错误");
       		    }
    		}
    		
		}
    	
    	
       //距离起飞不到2小时
       else if(status.equals("TERMINATE")){
    		System.out.println("距离起飞不足两个小时，该信息不可修改");
       }
       
       //其余情况：可预订和已满
       else if(status.equals("AVAILIABLE")||status.equals("FULL")){
		   System.out.println("5.当前价格,6.容量");
   		   System.out.print("请选择修改项");
   		   int number=input.nextInt();
   		   System.out.print("请输入修改后的内容");
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
   			System.out.println("当前指令错误");
   		}
	}break;
    
    }
    
}
}
