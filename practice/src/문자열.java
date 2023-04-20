import java.util.Scanner;

public class 문자열 {
    private static int hi = 1;
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
        System.out.println(hi);
        cal(hi);

        cal(hi);

//        for (int i = 0; i < N; i++) {
//            String a = sc.next();
//            int j = a.length();
//            String first = String.valueOf(a.charAt(0));
//            String last = String.valueOf(a.charAt(j - 1));
//            System.out.println(first + last);
//        }
    }
    public static int cal(int i) {

        System.out.println(hi);
        hi = 3;
        System.out.println(hi);
        return i;


    }
}
