package week_5_TicTacToe;

import java.util.Scanner;

public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private player turn;
	private Scanner scanner;
	
	
	public Game(Board board, Player player1, Player player 2) {
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
		scanner = new Scanner(System.in)
		this.turn = player1;
		}
	
	public void move() {
		System.out.println("Enter x: ");
		int x = scanner.nextInt();
		System.out.println("Enter y: ");
		int y = scanner.nextInt();
		board.placeCharacter(turn.getToken(),  x,  y);
		switchTurn();
		
	private void switchTurn() {
		turn = turn == player1 ? turn = player2 : turn = player1;
	}
	}

}
