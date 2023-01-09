import java.util.HashSet;
import java.util.Set;

class Student{
	private String name;
	private int rollNumber;
 
        public Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getRollNumber() {
		return rollNumber;
	}
 
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
        public String toString() {
			return name+" "+rollNumber; 
        }
       // add appropriate method for avoiding duplicate Student
        public boolean equals(Object o) {
        	if(o==null || getClass()!=o.getClass()) {
        		return false;
        	}
        	if(o==this) {
        		return true;
        	}
        	Student std=(Student)o;
        	return (this.rollNumber==std.rollNumber || this.name.equals(std.name));
        }
        public int hashCode() {
        	return rollNumber; 
        }
}


public class SetCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> stu=new HashSet<>();
		stu.add(new Student("Hrutik", 121));
		stu.add(new Student("Hrutik", 121));
		for(Student s:stu) {
			System.out.println(s);
		}
	}

}
