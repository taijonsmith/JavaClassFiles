package assignment5package;

import java.io.*;

public class StringTooLongExceptionDriver {
	public static void main(String[] args) throws Exception {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		String string;
		System.out.println("Enter a string: ");
		
		try {
			while(x > 0) {
				string = bReader.readLine();
				
				if(string.equals("DONE")) {
					break;
				}
				else if(string.length() > 20) {
					throw new StringTooLongException();
				}
				else
					x++;
			}
		}
		
		catch(StringTooLongException str) {
			System.out.println("The string you entered has too many characters: "
					+ "Program terminated!");
		}
	}
}