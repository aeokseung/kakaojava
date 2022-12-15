package kakao.itstudy.oop;

public class Main {

	public static void main(String[] args) {
		MethodClass.noArgsMethod();
		MethodClass.oneArgsMethod(3);
		MethodClass.twoArgsMethod(2, "Message");
		MethodClass obj = new MethodClass();

		// 리턴된 결과 가져오기
		int result = obj.addWithInteger(10, 30);
		System.out.println("결과: " + result);
		// 리턴된 결과를 가지고 다른 작업을 수행할 수 있습니다.
		result = obj.addWithInteger(result, 90);
		System.out.println("결과: " + result);

		int x = 10;
		MethodClass.callByValue(x);
		// 기본형을 메서드에게 넘겨준 경우는 데이터가 변경되지 않음
		System.out.println("x: " + x);
		int[] br = { 10, 20, 30 };
		MethodClass.callByReference(br);
		System.out.println("br[0]: " + br[0]);
		MethodClass o1 = new MethodClass();
		o1.thisMethod();

		// 20번째 피보나치 수열의 값
		int f = MethodClass.noRecursionFibonacci(10);
		System.out.println("f1:" + f);

		f = MethodClass.recursionFibonacci(10);
		System.out.println("f2:" + f);
		// display 메서드의 매개변수가 String ...args이므로 문자열을 몇개 주어도 상관x
		MethodClass.display("gulit");
		MethodClass.display("vekenvour", "z");
		MethodClass.display("d", "e", "q", "r");
	}

}
