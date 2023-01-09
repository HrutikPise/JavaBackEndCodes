class Chocolate{
	int barCode;
	String name;
	int weight;
	int cost;
	
	

	public Chocolate(int barCode, String name, int weight, int cost) {
		this.barCode = barCode;
		this.name = name;
		this.weight = weight;
		this.cost = cost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate ch=new Chocolate(101,"Cadbury",12,10);
		ch.setBarCode(102);
		ch.setName("Hershey's");
		ch.setCost(24);
		ch.setWeight(50);
		
		System.out.println(ch.getBarCode()+" "+ch.getCost()+" "+ch.getName()+" "+ ch.getWeight());
	}

}
