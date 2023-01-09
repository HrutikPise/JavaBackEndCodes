class First extends Thread{
	String name;
	public First(String name) {
		//System.out.println(name);
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name);
		for(int i=0;i<4;i++) {
			System.out.println("i="+i);			
		}
	}
}

class Secound extends Thread{
	String name;
	public Secound(String name) {
		// TODO Auto-generated constructor stub
		//System.out.println(name);
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name);
		for(int i=0;i<4;i++) {
			System.out.println("j="+i);			
		}
	}
}


public class ThreadExtendsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		First f=new First("hrutik");
		f.start();
		//First f1=new First("Pise");//Par Constructor 
		Secound s=new Secound("Pise");
		s.start();
		//f1.start();
		f.join(); //join help us to execute first class then after execute second class
		//f1.join();
		s.join();
	}
}
