package com.imagegrafia.calculator;

public class Calculator {
	public int add(int i, int j) {
		return i + j;
	}
	public int divide(int k, int m) { 
		int x=10;
		try {
			x= m%k;
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		return x;
	}
}
