package FlightOrder;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	//管理员能够做的事情
	private String adminName;
	private String adminPW;
	ArrayList<Admin> adminList=new ArrayList<Admin>();

	public ArrayList<Admin> getAdminList() {
		return adminList;
	}

	public void setAdminList(ArrayList<Admin> adminList) {
		this.adminList = adminList;
	}

	public Admin(String adminName,String adminPW){
		this.adminName=adminName;
		this.adminPW=adminPW;
		
	}
	
	public Admin(String adminName2, String adminPW2, ArrayList<Admin> adminList2){
		
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPW() {
		return adminPW;
	}

	public void setAdminPW(String adminPW) {
		this.adminPW = adminPW;
	}
	
	
	//创建管理员的方法
	public Admin createAdmin(){
		
		Scanner input=new Scanner(System.in);
		System.out.println("新管理员名称");
		adminName=input.next();
		System.out.println("新管理员密码");
		adminName=input.next();
		Admin s=new Admin(adminName,adminPW);
		return s;
		
	}
	//删除管理员
	public void deleteAdmin(String adminName,String adminPW){
		Admin s=new Admin(adminName,adminPW);
		adminList.remove(s);
	}
	//验证管理员的身份信息
	public boolean loginAdmin(String adminName,String adminPW,ArrayList<Admin> adminList){
		Admin test=new Admin(adminName,adminPW);
		boolean login = adminList.contains(test);
		return login;	
	}

	public static void main(String []args){
		
	}
	

}
