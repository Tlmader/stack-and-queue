/**
 * Ted Mader
 * Queue
 * 11/05/2013
 **/

import java.util.Arrays;

public class Queue{
	
	private String[] dataArray;
	private int queueSize;
	private int currentIndex;
	
	public Queue(){
		dataArray = new String[10];
		queueSize = 0;
		currentIndex = 0;
	}
	
	public Queue(int size){
		//System.out.println("***Constructing new Queue...");
		dataArray = new String[size];
		queueSize = 0;
		currentIndex = 0;
		System.out.println("***Constructed Queue.");
	}
	
	public Queue(String[] otherArray){
		dataArray = Arrays.copyOf(otherArray, 2*otherArray.length);
		queueSize = dataArray.length;
		currentIndex = otherArray.length;
	}	
	
	public void push(String data){
		//System.out.println("***Adding data...");
		//System.out.println("***queueSize: " + queueSize);
		//System.out.println("***currentIndex: " + currentIndex);
		if(currentIndex == dataArray.length){
			expandArray();
		}
		for(int i = queueSize - 1; i >= 0; i = i-1){
			dataArray[i+1] = dataArray[i];
		}
		dataArray[0] = data;
		queueSize++;
		currentIndex++;	
		printQueue();
	}
	
	public String pop(){
		String popData = "No data to remove.";
		//System.out.println("***Removing data...");
		if(queueSize > 0){
			popData = dataArray[currentIndex - 1];
			dataArray[currentIndex - 1] = null;
			queueSize = queueSize - 1;
			currentIndex = currentIndex - 1;
			printQueue();
		}
		//System.out.println("***queueSize: " + queueSize);
		//System.out.println("***currentIndex: " + currentIndex);
		return popData;
	}
	
	public String peek(){
		String topOfQueue = "There are no strings.";
		if(currentIndex - 1 >= 0){
			topOfQueue = dataArray[currentIndex - 1];
		}
		return topOfQueue;
	}
	
	public boolean isEmpty(){
		boolean elementCheck = false;
		for(int i = 0; i < queueSize; i++){
			if(dataArray[i] != null){
				elementCheck = true;
			}
		}
		return elementCheck;
	}
	
	public int size(){
		return queueSize;
	}
	
	private void expandArray(){
		//System.out.println("***Expanding Array...");
		String[] newArray = new String[dataArray.length + 5];
		for(int i = 0; i < dataArray.length; i++){
			newArray[i] = dataArray[i];
		}
		dataArray = newArray;
		//System.out.println("***New dataArray.length: " + dataArray.length);
		//System.out.println("***New queueSize: " + queueSize);
	}
	
	private void printQueue(){
		System.out.println("\nQueue:");
		for(int i = 0; i < queueSize; i++){
			System.out.print(dataArray[i] + " ");
		}
		System.out.println("");
	}
	
}