public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		float f=10.12342f;
		double d=1203.39327674645;
		
		//It will convert both float and double to int
		int i1=(int)f;
		int i2=(int)d;
		System.out.println(i1+" "+i2);
		
		//It will convert both int and double to float
		float f1=i; //implicit conversion
		float f2=(float)d; //Explicit conversion
		System.out.println(f1+" "+f2);
		
		//It will convert both float and int to double
		double d1=i;
		double d2=f;
		System.out.println(d1+" "+d2);
		
	}

}
