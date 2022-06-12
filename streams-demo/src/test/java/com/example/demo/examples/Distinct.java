package com.example.demo.examples;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Distinct {

	@Test void distinct() throws Exception {
		
		List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
		final List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
		
		Assertions.assertThat(distinct).hasSize(9);
		
		distinct.forEach(System.out::println);
	}
	
	@Test void distinctWithSet() throws Exception {
		
		List<Integer> numbers = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
		final Set<Integer> distinct = numbers.stream().collect(Collectors.toSet());
		
		Assertions.assertThat(distinct).hasSize(9);
		
		distinct.forEach(System.out::println);
	}
}
