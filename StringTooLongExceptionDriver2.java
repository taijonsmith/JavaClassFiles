package assignment5package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTooLongExceptionDriver2 {
	public static void main(String[] args) throws IOException {
		StringTooLongExceptionDriver2 ex = new StringTooLongExceptionDriver2();
		ex.compute();
	}
	String string;
	
	public void compute() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		System.out.println("Enter a string: ");
		
		try {
			while(x > 0) {
				string = bReader.readLine();
				
				if(string.equals("DONE")) {
					break;
				}
				else if(string.length() > 20) {
					throw new StringTooLongException2();
				}
				else
					x++;
			}
		}
		
		catch(StringTooLongException2 str) {
			System.out.println("The string you entered has too many characters, try again... ");
			compute();
		}
	}
}