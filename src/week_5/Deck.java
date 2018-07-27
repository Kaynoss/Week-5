package week_5;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	
	private List<Card> cards;
	
	public Deck() {
		setCards(new ArrayList<Card>());
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
		}		cards,add(new Card(j, createCardName(i, j)));

	}

}
	public card(draw() )
		System.out.println();{
		cards.remove(0);
	}
	private String createCardName(int suite, int value) {
		StringBuilder cardName = new StringBuilder();
		
		switch (value) {
		case 11:
			
		}
		
		
		switch (suit) {
		case 0:
			cardName.append("Heart");
			break;
		case 1:
		cardName.append("Diamond");
			break;
		case 2:
		cardName.append("Spade");
			break;
		case 3:
		cardName.append("Club");
			break;
		default:
			cardName.append("Default");
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}	