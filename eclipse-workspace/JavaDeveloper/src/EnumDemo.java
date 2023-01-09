enum Scholarships {
	A(5000),B(4000),C(3000),D(2000),E(0);
	private int scholarshipsAmount;
	Scholarships (int scholarshipsAmount){
		this.scholarshipsAmount=scholarshipsAmount;
	}
	public int getscholarshipsAmount() {
		return scholarshipsAmount;
	}
}

class Student2{
	int studntID;
	String name;
	char grade;
	int scholarshipsAmount;
	int totalMarks;
	public int getStudntID() {
		return studntID;
	}
	public void setStudntID(int studntID) {
		this.studntID = studntID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getScholarshipsAmount() {
		return scholarshipsAmount;
	}
	public void setScholarshipsAmount(int scholarshipsAmount) {
		this.scholarshipsAmount = scholarshipsAmount;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalAmount) {
		this.totalMarks = totalAmount;
	}
	
	public void calculateGrade() {
		if(totalMarks>=250) {
			grade='A';
		}else if(totalMarks>=200 && totalMarks<250) {
			grade='B';
		}else if( totalMarks>=175 && totalMarks<200)   {
			grade='C';
		}else if( totalMarks>=150 && totalMarks<175) {
			grade='D';
		}else {
			grade='E';
		}
	}
	public void CalculateScholarshipsAmount() {
		switch(grade) {
		case 'A':
			scholarshipsAmount=5000;
			break;
		case 'B':
			scholarshipsAmount=4000;
			break;
		case 'C':
			scholarshipsAmount=3000;
			break;
		case 'D':
			scholarshipsAmount=2000;
			break;
		case 'E':
			scholarshipsAmount=0;
			break;
		default:
			System.out.println("Enter Correct Case");
		}
	}
}

public interface EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 std=new Student2();
		std.setName("alvin");
		std.setStudntID(1000);
		std.setTotalMarks(280);
		std.calculateGrade();
		std.CalculateScholarshipsAmount();
		
		System.out.println("Student Detsils are:");
		System.out.println("Student ID:"+std.getStudntID());
		System.out.println("Student Name:"+std.getName());
		System.out.println("Student Grade:"+std.getGrade());
		System.out.println("Scholarships Amount:"+std.getScholarshipsAmount());
	}

}


