package com.skilldistillery.blackjack.cards;

public abstract class Hand extends Card {

	

	public Hand(Suit suit, Rank rank) {
		super(suit, rank);
		// TODO great hand method to deal two cards

	}

	public void addCard(Card Card) {

	}

	public void clear() {

	}

	public int getHandValue() {
		return 0;
	}

	public String toString() {
		return null;
	}
}
