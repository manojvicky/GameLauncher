package com.headfirst.sinkdotcom;

import java.util.Scanner;

public class SinkDotCom {
	public String [] sinkArr = new String[7];
	public int hitCount = 3;
	public int range;
	public int noOfChances = 4;
	public static final String dotCom = "Manoj.com";
	
	SinkDotCom(){
		range = random(); 
	}
	
	public int random() {
		int random = (int) (Math.random()*6);
		return random<5 ? random : random();
	}
	
	public void insertArray() {
		for(int i=range; i<(range+3);i++) {
			sinkArr[i] = dotCom;
		}
	}
	
	public void plotArray() {
		for(int i=0; i<sinkArr.length;i++) {
			System.out.print(sinkArr[i]+" ");
		}
	}
	public void start() {
		insertArray();
		while(noOfChances>0) {
			System.out.println("Please enter the value");
			Scanner guess = new Scanner(System.in); 
			int userGuess = guess.nextInt();
			String value = sinkArr[userGuess];
			if(value==dotCom) {
				noOfChances-=1;
				hitCount-=1;
				if(hitCount==0) {
					System.out.println("Kill");
					System.out.println("Perfect");
					break;
				}else {
					System.out.println("Hit");
				}
			}else {
				noOfChances-=1;
				System.out.println("Miss");
				System.out.println("Keep it up!");
			}
//			guess.close();
		}
		System.out.println("Game Ended");
		if(hitCount==0) {
			System.out.println("You Won in "+ (4-noOfChances)+" chances.");
		}else {
			System.out.println("You lost, out ofchances");
		}
	}
}
