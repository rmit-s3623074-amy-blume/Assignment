import java.util.*;

public class Driver implements athleteLists {
	private boolean run = false;
	private boolean swim = false;
	private boolean cycle = false;
	private Athlete predict; // will be the users prediction for winner
    Game currGame; // the game that will currently be run
    Athlete [] aList; //list of athletes that will compete in a game
    
    
    
    Game[] games = new Game[3];
    ArrayList Athlete = new ArrayList();
    ArrayList<Game> AllResults = new ArrayList<Game>(); //will hold results of run games
   


	// Display of options for user to choose from
	public void menu() {
		System.out.print
		        (" \n Ozlympic Games \n" 
		        + "======================== \n" 
	            + "1. Select Game to run\n"
				+ "2. Predict the Winner of a game \n"  
	            + "3. Start The Game \n"
				+ "4. Display the final results of all games \n" 
	            + "5. Display total points of all athletes \n"
				+ "6. Exit\n" + "\n" + "Please choose an option from the above \n");
		choice();
	}
	
	/* user chooses option from menu list
	 * and action will happen depending on
		 * choice*/
	public int choice() {
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
	try{	if (choice == 1) {
			game();
		}

		if (choice == 2) {
			prediction();
		}
		if (choice == 3) {
			startGame();

		}
		if (choice == 4) {
			results();

		}
		if (choice == 5) {

			System.out.println("Athlete points");
			int i = 0;
			for (i = 0; i < fullList.length; i++) {
				if(fullList[i].getScore() != 0){
				fullList[i].print();
				fullList[i].printScore();}
			}
				menu();
		}
		
		if (choice == 6) {
			System.out.println("Game ended");
			menu();
		
		}
		if (choice < 1 || choice > 6) { //error message if number entered is outside range
			System.out.println("Error. Please choose a valid option \n");
			menu();
		}
	}
		catch(Exception e){ // Return error message if input is not an integer
			System.out.println("Invalid input, please enter an integer from 1 to 6");
			menu();
	}
	
 return choice;
}

	// for user to choose which type of game will be run
	public boolean game() {
		
		System.out.println("Which game do you wish to run? "
				+ "\n" + "1. Running \n" 
				+ "2. Cycling \n" 
				+ "3. Swimming \n");

		Scanner scan = new Scanner(System.in);
		int game = scan.nextInt();
		if (game == 1) {
		run =true;
			
			System.out.println("You have chosen running");
			menu();
			return run = true;
		}  
	        if (game == 2) {
			cycle = true;
			System.out.println("You have chosen cycling");
            menu();
			return cycle = true;
	    }
	        if (game == 3) {
			swim = true;
			System.out.println("You have chosen swimming");
			menu();
			return swim =true;
	   }
	        if (game <1 || game > 3){
	        	System.out.println("Please choose a number between 1 and 3");
	        	game();
	        }
	  return true;
}
	
	//randomly add an official into a game
	public Official getOfficial(){
		Random r = new Random();
		int x = r.nextInt(officials.length);
		return officials[x];
	}
	
		
	public Game getGame(){
		Swimming gameD = new Swimming("S01", getOfficial(),Swimming.gets1());
		Swimming gameE = new Swimming("S02", getOfficial(), Swimming.gets2());
		Swimming gameF = new Swimming("S03", getOfficial(), Swimming.gets3());
		games[0] = gameD;
		games[1]= gameE;
		games[2]= gameF;
		Random r = new Random();
		int x = r.nextInt(3);
		currGame = games[x];
		return currGame;
	}

	public Game getGames(){
		Cycling gameA = new Cycling("C01", getOfficial(), Cycling.getc1());
		Cycling gameB = new Cycling("C02", getOfficial(), Cycling.getc1());
		Cycling gameC = new Cycling("C03", getOfficial(), Cycling.getc3());
	    games [0] = gameA;
		games [1] = gameB;
		games [2] = gameC;
		Random r = new Random();
		int x = r.nextInt(3);
		
		currGame = gameA;
		return currGame;
	}

   public Game getrGame(){
	   Sprinting gameG = new Sprinting("R01", getOfficial(), Sprinting.getr1());
	   Sprinting gameH = new Sprinting("R02", getOfficial(), Sprinting.getr2());
	   currGame = gameG;
	   return currGame;
   }
	
	//chooses at random which game to run based on your choice
public Athlete [] runGame(){
	if(run == true){
		Game r = new Game();
		r = getrGame();
		r.getList();
		Athlete list [] = currGame.getList();
		aList = list;
		System.out.println();
		
		}	
	if(cycle == true){
		Game c = new Game();
		c = getGames();
		c.getList();
		Athlete list [] = currGame.getList();
		aList = list;
		System.out.println();
		
	}
	if (swim == true){
		Game s = new Game();
		s = getGame();
		s.getList();
		Athlete list [] = currGame.getList();
		aList = list;
	}
	System.out.println("Your referee is " + currGame.getRef().getName());
	for(int i = 0; i<aList.length; i++){
		aList[i].print();
		System.out.println(i + 1);
		}
		AllResults.add(currGame); //Store ID/results of game being run into a list
	
	return aList;
}

	// allows the user to make a choice of athlete
	public Athlete prediction() {
		System.out.println("Choose an athlete to win");
		runGame();
		Scanner s = new Scanner(System.in);

		int choices = s.nextInt();
		predict = aList[choices - 1];
		System.out.println("Your prediction is");
		predict.printName();
		menu();
		return predict;

	}

	public void startGame() {
		System.out.println("The results are in!");
	
		List<Double> results = new ArrayList<Double>();

		for (int i = 0; i < aList.length; i++) {
			
			aList[i].compete();
		}
		for (int i = 0; i < aList.length; i++) {
			results.add(i, aList[i].getTime());
			aList[i].print();
		// Sort results of a game into the correct order
		Collections.sort(results);
		System.out.println(results.get(i)); }
		double first = results.get(0);
	    double two = results.get(1);
		double three = results.get(2);
		for (int i = 0; i < aList.length; i++) {
		if (aList[i].getTime() == first) {

			aList[i] = aList[0];}
		if(aList[i].getTime() == two){
			aList[i] = aList[1];}
        HashMap res = new HashMap (3);
        res.put("first", aList[0]);
        res.put("second", aList[1]);
        res.put("third", aList[2]);
		
	    
		
			  
		   	
				Athlete winner = aList[0];
				Athlete second = aList[1];
				Athlete third = aList[2];
				winner.addScore(5);
				second.addScore(2);
				third.addScore(1);
				res.clear();
				}
		
				System.out.println("\nThe winner is " + aList[0].getName()); 
			 // adds point to athletes score for placing
			    System.out.println("Second Place: " + aList[1].getName());
			    System.out.println("Third Place: " + aList[2].getName());
                
		if (aList[0] == predict) {
			System.out.println("Congratulations, you picked the winner");
		     
		}
		
     
     
		menu();
		
	}

	public void results() {
		System.out.println("Results So Far:");
		//print list of the results
		for (int j = 0; j <AllResults.size(); j++){
			Game game = (Game)AllResults.get(j);
		
			game.printInfo();
		
		}	
		menu();
	}

}
