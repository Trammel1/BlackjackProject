package com.skilldistillery.blackjack;

//import java.util.Scanner;


public class BlackjackApplication {
//	private Scanner kb = new Scanner(System.in);
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
		d.getDealing(null, p1, d);
//		p1.getCard();
		p1.getBJhand();
		d.getBJhand();
		p1.getHandValue();
		p1.addToHand(null);
		p1.displayHand();
		d.addToHand(null);
		d.displayHand();
		displayWinner();
		
		
	}
	private void displayWinner() {
		
	}
	private void close() {
		// TODO Auto-generated method stub
		
	}
		
}


