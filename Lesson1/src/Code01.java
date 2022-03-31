

// class 밖에 변수 선언 불가!

public class Code01 {

	static int num;

	public static void main(String[] args) {
		
		int anotherNum = 5;
		
		num = 2;

		System.out.println(num + anotherNum);
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("Sum: " + num + anotherNum); // left associativity 덧셈 연산은 왼쪽부터 적용
		System.out.println("Sum: " + (num + anotherNum)); // 괄호일 경우 괄호 안의 연산 먼저 진행
		
	}

}
