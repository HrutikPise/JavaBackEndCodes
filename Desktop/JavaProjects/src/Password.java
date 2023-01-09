import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		String newpassword="";
		Scanner sc=new Scanner(System.in);
		String password=sc.next();
		
		while(true) {
			if(flag==0) {
				System.out.println("Create password");
				password=sc.next();
				int length=password.length();
				if(length>=8 && password.startsWith("Hru")) {
					System.out.println("Password has successfully created");
					System.out.println("Password is:"+password);
				}else {
					System.out.println("Please enter valid password");
				}
				flag=1;
			}
			System.out.println("Change password");
			newpassword=sc.next();
			int length1=newpassword.length();
			if(newpassword.equals(password)) {
				System.out.println("Password already Exits");
			}else if(length1>=8 && newpassword.startsWith("Pra")) {
				System.out.println("Password has successfully changed");
				System.out.println("Password is:"+newpassword);
				password = newpassword;
			}else {
				System.out.println("Please enter valid password");
			}
		}
	}

}
