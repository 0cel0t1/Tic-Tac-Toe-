import java.util.Scanner;

public class Board{
	static char [][] spots;
	
	public Board() {
	}
	public Board(int xDimensions, int yDimensions) {
		spots = new char[xDimensions][yDimensions];
	}
	

	public void newBoard() {
		for(int row = 0; row < spots.length; row++) {
			for(int column = 0; column < spots[row].length; column++) {
				spots[row][column] = ' ';
			}
		}
	}
	
	public void displayBoard() {
		System.out.println(spots[0][0] + "  | " + spots[0][1] + " |  " + spots[0][2]);
		System.out.println("___" + "+" + "___" + "+" + "___");
		System.out.println(spots[1][0] + "  | " + spots[1][1] + " |  " + spots[1][2]);
		System.out.println("___" + "+" + "___" + "+" + "___");
		System.out.println(spots[2][0] + "  | " + spots[2][1] + " |  " + spots[2][2]);
		System.out.println("___" + "+" + "___" + "+" + "___");
	}
	//checks if board is full
	
	public Boolean isFull() {
		for(int row = 0; row < spots.length; row++) {
			for(int column = 0; column < spots[row].length; column++) {
				if(spots[row][column] != 'X' || spots[row][column] != 'Y') {
				return false;
				}
			}
		}
		return true;
	}
	
	
	//checks if slot is taken
	 public boolean isSlotTaken(int row, int column) {
	        return spots[row][column] != ' ';
	    }
	 
	public void gamePlay() {
		Player player1 = new Player('x');
		Player player2 = new Player('o');
		
		Scanner input = new Scanner(System.in);
		displayBoard();
	
		System.out.println("Hello would you like to play a tic tac toe game ? Y or N: ");
		String wantPlay = input.nextLine();
		
		newBoard();
		if(wantPlay.equalsIgnoreCase("Y")) {
			int i = 0;
		while(!gameWon() && !isFull()) {
			if(i % 2 == 0) {
			System.out.println("Player 1 it is your turn. ");
			player1.makeMove();
			displayBoard();
			i++;
		}else if(i % 2 != 0){
			System.out.println("Player 2 it is your turn");
			player2.makeMove();
			displayBoard();
			i++;
		}
	}
		if(gameWon()) {
			if(i % 2 != 0) {
				System.out.println("Congratulations Player 1, you are the winner!");
			}else if(i % 2 == 0){
				System.out.println("Congralations Player 2, you are the winner!");
			}
		}
}
	}
		
		
	
	

	
	public boolean gameWon() {
		
		
		//loops checks matching rows
		for(int row = 0; row < spots.length; row++) {
			if(spots[row][0] != ' ' && spots[row][0] == spots[row][1] && spots[row][1] == spots[row][2]) {
					return true;
			}
					
		}
		//loops check matching columns
		for(int column = 0; column < spots.length; column++) {
			if(spots[0][column] != ' ' && spots[0][column] == spots[1][column] && spots[1][column] == spots[2][column]) {
				return true;
		}
		}
		// checks for diagonal match
		if (spots[0][0] != ' ' && spots[0][0] == spots[1][1]  && spots[1][1] == spots[2][2] ) {
			return true;
		}else if (spots[0][2] != ' ' && spots[0][2] == spots[1][1] && spots[1][1] == spots[2][0]) {
			return true;
		}
	
		
		return  false;

		}
	
	}



	

