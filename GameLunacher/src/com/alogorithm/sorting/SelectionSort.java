package com.alogorithm.sorting;

public class SelectionSort {
private int[] arr = new int[7];
public void randomArray() {
	for(int i=0; i<arr.length;i++) {
		int random = (int) (Math.random()*9);
		int randomNumber = (int) (Math.random()*random*100);
		arr[i]=randomNumber;
	}
}
public void printArr() {
	for(int i=0; i<arr.length;i++) {
		if(i==arr.length-1) {
			System.out.print(" "+arr[i]+" ");
			System.out.println("");
		}else {
			System.out.print(" "+arr[i]+" ");
		}
	}
}
public void sort() {
	for(int i=0; i<arr.length;i++) {
		int min;
		for(int j=i+1; j<arr.length;j++) {
			if(arr[j]<arr[i]) {
				min=arr[j];
				arr[j]=arr[i];
				arr[i]=min;
			}
		}
	}
}
}
