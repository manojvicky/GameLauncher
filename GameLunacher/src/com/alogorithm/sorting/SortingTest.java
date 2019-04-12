package com.alogorithm.sorting;

public class SortingTest {

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		ss.randomArray();
		ss.printArr();
		ss.sort();
		ss.printArr();
	}

}
