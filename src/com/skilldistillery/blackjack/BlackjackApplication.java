package com.skilldistillery.blackjack;

public class BlackjackApplication {

	public static void main(String[] args) {
		BlackjackApplication app = new BlackjackApplication();
		app.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		System.out.println("  BLACKJACK RULES: ");
		System.out.println("	-Each player is dealt 2 cards. The dealer is dealt 2 cards with one face-up and one face-down.");
		System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
		System.out.println("	-The players cards are added up for their total.");
		System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
		System.out.println("	-Dealer “Hits” until they equal or exceed 17.");
		System.out.println("	-The goal is to have a higher card total than the dealer without going over 21.");
		System.out.println("	-If the player total equals the dealer total, it is a “Push” and the hand ends."); 
		System.out.println("	-Players win if they beat the dealer. Players win automatically if they get “Blackjack” which is 21.");

	}
		
}


