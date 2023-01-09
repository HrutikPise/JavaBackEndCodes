class Demo1{
	String location,name;
	String getLocation() {
		return location;
	}
	void setLocation(String location) {
		this.location=location;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	
	void welcomeEmployee() {
		String[] emp=this.name.split(" ");
		System.out.println("Hello:"+emp[0]);
	}
		
	void checkCity() {
		String[] loc = this.location.split(",");
		if(("Delhi").equals(loc[1])) {
			System.out.println("Delhi");
		}else if(("Trivandrum").equals(loc[1])) {
			System.out.println("Trivandrum");
		}else if(("Bhubaneshwar").equals(loc[1])){
			System.out.println("Bhubaneshwar");
		}else {
			System.out.println("Oops!! u entered Wrong Location");
		}
	}
	void editAddress() {
		if((location).contains("STP")) {
			System.out.println("STP");
		}else {
			System.out.println("SZE");
		}			
	}
}


public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		d.setName("Annabelle Michael");
		d.setLocation("BL003,Delhi,STP");
		d.welcomeEmployee();
		d.checkCity();
		d.editAddress();
		
		Demo1 d2=new Demo1();
		d2.setName("Jissable James");
		d2.setLocation("FL091,pune,SEZ");
		d2.welcomeEmployee();
		d2.checkCity();
		d2.editAddress();
	}

}
