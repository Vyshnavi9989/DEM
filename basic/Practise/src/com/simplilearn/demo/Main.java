
//Program For Arithmetic Calculator
package com.simplilearn.demo;
import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {
        char operator;
	    Float a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
	    a = input.nextFloat();
        System.out.println("Choose an operator:");
	    operator = input.next().charAt(0);
        System.out.println("Enter second number");
	    b = input.nextFloat();
        switch (operator) {
          case '+':
            c = a + b;
	        System.out.println("Addition is :" + c);
	        break;
          case '-':
	    	c = a - b;
	        System.out.println("Subtraction is :" + c);
	        break;
          case '*':
	    	c = a * b;
	        System.out.println("Multiplication is :" + c);
	        break;
	      case '/':
	    	c = a / b;
	        System.out.println("Division is :" + c);
	        break;
          default:
	        System.out.println("Invalid operator");
	        break;
	    }
      }
	}
           

