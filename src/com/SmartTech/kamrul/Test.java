package com.SmartTech.kamrul;

public class Test {
	public static void main(String[] args) {
		Test xyz = new Test();
		xyz.methodOne();
		
		//int x = Test.methodTwo()
		System.out.println(Test.methodTwo(20,30));
				
	}
	public void methodOne() {
	 String abc = "kamrulalam";
	 System.out.println(abc);
 }
	public static int methodTwo(int a, int b) {
		
		int c = a+b;
	 return c; 
  }
} 