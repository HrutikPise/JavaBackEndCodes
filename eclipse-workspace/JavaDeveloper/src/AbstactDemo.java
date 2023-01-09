abstract class RRPaymentServices{
	double balanace;
	int custID;
	
	public RRPaymentServices(double balanace, int custID) {
		this.balanace = balanace;
		this.custID = custID;
	}
	public double getBalanace() {
		return balanace;
	}
	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	
	public abstract void PayBill(double amt);
}

class ShoppingPayment extends RRPaymentServices{
	
	static int counter;
	String paymentID;
	public ShoppingPayment(double balanace, int custID) {
		super(balanace, custID);
	}
	static {
		counter=1000;
	}
	public String getPaymentID() {
		return paymentID;
	}


	@Override
	public void PayBill(double amt) {
		// TODO Auto-generated method stub
		if((getPaymentID().startsWith("S")) && (getPaymentID().length()==4)) {
			if(amt<balanace) {
				paymentID="S"+ ++counter;
				double bal=balanace-amt;
				super.custID=++counter;
				System.out.println("Congratulation !! you have Successfully made Payment"+amt);
				System.out.println(getPaymentID());
				System.out.println(getCustID());
				System.out.println(balanace);
				System.out.println(bal);
			}else if(amt==balanace){
				System.out.println("Congratulation !! you have"+balanace+" Successfully made Payment");
			}else {
				System.out.println("Please try Again!!");
			}
		}else {
			System.out.println("Please Try Again");
		}
	}
}

class CreditCardPayment extends RRPaymentServices{
	
	static int counter;
	String paymentID;
	double cashback,balanceDue;
	
	static {
		counter=5000;
	}
	
	public String getPaymentID() {
		return paymentID;
	}

	public double getCashback() {
		return cashback;
	}

	public double getBalanceDue() {
		return balanceDue;
	}

	public CreditCardPayment(double balanace, int custID) {
		super(balanace, custID);
		// TODO Auto-generated constructor stub
		cashback=0;
		paymentID="5000";
		this.balanceDue=balanace;
	}

	@Override
	public void PayBill(double amt) {
		// TODO Auto-generated method stub
		if(getPaymentID().length()==4) {
			if(amt>balanace) {
				super.custID=++counter;
				cashback=amt-balanace;
				paymentID="C"+ ++counter;
				System.out.println("Congrats You Successfully Made Payment"+amt);
				System.out.println(getPaymentID());
				System.out.println(getCustID());
				System.out.println(getBalanceDue());
				System.out.println(getCashback());
			}else if(amt<balanace) {
				balanceDue=amt-balanace;
				cashback=0;
				paymentID="C"+ ++counter;
				System.out.println("Congrats You Successfully Made Payment"+amt);
				System.out.println(getBalanceDue());
				System.out.println(getBalanace());
				System.out.println(getCashback());
				System.out.println(getPaymentID());
				System.out.println(getCustID());
			}
		}else {
			System.out.println("Please Try Again");
		}
	}
	
}

public class AbstactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RRPaymentServices rp=null;
		//RRPaymentServices rp1=null;
		rp=new CreditCardPayment(10000.23,5001);
		rp.PayBill(15000);
		rp=new CreditCardPayment(10000.23,5001);
		rp.PayBill(0);
	}

}
