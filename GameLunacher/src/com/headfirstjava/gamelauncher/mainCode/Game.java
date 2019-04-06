package com.headfirstjava.gamelauncher.mainCode;

public class Game {
	private int randomNumber;
	public Game(){
		setRandomNumber();
	}
	
	public void setRandomNumber() {
		this.randomNumber = (int) (Math.random()*9);
	}
	
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	public void startGame() {
		if(p1.getNumber()==randomNumber) {
			System.out.println("player 1 Won "+ p1.getNumber() +" "+ this.randomNumber );
		}else if(p2.getNumber()==randomNumber) {
			System.out.println("player 2 Won "+ p2.getNumber() +" "+ this.randomNumber );
		}else if(p3.getNumber()==randomNumber) {
			System.out.println("player 3 Won "+ p3.getNumber() +" "+ this.randomNumber );
		}else {
			System.out.println("no body won :-( "+ this.randomNumber);
		}
	}
	
}
