package com.prabeen.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.prabeen.beans.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		Resource res=null;
		 BeanFactory factory=null;
		 WishMessageGenerator generator=null;
		 res=new ClassPathResource("com/prabeen/cfgs/applicationcontext.xml");
		 factory= new XmlBeanFactory(res);
         generator=factory.getBean(WishMessageGenerator.class);
		 System.out.println("Message::"+generator.sayHello("prabeen"));

	}

}
