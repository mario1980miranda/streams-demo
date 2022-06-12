package com.example.demo.examples;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class JoiningStrings {

	@Test void joiningStrings() throws Exception {
		
		List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
		
		StringBuilder join = new StringBuilder();
		
		for (String name : names) {
			join.append(name.substring(0,1).toUpperCase())
			.append(name.substring(1))
			.append(", ");
		}
		
		System.out.println(join);
		System.out.println(join.substring(0, join.length() -2));
	}
	
	@Test void joiningStringsWithStream() throws Exception {
		
		List<String> names = List.of("anna", "john", "marcos", "helena", "yasmin");
		
		final String join = names.stream()
				.map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
				.collect(Collectors.joining("|"));
		System.out.println(join);
	}
}
