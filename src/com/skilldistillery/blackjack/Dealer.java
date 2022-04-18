package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Card;

public class Dealer {
	private Deck deck = new Deck();
	protected BlackjackHand BJhand = new BlackjackHand();

	public Dealer() {
		setDeck(new Deck());
	}

	public Deck getDeck() {

		return this.deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public BlackjackHand getBJhand() {

		return BJhand;
	}

	public int getBJhandValue() {

		return BJhand.getBJhandValue();
	}

	public Card getCard() {
		return BJhand.getCards().get(2);
	}
//	"Added to Dealer's hand: " + 
	public void addToHand(Card card) {
		System.out.println(card);
		this.BJhand.addCard(card);
		System.out.println("Dealer Hand: " + getBJhand());

	}

	public BlackjackHand displayHand() {
		
		return getBJhand();
	}

}