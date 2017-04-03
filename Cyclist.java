import java.util.*;
public class Cyclist extends Athlete{
    
    
    public Cyclist(String ID, String name, int age, String state, double time, int score) {
		super(ID, name, age, state, time, score);
		
	}
	
	public double compete(){
		Random r = new Random();
		double c = this.getTime();
	    c = r.nextInt(500)+ 300;
	    setTime(c);
		return getTime() ;
	}
	
}




