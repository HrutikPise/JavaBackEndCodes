class Employee {
 
	private String empName;
	private int empAge;
	private double empSalary;
	
	public Employee(String empName, int empAge, double empSalary) {

		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
 
    public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	} 
}
class EmpSalaryException extends Exception{
	EmpSalaryException(String meg){
		super(meg);
	}
}


public class UserDefinedException {
	
	public void checkEmployeeSalary(Employee emp) throws EmpSalaryException{
	     //Write the code here 
		if(emp.getEmpSalary()<1000) {
			throw new EmpSalaryException("Employee Salary Not Less Then 1000");
		}else {
			System.out.println(emp.getEmpName()+" "+emp.getEmpAge()+" "+emp.getEmpSalary());
		}
	}
	public static void main(String[] args)  {
		
		Employee e1 = new Employee("Joe Smith",20,5345);
		Employee e2 = new Employee("Lewis Jane",21,1345);
		Employee e3 = new Employee("Larry Page",22,245);
		Employee e4 = new Employee("Smith James",23,945);
		Employee e5 = new Employee("Elvis George",25,1425);
		UserDefinedException empser=new UserDefinedException();
		Employee[] emparray={e1,e2,e3,e4,e5};
		for (Employee employee : emparray) {
			//call check employee with appropriate exception handling code
			try {
				empser.checkEmployeeSalary(employee);
			} catch (EmpSalaryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}

}
