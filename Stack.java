/**
 * Ted Mader
 * Stack
 * 11/05/2013
 **/

import java.util.Arrays;

public class Stack{
	
	private String[] dataArray;
	private int stackSize;
	private int currentIndex;
	
	public Stack(){
		dataArray = new String[10];
		stackSize = 0;
		currentIndex = 0;
	}
	
	public Stack(int size){
		//System.out.println("***Constructing new Stack...");
		dataArray = new String[size];
		stackSize = 0;
		currentIndex = 0;
		//System.out.println("***Constructed Stack.");
	}
	
	public Stack(String[] otherArray){
		dataArray = Arrays.copyOf(otherArray, 2*otherArray.length);
		stackSize = dataArray.length;
		currentIndex = otherArray.length;
	}	
	
	public void push(String data){
		//System.out.println("***Adding data...");
		//System.out.println("***stackSize: " + stackSize);
		//System.out.println("***currentIndex: " + currentIndex);
		if(currentIndex == dataArray.length){
			expandArray();
		}
		dataArray[currentIndex] = data;
		stackSize++;
		currentIndex++;	
		printStack();
	}
	
	public String pop(){
		String popData = "No data to remove.";
		//System.out.println("***Removing data...");
		if(stackSize > 0){
			popData = dataArray[currentIndex - 1];
			dataArray[currentIndex - 1] = null;
			stackSize = stackSize - 1;
			currentIndex = currentIndex - 1;
			printStack();
		}
		//System.out.println("***stackSize: " + stackSize);
		//System.out.println("***currentIndex: " + currentIndex);
		return popData;
	}
	
	public String peek(){
		String topOfStack = "There are no strings.";
		if(currentIndex - 1 >= 0){
			topOfStack = dataArray[currentIndex - 1];
		}
		return topOfStack;
	}
	
	public boolean isEmpty(){
		boolean elementCheck = false;
		for(int i = 0; i < stackSize; i++){
			if(dataArray[i] != null){
				elementCheck = true;
			}
		}
		return elementCheck;
	}
	
	public int size(){
		return stackSize;
	}
	
	private void expandArray(){
		//System.out.println("***Expanding Array...");
		String[] newArray = new String[dataArray.length + 5];
		for(int i = 0; i < dataArray.length; i++){
			newArray[i] = dataArray[i];
		}
		dataArray = newArray;
		//System.out.println("***New dataArray.length: " + dataArray.length);
		//System.out.println("***New stackSize: " + stackSize);
	}
	
	private void printStack(){
		System.out.println("\nStack:");
		for(int i = stackSize - 1; i >= 0; i = i-1){
			System.out.println((i+1) + ": " + dataArray[i]);
		}
	}
	
}