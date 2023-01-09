class Loan{
	int loanNo,accNo,custNo,loanDuration;
	float loanAmount,interest;
	private static int loanCounter;
	
	static {
		loanCounter=100;
	}
	
	public Loan(){
		loanCounter++;
	}
	
	public Loan( int custNo, int loanDuration, float loanAmount, float interest) {
		this.custNo = custNo;
		this.loanDuration = loanDuration;
		this.loanAmount = loanAmount;
		this.interest = interest;
		loanCounter++;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getLoanAmount() {
		loanAmount=(loanAmount*loanDuration*interest)/100;
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	public static int LoanCounter() {
		return loanCounter;
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan loan=new Loan();
		System.out.println(loan.LoanCounter());
		Loan loan1=new Loan();
		System.out.println(loan1.LoanCounter());
		Loan loan3=new Loan(1234,5,15000,5);
		System.out.println(loan3.LoanCounter()+" "+ loan3.getCustNo()+" "+loan3.getLoanDuration()+" "+loan3.getLoanAmount()+" "+loan3.getInterest());
		Loan loan4=new Loan(12345,4,12000,2);
		System.out.println(loan4.LoanCounter()+" "+ loan4.getCustNo()+" "+loan4.getLoanDuration()+" "+loan4.getLoanAmount()+" "+loan4.getInterest());
	}

}
