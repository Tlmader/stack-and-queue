/**
 * Ted Mader
 * Data Structures: Stack and Queue
 * 11/15/2013
 **/

import java.util.Scanner; 

public class StackAndQueue{
	
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int index;
		String data;
		String temp;
		
		int returnedInt;
		boolean returnedBoolean;
		String returnedString;
		System.out.println("\n=== DATA STRUCTURES ===");
		System.out.println("\nWhich would you like to work with?");
		System.out.println("1. Stack - Operates like a stack of books; add to top, remove from top.");
		System.out.println("2. Queue - Operates like a line; add to the back, remove from the front.\n");
		choice = input.nextInt();
		if(choice == 1){
			choice = 0;
			System.out.println("\n=== STACK ===");
			Stack myStack= new Stack(1);
			while(choice != 6){
				System.out.println("\n1. Push a string to the top of the stack.");
				System.out.println("2. Remove a string from the top of the stack.");
				System.out.println("3. Return the string at the top of the stack.");
				System.out.println("4. Check if there are strings in the stack.");
				System.out.println("5. Return the number of strings in the stack.");
				System.out.println("6. Exit the application.\n");
				choice = input.nextInt();
				//push
				if(choice == 1){
					System.out.println("\nEnter the string you wish to push to the top of the stack.\n");
					data = input.next();
					myStack.push(data);
				}
				//pop
				if(choice == 2){
					returnedString = myStack.pop();
					System.out.println("\nYou removed: " + returnedString);
				}
				//peek
				if(choice == 3){
					returnedString = myStack.peek();
					System.out.println("\nString at the top of the stack: " + returnedString);
				}
				//isEmpty
				if(choice == 4){
					returnedBoolean = myStack.isEmpty();
					if(returnedBoolean == true){
						System.out.println("\nThe stack contains data.");
					}
					if(returnedBoolean == false){
						System.out.println("\nThe stack is empty.");
					}
				}
				//size
				if(choice == 5){
					returnedInt = myStack.size();
					System.out.println("\nThe size of the stack is " + returnedInt + ".");
				}
			}
		}
		if(choice == 2){
			System.out.println("\n=== QUEUE ===");
			Queue myQueue= new Queue(1);
			while(choice != 6){
				System.out.println("\n1. Push a string to the back of the queue.");
				System.out.println("2. Remove a string from the front of the queue.");
				System.out.println("3. Return the string at the front of the queue.");
				System.out.println("4. Check if there are strings in the queue.");
				System.out.println("5. Return the number of strings in the queue.");
				System.out.println("6. Exit the application.\n");
				choice = input.nextInt();
				//push
				if(choice == 1){
					System.out.println("\nEnter the string you wish to push to the top of the queue.\n");
					data = input.next();
					myQueue.push(data);
				}
				//pop
				if(choice == 2){
					returnedString = myQueue.pop();
					System.out.println("\nYou removed: " + returnedString);
				}
				//peek
				if(choice == 3){
					returnedString = myQueue.peek();
					System.out.println("\nString at the top of the queue: " + returnedString);
				}
				//isEmpty
				if(choice == 4){
					returnedBoolean = myQueue.isEmpty();
					if(returnedBoolean == true){
						System.out.println("\nThe queue contains data.");
					}
					if(returnedBoolean == false){
						System.out.println("\nThe queue is empty.");
					}
				}
				//size
				if(choice == 5){
					returnedInt = myQueue.size();
					System.out.println("\nThe size of the queue is " + returnedInt + ".");
				}
			}
		}
		System.out.println("\nHave a good day, sir.");
	}
}