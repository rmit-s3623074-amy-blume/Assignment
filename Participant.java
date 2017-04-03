
public abstract class Participant {

	private String ID; 
	private String name;
	private int age;
	private String state;
	
	public Participant(String ID, String name, int age, String state){
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.state = state;
		
	}
	
	public String getName(){
		return this.name;
		
	}
	
	public void print(){
		 
		
		System.out.print( "\n" +" " + this.name + " ");
	
	}
}
