package asignment2package;

public class Flight {
	
	//variables declared
	private String airlineName;
	private String flightNumber;
	private String origin;
	private String destination;
	
	//constructors
	public Flight(String airline, String number, String starting, String ending) 
	{
		airlineName = airline;
		flightNumber = number;
		origin = starting;
		destination = ending;
		
	}
	
	//setter method definitions
	public void setFlightName(String airName) {
		airlineName = airName;
		}
	
	public void setFlightNumber(String planeNumber) {
		flightNumber = planeNumber;
	}
	
	public void setFlightOrigin(String planeStart) {
		origin = planeStart;
	}
	
	public void setFlightDestination(String planeEnd) {
		destination = planeEnd;
	}
	
	//getter method definitions
	public String getFlightName() {
		return airlineName;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getFlightOrigin() {
		return origin;
	}
	
	public String getFlightDestination() {
		return destination;
	}
	
	//toString method
	public String toString() {
		return "Flight Name -> " + airlineName + ", Flight Number -> " 
				+ flightNumber + ", Flight Origin -> " + origin + 
				", Flight Destination -> " + destination;
	}
}