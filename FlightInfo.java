package FlightOrder;

import java.io.*;
public class FlightInfo {
	
	//���ļ�β��׷��
	public void writeFollow(String fileName, String content) {
        try {
            //��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void write(String fileName, String content){
        try {
            //��һ��д�ļ��������캯���еĵڶ�������false��ʾ����д��ʽд�ļ�
            FileWriter writer = new FileWriter(fileName, false);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		FlightInfo AppendToFile=new FlightInfo();
		AppendToFile.writeFollow("flightInfo.txt ","�����	  ���	����	���	����	����			�۸� ����ʣ��	״̬");
        

}
}