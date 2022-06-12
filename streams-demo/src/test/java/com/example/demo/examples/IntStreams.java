package com.example.demo.examples;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import com.example.demo.mockdata.MockData;
import com.example.demo.model.Person;

public class IntStreams {

	@Test void range() throws Exception {
		
		System.out.println("with for");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("with int stream exclusive");
		IntStream.range(0,10).forEach(System.out::println);
	}
	
	@Test void rangeIteratingList() throws Exception {
		
		final List<Person> people = MockData.getPeople();
		IntStream.range(0, people.size()).forEach(index -> {
			System.out.println(people.get(index));
		});
	}
	
	@Test void intStreamIterate() throws Exception {
		
		IntStream
			.iterate(0, value -> value + 1)
			.limit(11)
			.forEach(System.out::println);
	}
}
