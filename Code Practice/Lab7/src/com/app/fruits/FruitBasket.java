package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of your basket (integer value)");
		int size = sc.nextInt();
		int ch, index = 0, i;
		Fruit[] f = new Fruit[size];
		System.out.println("1. Add Mango 2. Add Orange 3. Add Apple 4. Display Fruits name from Basket");
		System.out.println("5. View Fresh Fruit Details 6. Mark a fruit Stale 7. Mark all Sour fruit Stale 8. Make Fruit Juice/Jam/Pulp");
		System.out.println("9. Exit");
		
		do {
			
			System.out.println("Enter Choice");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				if(index < f.length) {
					System.out.println("Enter Mango Color, Weight and Name of Mango type");
					f[index] = new Mango(sc.next(), sc.nextDouble(), sc.next(), true);
						
					index++;
				}
				else {
					System.out.println("Basket is Full!");
				}
				break;
				
			case 2:
					if(index < f.length) {
						System.out.println("Enter Orange Color, Weight and Name of Orange type");
						f[index] = new Orange(sc.next(), sc.nextDouble(), sc.next(), true);
						index++;
						
					}
					else
						System.out.println("Basket is full!");
				
				break;
			case 3:
					if(index < f.length) {
						System.out.println("Enter Apple Color, Weight and Name of Apple type");
						f[index] = new Apple(sc.next(), sc.nextDouble(), sc.next(), true);
						index++;
						
					}
					else
						System.out.println("Basket is full!");
				
				break;
			case 4:
					for (Fruit item : f) {
						if(item != null)
							System.out.println(item);
					}
				
				break;
			case 5:
					for(Fruit item : f) {
						
						if(item != null && item.isFresh()) {
							
							System.out.println(item);
							if(item instanceof Apple)
								((Apple)item).taste();
							else if(item instanceof Mango)
								((Mango)item).taste();
							else if(item instanceof Orange)
								((Orange)item).taste();
						}
					}
				
				break;
			case 6:
					System.out.println("Enter index of item to mark stale");
					
					i = sc.nextInt();
					if(f[i] != null) {
						f[i].setFresh(false);
						System.out.println("Item marked stale");
					}
					else
						System.out.println("Item not yet added");
				
				break;
			case 7:
					for (Fruit item : f) {
						if(item != null && item instanceof Orange) {
							item.setFresh(false);
						}
					}
					System.out.println("Marked all Sour fruit stale");
				
				break;
			case 8:
					System.out.println("Please enter index to call special method");
					i = sc.nextInt();
					if(f[i] != null) {
						if(f[i] instanceof Apple)
							((Apple)f[i]).jam();
						else if(f[i] instanceof Mango)
							((Mango)f[i]).pulp();
						else if(f[i] instanceof Orange)
							((Orange)f[i]).juice();
					}
				
				break;
			case 9:
				System.out.println("---End of Shopping---");
				break;

			default:
				System.out.println("Invalid Option. Try Again");
				break;
			} //End of Switch
			
		}while(ch != 9); //end of do loop
		
		System.out.println("---End of Program---");

	}

}
