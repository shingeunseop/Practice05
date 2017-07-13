package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {
	

	public static void main(String[] args) {
    	String op="";
    	String num="";
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println(">>"+a+" "+op+" "+b);
    	
    	String[] str=num.split(" ");
    	
    		if(op=="/q")
    			System.out.println("종료합니다.");
    		
    		switch(op) {
    		case "+":
    			Add add=new Add();
    			add.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
    			System.out.println(">>"+add.calculate());
    			break;
    		case "-":
    			Sub sub= new Sub();
    			sub.setValue(a, b);
    			System.out.println(">>"+sub.calculate());
    			break;
    		case "*":
    			Mul mul=new Mul();
    			mul.setValue(a, b);
    			System.out.println(">>"+mul.calculate());
    			break;
    		case "/":
    			Div div=new Div();
    			div.setValue(a, b);
    			System.out.println(">>"+div.calculate());
    			break;
    		case "/q":
    			System.out.println("종료합니다.");
    			break;
    			default:
    				System.out.println("");
    		}
    		sc.close();
    	}
    	
    	
    }

