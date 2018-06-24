package com.example.git.eclipse;

public class Example {

	public static void main(String[] args) {
		Example.printMessage();
	}
	
	
	public static void printMessage(){
		System.out.println("Hello World!");
		System.out.println("Hi");
		System.out.println("ENNAMI Mohammed Amine");
		System.out.println("ABBOUDI Widad");
		System.out.println("---------------");
		printData();
	}
	public static void printData(){
		int data[]={1,56,88,60,55,784,24};
		System.out.println("Data:");
		for (int i : data) {
			System.out.println(i);
		}
	}
}
