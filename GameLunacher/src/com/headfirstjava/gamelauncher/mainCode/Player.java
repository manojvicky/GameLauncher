package com.headfirstjava.gamelauncher.mainCode;

public class Player {
	private int randomNumberGuessed;
	public Player(){
		setNumber();
	}
	public Integer getNumber() {
		return this.randomNumberGuessed;
	}
	public void setNumber() {
		this.randomNumberGuessed = (int) (Math.random()*9);
	}
}
