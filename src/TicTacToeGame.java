import java.util.Scanner;

public class TicTacToeGame {
	public static char[] board = new char[] {'0','0','0','0','0','0','0','0','0','0'};
	public static String userChar;
	
	public static void selection()
	{
		System.out.println("Enter X or O to select your character");
		Scanner sc = new Scanner(System.in);
		userChar = sc.next();
		if(userChar.equals("X"))
		{
			System.out.println("Your character is X");
		}
		else if(userChar.equals("O"))
		{
			System.out.println("Your character is O");
		}
		else {
			System.out.println("Please enter only X or O");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Welcom to TicTacToeGame!!! -----");
		selection();
	}

}
