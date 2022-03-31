import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {

		int number = 123;
		//스캐너 선언
		Scanner kb = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		//스캐너에 int형 변수 입력 받기
		int input = kb.nextInt();

		if(input == number) {
			System.out.println("Numbers match! :-)");
		} 
		else {
			System.out.println("Numbers do not match! :-(");
		}
		//스캐너 닫기
		kb.close();
	}

}
