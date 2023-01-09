class First1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.println(i+":");
		}
	}
}
class Secound1 implements Runnable{

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		String[] arg= {"hrutik","pise","java","Oops"};
		for(String s:arg) {
			System.out.println(s);
		}
	}
}


public class ThreadImplimentedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First1 f=new First1();
		Thread t1=new Thread(f);
		Secound1 s=new Secound1();
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
	}

}
