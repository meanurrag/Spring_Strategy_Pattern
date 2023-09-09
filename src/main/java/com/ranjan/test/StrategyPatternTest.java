package com.ranjan.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ranjan.comps.Flipkart;

public class StrategyPatternTest {

	public static void main(String[] args) throws Exception {

		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ranjan/config/applicationContext.xml");
		
		//get target class object
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		
		//invoke business method
		String msg = fpkt.shoping(new String[] {"Shirt","Pant","Suit"}, new double[] {2000.0,3000.0,15000.0});
		System.out.println(msg);
	}

}
