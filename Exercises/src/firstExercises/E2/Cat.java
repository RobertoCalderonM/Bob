package firstExercises.E2;
import java.util.*;

public class Cat {
private ArrayList<Integer> TryX=new ArrayList<Integer>();
private ArrayList<Integer> TryY=new ArrayList<Integer>();


private boolean check_try(int x,int y) {
	
		for (int i=0;i<TryX.size();i++) {
			if (x==TryX.get(i) && y==this.TryY.get(i)) {
				System.out.println("Repeated try, try again");
				return true;
		}
	}
	return false;
}

private void add_try(int x,int y) {
	this.TryX.add(x);
	this.TryY.add(y);
}
	
public void catch_mouse(int x, int y, Mouse mouse) {
if (!check_try(x,y)) {
	add_try(x,y);
	if (x==mouse.getX() && y==mouse.getY()) {
		System.out.println("Mouse catched");
		mouse.setCatched(true);
	}else {System.out.println("Mouse not catched");}
}
}

public int num_tries() {
	return this.TryX.size();
}

}

