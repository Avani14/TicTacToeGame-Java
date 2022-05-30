import java.util.Scanner;

public class TicTacToeGame {
	public static char[] board = new char[] {'0','0','0','0','0','0','0','0','0','0'};
	public static char userChar;
	static Scanner sc = new Scanner(System.in);
	public static void selection()
	{
		System.out.println("Enter X or O to select your character");
		userChar = sc.next().charAt(0);
		if(userChar =='X')
		{
			System.out.println("Your character is X");
		}
		else if(userChar =='O')
		{
			System.out.println("Your character is O");
		}
		else {
			System.out.println("Please enter only X or O");
		}
		
	}
	
	// Display the board
	public static void showBoard()
	{
		System.out.println("The current board is");
		for(int i = 0;i<board.length -1;i++)
		{
			System.out.print(board[i]+"|");
			if(i == 2 || i == 5)
			{
				System.out.println("\n------");
			}
		}
	}
	public static void makeMove()
	{
		System.out.println("\nEnter a your move (the value should be between 1 and 9)");
		desiredSpaces();
		System.out.println();
		byte move = sc.nextByte();
		if(board[move] == '0')
		{
			board[move-1] = (char)userChar;
		}
		else
		{
			System.out.println("The place has been already assigned please make another move");
		}
		showBoard();
	}
	
	public static void desiredSpaces()
	{
		System.out.println("Places available are");
		for(int i = 0;i<board.length-1;i++)
		{
			if(board[i] == '0') {
				System.out.print((i+1)+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Welcom to TicTacToeGame!!! -----");
		selection();
		showBoard();
		makeMove();
	}

}
