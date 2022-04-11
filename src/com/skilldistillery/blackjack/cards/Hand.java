package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
// a hand is a collection of cards

	public List<Card> cards;

	public Hand() {
		cards = new ArrayList<>();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void addCard(Card Card) {
		cards.add(Card);

	}

	public List<Card> getHand() {
		return cards;
	}

	public int getHandValue() {
		int value = 0;
		return value;
	}

	public void clear() {
		cards.clear();
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
}
