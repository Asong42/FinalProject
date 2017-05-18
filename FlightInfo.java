package FlightOrder;

import java.io.*;
public class FlightInfo {
	
	//在文件尾部追加
	public void writeFollow(String fileName, String content) {
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void write(String fileName, String content){
        try {
            //打开一个写文件器，构造函数中的第二个参数false表示以重写形式写文件
            FileWriter writer = new FileWriter(fileName, false);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		FlightInfo AppendToFile=new FlightInfo();
		AppendToFile.writeFollow("flightInfo.txt ","航班号	  起飞	降落	起飞	降落	日期			价格 人数剩余	状态");
        

}
}