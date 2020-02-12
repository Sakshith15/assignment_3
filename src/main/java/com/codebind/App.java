 package com.codebind;

 import java.util.Scanner;
 
 class Calculator{  /*Class is having single responsibility*/
	 int a,b;
	 Calculator(int a,int b){
		 this.a=a;
		 this.b=b;
	 }
	 
	 int add() { return a+b; } /*KISS principle used  because all the functions are here simple*/
	 int sub() {return a-b; }
	 int mul() {return a*b; }
	 int div() {return a/b; }
 }
 
 /* Dry is used because no function or class is repeated*/
 
public class App {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = s.nextInt();
		System.out.print("Enter b: ");
		int b = s.nextInt();
		System.out.print("Enter the Operation: 1:Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		int op = s.nextInt();
		s.close();
		
		Calculator obj = new Calculator(a,b);
		
		int c=0;
		
		switch(op) {
			case 1: c=obj.add(); break;
			case 2: c=obj.sub(); break;
			case 3: c=obj.mul(); break;
			case 4: c=obj.div(); break;
			default : System.out.print("Invalid");
		}
		
		System.out.print("Answer = " + c);
	}
}

