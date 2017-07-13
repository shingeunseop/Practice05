package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	int count=0;
    	System.out.println("상품 3개를 입력해주세요");
    	ArrayList<Goods> list= new ArrayList<Goods>();
    	
    	Scanner sc=new Scanner(System.in);
    	
    	for(int i=0;i<3;i++) {
	    	String a=sc.nextLine();
	    	String str[]=a.split(" ");
	    	Goods g=new Goods(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
	    	list.add(g);
    	}
    	
    	for (int j=0;j<list.size();j++) {
    		System.out.println(list.get(j).getName()+"(가격:"+list.get(j).getPrice()+")이 "+list.get(j).getCount()+"개 입고 되었습니다.");
    		
    	}
    	int k=list.get(0).getCount()
    			+list.get(1).getCount()
    			+list.get(2).getCount();
    	
    	System.out.println("모든 상품의 갯수는 "+k+"개 입니다.");
    	
    	 sc.close();    	

       
    }

}
