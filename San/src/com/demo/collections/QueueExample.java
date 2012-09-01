package com.demo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main (String [] args){
		
	Queue<String> queue = new LinkedList<String>();
	
	queue.offer("Anthony");
	queue.offer("Brian");
	queue.offer("Chris");
	queue.offer("Dennis");
	
	System.out.println("----Peeking Once "+queue.peek());
	System.out.println("----Peeking Once After Peek");
	
	printQueue (queue);
	
	System.out.println("----Polling Once "+queue.poll());
	System.out.println("----Peeking Once After Poll---");

	printQueue (queue);

}


public static void printQueue(Queue<String> queue){
	for (String element :queue){
		System.out.println("Element in queue =="+element);
		
	}
}
}





