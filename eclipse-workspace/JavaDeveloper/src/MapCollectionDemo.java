import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapCollectionDemo {
public static void main(String[] args) {
	
/*	
Set<Student1> students = new HashSet();
students.add(new Student1("Prashant", 101, 90));
students.add(new Student1("Harish", 102, 54));
students.add(new Student1("Ranjit", 103, 40));
students.add(new Student1("Amar", 104, 55));

TreeMap<Integer, String> studentGradeMap = new TreeMap();

for(Student1 s: students){
studentGradeMap.put(s.getRollNumber(), s.getGrade());
}

Set<Entry<Integer, String>> entrySet = studentGradeMap.entrySet();
for(Entry e: entrySet) {
System.out.println(e.getKey() + ":" + e.getValue());
}*/
	/*System.out.println("Hello\n");
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
	    Map<String,Integer> mp=new HashMap<String,Integer>();
	    int n=sc.nextInt();
	    String val;
	    int no,sum=0;
	    for(int i=0;i<n*3;i++){
	        val=sc.next();
	        no=sc.nextInt();
	        if(!mp.containsKey(val)){
	            mp.put(val,no);
	        }else{
	            sum+=no;
	            mp.put(val,sum);
	        }
	    }
	    for(int i=0;i<mp.size();i++){
	        System.out.println(mp.get(i));
	    }
	}*/
	System.out.println("Yes\n");
	/*Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		HashSet<Integer> set=new HashSet<Integer>();
		int val1;
		for(int i=0;i<n;i++) {
			set.add(sc.nextInt());
		}
		for(int i=0;i<m;i++) {
			val1=sc.nextInt();
			if(set.contains(val1)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}*/
	
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while (t-->0){
	    Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	    int t1,t2,g1,g2;
	    t1=sc.nextInt();
	    t2=sc.nextInt();
	    g1=sc.nextInt();
	    g2=sc.nextInt();
	    if(g1>g2) {
	    	mp.put(null, null);
	    }
	}
}
}

class Student1 {
private String name;
private int rollNumber;
private int totalMarks;
private String grade;

public Student1(String name, int rollNumber, int totalMarks) {
this.name = name;
this.rollNumber = rollNumber;
this.totalMarks = totalMarks;
this.grade = getGrade(totalMarks);
}

private String getGrade(int totalMarks){
if (totalMarks >= 60) {
return "A";
} else if (totalMarks < 60 && totalMarks > 40) {
return "B";
}
return "C";
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

public int getTotalMarks() {
return totalMarks;
}

public void setTotalMarks(int totalMarks) {
this.totalMarks = totalMarks;
}

public String getGrade() {
return grade;
}
}
