package com.service.test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.frame.Biz;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("springdi.xml");
		
		Biz biz = (Biz) factory.getBean("custbiz");
		//Cust cust = new Cust("id23", "pw22", "asdfasf");
		
		/*Scanner sc = new Scanner(System.in);
		String ser = sc.next();*/
		
		
		ArrayList<Object> list = null;
		
		
		try {
			//System.out.println(biz.search("a"));
			list = biz.search(2,6);
			System.out.println("ют╥б");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(Object o : list){
			System.out.println(o);
		}

	}

}
