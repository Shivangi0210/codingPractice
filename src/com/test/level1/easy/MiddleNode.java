package com.test.level1.easy;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.stream.Stream;

public class MiddleNode {
	
	public static void main(String... args) {

		//Stream.of(TimeZone.getAvailableIDs()).forEach(System.out::println);
		
		TimeZone.setDefault(TimeZone.getTimeZone("CET"));
		Calendar calendar = Calendar.getInstance();
	System.out.print(calendar.getTimeZone());
	}
}
