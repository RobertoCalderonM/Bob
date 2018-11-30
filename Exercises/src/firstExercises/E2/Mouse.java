package firstExercises.E2;

public class Mouse {
	
	private int x,y;
	private boolean catched;

	public Mouse() {
		super();
		System.currentTimeMillis();
		this.x=(int) (Math.random()*(5-1)+1);
		this.y=(int) (Math.random()*(5-1)+1);
		this.catched=false;
		
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isCatched() {
		return catched;
	}

	public void setCatched(boolean catched) {
		this.catched = catched;
	}
	
	
	
}
