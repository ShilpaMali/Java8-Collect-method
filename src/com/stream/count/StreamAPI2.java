package com.stream.count;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("pune");
		list.add("mumbai");
		list.add("bangalore");
		list.add("delhi");
		list.add("nagpur");
		System.out.println("Count is>>" + list.stream().count());
	}

}
