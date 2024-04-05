package com.javaex.ex05_v2;
import java.util.Scanner;
import java.util.Arrays;

public class CalcApp {
	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String expression=sc.next();
    	expression = expression.replaceAll("\\s", "");
    	
    	System.out.println(expression.indexOf('+'));
    	
        // Find operator index
        int operatorIndex = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (!Character.isDigit(expression.charAt(i))) {
                operatorIndex = i;
                break;
            }
        }

        // Extract numbers and operator
        int num1 = Integer.parseInt(expression.substring(0, operatorIndex));
        int num2 = Integer.parseInt(expression.substring(operatorIndex + 1));
        char operator = expression.charAt(operatorIndex);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operator);

        // Perform calculation based on operator
        int result = 0;
        switch (operator) {
            case '+':
                Add add = new Add();
                add.setValue(num1, num2);
                result = add.calculate();
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(num1, num2);
                result = sub.calculate();
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(num1, num2);
                result = mul.calculate();
                break;
            case '/':
                Div div = new Div();
                div.setValue(num1, num2);
                result = div.calculate();
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result is "+result);
    }
}