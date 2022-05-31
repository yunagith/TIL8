package ch14_lambda.sec04;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapLambdaMain {

	public static void main(String[] args) {
		// HashMap에서 람다식 사용 예
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<10; i++) {
			map.put("key" + i, i);
		}
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		endTime = System.nanoTime();
		System.out.println("(1) : " + (endTime-startTime) + " ns");
				
		System.out.println();		
		
		// 람다식 사용
		startTime = System.nanoTime();
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		endTime = System.nanoTime();
		System.out.println("(2) : " + (endTime-startTime) + " ns");
	}

}
