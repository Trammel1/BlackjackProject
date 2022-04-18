package com.skilldistillery.blackjack;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Hand;

public class BlackjackHand extends Hand {
	public BlackjackHand() {
	}
	public List<Card> getBJhand() {
		
		return this.cards;
	}

	public int getCardsSize() {
		return this.cards.size();
	}

	public int getBJhandValue() {
		
		return this.getHandValue();
	}

}
