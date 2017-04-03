import java.util.*;
public class Game implements athleteLists{
	private String GameID;
	private Official ref;
	private Athlete [] a;
	
	public Game(String GameID, Official ref, Athlete[] a){
		this.GameID = GameID;
		this.ref = ref;
		this.a = a;
		
    }
	
	public Game(){
		
	}
	
	public Official getRef(){
		return this.ref;
	}
   public Game getGame(){
	   return this.getGame();
   }
	
	public Athlete [] getList(){
		return a;
	}
	
	public String getID(){
		return GameID;
	}

	public void printInfo(){ //for printing Game info/results
	System.out.println("\n Game ID: " + GameID);
	System.out.println("\n Referee " + ref.getName()); 
	System.out.println("\n Winner: " + a[0].getName());
	System.out.println("\n Second:" + a[1].getName());
	System.out.println("\n Third:" + a[2].getName());
	System.out.println("_______________________");
	}

}	 



