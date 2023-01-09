class Registration{
	private String custName;
	private String panCardNo;
	private int voterID;
	private String passportNo;
	private int lisNo;
	private long[] telephoneNo;
	public String getCustName() {
		return custName;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public int getVoterID() {
		return voterID;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public int getLisNo() {
		return lisNo;
	}
	public long[] getTelephoneNo() {
		return telephoneNo;
	}
	
	public Registration(String custName,String passportNo,long[] telephoneNo){
		this.custName=custName;
		this.passportNo=passportNo;
		this.telephoneNo=telephoneNo;
	}
	
	public Registration(String custName,int lisNo,String panCardNo, long[] telephoneNo){
		this.custName=custName;
		this.lisNo=lisNo;
		this.panCardNo=panCardNo;
		this.telephoneNo=telephoneNo;
	}
	
	public Registration(String custName,int voterID,int lisNo, long[] telephoneNo){
		this.custName=custName;
		this.voterID=voterID;
		this.lisNo=lisNo;
		this.telephoneNo=telephoneNo;
	}
	
	public Registration(String custName,String panCardNo,int voterID, long[] telephoneNo){
		this.custName=custName;
		this.panCardNo=panCardNo;
		this.voterID=voterID;
		this.telephoneNo=telephoneNo;
	}
	
	public void Display() {
		if(custName!=null && passportNo!=null && telephoneNo[0]!=0 && telephoneNo[1]!=0) {
			System.out.println("Congratulations "+custName+" "+"!!! you have been successfully registered for our services with the following details:");
			System.out.println("Passport number:"+passportNo);
			System.out.println("Phone numbers:"+telephoneNo[0]+"\n"+telephoneNo[1]);
		}else if(custName!=null && lisNo!=0 && panCardNo!=null  && telephoneNo[0]!=0 && telephoneNo[1]!=0) {
			System.out.println("Congratulations "+custName+" "+"!!! you have been successfully registered for our services with the following details:");
			System.out.println("License number:"+lisNo);
			System.out.println("Pan card number:"+panCardNo);
			System.out.println("Phone numbers:"+telephoneNo[0]+"\n"+telephoneNo[1]);
		}else if(custName!=null && voterID!=0 && lisNo!=0 && telephoneNo[0]!=0 && telephoneNo[1]!=0) {
			System.out.println("Congratulations "+custName+" "+"!!! you have been successfully registered for our services with the following details:");
			System.out.println("VoiterID Number:"+voterID);
			System.out.println("License number:"+lisNo);
			System.out.println("Phone numbers:"+telephoneNo[0]+"\n"+telephoneNo[1]);
		}else if(custName!=null && panCardNo!=null && voterID!=0 && telephoneNo[0]!=0 && telephoneNo[1]!=0) {
			System.out.println("Congratulations "+custName+" "+"!!! you have been successfully registered for our services with the following details:");
			System.out.println("Pan card number:"+panCardNo);
			System.out.println("VoiterID Number:"+voterID);
			System.out.println("Phone numbers:"+telephoneNo[0]+"\n"+telephoneNo[1]);
		}
	}
}


public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registration reg=new Registration("Kevin","MN9891N",new long[] {9452425421L,7676765252L});
		reg.Display();
		Registration reg1=new Registration("Julias",123,"PN7878",new long[] {2345615451L,6763562562L});
		reg1.Display();
		Registration reg2=new Registration("Jammy",45453,765,new long[] {9634524353L,9887373737L});
		reg2.Display();
		Registration reg3=new Registration("Rose","PN8934",34356,new long[] {9867456367L,7645367356L});
		reg3.Display();
		
	}

} 
