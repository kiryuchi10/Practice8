package com.javaex.ex05;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	 int num1;
    	 int num2;
    	 String op;
    	while(true) {
    		System.out.print(">>");
    		String strLine=sc.nextLine();
    		
    		if(strLine.equals("/q"))
    				{
    			System.out.println("종료합니다");
    		}
    		String [] data=strLine.split(" ");
    		num1=Integer.parseInt(data[0]);
    		num2=Integer.parseInt(data[2]);
    		op=data[1];
    	}
   
		
    	 int result=0;
         switch (op) {
             case "+":
                 Add add = new Add();
                 add.setValue(num1, num2);
                 result = add.calculate();
                 break;
             case "-":
                 Sub sub = new Sub();
                 sub.setValue(num1, num2);
                 result = sub.calculate();
                 break;
             case "*":
                 Mul mul = new Mul();
                 mul.setValue(num1, num2);
                 result = mul.calculate();
                 break;
             case "/":
                 Div div = new Div();
                 div.setValue(num1, num2);
                 result = div.calculate();
                 break;
             default:
                 System.out.println("Invalid operator");
         }

         // Print result
         System.out.println("Result: " + result);
         
         sc.close();
    }
}