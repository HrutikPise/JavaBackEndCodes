import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class h {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a=0;
		while(a<t){
			HashSet<Character> set=new HashSet<>();
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    String str=sc.next();
		    for(int i=0;i<str.length();i++){
		        set.add(str.charAt(i));
		    }
		    if(set.size()<m) {
		    	int len=(m-set.size());
			    System.out.println(len);
		    }else {
		    	System.out.println(0);
		    }
		    
		    a++;
		    Map<String,Integer> mp=new HashMap<String,Integer>();
		    String a1="dd";
		    int b=1;
		    mp.put(a1, b); 
	}

}
}
