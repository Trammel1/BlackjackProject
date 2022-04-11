package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Card;

public class Player {
	private BlackjackHand BJhand = new BlackjackHand();

	public Player() {
		this.BJhand = new BlackjackHand();
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


