package assignment3package;

public class Task implements Priority {

	private int numberRank;
	private String task;
	//sets task priority
	public void setPriority (int priority) {
		numberRank = priority;
	}
	//returns task priority
	public int getPriority() {
		return numberRank;
	}
	//constructor for tasks (to be included in print)
	public Task (String toDo) {
		task = toDo;
	}
	//displays print
	public String toString() {
		return (numberRank + ".) " + task);
	}
}