package ch14_lambda.sec01;

public class MyFunctionInterfaceMain3 {

	public static void main(String[] args) {
		MyFunctionalInterface3 fi3;
		
		fi3=(x,y)->{return x+y;};
		System.out.println(fi3.method3(2, 5));
		
		// return문만 있는 경우 return과 중괄호 {} 생략
		fi3=(x,y)-> x+y;
		System.out.println(fi3.method3(2, 5));
		
		// Integer 클래스의 sum() 메소드 사용
		
		// 아래에 추가한 sum() 메소드 사용
	}

}
