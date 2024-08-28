import java.util.Scanner;

public class Player extends Board{
		
	private char key;
	
	
	public Player(char key) {
		super();
		this.key = key;
	}
	
	public void makeMove(){
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("Please enter row (0, 1 , 2): ");
		int row = input.nextInt();
		
		System.out.println("Please enter column ( 0, 1, 2): ");
		int column = input.nextInt();
		
		spots[row][column] = key;
		
	}

}
