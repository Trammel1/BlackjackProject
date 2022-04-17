package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Deck;
import com.skilldistillery.blackjack.BlackjackHand;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Dealing;

public class Dealer {
	private Deck deck = new Deck();
	protected BlackjackHand BJhand = new BlackjackHand();
	private Dealing deal = new Dealing();

	public Dealer() {
		setDeck(new Deck());
	}

	public Deck getDeck() {

		return this.deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
//
//	public Dealing getDealing(Card cards, Player p1, Dealer d) {
//		for (int i = 0; i < 2; i++) {
//		p1.BJhand.getCards();
//		d.deck.getCardsFromDeck();
//		}
//		return deal;
//	}

	public BlackjackHand getBJhand() {

		return BJhand;
	}

	public int getBJhandValue() {

		return BJhand.getBJhandValue();
	}

	public Card getCard() {
		return BJhand.getCards().get(2);
	}

	public void addToHand(Card card) {
		this.BJhand.addCard(card);
	}

	public void displayHand() {
		// TODO Auto-generated method stub

	}

}