class StudentRegistration1{
	String studentName;
	double age;
	int addNo;
	int rollNo;
	static int counter;
	public StudentRegistration1(String studentName, double age, int addNo) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.addNo = addNo;
		this.rollNo=++counter;
	}
	
	static {
		counter=1000;
	}

	public String getStudentName() {
		return studentName;
	}

	public double getAge() {
		return age;
	}

	public int getAddNo() {
		return addNo;
	}

	public int getRollNo() {
		return rollNo;
	}
	
	public int hashCode() {
		return rollNo;
	}
	
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		if(obj==null && getClass()!=obj.getClass()) {
			return false;
		}
		StudentRegistration1 reg=(StudentRegistration1)obj;
		return (this.rollNo==reg.rollNo);
	}
	
	public String toString() {
		return studentName+" "+rollNo+"	"+addNo;
	}
}


public class JavaLib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistration1 reg1=new StudentRegistration1("Peter",23,5001);
		StudentRegistration1 reg2=new StudentRegistration1("Peter",24,5003);
		StudentRegistration1 reg3=new StudentRegistration1("Peter",24,5001);
		
		/* if(reg1.equals(reg2)) {
			System.out.println("Roll Number already generated for this student!");
		}else {
			System.out.println(reg2);
		}
		
		
		if(reg1.equals(reg3)) {
			System.out.println("Roll Number already generated for this student!");
		}else {
			System.out.println(reg3);
		}*/
		if(reg1.getAddNo()==reg2.getAddNo()) {
			System.out.println("Roll Number already generated for this student!");
		}else {
			System.out.println(reg2);
		}
		if(reg1.getAddNo()==reg3.getAddNo()) {
			System.out.println("Roll Number already generated for this student!");
		}else {
			System.out.println(reg3);
		}
		
	}

}
