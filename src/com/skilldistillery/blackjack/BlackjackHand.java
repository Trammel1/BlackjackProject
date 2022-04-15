package com.skilldistillery.blackjack;

import java.util.List;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Hand;

public class BlackjackHand extends Hand {
	public BlackjackHand() {
		// TODO Auto-generated constructor stub
	}

	public List<Card> getBJhand() {
		
		return this.cards;
	}

	public int getCardsSize() {
		return this.cards.size();
	}

	public int getBJhandValue() {
		//TODO create getHandValue method
		int total = 0;
		
		for (Card card : cards) {
			total += card.getValue();
		}
		return total;
	}

	public boolean isBlackjack() {
		int total = getHandValue();

		Boolean is21 = false;
		
		if (total == 21) {
			is21 = true;
		}
		
		return is21;
	}

	public boolean isBust() {
		// TODO create isBust method
		int total = getHandValue();

		Boolean isOver21 = false;
		
		if (total > 21) {
			isOver21 = true;
		}
		
		return isOver21;
	}

}
