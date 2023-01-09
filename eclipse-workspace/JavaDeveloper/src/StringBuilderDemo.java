class Demo{
	void Check(String s) {
		StringBuilder bb=new StringBuilder(s);
		//System.out.println(bb+" "+s);
		String b1=bb.reverse().toString();
		//System.out.println(b1+" "+bb);
		if(s.equals(b1)) {
			System.out.println("Palindrome Number:"+s);
		}else {
			System.out.println("Not Palindrome Number:"+s);
		}
		
		
	}
}


public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		String[] palindrome= {"121","aba","abc","123","hello","12321"};
		for(String s:palindrome) {
			d.Check(s);
		}
	}

}
