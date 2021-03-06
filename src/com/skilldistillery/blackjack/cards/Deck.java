package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;

	public Deck() {
		cards = createDeck();
	}

	public List<Card> createDeck() {

		List<Card> deck = new ArrayList<>(52);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(s, r));
			}
		}
		return deck;
	}

	public int checkDeckSize() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard() {
		return cards.remove(0);
	}

	public List<Card> getCardsFromDeck() {
		return this.cards;
	}
	public void printDeck() {
		for(Card card: cards) {
			System.out.println(card);
		}
		System.out.println("Number of cards left in the deck is "+ checkDeckSize());
	}
}
