package Week5CodingHomework;

public class Player {
	
	private static String playerName;
	private static Card[] playerHand;
	private static int playerScore;

	public Player() {}
	
	public Player(String playerName) {
		Player.playerName = playerName;
	}
	
	public Player(String playerName, Card[] playerHand, int playerScore) {
		Player.playerName = playerName;
		Player.playerHand = playerHand;
		Player.setPlayerScore(playerScore);
	}
	
	public static void getPlayerInfo() {
		System.out.println("\n******PLAYER INFORMATION*******\n");
		System.out.println("Player Name: " + playerName);
		System.out.println("Player Hand: " + playerHand);
		System.out.println("Player Score: ");
		System.out.println("***********************************");
	}

	public static Card playerDraw(Deck deck) {
		return deck.draw();
	}
	
	public static int getPlayerScore() {
		return playerScore;
	}

	public static void setPlayerScore(int playerScore) {
		Player.playerScore = playerScore;
	}
}