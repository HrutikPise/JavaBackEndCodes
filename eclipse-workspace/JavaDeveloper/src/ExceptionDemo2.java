import java.util.Scanner;
class Exception2{
	void Display(int a,int b) throws ArithmeticException {
		int c=a/b;
		System.out.println(c);
		//throw new Exception("ArithmeticException");
	}
	void Test(String[] m) throws IndexOutOfBoundsException{
		System.out.println(m[6]);
		//throw new Exception("IndexOutOfBoundsException");
	}
}
public class ExceptionDemo2 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Exception2 ex=new Exception2();
		// TODO Auto-generated method stub
		try {
			int a=10,b=0;
			String[] var={"Hello"};
			ex.Display(a,b);
			ex.Test(var);
		}catch(ArithmeticException ex1) {
			System.out.println("Can't divide by zero"+ex1);
		}catch(IndexOutOfBoundsException ex2) {
			System.out.println("Index out of bound can't access 6th value"+ex2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Exit block");
			System.exit(0);
		}
	}

}
