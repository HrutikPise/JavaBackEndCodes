class PlayerRating{
	private int playerPosition;
	private String playerName;
	private float oneRating;
	private float twoRating;
	private float threeRating;
	private float avarageRating;
	private char category;
	
	PlayerRating(int playerPosition,String playerName){
		this.playerPosition=playerPosition;
		this.playerName=playerName;
	}
	
	void calculateAverageRating(float oneRating,float twoRating) {
		this.oneRating=oneRating;
		this.twoRating=twoRating;
		float rating=(oneRating+twoRating)/2;
		System.out.println(rating);
	}
	
	void calculateAverageRating(float oneRating,float twoRating,float threeRating) {
		this.oneRating=oneRating;
		this.twoRating=twoRating;
		this.threeRating=threeRating;
		float rating=(oneRating+twoRating+threeRating)/3;
		System.out.println(rating);
	}
	void calculateCategory() {
		if(avarageRating>8) {
			category='A';
		}else if(avarageRating>5 && avarageRating<=8) {
			category='B';
		}else {
			category='C';
		}
	}
	
	void Display() {
		System.out.println(playerName);
		System.out.println(playerPosition);
		System.out.println(avarageRating);
		System.out.println(category);
	}
}


public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerRating player=new PlayerRating(1,"Beckham");
		player.calculateAverageRating(9f,9.9f);
		player.calculateAverageRating(1f, 1f, 1f);
		player.calculateCategory();
		player.Display();
	}

}
