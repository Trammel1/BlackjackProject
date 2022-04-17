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

	public BlackjackHand getBJhand() {
		
		return BJhand;
	}

	public void setBJhand(BlackjackHand bJhand) {
		BJhand = bJhand;
		
	}
	public void addToHand(Card card) {
		System.out.println("Added to Player's hand: " + card);
		this.BJhand.addCard(card);
	}

	public int getBJhandValue() {
		
		return BJhand.getBJhandValue();
	}

	

	
	
}
