package com.example.demo.examples;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.example.demo.mockdata.MockData;
import com.example.demo.model.Car;

public class Grouping {

	@Test void simpleGrouping() throws Exception {
		
		final List<Car> map = MockData.getCars();
		final Map<String, List<Car>> mapCarsByMaker = map.stream()
				.collect(Collectors.groupingBy(Car::getMake));
		
		mapCarsByMaker.forEach((s, cars) -> {
			System.out.println("Make " + s);
			cars.forEach(System.out::println);
			System.out.println("----------------------");
		});
	}
	
	@Test void groupingAndCountin() throws Exception {
		
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );
        
        final Map<String, Long> map = names.stream()
        		.collect(Collectors.groupingBy(
        				Function.identity(), Collectors.counting()
        				));
        
        System.out.println(map);
	}
}
