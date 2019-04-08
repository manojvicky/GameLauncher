/*1. A number is given as input. Find the odd digits in the number, add them and find if the sum is odd or not.
if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1
*/
package com.dumps.set1;

public class SumOfOddDigits {
	private int digit;
	private int sumOfOddDigits;
	public SumOfOddDigits(){
	}
	public SumOfOddDigits(int number){
		digit = number;
	}
	
	public void setDigit(int number) {
		digit=number;
	}
	
	public int getDigit() {
		return digit;
	}
	
	private boolean isEvenMethod() {
		int add=0;
		while(digit>0) {
			int rem = digit%10;
			if(rem%2!=0) {
				add+=rem;
			}
			digit=digit/10;
		}
		sumOfOddDigits=add;
		return add%2==0;
	}
	
	public int test() {
		return isEvenMethod() ? 1 : -1;
	}
	public int sumOfOddDigits() {
		return sumOfOddDigits;
	}
}
