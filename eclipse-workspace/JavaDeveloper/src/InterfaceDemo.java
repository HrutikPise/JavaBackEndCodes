interface DataProvider {
	int totalMaximumMark=8000;
	void calcPercentage();
}

class Intern implements DataProvider{
	
	int marksSecured;
	int graceMarks;
	
	public Intern(int marksSecured, int graceMarks) {
		this.marksSecured = marksSecured;
		this.graceMarks = graceMarks;
	}

	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub
		double sum=(marksSecured+graceMarks);
		if(sum>=0 && sum<=totalMaximumMark) {
			double percentage=(sum*100)/totalMaximumMark;
			System.out.println("the total aggregate percentage secured is:"+percentage);
		}else {
			System.out.println("Please enter the correct marks");
		}
	}
	
}

class Trainee implements DataProvider
{
	int marksSecured;
	public Trainee(int marksSecured) {
		this.marksSecured=marksSecured;
	}
	
	@Override
	public void calcPercentage() {
		// TODO Auto-generated method stub
		if(marksSecured>=0 && marksSecured<=totalMaximumMark) {
			double percentage=(marksSecured*100)/totalMaximumMark;
			System.out.println("the total aggregate percentage secured is:"+percentage);
		}
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataProvider da=null;// Run-time polymorphism can achive throw interface,Method-overring,Abstraction.
		da=new Intern(5000,500);
		da.calcPercentage();
		da=new Trainee(6000);
		da.calcPercentage();
		da=new Intern(8000,500);
		da.calcPercentage();
	}

}
