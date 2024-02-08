package com.tsnif.daysix;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		int a=3;
		int b=5;
		float c=7;
		float d=2;
		String e="abc";
		String f="de";
		MethodOverloading m=new MethodOverloading();
		
      System.out.println(m.addition(a,c));
      System.out.println(MethodOverloading.addition(c, b));
	}

}
