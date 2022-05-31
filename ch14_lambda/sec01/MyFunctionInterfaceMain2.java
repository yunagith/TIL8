package ch14_lambda.sec01;

public class MyFunctionInterfaceMain2 {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi2;
		
		fi2=(x)->{
			int result=x*5;
			System.out.println(result);
		};
		fi2.method2(2);
		
		// 실행 문장이 1개인 경우
		fi2 = (x)->{System.out.println(x*5);};
		fi2.method2(2);
		
		//매개변수가 1개인 경우 괄호 {} 생략가능
		fi2 = (x)->System.out.println(x*5);
		fi2.method2(2);
		
		
	}

}
