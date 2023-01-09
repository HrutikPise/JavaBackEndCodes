class EventRegistration{
	String name;
	String nameofEvent;
	double registrationFee;
	public EventRegistration(String name, String nameofEvent) {
		this.name = name;
		this.nameofEvent = nameofEvent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameofEvent() {
		return nameofEvent;
	}
	public void setNameofEvent(String nameofEvent) {
		this.nameofEvent = nameofEvent;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	void registerEvent() {
		if(nameofEvent.equals("ShakeALeg")) {
			setRegistrationFee(100);
		}else if(nameofEvent.equals("Sing&Win")) {
			setRegistrationFee(150);
		}else if(nameofEvent=="Actathon") {
			setRegistrationFee(70);
		}else if(nameofEvent=="PlayAway") {
			setRegistrationFee(130);
		}else {
			System.out.println("Please choose a valid event");
		}
	}
	
}

class SingleEventRegistration extends EventRegistration{
	
	int parNo;
	public SingleEventRegistration(String name, String nameofEvent,int parNo) {
		super(name, nameofEvent);
		this.parNo=parNo;
		// TODO Auto-generated constructor stub
	}
	public int getParNo() {
		return parNo;
	}
	public void setParNo(int parNo) {
		this.parNo = parNo;
	}

	void registerEvent() {
		if(nameofEvent=="ShakeALeg") {
			setRegistrationFee(100);
		}else if(nameofEvent=="Sing&Win") {
			setRegistrationFee(150);
		}else if(nameofEvent=="PlayAway") {
			setRegistrationFee(130);
		}else {
			System.out.println("Please choose a valid event");
		}
	}
	
}

class TeamEventRegistration extends EventRegistration{
	
	int noOfPar;
	int teamNo;
	public TeamEventRegistration(String name, String nameofEvent,int noOfPar,int teamNo) {
		super(name, nameofEvent);
		this.noOfPar=noOfPar;
		this.teamNo=teamNo;
		// TODO Auto-generated constructor stub
	}
	public int getNoOfPar() {
		return noOfPar;
	}
	public void setNoOfPar(int noOfPar) {
		this.noOfPar = noOfPar;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	void registerEvent() {
		if(nameofEvent=="ShakeALeg") {
			super.registrationFee=(50*noOfPar);
		}else if(nameofEvent=="Sing&Win") {
			super.registrationFee=(60*noOfPar);
		}else if(nameofEvent=="Actathon") {
			super.registrationFee=(80*noOfPar);
		}else if(nameofEvent=="PlayAway") {
			super.registrationFee=(100*noOfPar);
		}else {
			System.out.println("Please choose a valid event");
		}

	}
}



public class MethodOverredingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EventRegistration event=null;
		SingleEventRegistration event1=new SingleEventRegistration("Jenny","Sing&Win",1);
		event1.registerEvent();
		System.out.println("Thank You  "+event1.name+" "+ "for your participation.Your registration fee is:"+event1.getRegistrationFee());
		System.out.println("You are participant no:"+event1.getParNo());
		SingleEventRegistration event2=new SingleEventRegistration("Hudson","PlayAway",2);
		event2.registerEvent();
		System.out.println("Thank You  "+event2.name+" "+ "for your participation.Your registration fee is:"+event2.getRegistrationFee());
		System.out.println("You are participant no:"+event2.getParNo());
		TeamEventRegistration event3=new TeamEventRegistration("Aura","ShakeALeg",5,1);
		event3.registerEvent();
		System.out.println("Thank You  "+event3.name+" "+ "for your participation.Your registration fee is:"+event3.getRegistrationFee());
		System.out.println("You are participant no:"+event3.getTeamNo());
		
	}

}
