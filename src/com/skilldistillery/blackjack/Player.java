package com.skilldistillery.blackjack;

import com.skilldistillery.blackjack.cards.Card;
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
//	"Added to Player's hand: " + 
	public void addToHand(Card card) {
		System.out.println(card);
		this.BJhand.addCard(card);
		System.out.println("Player Hand: " + getBJhand());

	}

	public int getBJhandValue() {

		return BJhand.getBJhandValue();
	}

}
