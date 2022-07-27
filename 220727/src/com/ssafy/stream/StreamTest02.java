package com.ssafy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		
		String[][] str = {{"a","b","f"},{"a","e","f"}};
		
		//2차원 배열을 1차원 배열로
		Stream<String[]> stream = Arrays.stream(str);
		
		List<String> list = stream
		.flatMap( arr-> Arrays.stream(arr) )
		.distinct() //중복 제거, equals기반
		.peek(System.out::println)
		.collect(Collectors.toList());
		
		System.out.println(list);
		//출력
		//.forEach(System.out::println);
		
		Stream<String[]> stream1= Arrays.stream(str);
		Optional<String> opt = stream1
		.flatMap( arr-> Arrays.stream(arr) )
		.max((a,b)->a.compareTo(b));

		if(opt.isPresent()) {
			//값 추출
			String maxStr = opt.get();
			System.out.println(maxStr);
		}
		

	}

}
