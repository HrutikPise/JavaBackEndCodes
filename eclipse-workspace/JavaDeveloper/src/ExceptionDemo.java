import java.util.Scanner;

class User extends Exception{
	User(String mes){
		super(mes);
	}
}

class TryCatch{
	int Test(int n,int m) {
		return (n/m);
	}
	int Test(int n,String m) throws User {
		throw new User("Char not allow\n");
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TryCatch tr=new TryCatch();
			System.out.println("Enter Number");
		try {
			int i=sc.nextInt();
			String j=sc.next();
			int k=tr.Test(i,j);
			System.out.println(k);
		}catch(NumberFormatException  ex) {
			System.out.println("Can't Multiple The 0 Value");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}
