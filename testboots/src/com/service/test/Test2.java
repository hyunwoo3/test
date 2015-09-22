package com.service.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.frame.Biz;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				"springdi.xml");

		Biz biz = (Biz) factory.getBean("productbiz");
		//Product product = new Product("book", 111.11, 4, "book.jpg"); �Է�
		//Product product = new Product(4); ����
		//Product product = new Product(3,"book", 111.11, 4, "book.jpg");

		try {
			//biz.modify(product);
			System.out.println(biz.search("b"));
			System.out.println("�Է�");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
