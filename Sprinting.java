
public class Sprinting extends Game implements athleteLists {
     
	public Sprinting(String GameID, Official ref, Athlete[] a){
		super(GameID, ref, a);
		
  }
	public static Athlete [] getr1(){
		Athlete [] r1 = new Athlete [6];{
			r1[0] = fullList[0];
			r1[1]= fullList[3];
			r1[2]= fullList[2];
			r1[3] = fullList[8];
			r1[4]= fullList[5];
			r1[5]= fullList[6];
			return r1;
		}
	}
	
	public static Athlete [] getr2(){
		Athlete[] r2 = new Athlete[8];{
			r2[0] = fullList[1];
			r2[1]= fullList[10];
			r2[2]= fullList[7];
			r2[3] = fullList[5];
			r2[4]= fullList[9];
			r2[5]= fullList[6];
			r2[6]= fullList[4];
			r2[7]= fullList[2];
			return r2;
		}
	}	
	public static Athlete [] getr3(){
		Athlete[] r3 = new Athlete[4];{
			r3[0] = fullList[8];
			r3[1]=fullList[1];
			r3[2]=fullList[0];
			r3[3]=fullList[6];
		
		return r3;
	}
	}
} 
