package ch14_lambda.sec03;

public class UsingLocalVariable {
	void method(int arg) { // 매개변수 arg는 final 특성을 가짐
		int localVar = 40;      // 로컬 변수 localVar는 final 특성을 가짐
		
		//arg = 31;      		// final 특성 때문에 수정 불가 (여기서 수정하면 람다식 내에서 사용 불가 : final 특성 아니라는 오류)
		//localVar = 41;
		
		//람다식
		MyFunctionalInterface fi = () -> {
			// 로컬 변수 사용
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		
		fi.method();
	}
}

