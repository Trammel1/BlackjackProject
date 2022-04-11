package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Deck;

public class Dealer {
	private Deck deck = new Deck();
	private BlackjackHand BJhand;

	public Dealer() {
		setDeck(new Deck());
	}

	public BlackjackHand getBJhand() {
		return BJhand;
	}

	public void setBJhand(BlackjackHand bJhand) {
		BJhand = bJhand;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
}
