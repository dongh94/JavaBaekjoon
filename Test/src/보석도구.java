import java.io.*;
import java.util.*;

public class 보석도구 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        PriorityQueue<int[]> dia = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int[] d = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            dia.offer(d);
        }
        int[] bag = new int[k];
        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bag);

        Long answer = 0L;
        PriorityQueue<Integer> Q = new PriorityQueue<>(Collections.reverseOrder());
        for (int b : bag) {
            while (!dia.isEmpty() && b >= dia.peek()[0]) {
                Q.offer(dia.poll()[1]);
            }
            if (!Q.isEmpty()) {
                answer += Q.poll();
            }
        }

        System.out.println(answer);
    }
}

