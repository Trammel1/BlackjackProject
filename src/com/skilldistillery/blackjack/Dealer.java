package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Card;

public class Dealer {
	private Deck deck = new Deck();
	private BlackjackHand BJhand = new BlackjackHand();

	public Dealer() {
		setDeck(new Deck());
	}

	public BlackjackHand getBJhand() {
		return BJhand;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Card getCard() {
		return BJhand.getCards().get(0);
	}

	public void addToHand(Card card) {
		this.BJhand.addCard(card);
	}
}