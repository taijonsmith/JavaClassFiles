package asignment2package;

public class FlightTest {
	
	public static void main(String[] args) {
		//name of airlines, flight number, origin and destination are assigned
		Flight flight1 = new Flight("Southwest","1128","Louisville", "Miami");
		Flight flight2 = new Flight("Delta","924","Nashville","Dallas");
		Flight flight3 = new Flight("Southwest","1542","Los Angeles","Denver");
		Flight flight4 = new Flight("American","1211","New York City","Raleigh");
		
		//prints each flight's data using toString method
		System.out.println("Flight One: " + flight1.toString());
		System.out.println("Flight Two: " + flight2.toString());
		System.out.println("Flight Three: " + flight3.toString());
		System.out.println("Flight Four: " + flight4.toString());
	}
}