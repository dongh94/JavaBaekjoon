import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String a = sc.next();
            int j = a.length();
            String first = String.valueOf(a.charAt(0));
            String last = String.valueOf(a.charAt(j - 1));
            System.out.println(first + last);
        }
    }
}
