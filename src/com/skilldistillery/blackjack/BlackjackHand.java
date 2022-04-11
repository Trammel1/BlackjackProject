package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Hand;

public class BlackjackHand extends Hand {
	public BlackjackHand() {
		// TODO Auto-generated constructor stub
	}
	public int getHandValue() {
		//TODO create getHandValue method
		int totalValue = 0;
		for (int i = 0; i < getHand().size(); i++) {
			totalValue += getHand().get(i).getValue();
		}
		return totalValue;
	}
		return 0;

	public boolean isBlackjack() {
		//TODO create isBlackjack method
		return false;
	}
	public boolean isBust() {
		//TODO create isBust method

		return false;
	}
	
}
