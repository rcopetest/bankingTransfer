package com.eintern.corejava.strings;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		String s = "";
		long start = System.nanoTime();
		for (int i=0; i<1000; ++i)
			s += i;
		long duration = System.nanoTime() - start;
		
		StringBuilder sb = new StringBuilder();
		start = System.nanoTime();
		for (int i=0;i<)
	}

}
