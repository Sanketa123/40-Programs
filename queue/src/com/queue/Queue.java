package com.queue;



public class Queue<T> {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new Queue<>();

	        		locationsQueue.add("sanketa");
	        		locationsQueue.add("gulbarga");
	        		locationsQueue.add("karantaka");
	        		locationsQueue.add("pune");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

	private String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	private String size() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
	}



