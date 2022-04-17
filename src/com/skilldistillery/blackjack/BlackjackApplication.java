package com.skilldistillery.blackjack;

import java.util.Scanner;

public class BlackjackApplication {
	private Scanner kb = new Scanner(System.in);
	private Dealer d = new Dealer();
	private Player p1 = new Player();

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run();

		app.close();
	}

	private void run() {
		// TODO Auto-generated method stub
		System.out.println("  BLACKJACK RULES: ");
		System.out.println("	-Player and Dealer is dealt 2 cards. ");
		System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
		System.out.println("	-The players cards are added up for their total.");
		System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
		System.out.println("	-Dealer “Hits” until they equal or exceed 17.");
		System.out.println("	-The goal is to have a higher card total than the dealer without going over 21.");
		System.out.println("	-If the player total equals the dealer total, it is a “Push” and the hand ends.");
		System.out.println("	-Players win if they beat the dealer. Players win automatically if they get “Blackjack” which is 21.");
		d.getDeck().shuffle();
		p1.placeBet();
		p1.addToHand(d.getDeck().dealCard());
		p1.addToHand(d.getDeck().dealCard());
		d.addToHand(d.getDeck().dealCard());
		d.addToHand(d.getDeck().dealCard());
		
		System.out.println("Enter Hit or Stay: ");
		String choice = kb.next();
		while (choice.equalsIgnoreCase("Hit")) {
			p1.addToHand(d.getDeck().dealCard());
			System.out.println("Enter Hit or Stay: ");
			choice = kb.next();
		}
		
		if (d.getBJhandValue() == 21) {
			displayWinner("dealer (BlackJack!!!)");
			close();
		}else if (p1.getBJhandValue() == 21) {
			displayWinner("player 1 (BlackJack!!!)");
			close();
		}
//		The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's 
//		hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.
		
		while (d.getBJhandValue() < 17) {
			d.addToHand(d.getDeck().dealCard());
		}
		boolean p1Bust = p1.getBJhandValue() > 21;
		boolean dBust = d.getBJhandValue() > 21;
		if (p1Bust && dBust) {
			displayPush();
		} else if (p1Bust) {
			displayWinner("dealer");
		} else if (dBust) {
			displayWinner("player 1");
		} else {
			if (p1.getBJhandValue() == d.getBJhandValue()) {
				displayPush();

			} else if (p1.getBJhandValue() > d.getBJhandValue()) {
				displayWinner("player 1");
			} else if (p1.getBJhandValue() < d.getBJhandValue()) {
				displayWinner("dealer");
			}
		}
		d.getDeck().printDeck();
	}
	

	
	private void displayPush() {
		System.out.println("Push ");
	}

	private void displayWinner(String winner) {
		System.out.println("The winner is: " + winner);

	}

	private void close() {
	
		System.exit(0);
	}

}
