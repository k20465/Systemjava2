package �����ϱ�ϵͳ;
import java.sql.*;
//�����ｫ���Զ���Ϊ˽�е�
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
	
	//ѧ��
	public String getSsno() {
		return this.Ssno;
	}
	public void setSsno(String sno) {
		this.Ssno=sno;
	}
	
	//����
	public String getSname() {
		return this.Sname;
	}
	public void setSname(String name) {
		this.Sname=name;
	}
	
	//ѧԺ
	public String getScollege() {
		return this.Scollege;
	}
	public void setScollege(String college) {
		this.Scollege=college;
	}
		
	//�༶
	public String getSclass() {
		return this.Sclass;
	}
	public void setSclass(String clas) {
		this.Sclass=clas;
	}
		
	//����
	public String getSdata() {
		return this.Sdata;
	}
	public void setSdata(String data) {
		this.Sdata=data;
	}	
	//��ȡ��ϵ��ʽ 
	public String getSnum() {
		return this.Snum;
	}
	public void setSnum(String num) {
		this.Snum=num;
	}
		
	//ʡ��
	public String getSprovince() {
		return this.Sprovince;
	}
	public void setSprovince(String province) {
		this.Sprovince=province;
	}
		
	//����
	public String getScity() {
		return this.Scity;
	}
	public void setScity(String city) {
		this.Scity=city;
	}
	//����
	public String getSarea() {
		return this.Sarea;
	}
	public void setSarea(String area) {
		this.Sarea=area;
	}
	//�Ƿ�Ϊ�人����
	public String getSwuhan() {
		return this.Swuhan;
	}
	public void setSwuhan(String wuhan) {
		this.Swuhan=wuhan;
	}
		
	//�Ƿ�Ϊ��ѧ��
	public String getSabroad() {
		return this.Sabroad;
	}
	public void setSabroad(String abroad) {
		this.Sabroad=abroad;
	}
		
	//�Ƿ�ȷ��
	public String getSinfect() {
		return this.Sinfect;
	}
	public void setSinfect(String Sinfect) {
		this.Sinfect=Sinfect;
	}		
}
