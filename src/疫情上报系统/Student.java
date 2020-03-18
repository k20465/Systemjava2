package 疫情上报系统;
import java.sql.*;
//在这里将属性定义为私有的
public class Student {
	private String Ssno;
	private String Sname;
	private String Scollege;
	private String Sclass;
	private String Sdata;
	private String Snum;
	private String Sprovince;
	private String Scity;
	private String Sarea;
	private String Swuhan;
	private String Sabroad;
	private String Sinfect;
	
	public Student() {
		super();
	}
	
	//学号
	public String getSsno() {
		return this.Ssno;
	}
	public void setSsno(String sno) {
		this.Ssno=sno;
	}
	
	//姓名
	public String getSname() {
		return this.Sname;
	}
	public void setSname(String name) {
		this.Sname=name;
	}
	
	//学院
	public String getScollege() {
		return this.Scollege;
	}
	public void setScollege(String college) {
		this.Scollege=college;
	}
		
	//班级
	public String getSclass() {
		return this.Sclass;
	}
	public void setSclass(String clas) {
		this.Sclass=clas;
	}
		
	//日期
	public String getSdata() {
		return this.Sdata;
	}
	public void setSdata(String data) {
		this.Sdata=data;
	}	
	//获取联系方式 
	public String getSnum() {
		return this.Snum;
	}
	public void setSnum(String num) {
		this.Snum=num;
	}
		
	//省份
	public String getSprovince() {
		return this.Sprovince;
	}
	public void setSprovince(String province) {
		this.Sprovince=province;
	}
		
	//城市
	public String getScity() {
		return this.Scity;
	}
	public void setScity(String city) {
		this.Scity=city;
	}
	//地区
	public String getSarea() {
		return this.Sarea;
	}
	public void setSarea(String area) {
		this.Sarea=area;
	}
	//是否为武汉户籍
	public String getSwuhan() {
		return this.Swuhan;
	}
	public void setSwuhan(String wuhan) {
		this.Swuhan=wuhan;
	}
		
	//是否为留学生
	public String getSabroad() {
		return this.Sabroad;
	}
	public void setSabroad(String abroad) {
		this.Sabroad=abroad;
	}
		
	//是否确诊
	public String getSinfect() {
		return this.Sinfect;
	}
	public void setSinfect(String Sinfect) {
		this.Sinfect=Sinfect;
	}		
}
