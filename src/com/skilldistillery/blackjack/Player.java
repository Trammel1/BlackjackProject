package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Card;
import com.skilldistillery.blackjack.cards.Hand;
import com.skilldistillery.blackjack.BlackjackHand;
import java.util.Scanner;

public class Player {
	private Scanner kb = new Scanner(System.in);

	BlackjackHand BJhand = new BlackjackHand();

	public Player() {
		this.BJhand = new BlackjackHand();
	}
	public double placeBet() {
	
		System.out.println("Enter bet amount: ");
		double i = kb.nextDouble();
		System.out.println("Amount bet = $" + i);
		return i;		
	}
	public void displayBet() {
	System.out.println("Bet amount is ");
	
	}

	public BlackjackHand getBJhand() {
		System.out.println(BJhand);
		return BJhand;
	}

	public void addToHand(Card card) {
		this.BJhand.addCard(card);
	}

	public int getHandValue() {
		return BJhand.getHandValue();
	}

	public int displayHand() {
		return  0;		
	}

	
	
}
