package com.headfirstjava.testClass;

import com.dumps.set1.SumOfOddDigits;

public class SumOfOddDigitTestClass {

	public static void main(String[] args) {
		SumOfOddDigits digit1 = new SumOfOddDigits();
		SumOfOddDigits digit2 = new SumOfOddDigits(52315);
		digit1.setDigit(1112);
		System.out.println("digit 1: "+digit1.getDigit());
		System.out.println("digit 2: "+digit2.getDigit());
		System.out.println("return digit1 "+ digit1.test());
		System.out.println("sum of digit1 "+ digit1.sumOfOddDigits());

		System.out.println("return digit2 "+ digit2.test());
		System.out.println("sum of digit2 "+ digit2.sumOfOddDigits());
	}

}
