class Employee3{
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
		
}
class PerformanceRating extends Employee3{
	private static int Outstanding=5;
	private static int Good=4;
	private static int Average=3;
	private static int Poor=2;
	static int calculatePerformace(Employee3 employee){
		if(employee.getPoint()<100 && employee.getPoint()>80) {
			return Outstanding;
		}else if(employee.getPoint()<79 && employee.getPoint()>60) {
			return Good;
		}else if(employee.getPoint()<59 && employee.getPoint()>50) {
			return Average;
		}else {
			return Poor;
		}
	}
}


public class StaticAndFinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee3 emp=new Employee3();
		emp.setPoint(90);
		int a=PerformanceRating.calculatePerformace(emp);
		Employee3 emp2=new Employee3();
		emp2.setPoint(75);
		int b=PerformanceRating.calculatePerformace(emp2);
		Employee3 emp3=new Employee3();
		emp3.setPoint(29);
		int c=PerformanceRating.calculatePerformace(emp3);
		System.out.println(a+" "+b+" "+c);
	}

}
