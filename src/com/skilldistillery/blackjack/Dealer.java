package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Dealing;

public class Dealer {
	private Deck deck = new Deck();
	private BlackjackHand BJhand = new BlackjackHand();
	private Dealing deal = new Dealing();

	public Dealer() {
		setDeck(new Deck());
	}
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Dealing getDealing(BlackjackHand bJhand) {
		return deal;
	}

	public BlackjackHand getBJhand() {
		return BJhand;
	}

	public Card getCard() {
		return BJhand.getCards().get(0);
	}

	public void addToHand(Card card) {
		this.BJhand.addCard(card);
	}

	
}