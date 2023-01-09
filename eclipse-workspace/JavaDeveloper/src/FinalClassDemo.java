class Final{
	 static int a=100;
	 final int y=10;
	 
	 
	 Final(){
		 a++;
	 }
	 
	public  int getA() {
		return a;
	}
	public static void setA(int a) {
		Final.a = a;
	}
	
	
	//If i write final keywork in this method it can't be override
	
}

class Final2 extends Final{
	Final f1=new Final();
	public int add1(int a,int b) {
		int c=a+b;
		return c;
	}
}

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f=new Final();
		f.setA(50);
		System.out.println(f.getA());
		Final f1=new Final();
		System.out.println(f1.getA());
		Final f2=new Final();
		System.out.println(f2.getA());
		Final f3=new Final();
		System.out.println(f3.getA());
		Final f4=new Final();
		System.out.println(f4.getA());
		Final f5=new Final();
		System.out.println(f5.getA()+" "+f.y);
	}

}
