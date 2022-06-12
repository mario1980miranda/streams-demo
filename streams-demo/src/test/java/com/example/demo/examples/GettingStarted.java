package com.example.demo.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.example.demo.mockdata.MockData;
import com.example.demo.model.Person;

public class GettingStarted {

	@Test void imperativeApproach() throws Exception {
		
		// 1. Find people aged less or equal 18
		// 2. Then change implementation to find first 10 people
		final List<Person> people = MockData.getPeople();
		final ArrayList<Person> youngPeople = new ArrayList<Person>();
		
		int limit = 10;
		int count = 0;
		
		for (Person person : people) {
			if (person.getAge() <= 18) {
				youngPeople.add(person);
				count++;
				if (count == limit) {
					break;
				}
			}
		}
		youngPeople.forEach(System.out::println);
	}
	
	@Test void declarativeApproach() throws Exception {
		
		final List<Person> people = MockData.getPeople();
		final List<Person> youngPeople = people.stream()
				.filter(p -> p.getAge() <= 18)
				.limit(10)
				.collect(Collectors.toList());
		youngPeople.forEach(System.out::println);
	}
}
