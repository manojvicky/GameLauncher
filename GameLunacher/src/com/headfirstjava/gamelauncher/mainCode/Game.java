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
		while(true) {
			if(p1.getNumber()==randomNumber || p2.getNumber()==randomNumber || p3.getNumber()==randomNumber) {
				System.out.println("player 1 "+ ((p1.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("player 2 "+ ((p2.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("player 3 "+ ((p3.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("Yoo! the number was "+ this.randomNumber);
				break;
			}else {
				System.out.println("no body won :-( "+ this.randomNumber);
				setRandomNumber();
				p1.setNumber();
				p2.setNumber();
				p3.setNumber();
			}
		}
	}
	
}
