package firstExercises.E3;

public class Player {

	private float money;
	
	public Player(){
		this.money=100;
	}
	
	public Player(int initialMoney) {
		this.money=initialMoney;
	}
	
	public void addMoney(float newMoney) {
		this.money+=newMoney;
	}
	
	public void retrieveMoney(float retrievedMoney) {
		this.money-=retrievedMoney;
	}
	
	public boolean validatePay(float pay) {
		if (pay<=this.money && pay>=0) {
			return true;
		}
		return false;
	}
	
	public float getMoney() {
		return this.money;
	}
}
