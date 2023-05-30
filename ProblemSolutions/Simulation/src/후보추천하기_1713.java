import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 후보추천하기_1713 {
    static int N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        int[] day = new int[K + 1];
        for (int i = 0; i <= K; i++) {
            day[i] = Integer.MAX_VALUE;
        }

        int[] count = new int[K + 1];
        Set<Integer> check = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i <= K; i++) {
            count[i]++;

        }
//        Collections.sort();
    }
}
