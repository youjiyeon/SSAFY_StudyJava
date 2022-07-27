package com.ssafy.lambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		//익명 구현 객체
		//익명으로 한번 쓸 수 있는 객체
/*		SimpleInterface s = new SimpleInterface() {
			
			@Override
			public void simple() {
				System.out.println("simple() 실행");
				
			}
		};
		
		s.simple();
		
		
		//Lambda식
		SimpleInterface s1 = ()-> System.out.println("simple() 실행");
		s1.simple();*/
		
/*		SimpleInterface s = m -> System.out.println(m);
		s.simple("유지연");*/
		
		
		//같음
/*		SimpleInterface s = m -> {
			System.out.println(m);
			return m+" world";
		};*/
		
		SimpleInterface s = m -> m+" world";

		System.out.println(s.simple("hello"));
		
	}

}
