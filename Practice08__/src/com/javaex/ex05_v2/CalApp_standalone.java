package com.javaex.ex05_v2;

import java.util.Scanner;

class Add {
    private int a;
    private int b;

    public void setValue(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a;
    private int b;

    public void setValue(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int calculate() {
        return a - b;
    }
}

class Mul {
    private int a;
    private int b;

    public void setValue(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a;
    private int b;

    public void setValue(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public int calculate() {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class CalApp_standalone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the arithmetic expression (e.g., 5 + 3): ");
        String expression = scanner.nextLine();

        // Remove whitespace
        expression = expression.replaceAll("\\s", "");

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

        // Print result
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}