package com.ssafy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest01 {

	public static void main(String[] args) {
		
		
		List<Member> list = Arrays.asList(
				new Member("유지연1", "261"),
				new Member("유지연2", "262"),
				new Member("유지연3", "263"),
				new Member("유지연4", "264"),
				new Member("유지연5", "265"),
				new Member("유지연6", "266")
				);
		System.out.println(list);
		
		//list자료 중 이름만 출력
		list.stream()
		.map(member -> member.getName()) //return 생략
		.forEach(member -> System.out.println(member));
		
		
		System.out.println("이름에 1이 포함됨 사람");
		list.stream()
		.map(member -> member.getName()) //return 생략
		.filter(name->name.contains("1"))
		.forEach(member -> System.out.println(member));
		
		
		System.out.println("나이의 오름차순 정렬");
		list.stream()
		.map(member -> member.getAge()) //return 생략
		.sorted()
		.forEach(member -> System.out.println(member));
		
		System.out.println("나이의 내림차순 정렬");
		list.stream()
		.map(member -> member.getAge()) //return 생략
		.sorted((a,b)->b.compareTo(a))
		.forEach(member -> System.out.println(member));
		//중간 처리 메서드
		//필터링
		
		//매핑
		
		//정렬
		
		//중복 제거

		//루핑
		
		//최종 처리 메서드
		//값의 존재 여부 체크
		
		//집계
		
		//반복(루핑)
		
		//IntStream
		//짝수
		IntStream ist = IntStream.rangeClosed(0, 10);
		ist
		.filter(m->m%2==0)
		.forEach(System.out::println);
		//.forEach(e1->System.out.println(e1));
		
		//짝수의 합
		IntStream ist1 = IntStream.rangeClosed(0, 10);
		int sum = ist1
		.filter(m->m%2==0)
		.sum();
		System.out.println("0~10까지의 짝수의 합: "+sum);
		
		//11보다 큰 값이 하나라도 존재하는 지 체크
		IntStream ist2 = IntStream.rangeClosed(0, 10);
		boolean isLargeEleven = ist2.anyMatch(m->m>11);
		System.out.println(isLargeEleven);
		
		//IntStream으로 배열 생성
		int[] arr = IntStream.rangeClosed(1, 10)
				.filter(m->m%3!=0)
				.toArray();
		System.out.println("int배열 생성 "+Arrays.toString(arr));
		
		
	}

}
