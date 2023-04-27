package com.app.tester;

import com.app.basket.*;

import java.util.Scanner;

public class TesterFruit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		Fruit[] basket = new Fruit[sc.nextInt()];

		System.out.println("1.Add Apple 2.Add Mango 3.Add Orange 4.Display name of fruit");
		System.out.println("5.Display fresh fruits 6.Mark fruit:stale 7.Mark All sour fruit Stale");
		System.out.println("8.Choose Fruit specific method 10.Exit");

		int ch, index = 0;
		do {

			System.out.println("Enter choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				if (index < basket.length) {
					basket[index] = new Apple(sc.next(), sc.next(), sc.nextDouble());
					index++;
				} else {
					System.out.println("Basket is full.");
				}
					break;

			case 2:
				if (index < basket.length) {
					basket[index] = new Mango(sc.next(), sc.next(), sc.nextDouble());
					index++;
				} else {
					System.out.println("Basket is full.");
				}
				
				break;

			case 3:
				if (index < basket.length) {
					basket[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
					
				} else {
					System.out.println("Basket is full.");
				}
				break;

			case 4:
				for(Fruit f : basket) {
					if(f != null) {
						System.out.println(f.getName());
					}	
				}
				break;

			case 5:
				for(Fruit f : basket) {
					if(f != null) {
						if(f.isFresh())
						System.out.println(f);
					}
				}				
				break;

			case 6:
				System.out.println("Enter index of fruit to mark stale:");
				int i = sc.nextInt();
				if(i < index) {
					basket[i].isfresh(false);
				}
				
				break;

			case 7:
				break;

			case 8:
				break;

			case 9:
				break;

			case 10:
				break;

			default:
			}

		} while (ch != 10);

	}

}
