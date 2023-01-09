class Employee2{
	private int empID;
	private String name;
	protected double salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class PermanentEmployee extends Employee2{
	private double basicPay;
	private double hra;
	private int exp;
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	void calculateSalary() {
		if(exp<3) {
			salary=(basicPay+hra);
		}else if(exp>=3 && exp <=5) {
			salary=(basicPay*0.05)+basicPay+hra;
		}else if(exp>=5 && exp<=10) {
			salary=(basicPay*0.07)+basicPay+hra;
		}else {
			salary=(basicPay*0.12)+basicPay+hra;
		}
	}
	
}

class ContractEmployee extends Employee2{
	private double wages;
	private int hours;
	public double getWeight() {
		return wages;
	}
	public void setWeight(double wages) {
		this.wages = wages;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	void calculateSalary() {
		salary=hours*wages;
		
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee per=new PermanentEmployee();
		per.setName("Anil");
		per.setEmpID(101);
		per.setBasicPay(10000);
		per.setHra(1500);
		per.setExp(3);
		per.calculateSalary();
		
		System.out.println("Permanent Employee: Your Salary is:"+per.getSalary());
		
		ContractEmployee con=new ContractEmployee();
		con.setName("Anitha");
		con.setEmpID(102);
		con.setWeight(500);
		con.setHours(10);
		con.calculateSalary();
		
		System.out.println("Contract Employee: Your Salary is:"+con.getSalary());
	}

}
