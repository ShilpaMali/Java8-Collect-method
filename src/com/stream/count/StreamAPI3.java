package com.stream.count;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI3 {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "sohan", 40000));
		list.add(new Employee(102, "sandip", 45000));
		list.add(new Employee(103, "akash", 55000));
		list.add(new Employee(104, "yogesh", 50000));
		list.add(new Employee(105, "vishal", 35000));
		System.out.println("Count is>>" + list.stream().count());
	}

}
