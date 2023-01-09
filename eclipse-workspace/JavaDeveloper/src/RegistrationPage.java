import java.util.Scanner;

public class RegistrationPage {

	public static void main(String[] args) {
		String username="",password="",cpassword="";
		boolean entry=true;
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("_____________Registration Page_____________");
		System.out.println("Enter user name");
		username=sc.next();
		System.out.println("Enter user password");
		password=sc.next();
		System.out.println("Enter user C-password");
		cpassword=sc.next();
		if(password.equals(cpassword)) {
			System.out.println("Registration Successful");
		}else {
			System.out.println("Registration Un-uccessful");
		}
		System.out.println("_____________Welcome to login page_____________");
		System.out.println("Enter user name");
		String lname=sc.next();
		while(entry) {
			System.out.println("Enter user password");
			String lpass=sc.next();
			if(lname.equals(username) && lpass.equals(password)) {
				System.out.println("Login Successful");
				UserHome user=new UserHome();
				user.Display();
				entry=false;
			}else if(cnt<2){
				cnt++;
				System.out.println("Please enter correct credentials");
			}else {
				System.out.println("Press 1 continue with forget password");
				int ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter new password");
					String fpass=sc.next();
					if(fpass.equals(password)) {
						System.out.println("Password already exits");
					}else if(fpass.length()>=5 && fpass.startsWith("H")) {
						System.out.println("Password successfully modified");
						password=fpass;
						entry=false;
					}
				}
			}
		}
	}

}
