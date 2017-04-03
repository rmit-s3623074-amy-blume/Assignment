import java.util.Random;

public class SuperAthlete extends Athlete {

	public SuperAthlete(String ID, String name, int age, String state, int time, int score) {
		super(ID, name, age, state, time, score);
	}
	
	
	public double compete(Game a){
		if (a instanceof Cycling){
		double c = this.getTime();
		Random r = new Random();
		c = r.nextInt(500)+ 300;
		
		setTime(c);
		}
		return getTime();
		
		}
 
	public double compete(int a){
		Random r = new Random();
		
		return getTime();
	}
		
	public double compete(Sprinter a){
		double x;
		Random r = new Random();
		x = this.getTime();
		x = r.nextInt(11) + 10;
		setTime(x);
		return getTime();
	}
		
	
}
