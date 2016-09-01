package assignment3package;

public class TaskMain {

	public static void main(String[] args) {
		//constructors
		Task taskOne = new Task ("Go to the grocery");
		Task taskTwo = new Task ("Wash the car");
		Task taskThree = new Task ("Mow the lawn");
		//priority setter method
		taskOne.setPriority(1);
		taskTwo.setPriority(2);
		taskThree.setPriority(3);
		
		System.out.println("Task Priority List\n");
		System.out.println(taskOne);
		System.out.println(taskTwo);
		System.out.println(taskThree);
	}
}