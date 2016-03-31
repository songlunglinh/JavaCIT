package com.pvthuan.farm2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Farm
{
	public static void main(String [] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory factory = (BeanFactory) context;
		House house = (House) factory.getBean("houseBean");
		
		System.out.println("Animal 1: "+house.getAnimal1().makeSound());
		System.out.println("Animal 2: "+house.getAnimal2().makeSound());
	}
}
