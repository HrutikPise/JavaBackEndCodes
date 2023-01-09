import java.util.Scanner;
import java.util.Set;

public class ATMProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=1000,deposite=0,withdraw=0,choice,cnt=0;
		String password="12345678";
		String newpassword="";
		boolean atm=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Password");
		while(true) {
		String pass=sc.next();
		if(pass.equals(password)) {
			System.out.println("Thank-You for useing our ATM");
			while(atm) {
				System.out.println("1. Check Balance");
				System.out.println("2. Withdraw amount");
				System.out.println("3. Deposit Amount");
				System.out.println("4. Password create");
				System.out.println("5. Exit");
				
				System.out.println("Enter your choice");
				choice=sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Balance is:"+balance);
						break;
					case 2:
						System.out.println("Enter withdraw amount");
						withdraw=sc.nextInt();
						if(withdraw>=balance) {
							System.out.println("Sorry your withdraw amount is more then balance");
						}
						else {
							balance=balance-withdraw;
							System.out.println("Succesfully withdraw");
							System.out.println("Balance is:"+balance);
						}
						break;
					case 3:
						System.out.println("Enter Deposite amount");
						deposite=sc.nextInt();
						if(deposite%100!=0) {
							System.out.println("Please Enter amount in multiple of 100");
						}else {
							balance+=deposite;
							System.out.println("Amount has been Successfully Deposited");
							System.out.println("Balance is:"+balance);
						}
						break;
					case 5:
						System.exit(0);
					case 4:
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
						break;
					default:
						System.out.println("invalid choice");
					}
			}
		}
		else {
			if(cnt>=2) {
				System.out.println("Card is blocked, please try again after 24hrs");
				System.exit(0);
			}
			cnt++;
			System.out.println("Card denied, Please enter correct password");
		}
	}
	}
}
