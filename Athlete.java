
public abstract class Athlete extends Participant {
	private int score;
	private double time;
	public Athlete(String ID, String name, int age, String state, double time, int score) {
		super(ID, name, age, state);
		this.time = time;
		this.score = score;
	}
   
	//will randomly generate a time for different types of athletes
	public double compete(){
		return time;
	};
	
	public double compete(Game a){
		return time;
	}
	//returns score
	public int getScore(){
		return score;
	}
	
	public double getTime(){
		return this.time;
	}
	

	public void printTime(){
		
	}
	
	public void setTime(double a){
		time = a;
	}
	
	public void printName(){
		getName();
		System.out.println(this.getName());
	}
	

   public void printScore(){
	   System.out.println(this.score);
   }
   
   public int addScore(int place){
	   score =+ place;
	   return score;
   }
	

}
