import java.util.*;
public class Sprinter extends Athlete{
	
	
	
	public Sprinter(String ID, String name, int age, String state, double time, int score) {
		super(ID, name, age, state, time, score);
		
	}
    
	
	// Generates random time for sprinters
	public double compete(){
		double a;
		Random rand = new Random();
		
		a = this.getTime();
		a = rand.nextInt(11) + 10;
		setTime(a);
		
		return getTime();
	}
	 public void printTime(){
		 System.out.println(this.getTime());
		 
	 }
	 
	
 
 
 
 
}
