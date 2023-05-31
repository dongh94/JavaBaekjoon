import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*5
-2 6 -97 -6 98*/
public class 세용액_2473 {
    public static void main(String[] args) {
        long[] arr = new long[5000];
        long[] ans = new long[3];

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long result = 3000000001L;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr, 0, num);
        for (int i = 0; i < num - 2; i++) {
            int l = i + 1;
            int r = num - 1;
            if (result == 0) break;
            while (l < r) {
                long val = arr[i] + arr[(int) l] + arr[(int) r];
                if (Math.abs(val) < result) {
                    result = Math.abs(val);
                    ans[0] = arr[i];
                    ans[1] = arr[l];
                    ans[2] = arr[r];
                }

                if (val < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
