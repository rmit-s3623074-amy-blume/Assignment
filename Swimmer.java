import java.util.*;
public class Swimmer  extends Athlete {
	
	public Swimmer(String ID, String name, int age, String state, int time, int score) {
		super(ID, name, age, state, time, score);
	}

	public double compete() {
		Random r = new Random();
		double x = this.getTime();
		x = r.nextInt(200)+100;
		setTime(x);
		return getTime();
	}
	

}
