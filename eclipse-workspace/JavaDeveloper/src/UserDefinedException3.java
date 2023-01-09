class ArException extends Exception{
	 ArException(String msg){
		 super(msg);
	 }
}


class Demo5{
	int rem=0,sum=0,temp;
	void Test(int n)throws ArException {
		//System.out.println(n);
		temp=n;
		while(temp>0) {
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		//System.out.println(n+" "+temp+" "+sum);
		if(n==sum) {
			System.out.println("This is that No:"+n);
		}else {
			throw new ArException("This is not that No:"+n);
		}
	}
}


public class UserDefinedException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d=new Demo5();
		try {
			d.Test(153);
		} catch (ArException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
