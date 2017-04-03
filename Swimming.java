
public class Swimming extends Game implements athleteLists{
	
	public Swimming(String GameID, Official ref, Athlete[] a){
		super(GameID, ref, a);
  }
//Lists for swimming games
	public static Athlete [] gets1(){
	Athlete [] s1 = new Athlete[5];{
		 s1[0]= fullList[35];
		 s1[1]=fullList[30];
		 s1[2]=fullList[28];
		 s1[3]=fullList[31];
		 s1[4]=fullList[32];
		 return s1;
		}
	}	
	public static Athlete [] gets2(){
		Athlete [] s2 = new Athlete[5];{
			 s2[0]= fullList[31];
			 s2[1]=fullList[32];
			 s2[2]=fullList[28];
			 s2[3]=fullList[29];
			 s2[4]=fullList[38];
			return s2;
		}
	
	}
	
	public static Athlete [] gets3(){
		Athlete [] s3 = new Athlete[8];{
			s3[0]= fullList[30];
			s3[1]=fullList[34];
			s3[2]=fullList[36];
			s3[3]=fullList[28];
			s3[4]=fullList[33];
			s3[5]= fullList[37];
			s3[6]= fullList[29];
			s3[7]= fullList[35];
			return s3;
		}
	}
	
}
