package org.fullyabstraction;
               //Child class
public class Ktm implements Bike{
	public static void main(String[] args) {
		Ktm a=new Ktm();
		a.cost();
		a.speed();
	}
	public void cost() {
		System.out.println("Cost is 165000");		
	}
	public void speed() {
		System.out.println("Speed is 125cc");		
	}
}
