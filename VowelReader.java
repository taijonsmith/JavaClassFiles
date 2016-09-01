package assignment3package;

import java.util.Scanner;

public class VowelReader {
	
	public static void main(String[] args) {
		
		char stringChar;
		String userString;
		int a = 0, e = 0, i = 0, o = 0, u = 0, x = 0, consonants = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a string: ");
		userString = scan.next();
		//x represents where letters are in string
		for(x = 0; x < userString.length(); x++) {
			stringChar = userString.charAt(x);
			
			//detects which letters show up in the string and takes count
			switch(stringChar) {
			case 'a':
				a++;
				break;
			case 'e':
				e++;
				break;
			case 'i':
				i++;
				break;
			case 'o':
				o++;
				break;
			case 'u':
				u++;
				break;
			default:
				consonants++;
			}
		}
		System.out.println("Number of a's in the string: " + a);
		System.out.println("Number of e's in the string: " + e);
		System.out.println("Number of i's in the string: " + i);
		System.out.println("Number of o's in the string: " + o);
		System.out.println("Number of u's in the string: " + u);
		System.out.println("Number of consonants in the string: " + consonants);
	}
}