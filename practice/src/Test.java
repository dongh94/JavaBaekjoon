import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		doSomething();
	}
	static void doSomething() {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			System.out.println(n);
		}
		catch(InputMismatchException e) {
			System.out.println("똑바로 좀 입력하세요..");
		}
	}
}
