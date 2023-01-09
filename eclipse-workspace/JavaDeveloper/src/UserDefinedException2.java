class UserDefined1 extends Exception{
	UserDefined1(String meg) {
		super(meg);
	}
}


public class UserDefinedException2 {

	public static void main(String[] args) throws UserDefined1 {
		int no=12221,sum = 0,rem=0,temp;
		temp=no;
		while(temp!=0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(no==sum) {
			System.out.println("It's Reversed No:"+no);
		}else {
			throw new UserDefined1("This is not Reversed No:"+no);
		}
	}

}
