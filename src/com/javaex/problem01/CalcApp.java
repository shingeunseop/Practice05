package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.print(">>");
		String str=sc.nextLine();
		if(str.equals("/q")) {
			System.out.println("종료합니다.");
			break;
		}
			
		String[] part=str.split(" ");
		
		
		
		switch(part[1]) {
		case "+":
			Add add= new Add();
			add.setA(Integer.parseInt(part[0]));
			add.setB(Integer.parseInt(part[2]));
			add.calculate();
			System.out.println(">>"+add.calculate());
			
			break;
		case "-":
			Sub sub=new Sub();
			sub.setA(Integer.parseInt(part[0]));
			sub.setB(Integer.parseInt(part[2]));
			sub.calculate();
			System.out.println(">>"+sub.calculate());
			break;
		case "*":
			Mul mul= new Mul();
			mul.setA(Integer.parseInt(part[0]));
			mul.setB(Integer.parseInt(part[2]));
			mul.calculate();
			System.out.println(">>"+mul.calculate());
			break;
		case "/":
			Div div= new Div();
			div.setA(Integer.parseInt(part[0]));
			div.setB(Integer.parseInt(part[2]));
			div.calculate();
			System.out.println(">>"+div.calculate());
			break;
		default:
			System.out.println("알 수없는 연산입니다.");
		}

		
		}
		sc.close();
    	
    	
    	
    }

}