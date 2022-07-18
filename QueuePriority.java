package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {

	public static void main(String[] args) {
		Queue<Integer> numbers = new PriorityQueue<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(7);
		numbers.add(6);
		numbers.add(9);
		numbers.add(7);
		numbers.add(2);
		numbers.add(1);
		System.out.println(":::::" +numbers);
		
		int accessedNumber = numbers.peek();
		System.out.println("::"+accessedNumber);
		int removedNumber = numbers.poll();
		System.out.println(":::"+removedNumber);
		System.out.println(":::::" +numbers);
	}
}
