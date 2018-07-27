package Week5CodingHomework;

import java.util.Random;

public class Deck {
	
	public static final int totalCards = 52; 		
	private int deckSize;							
	private Card[] deck;							
	public Card currentCard;					
	public int cardsUsed;							
	public int cardsLeft = totalCards - cardsUsed;	
		
	public Deck() {
		String[] faces = {"2", "3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
		deck = new Card[totalCards];
		
		for (int suit = 0; suit < 4; suit++) {
			for(int face = 0; face < 13; face++) {
				deck[face + (suit*13)] = new Card(faces[face],suits[suit], face+2);
			}
		}	
		deckSize = 52;
		
	}
	
	public void displayDeck() {
		System.out.println("\nDisplaying All Cards in the Deck:\n");
		for(Card card: deck) {
			card.toPrint();
		}
		System.out.println("\n************************************\n");
			
	}

	public void shuffle() {
		Random r =  new Random();
		int swapIndex;
		Card temp;
		for (int startIndex = 0; startIndex < deckSize; startIndex++) {
			swapIndex = r.nextInt(deckSize);
			temp = deck[swapIndex];
			deck[swapIndex] = deck[startIndex];
			deck[startIndex] = temp;
		}
	}
 	
	public Card draw() {
		cardsUsed = cardsUsed + 1;
		return currentCard;			
	}	
}