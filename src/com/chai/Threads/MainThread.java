package com.chai.Threads;



public class MainThread {
	public static void main(String args[])
	{
		// Thread object created
		// and initiated with data
		Thread t = new Thread("Hello Chaithra!");

		// Thread gets started
		t.start();

		// getting data of
		// Thread through String
		String s = t.getName();
		System.out.println(s);
	}
}
