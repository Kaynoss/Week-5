package Week5CodingHomework;

public class Card {
	
	private String face;
	private String suit;
	private int value;
	
	public Card() {}
	
	public Card(String face, String suit, int value) {
		this.setFace(face); 
		this.setSuit(suit);
		this.setValue(value);
	}

	public  void cardInfo() {
		System.out.println("\nCard Name: " +face + " of " + suit);
		System.out.println("This card is worth: "+ value + " points.");
		System.out.println("*************************************\n");
	}
	
	public void toPrint() {
		System.out.println(face + " of " + suit);
	}
	
	public  String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public  String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public  int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
		
}