package pkgPractice;

import java.util.Scanner;

public class MirroredString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, index, pos;
		
		System.out.println("PLease enter the string to mirror");
		String input = sc.next();
		
		char[] output = new char[input.length()];
		
		System.out.println("Please enter the position of letter");
		
		pos = sc.nextInt();
		
		for(i = 0; i < pos; i++) {
			
			output[i] = input.charAt(i);
		}
		
		for(i = pos; i < input.length(); i++) {
			
			char temp = (char)((int)(input.charAt(i)) - (int)('a'));
			char temp2 = (char)((int)('z') - (int)temp);
			
			output[i] = temp2;
		}
		
		for(i = 0; i < input.length(); i++) {
			
			System.out.print(output[i] + " ");
		}
		

	}

}
