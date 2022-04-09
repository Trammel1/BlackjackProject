package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public class Hand {
// a hand is a collection of cards
	
	private List<Card> cards;
	
	public Hand() {
		cards = new ArrayList<>();
	}
	public void addCard(Card Card) {

	}

	public void clear() {

	}

	public int getHandValue() {
		int value = 0;
		return value;
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
}
