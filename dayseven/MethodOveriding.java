package com.tsnif.dayseven;

public class MethodOveriding {

	public static void main(String[] args) {
		RBI a=new SBI();
		RBI b=new HDFC();
		RBI c=new ICICI();
		System.out.println(a.getrateofinterest());
		System.out.println(b.getrateofinterest());
		System.out.println(c.getrateofinterest());

	}

}
