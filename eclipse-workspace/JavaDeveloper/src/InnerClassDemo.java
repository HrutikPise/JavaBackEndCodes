class Inner{
	int roll;
	String name;
	double salary;
	
	class Inner1{
		public Inner1(int roll1,String name1,double salary1) {
			roll=roll1;
			name=name1;
			salary=salary1;
		}
		public String toString() {
			return "Roll is:"+roll+"\n Name is :"+name+"\n Salary is:"+salary;
		}
	}
}

interface Test{
	public void show();
	public int add(int a,int b);
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner in=new Inner();
		Inner.Inner1 in1=in.new Inner1(10,"hrutik",18000);
		System.out.println(in1);
		
		//Anonymous Class
		Test t=new Test() {
			@Override
			public void show() {
				System.out.println("Hello world");
			}

			@Override
			public int add(int a, int b) {
				int c=a+b;
				return c;
			}
		};
		t.show();
		int c=t.add(10, 20);
		System.out.println("addition of two No is:"+c);
	}
	
}
