package com.tsnif.daysix;

public class MethodOverloading {

	int addition(int a,int b) {
		return a+b;
	}
	
	float addition(float a,float b) {
		return a+b;
	}
	
	float addition(int a,float b) {
		return a+b;
	}
	
	public static float addition(float a,int b) {
		return a+b;
	}
	 
	String addition(String a,String b) {
		return a+b;
	}
}
