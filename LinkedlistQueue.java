package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistQueue {
	
public static void main(String[] args) {
	Queue<Integer> numbers = new LinkedList<>();
	numbers.offer(5);
	numbers.offer(1);
	numbers.offer(3);
	numbers.offer(7);
	numbers.offer(6);
	numbers.offer(9);
	numbers.offer(7);
	numbers.offer(2);
	numbers.offer(1);
	System.out.println(":::::" +numbers);
	
	int accessedNumber = numbers.peek();
	System.out.println("::"+accessedNumber);
	
	int removedNumber = numbers.poll();
	System.out.println(":::"+removedNumber);
	
	System.out.println(":::::" +numbers);
}
}
