class StudentRegistration{
	private String studentName;
	private double age;
	private int addmissionNo;
	private int rollNo;
	static int counter;
	
	static {
		counter=1000;
	}

	public StudentRegistration(String studentName, double age, int addmissionNo) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.addmissionNo = addmissionNo;
		this.rollNo = ++counter;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getAge() {
		return age;
	}

	public int getAddmissionNo() {
		return addmissionNo;
	}

	public int getRollNo() {
		return rollNo;
	}
	
	
	public int hashCode() {
		return rollNo;
	}
	
	public boolean equals(Object o) {
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		if(o==this) {
			return true;
		}
		StudentRegistration s=(StudentRegistration)o;
		return (this.getRollNo()==s.getRollNo()); 
	}
	public String toString() {
		return studentName+" "+rollNo+" "+addmissionNo; 
	}
}


public class JavaLibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistration reg=new StudentRegistration("Peter",23,5001);
		StudentRegistration reg2=new StudentRegistration("Peter",24,5003);
		StudentRegistration reg3=new StudentRegistration("Peter",23,5001);
		
		if(!reg.equals(reg2)) {
			System.out.println(reg2);
		}else {
			System.out.println("Roll Number Already Generated for this Number");
		}
		if(!reg2.equals(reg3)) {
			System.out.println(reg3);
		}else {
			System.out.println("Roll Number Already Generated for this Number");
		}
		
	}
}
