package com.purushotam.first.spring.appl.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringinitApplication.class, args);
		BinSearch binSearch = context.getBean(BinSearch.class);
		//BinSearch binSearch = new BinSearch(new QuickSort());//now it becomes loosely coupled
		//here quicksort is a bean and binarysearch is a dependency being populated
		//howeber in a typical application there would be thousands od dependency and beans and that's where spring comes into picture
		//we need to keep following things in mind while creating beans->
		//1.What are the beans? -> using the @Component annotation
		//2.What are the dependencies of the bean? -> using the @Autowired annotation 
		//3.Where to search for the beans? -> No need since auto scan of packages and subpackages is done by @SpringBootApplication
		//Spring Application Context manages all the beans.
		System.out.println(binSearch.BinarySearch(new int[] {12,4,6}, 3));

	}

}
