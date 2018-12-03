package firstExercises.E3;
import java.util.*;

public class Machine {
	
	private ArrayList<Integer> Slot=new ArrayList<Integer>();
	
	public Machine(int numSlots) {
		for (int i=0;i<numSlots;i++) {
			Slot.add(0);
		}
	}
	
	public void roll() {
		for (int i=0;i<this.Slot.size();i++) {
			Slot.set(i,(int)(Math.random()*(10-0)));
		}
	}
	
	public void show() {
		for (int i=0;i<this.Slot.size();i++) {
			System.out.println("Slot "+i+": "+Slot.get(i));
		}
	}
	
	public boolean checkWin() {
		boolean W=true;
		for (int i=1;i<this.Slot.size();i++) {
			if (Slot.get(i)!=Slot.get(i-1)) {
				W=false;
			}
		}
		return W;
	}
	
	public void pay(float bet,Player player) {
		float moneypaid= (float) Math.pow(this.Slot.size(),2)*bet;
		player.addMoney(moneypaid);
	}
	
	
	
}

