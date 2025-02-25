package corejavaarul;

class employee1{
	
	private String name;
	private long phoneNo;
		
	public void setName(String name) {
		this.name=name;
		}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public long getphoneNo() {
		return phoneNo;
	}
	
	void display() {
		System.out.println("Employee Name :"+name);
		System.out.println("Employee phone Number:"+phoneNo);

	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		employee1 emp1=new employee1();
		emp1.setName("arul");
		emp1.setPhoneNo(234566455l);
		System.out.println(emp1.getName());
		System.out.println(emp1.getphoneNo());
		
		
		employee1 emp2=new employee1();
		emp2.setName("tom");
		emp2.setPhoneNo(344345434l);
		System.out.println(emp2.getName());
		System.out.println(emp2.getphoneNo());
}
}