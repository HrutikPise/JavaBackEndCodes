import java.util.Scanner;

class UserHome{
	AdminHome admin = new AdminHome();
	Scanner sc = new Scanner(System.in);
	
	public void Display() {
		System.out.println("Welcome to Book-My_Show");
		System.out.println("Enter which film you want to Book");
		String user_order=sc.next();
	}
}
