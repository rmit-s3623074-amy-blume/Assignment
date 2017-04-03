import java.util.*;
public class Cycling extends Game implements athleteLists{
    
      
	public Cycling(String GameID, Official ref, Athlete [] a){
		super(GameID, ref, a);
  }


public Cycling() {
		// TODO Auto-generated constructor stub
	}

// Lists for pre-determined cycling races

public static Athlete [] getc1(){
	Athlete [] c1 = new Athlete [5];{
    c1[0]= fullList[14];
    c1[1]=fullList[19];
    c1[2]=fullList[22];
    c1[3]=fullList[20];
    c1[4]=fullList[24];
    return c1;
 }
}
public static Athlete [] getc2(){
	Athlete[] c2 = new Athlete [8];{
	c2[0] = fullList[40];
	c2[1]= fullList[13];
	c2[2]= fullList[18];
	c2[3]= fullList[20];
	c2[4]= fullList[21];
	c2[5]= fullList[24];
	c2[6]= fullList[15];
	c2[7]= fullList[23];
	return c2;
	}
}
public static Athlete[] getc3(){
Athlete [] c3 = new Athlete [6];{
	c3[0]= fullList[25];
	c3[1]= fullList[20];
	c3[2] =fullList[21];
	c3[3]=fullList[39];
	c3[4]= fullList[40];
	c3[5]=fullList[20];
	return c3;
}

}





}
