package com.stream.count;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("pune");
		list.add("mumbai");
		list.add("bangalore");
		list.add("delhi");
		list.add("nagpur");
		long c = list.stream().count();
		System.out.println("Total number of elements are>>" + c);
	}

}
