import java.util.Arrays;

class VaragsExercise1{
	public void Display(int... input) {
		System.out.println("Display Method");
		for(int a:input) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	public void MaxList(int... input) {
		System.out.println("Max is:");
		int k=0;
		for(int a:input) {
			if(a>k) {
				k=a;
			}
		}
		System.out.println(k);
	}
	public void SortList(int... input) {
		System.out.println("Before Sorting");
		for(int a:input) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("After Sorting");
		Arrays.sort(input);
		for(int a:input) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public void AverageList(float... input) {
		System.out.println("Average is:");
		float k=0;int count=0;
		for(float a:input) {
			k=k+a;
			count++;
			
		}
		k=k/count;
		System.out.println(k);
	}
}


public class VariableAsArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaragsExercise1 var=new VaragsExercise1();
		var.Display(5,3,2,5,21);
		var.MaxList(5,22,1,2,7,54,6);
		var.SortList(6,4,6,7,2,4,8,9,1);
		var.AverageList(5,10,2,24,6);
		
		 Account account=new Account();
		 account.display(1001,20,30,40,60,80);
	}

}


class Account {
	
void display(int accountId, int... amount){
		int sum=0;
		for(int x:amount){
			sum+=x;
		}
	System.out.println("The sum is: "+accountId+sum);
	}
}