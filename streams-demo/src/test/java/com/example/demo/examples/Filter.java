package com.example.demo.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import com.example.demo.mockdata.MockData;
import com.example.demo.model.Car;

public class Filter {

	@Test void filter() throws Exception {
		
		final List<Car> cars = MockData.getCars();
		
		Predicate<Car> pricePredicate = car -> car.getPrice() < 20_000.00;
		Predicate<Car> colorPredicate = car -> car.getColor().equals("Yellow");
		
		final List<Car> yellowCarsLessThan20k = cars.stream()
			.filter(colorPredicate)
			.filter(pricePredicate)
			.collect(Collectors.toList());
		
		yellowCarsLessThan20k.forEach(System.out::println);
	}
	
	/**
	 * The takeWhile method picks up each element that matches its predicate 
	 * until it encounters an unmatching element. 
	 * A portion of the stream – starting from that first encountered unmatching element up to the last element – is discarded.
	 * @throws Exception
	 */
    @Test void takeWhile() throws Exception {

        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using take while");
        Stream.of(2, 4, 6, 8, 9, 10, 12).takeWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }
	
	/**
	 * The dropWhile method does the opposite of the takeWhile. 
	 * If it finds the first element that does not match its predicate, 
	 * it discards all items that came before that unmatching element.
	 * @throws Exception
	 */
	@Test void dropWhile() throws Exception {
		
		System.out.println("using filter");
		
		Predicate<Integer> mod2 = n -> n % 2 == 0;
		
		Stream.of(2,4,6,8,10,12)
			.filter(mod2)
			.forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		
		System.out.println("using dropWhile");
		
        Stream.of(2, 4, 6, 8, 9, 10, 12).dropWhile(mod2)
        	.forEach(n -> System.out.print(n + " "));
	}
	
	@Test void findFirst() throws Exception {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		final var result = Arrays.stream(numbers)
				.filter(n -> n == 50)
				.findFirst().orElse(-1);
		
		System.out.println(result);
	}
	
	@Test void findAny() throws Exception {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		final var result = Arrays.stream(numbers)
				.filter(n -> n == 9)
				.findAny().orElse(-1);
		
		System.out.println(result);
	}
	
	@Test void allMatch() throws Exception {
		
		int[] even = {2,4,6,8,10};
		final boolean allMatch = Arrays.stream(even).allMatch(n -> n % 2 == 0);
		
		System.out.println(allMatch);
	}
	
	@Test void anyMatch() throws Exception {
		
		int[] evenAndOneOdd = {2,4,6,8,10,11};
		final boolean anyMatch = Arrays.stream(evenAndOneOdd).anyMatch(n -> !(n % 2 == 0));
		
		System.out.println(anyMatch);
		
	}
}
