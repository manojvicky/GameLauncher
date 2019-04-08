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
	int [] nums = new int[4];
	Player[] playerArr = new Player[4];
	public void startGame() {
		while(true) {
			if(p1.getNumber()==randomNumber || p2.getNumber()==randomNumber || p3.getNumber()==randomNumber) {
				System.out.println("player 1 "+ ((p1.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("player 2 "+ ((p2.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("player 3 "+ ((p3.getNumber()==this.randomNumber) ? "won" : "lost"));
				System.out.println("Yoo! the number was "+ this.randomNumber);
				System.out.println("Object variable reference"+" "+p1+" "+p2+" "+p3);
				nums[0]=12;
				System.out.println("Int Array "+nums+" "+nums[0]);
				playerArr[0]=p1;
				playerArr[1]=p2;
				playerArr[2]=p3;
				System.out.println("Player Array "+playerArr+" "+playerArr[0]);
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
